package com.example.CL1_inspiramotos_feignclient.model;


import lombok.Data;

@Data
public class Cliente {
    private int idCliente;
    private String nombre;
    private String email;
    private String telefono;
    private String fechaRegistro;
}
