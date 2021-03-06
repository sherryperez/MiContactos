package com.example.sherryperez.micontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros=    getIntent().getExtras();
        String nombre=        parametros.getString(getResources().getString(R.string.pnombre)); //nombre
        String telefono=      parametros.getString(getResources().getString(R.string.ptelefono)); //telefono
        String email=         parametros.getString(getResources().getString(R.string.pemail)); //email

        TextView tvNombre=    (TextView) findViewById(R.id.tvNombre);
        TextView tvTelefono=  (TextView) findViewById(R.id.tvTelefono);
        TextView tvEmail=     (TextView) findViewById(R.id.tvEmail);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);

    }
}
