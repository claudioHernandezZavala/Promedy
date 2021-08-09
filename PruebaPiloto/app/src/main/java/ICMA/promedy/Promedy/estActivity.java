package ICMA.promedy.Promedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.Promedy.R;

import java.security.SecureRandom;

public class estActivity extends AppCompatActivity {
    private EditText promedioIdeal;
    private EditText nombreclase1;
    private  EditText nombreclase2;
    private  EditText nombreclase3;
    private  EditText nombreclase4;
    private  EditText nombreclase5;
    private  EditText uv1;
    private  EditText uv2;
    private  EditText uv3;
    private  EditText uv4;
    private  EditText uv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_est);

        nombreclase1 =  (EditText)findViewById(R.id.NombreClase1);
        promedioIdeal =  (EditText)findViewById(R.id.indiceDeseado);
        nombreclase2 = (EditText)findViewById(R.id.nombreClase2);
        nombreclase3 = (EditText)findViewById(R.id.nombreClase3);
        nombreclase4 = (EditText)findViewById(R.id.nombreClase4);
        nombreclase5 = (EditText)findViewById(R.id.nombreClase5);
        uv1 = (EditText)findViewById(R.id.uve1);
        uv2 = (EditText)findViewById(R.id.uve2);
        uv3 = (EditText)findViewById(R.id.uve3);
        uv4  = (EditText)findViewById(R.id.uve4);
        uv5  = (EditText)findViewById(R.id.uve5);

    }

    public void estimar(View view){
        SecureRandom v = new SecureRandom();
        String nom1= nombreclase1.getText().toString();
        String indicei= promedioIdeal.getText().toString();
        String nom2= nombreclase2.getText().toString();
        String nom3= nombreclase3.getText().toString();
        String nom4= nombreclase4.getText().toString();
        String nom5= nombreclase5.getText().toString();
        String uvn1= uv1.getText().toString();
        String uvn2= uv2.getText().toString();
        String uvn3= uv3.getText().toString();
        String uvn4= uv4.getText().toString();
        String uvn5= uv5.getText().toString();


        int nota1temp=0;
        int nota2temp=0;
        int nota3temp=0;
        int nota4temp=0;
        int nota5temp=0;
        int uv1temp=0;
        int uv2temp=0;
        int uv3temp=0;
        int uv4temp=0;
        int uv5temp=0;
        int promedioAlcanzar ;
        if(!indicei.isEmpty()){

            promedioAlcanzar = Integer.parseInt(promedioIdeal.getText().toString());

            if((nom1.isEmpty()&&!uvn1.isEmpty())||(!nom1.isEmpty()&&uvn1.isEmpty())||(nom1.isEmpty()&&uvn1.isEmpty())){
                nota1temp = 0;
                uv1temp=0;

            }else{

                uv1temp =  Integer.parseInt(uvn1);


            }
            //nota1=====================================================================
            if((nom2.isEmpty()&&!uvn2.isEmpty())||(!nom2.isEmpty()&&uvn2.isEmpty())||(nom2.isEmpty()&&uvn2.isEmpty())){
                nota2temp = 0;
                uv2temp=0;

            }else{

                uv2temp =  Integer.parseInt(uvn2);


            }
            //nota2============================================================================
            if((nom3.isEmpty()&&!uvn3.isEmpty())||(!nom3.isEmpty()&&uvn3.isEmpty())||(nom3.isEmpty()&&uvn3.isEmpty())){
                nota3temp = 0;
                uv3temp=0;

            }else{

                uv3temp =  Integer.parseInt(uvn3);


            }
            if((nom4.isEmpty()&&!uvn4.isEmpty())||(!nom4.isEmpty()&&uvn4.isEmpty())||(nom4.isEmpty()&&uvn4.isEmpty())){
                nota4temp = 0;
                uv4temp=0;

            }else{

                uv4temp =  Integer.parseInt(uvn4);


            }

            //nota4===============================================================================
            if((nom5.isEmpty()&&!uvn5.isEmpty())||(!nom5.isEmpty()&&uvn5.isEmpty())||(nom5.isEmpty()&&uvn5.isEmpty())){
                nota5temp = 0;
                uv5temp=0;

            }else{

                uv5temp =  Integer.parseInt(uvn2);


            }


            //nota5========================================


            int promedioTemp=0;
            int sumaUVS;
            while((promedioTemp!=promedioAlcanzar)) {
                if (uv1temp != 0) {

                    nota1temp = v.nextInt((100 - promedioAlcanzar) + 1) + promedioAlcanzar;
                    //  Toast.makeText(this, "LLego hasta aleatorio1", Toast.LENGTH_LONG).show();

                }
                if (uv2temp != 0) {

                    nota2temp = v.nextInt((100 - promedioAlcanzar) + 1) + promedioAlcanzar;
                    //  Toast.makeText(this, "LLego hasta ale2", Toast.LENGTH_LONG).show();

                }
                if (uv3temp != 0) {
                    nota3temp = v.nextInt((100 - promedioAlcanzar) + 1) + promedioAlcanzar;
                    //  Toast.makeText(this, "LLego hasta aatorio3", Toast.LENGTH_LONG).show();

                }
                if (uv4temp != 0) {

                    nota4temp = v.nextInt((100 - promedioAlcanzar) + 1) + promedioAlcanzar;
                    //  Toast.makeText(this, "LLego hasta aleatorio4", Toast.LENGTH_LONG).show();

                }
                if (uv5temp != 0) {

                    nota5temp = v.nextInt((100 - promedioAlcanzar) + 1) + promedioAlcanzar;
                }
                sumaUVS = uv1temp + uv2temp + uv3temp + uv4temp + uv5temp;
                //Toast.makeText(this, "LLego hasta asuma de uvs", Toast.LENGTH_LONG).show();

                if (sumaUVS == 0) {
                    sumaUVS = 1;
                }
                int sumanota=(nota1temp*uv1temp)+(nota2temp*uv2temp)+(nota3temp*uv3temp)+(nota4temp*uv4temp)+(nota5temp*uv5temp);
                promedioTemp=(sumanota)/sumaUVS;

            }




            Intent ventan2 =  new Intent(this,resultadosEstimaciones.class);


            // if(uv1temp!=0){
            ventan2.putExtra("nota1",nota1temp);

            //  }
            //  if(uv2temp!=0){
            ventan2.putExtra("nota2",nota2temp);
            //  }
            //   if(uv3temp!=0){
            ventan2.putExtra("nota3",nota3temp);
            //  }
            //  if(uv4temp!=0){
            ventan2.putExtra("nota4",nota4temp);
            //   }
            //   if(uv5temp!=0){
            ventan2.putExtra("nota5",nota5temp);
            //   }
            ventan2.putExtra("promedioAlcanzable",promedioAlcanzar);
            ventan2.putExtra("promediosacaria",promedioTemp);
            ventan2.putExtra("nombre1",nom1);
            ventan2.putExtra("nombre2",nom2);
            ventan2.putExtra("nombre3",nom3);
            ventan2.putExtra("nombre4",nom4);
            ventan2.putExtra("nombre5",nom5);
            startActivity(ventan2);
        }else{
            Toast.makeText(this, "Debes ingresar un índice ", Toast.LENGTH_LONG).show();

        }



    }

}