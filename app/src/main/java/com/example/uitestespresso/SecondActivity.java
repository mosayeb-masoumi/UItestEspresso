package com.example.uitestespresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt_result = findViewById(R.id.txt_result);


        Intent intent = getIntent();
        txt_result.setText(intent.getStringExtra("NAME"));

    }
}