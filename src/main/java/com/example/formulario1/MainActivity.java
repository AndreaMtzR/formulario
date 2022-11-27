package com.example.formulario1;
//Andrea Martinez Ruiz 09/2022

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nom,ap,col,cpo,est,muni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom=(EditText)findViewById(R.id.etnombre);
        ap=(EditText)findViewById(R.id.etApellido);
        col=(EditText)findViewById(R.id.eTcolonia);
        cpo=(EditText)findViewById(R.id.etcp);
        est=(EditText)findViewById(R.id.etEstado);
        muni=(EditText)findViewById(R.id.etMunicipio);

    }
    public void limpiar(View view){
        nom.setText("");
        ap.setText("");
        col.setText("");
        cpo.setText("");
        est.setText("");
        muni.setText("");
    }
    public void registrar(View view){
        Intent registrar = new Intent(this, DatosRegis.class);
        registrar.putExtra("a",nom.getText().toString());
        registrar.putExtra("b",ap.getText().toString());
        registrar.putExtra("c",col.getText().toString());
        registrar.putExtra("d",cpo.getText().toString());
        registrar.putExtra("e",est.getText().toString());
        registrar.putExtra("f",muni.getText().toString());
        startActivity(registrar);
        finish();

        String nombre=nom.getText().toString();
        String apellido=ap.getText().toString();
        String colonia= col.getText().toString();
        String cp=cpo.getText().toString();
        String estado=est.getText().toString();
        String municipio=muni.getText().toString();
        if (!nombre.isEmpty()&& !apellido.isEmpty()&& !colonia.isEmpty()&& !cp.isEmpty()&& !estado.isEmpty()&&!municipio.isEmpty()){
            Toast.makeText(this, "Registrando datos.......", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Favor de llenar los campos vacios",Toast.LENGTH_SHORT).show();
        }



    }
}