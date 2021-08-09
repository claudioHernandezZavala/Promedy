package ICMA.promedy.Promedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.Promedy.R;

public class webActivity extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1 =  (WebView) findViewById(R.id.web);
        String url2 = getIntent().getStringExtra("url");
        wv1.setWebViewClient( new WebViewClient());
        wv1.setWebChromeClient(new WebChromeClient());

        wv1.loadUrl(url2);
        WebSettings WebSettings = wv1.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        WebSettings.setPluginState(android.webkit.WebSettings.PluginState.ON);

    }
    public void volver(View view){
        Intent ventan2 =  new Intent(this,MainActivity3.class);

        startActivity(ventan2);
      //  overridePendingTransition(R.anim.in,R.anim.out);


    }
}