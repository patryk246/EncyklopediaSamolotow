package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class L70Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l70);
    }

    private void startActivityWithName(String name) {
        Intent intent = new Intent(L70Activity.this, InfoActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void a10thunderboltClicked(View view) {
        startActivityWithName("a10thunderbolt");
    }

    public void ah64Clicked(View view) {
        startActivityWithName("ah64");
    }

    public void md500Clicked(View view) {
        startActivityWithName("md500");
    }

    public void mi24Clicked(View view) {
        startActivityWithName("mi24");
    }

    public void mig15_gearClicked(View view) {
        startActivityWithName("mig15_gear");
    }

    public void uh1Clicked(View view) {
        startActivityWithName("uh1");
    }
}
