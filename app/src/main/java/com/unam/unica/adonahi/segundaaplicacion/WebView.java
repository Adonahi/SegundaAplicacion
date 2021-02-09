package com.unam.unica.adonahi.segundaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {

    android.webkit.WebView wvPagina;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        URL = getIntent().getStringExtra("liga");

        wvPagina = findViewById(R.id.wvPagina);

        wvPagina.setWebViewClient(new WebViewClient()); //Inicializa el componente

        wvPagina.loadUrl("https://" + URL); //Carga la URL

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}