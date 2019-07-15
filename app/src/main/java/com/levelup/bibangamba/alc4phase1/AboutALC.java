package com.levelup.bibangamba.alc4phase1;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView aboutALCWebView = new WebView(this);
        aboutALCWebView.getSettings().setJavaScriptEnabled(true);
        aboutALCWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        setContentView(aboutALCWebView);
        aboutALCWebView.loadUrl(getResources().getString(R.string.alc_url));
    }
}
