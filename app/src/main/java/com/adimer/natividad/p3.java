package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p3 extends AppCompatActivity {
    String sintoma;
    String p1="";
    String p2="";
    String p3="";
    Button continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_p3 );
        sintoma = getIntent().getStringExtra("sintoma");
        p1 = getIntent().getStringExtra("p1");
        p2 = getIntent().getStringExtra("p2");
        continuar=(Button)findViewById( R.id.continuar );
    }
    public void atras(View view){
        Intent intent2 = new Intent (view.getContext(), como.class);
        startActivityForResult(intent2, 0);
    }
    public void si(View view){
        p3="En los ultimos 14 dias haz vivido o viajado a una ciudad / departamento que tenga caso confirmado de COVID-19";
        continuar.setEnabled( true );
    }
    public void no(View view){
        p3="";
        continuar.setEnabled( true );
    }
    public void p4(View view){
        Intent intent2 = new Intent (view.getContext(), p4.class);
        intent2.putExtra( "sintoma",sintoma );
        intent2.putExtra( "p1",p1 );
        intent2.putExtra( "p2",p2 );
        intent2.putExtra( "p3",p3 );
        startActivityForResult(intent2, 0);
    }
}
