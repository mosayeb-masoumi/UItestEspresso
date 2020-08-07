package com.example.uitestespresso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //click and select class name (MainActivity)/ Alt Enter/create test / ina the opened page
    // Testing Library JUnit4  select @befor and @after then ok then select AndroidTest
    // test class will generated

    EditText edt;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edt);
        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(edt.getText().toString());
            }
        });
    }
}