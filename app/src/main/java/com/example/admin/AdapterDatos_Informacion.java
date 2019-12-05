package com.example.admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos_Informacion extends RecyclerView.Adapter<AdapterDatos_Informacion.ViewHolderInformacion> {


    ArrayList<InformacionVo> ListInformacion;

    public AdapterDatos_Informacion(ArrayList<InformacionVo> listInformacion) {
        ListInformacion = listInformacion;
    }

    @NonNull
    @Override
    public ViewHolderInformacion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_informacion,null,false);
        return new ViewHolderInformacion(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderInformacion holder, int position) {

        holder.txtMarca.setText(ListInformacion.get(position).getMarca());
        holder.FechaHasta.setText(ListInformacion.get(position).getFechaDesde());
        holder.FechaHasta.setText(ListInformacion.get(position).getFechaHasta());
        holder.Precio.setText(ListInformacion.get(position).getPrecio());

        holder.foto.setImageResource(ListInformacion.get(position).getFotos());


    }

    @Override
    public int getItemCount() {
        return ListInformacion.size();
    }

    public class ViewHolderInformacion extends RecyclerView.ViewHolder {

        TextView txtMarca,FechaDesde,FechaHasta,Precio;
        ImageView foto;

        public ViewHolderInformacion(@NonNull View itemView) {


            super(itemView);


            txtMarca = itemView.findViewById(R.id.idMarca);
            FechaDesde = itemView.findViewById(R.id.fechaDesde);
            Precio = itemView.findViewById(R.id.idPrecioInf);
            FechaHasta = itemView.findViewById(R.id.fechahasta);
            foto = (ImageView) itemView.findViewById(R.id.FotoInf);
        }

    }
}
