package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;
//mała zmiana, test github from
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.animation.ModelAnimator;
import com.google.ar.sceneform.math.Vector3;
import com.google.ar.sceneform.rendering.AnimationData;
import com.google.ar.sceneform.rendering.Color;
import com.google.ar.sceneform.rendering.MaterialFactory;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.ShapeFactory;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

public class MainActivity extends AppCompatActivity {

    private ModelRenderable airplaneRenderable;
    private String name;
    private ModelAnimator modelAnimator;
    private Button animationButton;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = getIntent().getExtras().getString("name");
        if (!checkIsSupportedDeviceOrFinish(this)) {
            return;
        }
        ArFragment arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);

        ModelRenderable.builder()
                // To load as an asset from the 'assets' folder ('src/main/assets/andy.sfb'):
                .setSource(this, Uri.parse(name+".sfb"))

                // Instead, load as a resource from the 'res/raw' folder ('src/main/res/raw/andy.sfb'):
                //.setSource(this, R.raw.andy)

                .build()
                .thenAccept(renderable -> airplaneRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to load airplane renderable", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                            return null;
                        });

        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {

            if (airplaneRenderable == null) {
                return;
            }
            // Create the Anchor.
            Anchor anchor = hitResult.createAnchor();
            AnchorNode anchorNode = new AnchorNode(anchor);
            anchorNode.setParent(arFragment.getArSceneView().getScene());
            // Create the transformable airplane and add it to the anchor.
            TransformableNode airplane = new TransformableNode(arFragment.getTransformationSystem());
            airplane.setParent(anchorNode);
            airplane.setRenderable(airplaneRenderable);
            airplane.select();
            });

        animationButton = findViewById(R.id.button6);
        animationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(modelAnimator!=null && modelAnimator.isRunning()){
                    modelAnimator.end();
                }
                int animationCount = airplaneRenderable.getAnimationDataCount();
                if(i==animationCount){
                    i=0;
                }
                AnimationData animationData = airplaneRenderable.getAnimationData(i);
                modelAnimator = new ModelAnimator(animationData, airplaneRenderable);
                modelAnimator.start();
                i++;
            }
        });
    }
    public void backClicked(View v) {
        finish();

    }

    public void helpClicked(View view) {
        startActivity(new Intent(MainActivity.this, HelpActivity.class));
    }

    public static boolean checkIsSupportedDeviceOrFinish(final Activity activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            Toast.makeText(activity, "Sceneform requires Android N or later", Toast.LENGTH_LONG).show();
            activity.finish();
            return false;
        }
        String openGlVersionString =
                ((ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE))
                        .getDeviceConfigurationInfo()
                        .getGlEsVersion();
        if (Double.parseDouble(openGlVersionString) < 3.0) {
            Toast.makeText(activity, "Sceneform requires OpenGL ES 3.0 or later", Toast.LENGTH_LONG)
                    .show();
            activity.finish();
            return false;
        }
        return true;
    }
}
