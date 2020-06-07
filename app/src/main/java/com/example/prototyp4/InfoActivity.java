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
            textView_name.setText("Boeing 787 Dreamliner");
            image.setImageResource(R.drawable.b787);
            textView_info.setText(getInfo("b787.txt"));
        }
        if(name.equals("b29")) {
            textView_name.setText("Boeing b-29 Superfortress");
            image.setImageResource(R.drawable.b29);
            textView_info.setText(getInfo("b29.txt"));
        }
        if(name.equals("cc2")){
            textView_name.setText("Campini Caproni CC.2");
            image.setImageResource(R.drawable.cc2);
            textView_info.setText(getInfo("c22.txt"));
        }
        if(name.equals("an24")){
            textView_name.setText("Antonov An-24");
            image.setImageResource(R.drawable.an24);
            textView_info.setText(getInfo("an24.txt"));
        }
        if(name.equals("f22")){
            textView_name.setText("Lockheed F-22 Raptor");
            image.setImageResource(R.drawable.f22);
            textView_info.setText(getInfo("f22.txt"));
        }
        if(name.equals("spad13")){
            textView_name.setText("Spad XIII");
            image.setImageResource(R.drawable.spad13);
            textView_info.setText(getInfo("spad13.txt"));
        }
        if(name.equals("taube")){
            textView_name.setText("Taube");
            image.setImageResource(R.drawable.taube);
            textView_info.setText(getInfo("taube.txt"));
        }
        if(name.equals("spitfire")){
            textView_name.setText("Supermarine Spitfire");
            image.setImageResource(R.drawable.spitfire);
            textView_info.setText(getInfo("spitfire.txt"));
        }
        if(name.equals("spad11")){
            textView_name.setText("Spad XI");
            image.setImageResource(R.drawable.spad11);
            textView_info.setText(getInfo("spad11.txt"));
        }

        //helikoptery
        if(name.equals("uh1")){
            textView_name.setText("Bell UH-1 Iroquodis");
            image.setImageResource(R.drawable.uh1);
            textView_info.setText(getInfo("uh1.txt"));
        }
        if(name.equals("ah64")){
            textView_name.setText("Boeing AH-64 Apache");
            image.setImageResource(R.drawable.ah64);
            textView_info.setText(getInfo("ah64.txt"));
        }
        if(name.equals("wz10")){
            textView_name.setText("Changhe Wz-10");
            image.setImageResource(R.drawable.wz10);
            textView_info.setText(getInfo("wz10.txt"));
        }
        if(name.equals("md500")){
            textView_name.setText("Mcdonnell Douglas MD-500");
            image.setImageResource(R.drawable.md500);
            textView_info.setText(getInfo("md500.txt"));
        }
        if(name.equals("mi24")){
            textView_name.setText("MI-24");
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
