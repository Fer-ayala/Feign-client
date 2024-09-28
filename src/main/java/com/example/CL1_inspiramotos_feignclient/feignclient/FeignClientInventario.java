package com.example.CL1_inspiramotos_feignclient.feignclient;

import com.example.CL1_inspiramotos_feignclient.model.Pago;
import com.example.CL1_inspiramotos_feignclient.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "inventarioapi", url = "http://localhost:8081/apimotos/v1/productos")
public interface FeignClientInventario {

    @GetMapping("")
    List<Producto> obtenerProductos();
}
