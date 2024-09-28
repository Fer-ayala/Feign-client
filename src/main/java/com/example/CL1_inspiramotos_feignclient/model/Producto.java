package com.example.CL1_inspiramotos_feignclient.model;

import lombok.Data;

@Data
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidad;
}
