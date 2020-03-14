package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_model extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);


    }
    public void demoClicked(View v) {
        startActivity(new Intent(activity_model.this, MainActivity.class));

    }

    public void nextClicked(View v) {
        startActivity(new Intent(activity_model.this, activity_action.class));

    }
}

