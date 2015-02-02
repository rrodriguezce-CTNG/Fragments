package com.example.tarde.fragments;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    DetalleFragment detalleFragment;
    ListadoFragment ListadoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        detalleFragment = (DetalleFragment) fragmentManager.findFragmentById(R.id.fragmento_detalle);
        ListadoFragment = (ListadoFragment) fragmentManager.findFragmentById(R.id.fragmento_listado);

        ListadoFragment.setOnClickListenerListadoCorreos(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        CorreoElectronico item = (CorreoElectronico) parent.getItemAtPosition(position);

        if(detalleFragment != null){

        }
        else{
            Intent intent = new Intent(this, DetalleActivity.class);
            intent.putExtra("correo", item);
        }

    }
}
