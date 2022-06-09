package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;



public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        WebView webView = findViewById(R.id.webView);

        int position = getIntent().getExtras().getInt("title");

        if (position == 0) {
            webView.loadUrl("");
        }
        if (position == 1) {
            webView.loadUrl("");

        }
        if (position == 2) {
            webView.loadUrl("");

        }
        if (position == 3) {
            webView.loadUrl("");

        }
        if (position == 4) {
            webView.loadUrl("");

        }
        if (position == 5) {
            webView.loadUrl("");

        }
    }

}