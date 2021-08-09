package ICMA.promedy.Promedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.Promedy.R;

public class opcionesdeAyuda1 extends AppCompatActivity {
    private String dato;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcionesde_ayuda1);
        dato = getIntent().getStringExtra("curso");
    }


    public void youtube(View view1){
         url =  "https://www.youtube.com/results?search_query="+dato;
        Intent ventan2 =  new Intent(this,webActivity.class);
        ventan2.putExtra("url",url);
        startActivity(ventan2);
       // overridePendingTransition(R.anim.in,R.anim.out);
    }
    public void khan(View view2){
        url= "https://es.khanacademy.org/search?referer=%2F&page_search_query="+dato;
        Intent ventan2 =  new Intent(this,webActivity.class);
        ventan2.putExtra("url",url);
        startActivity(ventan2);
    }

}