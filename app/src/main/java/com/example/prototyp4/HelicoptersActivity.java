package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelicoptersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helicopters);
    }

    public void uh1Clicked(View view) {
        startActivityWithName("uh1");
    }

    public void ah64Clicked(View view) {
        startActivityWithName("ah64");
    }

    public void wz10Clicked(View view) {
        startActivityWithName("wz10");
    }

    public void md500Clicked(View view) {
        startActivityWithName("md500");
    }

    public void mi24Clicked(View view) {
        startActivityWithName("mi24");
    }

    private void startActivityWithName(String name) {
        Intent intent = new Intent(HelicoptersActivity.this, InfoActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
