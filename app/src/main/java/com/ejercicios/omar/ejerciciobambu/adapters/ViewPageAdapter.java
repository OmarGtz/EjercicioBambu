package com.ejercicios.omar.ejerciciobambu.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ejercicios.omar.ejerciciobambu.activities.MainActivity;
import com.ejercicios.omar.ejerciciobambu.fragments.FragmentCalificados;
import com.ejercicios.omar.ejerciciobambu.fragments.FragmentComunidad;

import static com.ejercicios.omar.ejerciciobambu.activities.MainActivity.FRAGMENT_CALIFICADOS;
import static com.ejercicios.omar.ejerciciobambu.activities.MainActivity.FRAGMENT_COMUNIDAD;

/**
 * Created by Dagorik on 20/04/2017.
 */

public class ViewPageAdapter extends FragmentPagerAdapter{

    //numero de tabs
    private int numberOfTabs;

    public ViewPageAdapter(FragmentManager fm, MainActivity context, int numberOfTaps) {
        super(fm);
        this.numberOfTabs = numberOfTaps;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case FRAGMENT_COMUNIDAD:
                return new FragmentComunidad();

            case FRAGMENT_CALIFICADOS:
                return new FragmentCalificados();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;

    }
}
