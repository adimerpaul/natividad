package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tienes extends AppCompatActivity {
    String sintoma="";
    Button continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tienes );
        String valor = getIntent().getStringExtra("tiene");
        continuar=(Button)findViewById( R.id.continuar );
    }
    public void ultimo(View view){
        Intent intent2 = new Intent (view.getContext(), ultimo.class);
        intent2.putExtra( "sintoma",sintoma );
        startActivityForResult(intent2, 0);
    }
    public void tos(View view){
        view.setEnabled( false );
        sintoma=sintoma+"tos,";
        continuar.setEnabled( true );
    }
    public void dolor(View view){
        view.setEnabled( false );
        sintoma=sintoma+"dolor,";
        continuar.setEnabled( true );
    }
    public void dificultad(View view){
        view.setEnabled( false );
        sintoma=sintoma+"dificultad,";
        continuar.setEnabled( true );
    }
    public void congestion(View view){
        view.setEnabled( false );
        sintoma=sintoma+"congestion,";
        continuar.setEnabled( true );
    }
    public void fiebre(View view){
        view.setEnabled( false );
        sintoma=sintoma+"fiebre,";
        continuar.setEnabled( true );
    }
    public void atras(View view){
        Intent intent2 = new Intent (view.getContext(), como.class);
        startActivityForResult(intent2, 0);
    }

}
