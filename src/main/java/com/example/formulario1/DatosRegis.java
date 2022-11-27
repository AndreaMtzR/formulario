package com.example.formulario1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DatosRegis extends AppCompatActivity {
      private TextView nom,apei,col,cp,est,muni;
     Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_regis);

         nom= (TextView) findViewById(R.id.nombre);
         apei= (TextView)findViewById(R.id.apellido);
         col= (TextView)findViewById(R.id.colonia);
         cp= (TextView)findViewById(R.id.cp);
         est= (TextView)findViewById(R.id.estado);
         muni= (TextView)findViewById(R.id.municipio);




        String a = getIntent().getStringExtra("a");
        nom.setText(a);
        String b = getIntent().getStringExtra("b");
        apei.setText(b);
        String c = getIntent().getStringExtra("c");
        col.setText(c);
        String d = getIntent().getStringExtra("d");
        cp.setText(d);
        String e = getIntent().getStringExtra("e");
        est.setText(e);
        String f = getIntent().getStringExtra("f");
        muni.setText(f);
    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
        finish();
    }
}