package com.example.imdbmovieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MovieWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_web_view);

        String imdbID = getIntent().getStringExtra("imdbID");
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://m.imdb.com/title/"+imdbID+"/");
        Log.d("URL:","http://m.imdb.com/title/"+imdbID+"/");
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });


    }
}
