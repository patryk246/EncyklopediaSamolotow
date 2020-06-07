package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void ww1Clicked(View view) {
        startActivity(new Intent(CategoryActivity.this, WW1Activity.class));
    }

    public void ww2Clicked(View view) {
        startActivity(new Intent(CategoryActivity.this, WW2Activity.class));
    }

    public void l70Clicked(View view) {
        startActivity(new Intent(CategoryActivity.this, L70Activity.class));
    }

    public void nowClicked(View view) {
        startActivity(new Intent(CategoryActivity.this, NowActivity.class));
    }

}
