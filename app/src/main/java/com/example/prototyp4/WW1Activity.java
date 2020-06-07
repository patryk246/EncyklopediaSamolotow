package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WW1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ww1);
    }

    private void startActivityWithName(String name) {
        Intent intent = new Intent(WW1Activity.this, InfoActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void aeg_g4Clicked(View view) {
        startActivityWithName("aeg_g4");
    }

    public void bristolf2bClicked(View view) {
        startActivityWithName("bristolf2b");
    }

    public void capronica5Clicked(View view) {
        startActivityWithName("capronica5");
    }

    public void fe2bClicked(View view) {
        startActivityWithName("fe2b");
    }

    public void fokkerDr1Clicked(View view) {
        startActivityWithName("fokkerDr1");
    }

    public void gothag1Clicked(View view) {
        startActivityWithName("gothag1");
    }

    public void rolandciiClicked(View view) {
        startActivityWithName("rolandcii");
    }

    public void sopwith3Clicked(View view) {
        startActivityWithName("sopwith3");
    }

    public void spad13Clicked(View view) {
        startActivityWithName("spad13");
    }

    public void spadxviClicked(View view) {
        startActivityWithName("spadxvi");
    }

    public void taubeClicked(View view) {
        startActivityWithName("taube");
    }

}
