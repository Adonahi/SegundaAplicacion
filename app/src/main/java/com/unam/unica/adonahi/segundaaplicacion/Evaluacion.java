package com.unam.unica.adonahi.segundaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Evaluacion extends AppCompatActivity {

    TextView txtvRapidez, txtvEficiencia, txtvUsoFacil;
    RatingBar rbRapidez, rbEficiencia, rbUsoFacil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtvRapidez = findViewById(R.id.txtvRapidez);
        txtvEficiencia = findViewById(R.id.txtvEficiencia);
        txtvUsoFacil = findViewById(R.id.txtvUsoFacil);

        rbRapidez = findViewById(R.id.rbRapidez);
        rbEficiencia = findViewById(R.id.rbEficiencia);
        rbUsoFacil = findViewById(R.id.rbUsoFacil);

    }

    @Override
    protected void onResume() {
        super.onResume();

        rbRapidez.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) { //0-5, paso 0.5, guarda valores en v
                txtvRapidez.setText(getString(R.string.txtv_Rapidez) + " " + v);
            }
        });

        rbEficiencia.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txtvEficiencia.setText(getString(R.string.txtv_Eficiencia) + " " + v);
            }
        });

        rbUsoFacil.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txtvUsoFacil.setText(getString(R.string.txtv_UsoFacil) + " " + v);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}