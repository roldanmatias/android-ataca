package com.example.acamica;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MiWebActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

	        setContentView( R.layout.web_layout );

	        WebView webView = (WebView) findViewById(R.id.miweb);
			webView.getSettings().setJavaScriptEnabled(true);
			webView.loadUrl("http://www.android.com/");
	        
    }
}
