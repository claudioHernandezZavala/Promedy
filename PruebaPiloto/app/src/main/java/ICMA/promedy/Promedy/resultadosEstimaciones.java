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

public class resultadosEstimaciones extends AppCompatActivity {
    private TextView texto;
    private TextView texto2;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_estimaciones);
        //anuncio==============================
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView6);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //acciones
        //accion para el anuncio1
        mAdView.setAdListener(new AdListener() {
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
        texto = (TextView) findViewById(R.id.mensaje);
        texto2 = (TextView) findViewById(R.id.indiceresulde);
        int nota11 =  getIntent().getIntExtra("nota1",0);
        int nota12 =  getIntent().getIntExtra("nota2",0);
        int nota13=  getIntent().getIntExtra("nota3",0);
        int nota14 =  getIntent().getIntExtra("nota4",0);
        int nota15 =  getIntent().getIntExtra("nota5",0);
        int promedio =  getIntent().getIntExtra("promedioAlcanzable",0);
        int promediosacaria =  getIntent().getIntExtra("promediosacaria",0);
        texto2.append(promedio+"");
        String nombre1 =  getIntent().getStringExtra("nombre1");
        String nombre2 =  getIntent().getStringExtra("nombre2");
        String nombre3 =  getIntent().getStringExtra("nombre3");
        String nombre4 =  getIntent().getStringExtra("nombre4");
        String nombre5 =  getIntent().getStringExtra("nombre5");
        String mensaje  ="";
        if(!nombre1.isEmpty()){
            mensaje+="Debes sacar "+nota11+" en " +nombre1+"\n";


        }
        if(!nombre2.isEmpty()){
            mensaje+="Debes sacar "+nota12+" en " +nombre2+"\n";


        }
        if(!nombre3.isEmpty()){
            mensaje+="Debes sacar "+nota13+" en " +nombre3+"\n";


        }
        if(!nombre4.isEmpty()){
            mensaje+="Debes sacar "+nota14+" en " +nombre4+"\n";


        }
        if(!nombre5.isEmpty()){
            mensaje+="Debes sacar "+nota15+" en " +nombre5+"\n";


        }
        mensaje+= "Para sacar:"+promediosacaria+".";

        texto.setText(mensaje);



    }
    public void regresar(View view){
        texto.setText("Estimacion:");
        Intent volver =  new Intent(this,MainActivity3.class);
        startActivity(volver);


    }
}