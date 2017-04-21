package com.ejercicios.omar.ejerciciobambu.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejercicios.omar.ejerciciobambu.R;
import com.ejercicios.omar.ejerciciobambu.adapters.PublicacionesAdapter;
import com.ejercicios.omar.ejerciciobambu.models.Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class FragmentComunidad extends Fragment {

    List<Publicaciones> publicaciones;
    RecyclerView recyclerView;
    PublicacionesAdapter publicacionesAdapter;
    RecyclerView.LayoutManager layoutManager;



    public FragmentComunidad() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.layout_fragment_comunidad, container, false);
        //seteamos la lista de publicaciones
        publicaciones = this.setPublicaciones();

        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_publicaciones);
        layoutManager = new LinearLayoutManager(getContext());

        //indicammps que no tendra un tamaño fijo
        recyclerView.setHasFixedSize(false);

        //seteamos layoutManager
        recyclerView.setLayoutManager(layoutManager);

        //creamos un obeto Publicaciones adapter y le pasamos la lista de publicaciones
        publicacionesAdapter = new PublicacionesAdapter(publicaciones);
        recyclerView.setAdapter(publicacionesAdapter);
        return  v;

    }


    public List<Publicaciones> setPublicaciones(){
        final String publicacion1 = getResources().getString(R.string.publicacion1);
        final String publicacion2 = getResources().getString(R.string.publicacion2);
        final String publicacion3 = getResources().getString(R.string.publicacion3);

        return new ArrayList<Publicaciones>(){{
            add(new Publicaciones(R.drawable.persona2,"Antonia blancas","Martes 14:23",publicacion1,16,"265 comentarios"));
            add(new Publicaciones(R.drawable.persona1,"German Garcia","Lunes 22:56",publicacion2,24,"18 comentarios"));
            add(new Publicaciones(R.drawable.persona3,"Inez Gomez","Domingo 4:23",publicacion3,10,"25 comentarios"));

        }};
    }
}


