package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    public void num1(View view) {
        Intent viewIntent =new Intent("android.intent.action.VIEW",Uri.parse("https://api.whatsapp.com/send?phone=59172464859&text=Gracias por utilizar nuestra aplicacion realize su consulta sobre el COVID-19 y le atenderemos con gusto"));
        startActivity(viewIntent);
    }
    public void num2(View view) {
        Intent viewIntent =new Intent("android.intent.action.VIEW",Uri.parse("https://api.whatsapp.com/send?phone=59173832819&text=Gracias por utilizar nuestra aplicacion realize su consulta sobre el COVID-19 y le atenderemos con gusto"));
        startActivity(viewIntent);
    }
    public void num3(View view) {
        Intent viewIntent =new Intent("android.intent.action.VIEW",Uri.parse("https://api.whatsapp.com/send?phone=59172464859&text=Gracias por utilizar nuestra aplicacion realize su consulta sobre el COVID-19 y le atenderemos con gusto"));
        startActivity(viewIntent);
    }
    public void num4(View view) {
        Intent viewIntent =new Intent("android.intent.action.VIEW",Uri.parse("https://api.whatsapp.com/send?phone=59172466917&text=Gracias por utilizar nuestra aplicacion realize su consulta sobre el COVID-19 y le atenderemos con gusto"));
        startActivity(viewIntent);
    }
    public void covid(View view) {
        Intent intent2 = new Intent (view.getContext(), covid.class);
        startActivityForResult(intent2, 0);
    }
    public void reco(View view) {
        Intent intent2 = new Intent (view.getContext(), Recomendacion.class);
        startActivityForResult(intent2, 0);
    }
    public void llamar(View view) {
//        Uri num = Uri.parse("tel:+5261245");
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:78610575"));
//        startActivity(i);
        if (ActivityCompat.checkSelfPermission( MainActivity.this, Manifest.permission.CALL_PHONE )!= PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(i);
    }
}
