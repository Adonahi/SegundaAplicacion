package com.unam.unica.adonahi.segundaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtURL;
    Button btnNavegar;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtURL = findViewById(R.id.edtURL);
        btnNavegar = findViewById(R.id.btnNavegar);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnNavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                URL = edtURL.getText().toString();

            }
        });
    }
}