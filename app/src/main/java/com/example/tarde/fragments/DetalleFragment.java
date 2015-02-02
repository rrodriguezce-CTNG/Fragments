package com.example.tarde.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tarde on 02/02/2015.
 */
public class DetalleFragment extends Fragment {

    TextView textRemitente;
    TextView textAsunto;
    TextView textContenido;
    //Button btGuardar;
    //Button btCancelar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle, container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textRemitente = (TextView)getActivity().findViewById(R.id.textRemitente);
        textAsunto = (TextView)getActivity().findViewById(R.id.textAsunto);
        textContenido = (TextView)getActivity().findViewById(R.id.textContenido);

        View btGuardar = (Button)getActivity().findViewById(R.id.btGuardar);
        View btCancelar = (Button)getActivity().findViewById(R.id.btCancelar);

    }

    public void actualizarDetalle(CorreoElectronico correo){


    }
}
