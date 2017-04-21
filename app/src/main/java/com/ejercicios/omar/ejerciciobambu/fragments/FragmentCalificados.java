package com.ejercicios.omar.ejerciciobambu.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejercicios.omar.ejerciciobambu.R;


public class FragmentCalificados extends Fragment {


    public FragmentCalificados() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.layout_fragment_calificados, container, false);
    }

}
