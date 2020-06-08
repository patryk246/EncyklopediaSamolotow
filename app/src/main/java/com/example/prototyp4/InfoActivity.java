package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class InfoActivity extends AppCompatActivity {

    DatabaseHelper DbHelper;

    private String name;
    private TextView textView_name, textView_info;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        DbHelper = new DatabaseHelper(this);
        textView_name = findViewById(R.id.textView_name);
        textView_info = findViewById(R.id.textView_info);
        image = findViewById(R.id.imageView);


        name = getIntent().getExtras().getString("name");

        textView_info.setMovementMethod(new ScrollingMovementMethod());

        //samoloty
        if(name.equals("b787")){
            textView_name.setText(R.string.b787);
            image.setImageResource(R.drawable.b787);
            textView_info.setText(getInfo("b787.txt"));
        }
        if(name.equals("b29")) {
            textView_name.setText(R.string.b29);
            image.setImageResource(R.drawable.b29);
            textView_info.setText(getInfo("b29.txt"));
        }
        if(name.equals("cc2")){
            textView_name.setText(R.string.cc2);
            image.setImageResource(R.drawable.cc2);
            textView_info.setText(getInfo("cc2.txt"));
        }
        if(name.equals("an24")){
            textView_name.setText(R.string.an24);
            image.setImageResource(R.drawable.an24);
            textView_info.setText(getInfo("an24.txt"));
        }
        if(name.equals("f22")){
            textView_name.setText(R.string.f22);
            image.setImageResource(R.drawable.f22);
            textView_info.setText(getInfo("f22.txt"));
        }
        if(name.equals("spad13")){
            textView_name.setText(R.string.spad13);
            image.setImageResource(R.drawable.spad13);
            textView_info.setText(getInfo("spad13.txt"));
        }
        if(name.equals("taube")){
            textView_name.setText(R.string.taube);
            image.setImageResource(R.drawable.taube);
            textView_info.setText(getInfo("taube.txt"));
        }
        if(name.equals("spitfire")){
            textView_name.setText(R.string.spitfire);
            image.setImageResource(R.drawable.spitfire);
            textView_info.setText(getInfo("spitfire.txt"));
        }
        if(name.equals("spad11")){
            textView_name.setText(R.string.spad11);
            image.setImageResource(R.drawable.spad11);
            textView_info.setText(getInfo("spad11.txt"));
        }
        if(name.equals("sopwith")){
            textView_name.setText(R.string.sopwith);
            image.setImageResource(R.drawable.sopwith);
            textView_info.setText(getInfo("sopwith.txt"));
        }
        if(name.equals("rolandcii")){
            textView_name.setText(R.string.rolandcii);
            image.setImageResource(R.drawable.rolandcii);
            textView_info.setText(getInfo("rolandcii.txt"));
        }
        if(name.equals("mig15_gear")){
            textView_name.setText(R.string.mig15_gear);
            image.setImageResource(R.drawable.mig15);
            textView_info.setText(getInfo("mig15_gear.txt"));
        }
       /* tego nie ma
       if(name.equals("martin244")){
            textView_name.setText("Mig-15");
            image.setImageResource(R.drawable.martin244);
            textView_info.setText(getInfo("martin244.txt"));
        }
        */
        if(name.equals("jakisMysliwiec")){
            textView_name.setText(R.string.jakisMysliwiec);
            image.setImageResource(R.drawable.f16);
            textView_info.setText(getInfo("jakisMysliwiec.txt"));
        }
        if(name.equals("gulfstream")){
            textView_name.setText(R.string.gulfstream);
            image.setImageResource(R.drawable.gulfstream);
            textView_info.setText(getInfo("gulfstream.txt"));
        }
        if(name.equals("gothag1")){
            textView_name.setText(R.string.gothag1);
            image.setImageResource(R.drawable.gothag1);
            textView_info.setText(getInfo("gothag1.txt"));
        }
        if(name.equals("fokkerDr1")){
            textView_name.setText(R.string.fokkerDr1);
            image.setImageResource(R.drawable.fokkerdr1);
            textView_info.setText(getInfo("fokkerDr1.txt"));
        }
        if(name.equals("fe2b")){
            textView_name.setText(R.string.fe2b);
            image.setImageResource(R.drawable.fe2b);
            textView_info.setText(getInfo("fe2b.txt"));
        }
        if(name.equals("concorde")){
            textView_name.setText(R.string.concorde);
            image.setImageResource(R.drawable.concorde);
            textView_info.setText(getInfo("concorde.txt"));
        }
        if(name.equals("aeg_g4")){
            textView_name.setText(R.string.aeg_g4);
            image.setImageResource(R.drawable.aeg_g4);
            textView_info.setText(getInfo("aeg_g4.txt"));
        }
        if(name.equals("a10thunderbolt")){
            textView_name.setText(R.string.a10thunderbolt);
            image.setImageResource(R.drawable.a10thunderbolt);
            textView_info.setText(getInfo("a10thunderbolt.txt"));
        }
        if(name.equals("antonov225")){
            textView_name.setText(R.string.antonov225);
            image.setImageResource(R.drawable.antonov225);
            textView_info.setText(getInfo("antonov225.txt"));
        }
        if(name.equals("cargoAircraft")){
            textView_name.setText(R.string.cargoAircraft);
            image.setImageResource(R.drawable.lockeheed130);
            textView_info.setText(getInfo("cargoAircraft.txt"));
        }
        if(name.equals("b17bomber")){
            textView_name.setText(R.string.b17bomber);
            image.setImageResource(R.drawable.b17bomber);
            textView_info.setText(getInfo("b17bomber.txt"));
        }
        if(name.equals("bristolf2b")){
            textView_name.setText(R.string.bristolf2b);
            image.setImageResource(R.drawable.bristolf2b);
            textView_info.setText(getInfo("bristolf2b.txt"));
        }
        if(name.equals("capronica5")){
            textView_name.setText(R.string.capronica5);
            image.setImageResource(R.drawable.capronica5);
            textView_info.setText(getInfo("capronica5.txt"));
        }
        if(name.equals("ho229")){
            textView_name.setText(R.string.ho229);
            image.setImageResource(R.drawable.ho229);
            textView_info.setText(getInfo("ho229.txt"));
        }


        //helikoptery
        if(name.equals("uh1")){
            textView_name.setText(R.string.uh1);
            image.setImageResource(R.drawable.uh1);
            textView_info.setText(getInfo("uh1.txt"));
        }
        if(name.equals("ah64")){
            textView_name.setText(R.string.ah64);
            image.setImageResource(R.drawable.ah64);
            textView_info.setText(getInfo("ah64.txt"));
        }
        if(name.equals("wz10")){
            textView_name.setText(R.string.wz10);
            image.setImageResource(R.drawable.wz10);
            textView_info.setText(getInfo("wz10.txt"));
        }
        if(name.equals("md500")){
            textView_name.setText(R.string.md500);
            image.setImageResource(R.drawable.md500);
            textView_info.setText(getInfo("md500.txt"));
        }
        if(name.equals("mi24")){
            textView_name.setText(R.string.mi24);
            image.setImageResource(R.drawable.mi24);
            textView_info.setText(getInfo("mi24.txt"));
        }
    }

    public String getInfo(String name){
        String text = "";
        try {
            InputStream stream = getAssets().open(name);
            int size = stream.available();
            byte[] buffer = new byte[size];
            stream.read(buffer);
            stream.close();
            text = new String(buffer);
        }catch (IOException e){
            return e.toString();
        }
        return text;
    }

    public void showModelClicked(View view) {
        Intent intent = new Intent(InfoActivity.this, MainActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
