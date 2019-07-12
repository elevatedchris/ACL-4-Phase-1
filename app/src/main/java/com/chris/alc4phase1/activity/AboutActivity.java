package com.chris.alc4phase1.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.chris.alc4phase1.R;
import com.chris.alc4phase1.SSLTolerentWebViewClient;

public class AboutActivity extends AppCompatActivity {

    private WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

     browser =  findViewById(R.id.url);
        browser.setWebViewClient(new WebViewClient());
        browser.setWebViewClient(
                new SSLTolerentWebViewClient()
        );
        browser.loadUrl("https://andela.com/alc/");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
