package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class p4 extends AppCompatActivity {
String sintoma;
    String p1;
    String p2;
    String p3;
    TextView ci;
    TextView nombre;
    TextView direccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_p4 );
        sintoma = getIntent().getStringExtra("sintoma");
        p1 = getIntent().getStringExtra("p1");
        p2 = getIntent().getStringExtra("p2");
        p3 = getIntent().getStringExtra("p3");
        TextView titulo=(TextView)findViewById(R.id.titulo1);
        TextView texto=(TextView)findViewById(R.id.texto1);
        TextView ci=(TextView)findViewById(R.id.ci);
        TextView nombre=(TextView)findViewById(R.id.nombre);
        TextView direccion=(TextView)findViewById(R.id.direccion);
        LinearLayout datos=(LinearLayout) findViewById(R.id.datos);
//        Toast.makeText(this, sintoma+"------"+p1+"------"+p2+"------"+p3,
//                Toast.LENGTH_LONG).show();
        if (!p1.equals("") || !p2.equals("") || !p3.equals("") ){
            titulo.setText("Podrías estar en riesgo de desarrollar la enfermedad.");
            titulo.setTextColor(Color.parseColor("#d50000"));
            texto.setText("Debido a que has estado en una zona con alto riesgo de transmisión del COVID-19, podrías estar en riesgo de haber contraído el COVID-19.\n" +
                    "\n" +
                    "Aunque no se considera un caso sospechoso, como medida preventiva debes permanecer en cuarentena durante 14 días, contados desde tu ingreso al país.\n" +
                    "\n" +
                    "Debes estar atento a la aparición de síntomas adicionales (tos, dolor de garganta, dificultad para respirar, congestión nasal, fiebre). Si tus síntomas son leves, deberás permanecer y recuperarte en tu casa.\n" +
                    "\n" +
                    "Toma en cuenta que puedes realizar este cuestionario las veces que consideres necesario o ante la aparición de nuevos síntomas.");
            datos.setVisibility(View.VISIBLE);
        }
    }
    public void atras(View view){
        Intent intent2 = new Intent (view.getContext(), MainActivity.class);
        startActivityForResult(intent2, 0);
    }
    public void enviardatos(View view){
//                Toast.makeText(this, sintoma+"------"+p1+"------"+p2+"------"+p3,
//                Toast.LENGTH_LONG).show();
//        Intent viewIntent =new Intent("android.intent.action.VIEW", Uri.parse("https://api.whatsapp.com/send?phone=59172464859&text=Sintomas:'"+sintoma+"',"+p1+","+p1+","+p1+","+ci.getText()+","+nombre.getText()+","+direccion.getText()+" "));
//        startActivity(viewIntent);
        Intent viewIntent =new Intent("android.intent.action.VIEW",Uri.parse("https://api.whatsapp.com/send?phone=59172464859&text=Gracias por utilizar nuestra aplicacion realize su consulta sobre el COVID-19 y le atenderemos con gusto"));
        startActivity(viewIntent);
    }
}
