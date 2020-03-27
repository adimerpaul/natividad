package com.adimer.natividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class p4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_p4 );
    }
    public void atras(View view){
        Intent intent2 = new Intent (view.getContext(), MainActivity.class);
        startActivityForResult(intent2, 0);
    }
}
