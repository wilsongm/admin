package com.example.admin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Informacion extends Fragment  {


    ArrayList<InformacionVo> ListInformacion;
    RecyclerView recyclerInformacion;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.informacion,container,false);




        ListInformacion = new ArrayList<>();

        recyclerInformacion =view.findViewById(R.id.listInformacion);
        recyclerInformacion.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        LlenarInformacion();

        AdapterDatos_Informacion adapter = new AdapterDatos_Informacion(ListInformacion);
        recyclerInformacion.setAdapter(adapter);
        return view;

    }

    private void LlenarInformacion() {


        ListInformacion.add(new InformacionVo("Mitsubishi mirage G4" , "20/12/2017  13:00 ", "21/12/2017  13:00 ", "RD$ 3,809,65 ",R.drawable.auto1));
        ListInformacion.add(new InformacionVo("Mitsubishi mirage" , "20/11/2017  13:00 ", "22/11/2017  13:00 ", "RD$ 6,809,65 ",R.drawable.auto2));
        ListInformacion.add(new InformacionVo("Mitsubishi mirage G4" , "20/12/2017  13:00 ", "21/12/2017  13:00 ", "RD$ 3,809,65 ",R.drawable.auto5));
        ListInformacion.add(new InformacionVo("Mitsubishi mirage G4" , "20/12/2017  13:00 ", "21/12/2017  13:00 ", "RD$ 3,809,65 ",R.drawable.auto3));
        ListInformacion.add(new InformacionVo("Mitsubishi mirage G4" , "20/12/2017  13:00 ", "21/12/2017  13:00 ", "RD$ 3,809,65 ",R.drawable.auto4));

      

         
    }
}
