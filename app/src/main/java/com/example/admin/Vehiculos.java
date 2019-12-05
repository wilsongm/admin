package com.example.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Vehiculos extends Fragment  {


    ArrayList<VehiculosVo> ListaVehiculo;
    RecyclerView recyclerVehiculos;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.vehiculos,container,false);

        ListaVehiculo = new ArrayList<>();
        recyclerVehiculos =view.findViewById(R.id.Idlist);
        recyclerVehiculos.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        llenarVehiculos();

        AdapterDatos_Vehiculos adapter = new AdapterDatos_Vehiculos(ListaVehiculo);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"Selecion: " +ListaVehiculo.get(recyclerVehiculos.getChildAdapterPosition(view)).getMarca(),Toast.LENGTH_SHORT ).show();

            }
        });
        recyclerVehiculos.setAdapter(adapter);
        return view;
    }

    private void llenarVehiculos() {

        ListaVehiculo.add(new VehiculosVo("Mitsubishi mirage G4" , "Economico ", "RD$ 3,809,65 ", "Disponible",R.drawable.auto1));
        ListaVehiculo.add(new VehiculosVo("Mitsubishi mirage " , "Economico ", "RD$ 3,509,04 ", "Disponible",R.drawable.auto2));
        ListaVehiculo.add(new VehiculosVo("Mitsubishi mirage G4" , "Economico ", "RD$ 3,809,65 ", "Disponible",R.drawable.auto3));
        ListaVehiculo.add(new VehiculosVo("Mitsubishi mirage G4" , "Economico ", "RD$ 3,809,65 ", "Disponible",R.drawable.auto4));
        ListaVehiculo.add(new VehiculosVo("Mitsubishi mirage G4" , "Economico ", "RD$ 3,809,65 ", "Disponible",R.drawable.auto5));

    }

}
