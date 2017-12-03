package com.example.sherryperez.micontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos= new ArrayList<contacto>();

        contactos.add(new contacto("Sherry Perez","999956789","sherry@gmail.com"));
        contactos.add(new contacto("Santiago Maradiaga ","88887654","santiago@outlook.com"));
        contactos.add(new contacto("Walter Maradiaga","33334567","walter@yahoo.com"));
        contactos.add(new contacto("Jaky Reyes","444456789","jaky@gmail.com"));
        contactos.add(new contacto("Reyna Flores","555567890","reyna@yahoo.com"));

        ArrayList<String> nombresContacto= new ArrayList<>();
        for (contacto contacto:contactos ) {
          nombresContacto.add(contacto.getNombre());


        }
        ListView lstContactos= (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            private int position;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(MainActivity.this, DetalleContacto.class);

                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(position).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), contactos.get(position).getEmail());



                startActivity(intent);
            }
        });

    }
}
