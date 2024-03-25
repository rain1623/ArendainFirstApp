package com.example.arendainfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView Name;
    EditText myName;
    TextView display;
    Button click;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.name);
        myName = findViewById(R.id.txtMyName);
        display = findViewById(R.id.txtDisplay);
        click = findViewById(R.id.btnClick);
        clear = findViewById(R.id.btnClear);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String MyValue = myName.getText().toString();
                display.setText("Hello " + MyValue+"!");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("Hello!");
                myName.setText(" ");
            }
        });

    }
}