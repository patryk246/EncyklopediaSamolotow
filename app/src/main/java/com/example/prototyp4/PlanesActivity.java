package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlanesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes);
    }

    public void b787Clicked(View view) {
        startActivityWithName("b787");
    }

    public void b29Clicked(View view) {
        startActivityWithName("b29");
    }

    public void cc2Clicked(View view) {
        startActivityWithName("cc2");
    }

    public void ho229Clicked(View view) {
        startActivityWithName("ho229");
    }

    public void f22Clicked(View view) {
        startActivityWithName("f22");
    }

    public void spad13Clicked(View view) {
        startActivityWithName("spad13");
    }

    private void startActivityWithName(String name) {
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        startActivity(new Intent(PlanesActivity.this, InfoActivity.class), bundle);
    }
}
