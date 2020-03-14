package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_action extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
    }

    public void demoClicked(View v) {
        startActivity(new Intent(activity_action.this, MainActivity.class));

    }

    public void infoClicked(View v) {
        startActivity(new Intent(activity_action.this, activity_action.class));

    }
    public void backClicked(View v) {
        startActivity(new Intent(activity_action.this, activity_model.class));

    }
}
