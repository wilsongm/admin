package com.example.admin;

public class InformacionVo {

    public InformacionVo(String marca, String fechaDesde, String fechaHasta, String precio, int fotos) {
        Marca = marca;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        Precio = precio;
        this.fotos = fotos;
    }

    private String Marca;
    private String fechaDesde;
    private String fechaHasta;
    private  String Precio;
    private int  fotos;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public int getFotos() {
        return fotos;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }
}
