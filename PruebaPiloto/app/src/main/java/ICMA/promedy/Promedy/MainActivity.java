package ICMA.promedy.Promedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Promedy.R;

public class MainActivity extends AppCompatActivity {
    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText nota4;
    private EditText nota5;
    private EditText nota6;
    private EditText nota7;
    private  EditText nota8;
    private  EditText nota9;
    private EditText nota10;
    private EditText nota11;
    private EditText nota12;

    private  EditText uv1;
    private  EditText uv2;
    private  EditText uv3;
    private  EditText uv4;
    private  EditText uv5;
    private  EditText uv6;
    private  EditText uv7;
    private  EditText uv8;
    private  EditText uv9;
    private  EditText uv10;
    private  EditText uv11;
    private  EditText uv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //=======================nota
        nota1 =  (EditText)findViewById(R.id.nota1);
        nota2 = (EditText)findViewById(R.id.nota2);
        nota3 = (EditText)findViewById(R.id.nota3);
        nota4 = (EditText)findViewById(R.id.nota4);
        nota5 = (EditText)findViewById(R.id.nota5);
        nota6 = (EditText)findViewById(R.id.nota6);
        nota7 = (EditText)findViewById(R.id.nota7);
        nota8  = (EditText)findViewById(R.id.nota8);
        nota9  = (EditText)findViewById(R.id.nota9);
        nota10  = (EditText)findViewById(R.id.nota10);
        nota11  = (EditText)findViewById(R.id.nota11);
        nota12  = (EditText)findViewById(R.id.nota12);
        //==============uv
        uv1 = (EditText)findViewById(R.id.uv1);
        uv2  = (EditText)findViewById(R.id.uv2);
        uv3  = (EditText)findViewById(R.id.uv3);
        uv4  = (EditText)findViewById(R.id.uv4);
        uv5  = (EditText)findViewById(R.id.uv5);
        uv6  = (EditText)findViewById(R.id.uv6);
        uv7  = (EditText)findViewById(R.id.uv7);
        uv8  = (EditText)findViewById(R.id.uv8);
        uv9  = (EditText)findViewById(R.id.uv9);
        uv10  = (EditText)findViewById(R.id.uv10);
        uv11  = (EditText)findViewById(R.id.uv11);
        uv12  = (EditText)findViewById(R.id.uv12);


    }
    public void inicio(View view){
        Intent ventan2 =  new Intent(this,MainActivity3.class);

        startActivity(ventan2);
    }
    public void suma(View view){
        int notauno=0;
        int notados =0;
        int notatres =0;
        int notacuatro=0 ;
        int notacinco=0 ;
        int notaseis=0 ;
        int notasiete=0 ;
        int notaocho=0 ;
        int notanueve=0 ;
        int notadiez=0 ;
        int notaonce=0 ;
        int notadoce=0 ;
        int uvuno=0,uvdos=0,uvtres=0,uvcuatro=0,uvcinco=0,uvseis=0,uvsiete=0,uvocho=0,uvnueve=0,uvdiez=0,uvonce=0,uvdoce=0;

        //tomo los string para verificar que no esten vacios y asignarles un valor y asi evitar un excepcion de tipo numerica al hacer operaciones
        String v11 =  uv1.getText().toString();
        String v22 =  uv2.getText().toString();
        String v33 =  uv3.getText().toString();
        String v44 =  uv4.getText().toString();
        String v55 =  uv5.getText().toString();
        String v66 =  uv6.getText().toString();
        String v77 =  uv7.getText().toString();
        String v88 =  uv8.getText().toString();
        String v99 =  uv9.getText().toString();
        String v10 =  uv10.getText().toString();
        String v111 =  uv11.getText().toString();
        String v12 =  uv12.getText().toString();
        //===notas
        String not1 =  nota1.getText().toString();
        String not2 =  nota2.getText().toString();
        String not3 =  nota3.getText().toString();
        String not4 =  nota4.getText().toString();
        String not5 =  nota5.getText().toString();
        String not6 =  nota6.getText().toString();
        String not7 =  nota7.getText().toString();
        String not8 =  nota8.getText().toString();
        String not9=  nota9.getText().toString();
        String not10=  nota10.getText().toString();
        String not11=  nota11.getText().toString();
        String not12=  nota12.getText().toString();


        if((not1.isEmpty()&&!v11.isEmpty())||(!not1.isEmpty()&&v11.isEmpty())||(not1.isEmpty()&&v11.isEmpty())){
           notauno = 0;
           uvuno=0;

        }else{
            notauno =  Integer.parseInt(nota1.getText().toString());
            uvuno =  Integer.parseInt(uv1.getText().toString());


        }
        //nota1=====================================================================
       if((not2.isEmpty()&&!v22.isEmpty())||(!not2.isEmpty()&&v22.isEmpty())||(not2.isEmpty()&&v33.isEmpty())){

            notados=0;
            uvdos=0;


        }else{
           notados =  Integer.parseInt(nota2.getText().toString());

           uvdos =  Integer.parseInt(uv2.getText().toString());

       }
       //nota2============================================================================
        if((not3.isEmpty()&&!v33.isEmpty())||(!not3.isEmpty()&&v33.isEmpty())||(not3.isEmpty()&&v33.isEmpty())){

            notatres = 0;
            uvtres =0;


        }else{
            notatres =  Integer.parseInt(nota3.getText().toString());

            uvtres =  Integer.parseInt(uv3.getText().toString());
        }
        //nota3===============================================================================
        if((not4.isEmpty()&&!v44.isEmpty())||(!not4.isEmpty()&&v44.isEmpty())||(not4.isEmpty()&&v44.isEmpty())){

            notacuatro = 0;
            uvcuatro=0;


        }else{
            notacuatro =  Integer.parseInt(nota4.getText().toString());

            uvcuatro =  Integer.parseInt(uv4.getText().toString());
        }
        //nota4===============================================================================
        if((not5.isEmpty()&&!v55.isEmpty())||(!not5.isEmpty()&&v55.isEmpty())||(not5.isEmpty()&&v55.isEmpty())){

            notacinco = 0;
            uvcinco=0;


        }else{
            notacinco =  Integer.parseInt(nota5.getText().toString());

            uvcinco =  Integer.parseInt(uv5.getText().toString());
        }
        //nota5========================================
        if((not6.isEmpty()&&!v66.isEmpty())||(!not6.isEmpty()&&v66.isEmpty())||(not6.isEmpty()&&v66.isEmpty())){

            notaseis = 0;
            uvseis=0;


        }else{
            notaseis =  Integer.parseInt(nota6.getText().toString());

            uvseis =  Integer.parseInt(uv6.getText().toString());
        }
        //nota6=======================================================
        if((not7.isEmpty()&&!v77.isEmpty())||(!not7.isEmpty()&&v77.isEmpty())||(not7.isEmpty()&&v77.isEmpty())){

            notasiete = 0;
            uvsiete=0;


        }else{
            notasiete =  Integer.parseInt(nota7.getText().toString());

            uvsiete =  Integer.parseInt(uv7.getText().toString());
        }
        //nota 7====================================================
        if((not8.isEmpty()&&!v88.isEmpty())||(!not8.isEmpty()&&v88.isEmpty())||(not8.isEmpty()&&v88.isEmpty())){

            notaocho = 0;
            uvocho=0;


        }else{
            notaocho =  Integer.parseInt(nota8.getText().toString());

            uvocho =  Integer.parseInt(uv8.getText().toString());
        }
        //nota 8=====================================================================
        if((not9.isEmpty()&&!v99.isEmpty())||(!not9.isEmpty()&&v99.isEmpty())||(not9.isEmpty()&&v99.isEmpty())){

            notanueve = 0;
            uvnueve=0;


        }else{
            notanueve =  Integer.parseInt(nota9.getText().toString());

            uvnueve =  Integer.parseInt(uv9.getText().toString());
        }
        //nota9-====================================
        if((not10.isEmpty()&&!v10.isEmpty())||(!not10.isEmpty()&&v10.isEmpty())||(not10.isEmpty()&&v10.isEmpty())){

            notadiez = 0;
            uvdiez=0;


        }else{
            notadiez =  Integer.parseInt(nota10.getText().toString());

            uvdiez =  Integer.parseInt(uv10.getText().toString());
        }
        //============================================================nota 10
        if((not11.isEmpty()&&!v111.isEmpty())||(!not11.isEmpty()&&v111.isEmpty())||(not11.isEmpty()&&v111.isEmpty())){

            notaonce = 0;
            uvonce=0;


        }else{
            notaonce =  Integer.parseInt(nota11.getText().toString());

            uvonce =  Integer.parseInt(uv11.getText().toString());
        }
        //==============nota11
        if((not12.isEmpty()&&!v12.isEmpty())||(!not12.isEmpty()&&v12.isEmpty())||(not12.isEmpty()&&v12.isEmpty())){

            notadoce = 0;
            uvdoce=0;


        }else{
            notadoce =  Integer.parseInt(nota12.getText().toString());

            uvdoce =  Integer.parseInt(uv12.getText().toString());
        }
        //=================nota12

        float UVS = uvuno+uvdos+uvtres+uvcuatro+uvcinco+uvseis+uvsiete+uvocho+uvnueve+uvdiez+uvonce+uvdoce;
        int num1 =  notauno* uvuno;
        int num2 =  notados* uvdos;
        int num3 =  notatres* uvtres;
        int num4 =  notacuatro* uvcuatro;
        int num5 =  notacinco* uvcinco;
        int num6 =  notaseis* uvseis;
        int num7 =  notasiete* uvsiete;
        int num8 =  notaocho* uvocho;
        int num9 =  notanueve* uvnueve;
        int num10 =  notadiez* uvdiez;
        int num11 =  notaonce* uvonce;
        int num12 =  notadoce* uvdoce;
        if(UVS==0){
            Toast.makeText(this, "No ingresaste suficientes UV", Toast.LENGTH_LONG).show();
            UVS=1;

        }
        float promedio1 =  (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10+num11+num12)/UVS;

        String v = String.format("%.2f", promedio1) + "";
        Intent ventan2 =  new Intent(this,MainActivity2.class);
        ventan2.putExtra("promedio",v);
        startActivity(ventan2);


        uv1.setText(null);
        uv2.setText(null);
        uv3.setText(null);
        uv4.setText(null);
        uv5.setText(null);
        uv6.setText(null);
        uv7.setText(null);
        uv8.setText(null);
        uv9.setText(null);
        uv10.setText(null);
        uv11.setText(null);
        uv12.setText(null);

        nota1.setText(null);
        nota2.setText(null);
        nota3.setText(null);
        nota4.setText(null);
        nota5.setText(null);
        nota6.setText(null);
        nota7.setText(null);
        nota8.setText(null);
        nota9.setText(null);
        nota10.setText(null);
        nota11.setText(null);
        nota12.setText(null);


    }//suma
}