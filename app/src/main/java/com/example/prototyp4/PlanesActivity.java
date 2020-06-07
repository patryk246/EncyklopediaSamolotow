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

    //public void b29Clicked(View view) { startActivityWithName("b29"); }

    public void cc2Clicked(View view) {
        startActivityWithName("cc2");
    }

    public void an24Clicked(View view) {
        startActivityWithName("an24");
    }

    public void f22Clicked(View view) {
        startActivityWithName("f22");
    }

    public void spad13Clicked(View view) {
        startActivityWithName("spad13");
    }

    private void startActivityWithName(String name) {
        Intent intent = new Intent(PlanesActivity.this, InfoActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void rolandciiClicked(View view) { startActivityWithName("rolandcii"); }

    public void taubeClicked(View view){ startActivityWithName("taube");}

    public void spitfireClicked(View view){ startActivityWithName("spitfire");}

    public void spad11Clicked(View view){ startActivityWithName("spad11");}

    public void sopwithClicked(View view){ startActivityWithName("sopwith");}

    public void mig15Clicked(View view){ startActivityWithName("mig15_gear");}

    public void martin244Clicked(View view){ startActivityWithName("martin244");}

    public void f16Clicked(View view){ startActivityWithName("jakisMysliwiec");}

    public void gulfstreamClicked(View view){ startActivityWithName("gulfstream");}

    public void gothag1Clicked(View view){ startActivityWithName("gothag1");}

}
