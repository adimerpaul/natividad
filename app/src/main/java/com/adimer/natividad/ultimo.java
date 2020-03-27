package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ultimo extends AppCompatActivity {
String sintoma;
String p1="";
Button continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ultimo );
        sintoma = getIntent().getStringExtra("sintoma");
        continuar=(Button)findViewById( R.id.continuar );
    }
    public void atras(View view){
        Intent intent2 = new Intent (view.getContext(), como.class);
        startActivityForResult(intent2, 0);
    }
    public void si(View view){
        p1="En los últimos 14 días has vuelto de un país con casos de coronavirus o has estado en contacto con alguien que volvió de ahí";
        continuar.setEnabled( true );
    }
    public void no(View view){
        p1="";
        continuar.setEnabled( true );
    }
    public void p2(View view){
        Intent intent2 = new Intent (view.getContext(), p2.class);
        intent2.putExtra( "sintoma",sintoma );
        intent2.putExtra( "p1",p1 );
        startActivityForResult(intent2, 0);
    }
}
