package com.example.CL1_inspiramotos_feignclient.model;

import lombok.Data;

@Data
public class Pago {
    private int idPago;
    private int idCliente;  // No es una relación directa pero se usa como referencia
    private double monto;
    private String fechaPago;  // Puede ser un tipo `Date` en vez de `String`
    private String metodoPago;
}
