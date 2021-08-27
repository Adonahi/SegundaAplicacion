package com.unam.unica.adonahi.segundaaplicacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("liga", URL);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.itEvaluacion:
                Intent evaluacion = new Intent(getApplicationContext(), Evaluacion.class);
                startActivity(evaluacion);
                //Toast.makeText(getApplicationContext(), "Evaluación", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itInfo:
                Intent info = new Intent(getApplicationContext(), Informacion.class);
                startActivity(info);
                Toast.makeText(getApplicationContext(), "Información", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itHola:
        }

        return super.onOptionsItemSelected(item);
    }
}