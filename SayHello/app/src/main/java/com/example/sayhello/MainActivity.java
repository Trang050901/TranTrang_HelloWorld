package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText myEditText;
    Button myButon;
    TextView mytextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = (EditText) findViewById(R.id.myEditText);
        myButon = (Button) findViewById(R.id.myButon);
        mytextview = (TextView) findViewById(R.id.mytextview);

        myButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = myEditText.getText().toString();
                mytextview.setText("Hi các bạn" + name);
            }
        });
    }
}