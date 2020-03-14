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

    public void planesClicked(View view) {
        startActivity(new Intent(CategoryActivity.this, PlanesActivity.class));
    }

    public void helicoptersClicked(View view) {
        startActivity(new Intent(CategoryActivity.this, HelicoptersActivity.class));
    }
}
