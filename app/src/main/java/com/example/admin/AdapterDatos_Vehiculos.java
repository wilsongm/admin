package com.example.admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterDatos_Vehiculos extends RecyclerView.Adapter<AdapterDatos_Vehiculos.ViewHolderVehiculo>
    implements View.OnClickListener{

    ArrayList<VehiculosVo> ListVehiculo;
    private View.OnClickListener listener;

    public AdapterDatos_Vehiculos(ArrayList<VehiculosVo> listVehiculo) {
        ListVehiculo = listVehiculo;
    }

    @NonNull
    @Override
    public ViewHolderVehiculo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_vehiculos,null,false);

        view.setOnClickListener(this);

        return new ViewHolderVehiculo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderVehiculo holder, int position) {

        holder.txtMarca.setText(ListVehiculo.get(position).getMarca());
        holder.txtEstado.setText(ListVehiculo.get(position).getEstado());
        holder.txtauto.setText(ListVehiculo.get(position).getInf());

        holder.foto.setImageResource(ListVehiculo.get(position).getFotos());

    }

    @Override
    public int getItemCount() {
        return ListVehiculo.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;

    }
    @Override
    public void onClick(View view) {

        if(listener!=null){
            listener.onClick(view);
        }


    }


    public class ViewHolderVehiculo extends RecyclerView.ViewHolder {

        TextView txtMarca,txtauto,txtEstado,Precio;
        ImageView foto;


        public ViewHolderVehiculo(View itemView) {
            super(itemView);

            txtMarca = itemView.findViewById(R.id.idMarca);
            txtEstado = itemView.findViewById(R.id.idEstado);
            Precio = itemView.findViewById(R.id.idPrecio);
            txtauto = itemView.findViewById(R.id.auto);

            foto = (ImageView) itemView.findViewById(R.id.idFoto);


        }
    }
}
