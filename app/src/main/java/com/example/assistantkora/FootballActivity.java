package com.example.assistantkora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FootballActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        AppCompatImageView imageFootballBack = findViewById(R.id.imageFootballBack);
        AppCompatImageView ligas = findViewById(R.id.ligas);
        AppCompatImageView fav = findViewById(R.id.fav);
        webView = findViewById(R.id.webView);

        // Enable JavaScript (if required)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load the specific page URL
        webView.loadUrl("http://kora.us.to/file/Football/Fixtures.html");

        imageFootballBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FootballActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ligas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FootballActivity.this, LigasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FootballActivity.this, JogadoresActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}