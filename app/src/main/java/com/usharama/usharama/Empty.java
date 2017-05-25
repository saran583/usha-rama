package com.usharama.usharama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Empty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        WebView wv = (WebView) findViewById(R.id.sweb);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setGeolocationEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.loadUrl("https://usharama.edu.in");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
