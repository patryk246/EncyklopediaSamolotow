package com.example.prototyp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        name = getIntent().getExtras().getString("name");
    }

    public void showModelClicked(View view) {
        Intent intent = new Intent(InfoActivity.this, MainActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
