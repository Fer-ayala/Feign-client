package com.example.CL1_inspiramotos_feignclient.feignclient;

import com.example.CL1_inspiramotos_feignclient.model.Pago;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "apipagos", url = "http://localhost:8080/apimotos/v1/pagos")
public interface FeignClientPagos {
    @GetMapping("")
    List<Pago> obtenerPagos();
}
