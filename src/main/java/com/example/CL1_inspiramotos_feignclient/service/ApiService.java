package com.example.CL1_inspiramotos_feignclient.service;

import com.example.CL1_inspiramotos_feignclient.feignclient.FeignClientBoredApi;
import com.example.CL1_inspiramotos_feignclient.feignclient.FeignClientInventario;
import com.example.CL1_inspiramotos_feignclient.feignclient.FeignClientPagos;
import com.example.CL1_inspiramotos_feignclient.model.Pago;
import com.example.CL1_inspiramotos_feignclient.model.Producto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApiService {

    @Autowired
    private FeignClientBoredApi feignClientBoredApi;

    @Autowired
    private FeignClientInventario feignClientInventario;

    @Autowired
    private FeignClientPagos feignClientPagos;

    public String getCombinedData() {
        Object dataFromApi1 = feignClientBoredApi.obtenerActividad();
        List<Producto> dataFromApi2 = feignClientInventario.obtenerProductos();
        List<Pago> dataFromApi3 = feignClientPagos.obtenerPagos();

        return String.format("Data from API 1: %s, Data from API 2: %s, Data from API 3: %s",
                dataFromApi1, dataFromApi2, dataFromApi3);
    }
}
