package com.example.webviewapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    private WebView myWebView;


    public void showExternalWebPage() {
        myWebView.loadUrl("https://www.his.se/");
    }

    public void showInternalWebPage() {
        myWebView.loadUrl("file:///android_asset/MinHTMLFIL.html");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        * Rename your App. Tip: Values->Strings
        * Enable Internet access for your App. Tip: Manifest
        * Create a WebView element in the layout file main_activity.xml
        * Give the WebView element ID "my_webview"
        -- Commit and push to your github fork
        * Create a private member variable called "myWebView" of type WebView
        * Locate the WebView element created in step 1 using the ID created in step 2
        * Create a new WebViewClient to attach to our WebView. This allows us to
          browse the web inside our app.
        -- Commit and push to your github fork
        * Enable Javascript execution in your WebViewClient
        * Enter the url to load in our WebView
        -- Commit and push to your github fork
        * Move the code that loads a URL into your WebView into the two methods
          "showExternalWebPage()" and "showInternalWebPage()".
        * Call the "showExternalWebPage()" / "showInternalWebPage()" methods
          when you select menu options "External Web Page" or "Internal Web Page"
          respectively
        -- Commit and push to your github fork
        * Take two screenshots using the "Take a screenshot" tool in the AVD
           showing your App. One (1) screenshot showing your internal web page and
           one (1) screenshot showing your external web page.
        */


        myWebView = findViewById(R.id.my_webview);

        myWebView.getSettings().setJavaScriptEnabled(true);

        myWebView.setWebViewClient(new WebViewClient());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_external_web) {
            // Anropa showExternalWebPage() när External Web Page väljs från menyn
            showExternalWebPage();
            return true;
        }

        if (id == R.id.action_internal_web) {
            // Anropa showInternalWebPage() när Internal Web Page väljs från menyn
            showInternalWebPage();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
