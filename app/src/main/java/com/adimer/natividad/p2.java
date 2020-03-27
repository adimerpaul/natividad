package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p2 extends AppCompatActivity {
    String sintoma;
    String p1="";
    String p2="";
    Button continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_p2 );
        sintoma = getIntent().getStringExtra("sintoma");
        p1 = getIntent().getStringExtra("p1");
        continuar=(Button)findViewById( R.id.continuar );
    }
    public void atras(View view){
        Intent intent2 = new Intent (view.getContext(), como.class);
        startActivityForResult(intent2, 0);
    }
    public void si(View view){
        p2="Has estado en contacto con una persona con diagnóstico confirmado de COVID-19";
        continuar.setEnabled( true );
    }
    public void no(View view){
        p2="";
        continuar.setEnabled( true );
    }
    public void p3(View view){
        Intent intent2 = new Intent (view.getContext(), p3.class);
        intent2.putExtra( "sintoma",sintoma );
        intent2.putExtra( "p1",p1 );
        intent2.putExtra( "p2",p2 );
        startActivityForResult(intent2, 0);
    }
}
