package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WW2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ww2);
    }

    private void startActivityWithName(String name) {
        Intent intent = new Intent(WW2Activity.this, InfoActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void b17bomberClicked(View view) {
        startActivityWithName("b17bomber");
    }

    public void b29Clicked(View view) {
        startActivityWithName("b29");
    }

    public void c22Clicked(View view) {
        startActivityWithName("cc2");
    }

    public void ho229Clicked(View view) {
        startActivityWithName("ho229");
    }

    public void supermarineSpitfireClicked(View view) { startActivityWithName("spitfire"); }
}
