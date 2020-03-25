package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        //samoloty
        if(name.equals("b787")){
            textView_name.setText("Boeing 787 Dreamliner");
            image.setImageResource(R.drawable.b787);
            String text = "text";


            text = DbHelper.getInfo(name);
            textView_info.setText(text);
        }
        if(name.equals("b29")) {
            textView_name.setText("Boeing b-29 Superfortress");
            image.setImageResource(R.drawable.b29);
            //sql query
        }
        if(name.equals("cc2")){
            textView_name.setText("Campini Caproni CC.2");
            image.setImageResource(R.drawable.cc2);
            //sql query
        }
        if(name.equals("ho229")){
            textView_name.setText("Horten HO 229");
            image.setImageResource(R.drawable.ho229);
            //sql query
        }
        if(name.equals("f22")){
            textView_name.setText("Lockheed F-22 Raptor");
            image.setImageResource(R.drawable.f22);
            //sql query
        }
        if(name.equals("spad13")){
            textView_name.setText("Spad XIII");
            image.setImageResource(R.drawable.spad13);
            //            //sql query
        }
        //helikoptery
        if(name.equals("uh1")){
            textView_name.setText("Bell UH-1 Iroquodis");
            image.setImageResource(R.drawable.uh1);
            //sql query
        }
        if(name.equals("ah64")){
            textView_name.setText("Boeing AH-64 Apache");
            image.setImageResource(R.drawable.ah64);
            //sql query
        }
        if(name.equals("wz10")){
            textView_name.setText("Changhe Wz-10");
            image.setImageResource(R.drawable.wz10);
            //sql query
        }
        if(name.equals("md500")){
            textView_name.setText("Mcdonnell Douglas MD-500");
            image.setImageResource(R.drawable.md500);
            //sql query
        }
        if(name.equals("mi24")){
            textView_name.setText("MI-24");
            image.setImageResource(R.drawable.mi24);
            //sql query
        }

    }

    public void showModelClicked(View view) {
        Intent intent = new Intent(InfoActivity.this, MainActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
