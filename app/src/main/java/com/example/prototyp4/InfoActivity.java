package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private String name;
    private TextView textView_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        textView_name = findViewById(R.id.textView_name);
        name = getIntent().getExtras().getString("name");
        //samoloty
        if(name.equals("b787")){
            textView_name.setText("Boeing 787 Dreamliner");
            //sql query
        }
        if(name.equals("b29")) {
            textView_name.setText("Boeing b-29 Superfortress");
            //sql query
        }
        if(name.equals("cc2")){
            textView_name.setText("Campini Caproni CC.2");
            //sql query
        }
        if(name.equals("ho229")){
            textView_name.setText("Horten HO 229");
            //sql query
        }
        if(name.equals("f22")){
            textView_name.setText("Lockheed F-22 Raptor");
            //sql query
        }
        if(name.equals("spad13")){
            textView_name.setText("Spad XIII");
            //sql query
        }
        //helikoptery
        if(name.equals("uh1")){
            textView_name.setText("Bell UH-1 Iroquodis");
            //sql query
        }
        if(name.equals("ah64")){
            textView_name.setText("Boeing AH-64 Apache");
            //sql query
        }
        if(name.equals("wz10")){
            textView_name.setText("Changze Wz-10");
            //sql query
        }
        if(name.equals("md500")){
            textView_name.setText("Mcdonnell Douglas MD-500");
            //sql query
        }
        if(name.equals("mi24")){
            textView_name.setText("MI-24");
            //sql query
        }

    }

    public void showModelClicked(View view) {
        Intent intent = new Intent(InfoActivity.this, MainActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
