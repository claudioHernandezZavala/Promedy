package ICMA.promedy.Promedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.Promedy.R;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void regresar(View view){
        Intent volver =  new Intent(this,MainActivity.class);
        startActivity(volver);

    }
    public void ayuda2(View view){
        Intent ayuda =  new Intent(this,ayudaAcademica.class);
        startActivity(ayuda);
    }
    public void estimar(View view){
        Intent ventan22 =  new Intent(this,
                estActivity.class);
        startActivity(ventan22);

    }
    public void anuncios(View view){
        Intent ventan22 =  new Intent(this,
                Anuncios.class);
        startActivity(ventan22);

    }
}