package com.example.micatalogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivityNavegador extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navegador);
        wv1 = (WebView)findViewById(R.id.webView);
        String url = getIntent().getStringExtra("sitioweb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl(url);
    }

    public void cerrar(View view){
        finish();
    }
}