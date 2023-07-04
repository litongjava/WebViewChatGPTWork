package com.liotngjava.web.view.chatgpt.work;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

public class MainActivity extends AppCompatActivity {

  private WebView myWebView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    getSupportActionBar().hide(); //隐藏ActionBar
    setContentView(R.layout.activity_main);

    String url = "https://chat.openai.com/";
    CustomTabsIntent intent = new CustomTabsIntent.Builder()
      //隐藏地址栏
      .setUrlBarHidingEnabled(true)
      .build();
    intent.launchUrl(MainActivity.this, Uri.parse(url));
  }
}