package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class como extends AppCompatActivity {
    Button continuar;
    String sintoma="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_como );
        continuar = (Button) findViewById(R.id.continuar);
    }
    public void mal(View view) {
        continuar.setEnabled( true );
        sintoma="Con sintomas";
    }
    public void bien(View view) {
        continuar.setEnabled( true );
        sintoma="Sin sintomas";
    }
    public void tienes(View view){

        if(sintoma.equals("Sin sintomas")){
            Intent intent2 = new Intent (view.getContext(), ultimo.class);
            intent2.putExtra("sintoma", sintoma);
//            intent2.putExtra("sintoma", sintoma);
            startActivityForResult(intent2, 0);
        }else{
            Intent intent2 = new Intent (view.getContext(), tienes.class);
//            intent2.putExtra("sintoma", sintoma);
//            intent2.putExtra("sintoma", sintoma);
            startActivityForResult(intent2, 0);
        }

    }
}
