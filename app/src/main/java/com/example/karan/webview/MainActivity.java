package com.example.karan.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
WebView w1;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        w1=findViewById(R.id.myweb);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        w1.getSettings().setJavaScriptEnabled(true);
        w1.setWebViewClient(new WebViewClient());
      //  w1.goForward();
      //  w1.goBack();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
       w1.loadUrl("http://www.ducatIndia.com");
//webviewclient is a method used to run multiple url in your app//
    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}
