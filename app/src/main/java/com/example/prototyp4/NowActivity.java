package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now);
    }

    private void startActivityWithName(String name) {
        Intent intent = new Intent(NowActivity.this, InfoActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void antonov225Clicked(View view) {
        startActivityWithName("antonov225");
    }

    public void b787Clicked(View view) {
        startActivityWithName("b787");
    }

    public void cargoAircraftClicked(View view) {
        startActivityWithName("cargoAircraft");
    }

    public void concordeClicked(View view) {
        startActivityWithName("concorde");
    }

    public void f22Clicked(View view) {
        startActivityWithName("f22");
    }

    public void gulfstreamClicked(View view) {
        startActivityWithName("gulfstream");
    }

    public void jakisMysliwiecClicked(View view) {
        startActivityWithName("jakisMysliwiec");
    }

    public void wz10Clicked(View view) {
        startActivityWithName("wz10");
    }
}
