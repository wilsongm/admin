package com.example.admin;

public class VehiculosVo {

    private String Marca;
    private String Inf;
    private String precio;
    private  String estado;
    private int  fotos;

    public VehiculosVo(){

    }

    public VehiculosVo(String marca, String inf, String precio,String estado, int fotos) {
        Marca = marca;
        Inf = inf;

        this.precio = precio;
        this.estado =estado;
        this.fotos = fotos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getInf() {
        return Inf;
    }

    public void setInf(String inf) {
        Inf = inf;

    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFotos() {
        return fotos;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

}
