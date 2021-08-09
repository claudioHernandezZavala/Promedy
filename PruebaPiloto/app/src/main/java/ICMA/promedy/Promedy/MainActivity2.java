package ICMA.promedy.Promedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.Promedy.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity2 extends AppCompatActivity {
    private TextView promedio1;
    private AdView mAdView4;
    private AdView mAdView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        promedio1 =  (TextView) findViewById(R.id.numeroPromedio);
        String dato = getIntent().getStringExtra("promedio");
       // promedio1.append(" "+dato);
        promedio1.setText(dato);
        //================================================================ anuncios

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView4 = findViewById(R.id.adView4);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView4.loadAd(adRequest);

        mAdView5 = findViewById(R.id.adView5);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView5.loadAd(adRequest2);
        //========================================= acciones
        //accion de anuncio 4
        mAdView4.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });
        //aciones de anuncio 5
        mAdView5.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });



    }
    public void regresar(View view){
        promedio1.setText("Tu promedio es:");
        Intent volver =  new Intent(this,MainActivity.class);
       startActivity(volver);
       promedio1.setText("0");

    }
    public void facebook(View view){

        Intent facebook =  new Intent(Intent.ACTION_SEND);
        facebook.setType("text/plain");
        facebook.putExtra(Intent.EXTRA_TEXT,"Mi promedio ha sido de:\n"+promedio1.getText()+"\nAverigua el tuyo con Promedy!");
        facebook.setPackage("com.facebook.katana");
        startActivity(facebook);


    }
    public void whatsapp(View view){

        Intent facebook =  new Intent(Intent.ACTION_SEND);
        facebook.setType("text/plain");
        facebook.putExtra(Intent.EXTRA_TEXT,"Mi promedio ha sido de:\n"+promedio1.getText()+"\nAverigua el tuyo con Promedy!");
        facebook.setPackage("com.whatsapp");
        startActivity(facebook);


    }
    public void instagram(View view){

        Intent insta =  new Intent(Intent.ACTION_SEND);
        insta.setType("text/plain");
        insta.putExtra(Intent.EXTRA_TEXT,"Este ha sido mi promedio este trimestre!"+promedio1.getText()+"\nInstala ya Promedy!");
        insta.setPackage("com.instagram.android");
        startActivity(insta);


    }
}