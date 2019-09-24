package com.example.hassan.surveyminia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {

    private WebView myWebView;
    public static String ul_name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        myWebView = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl(ul_name);
        myWebView.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }


}
