package com.example.admin.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.admin.Informacion;
import com.example.admin.Perfil;
import com.example.admin.R;
import com.example.admin.Vehiculos;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.vehiculos, R.string.perfil, R.string.informacion};
    private final Context mContext;


    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                Vehiculos tab1c = new Vehiculos();
                return tab1c;

            case 1:
                Perfil tab2c = new Perfil();
                return tab2c;

            case 2:
                Informacion tab3c = new Informacion();
                return tab3c;

        }


        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}