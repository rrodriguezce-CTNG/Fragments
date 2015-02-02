package com.example.tarde.fragments;

import android.app.Fragment;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;

/**
 * Created by tarde on 02/02/2015.
 */
public class ListadoFragment extends Fragment {

    private ListView listado;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Arrays.asList(
                new CorreoElectronico("Remitente 1", "Asunto 1", "Contenido 1"),
                new CorreoElectronico("Remitente 2", "Asunto 2", "Contenido 2"),
                new CorreoElectronico("Remitente 3", "Asunto 3", "Contenido 3"),
                new CorreoElectronico("Remitente 4", "Asunto 4", "Contenido 4")
        );

        listado = (ListView)getActivity().findViewById(R.id.listView_fragment_listado);

        ListAdapter adaptadorCorreos = new ArrayAdapter<CorreoElectronico>(getActivity(), android.R.layout.simple_expandable_list_item_1);
        listado.setAdapter(adaptadorCorreos);



    }

    public void setOnClickListenerListadoCorreos(AdapterView.OnItemClickListener listener){
        listado.setOnItemClickListener(listener);
    }

}
