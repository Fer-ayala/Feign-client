package com.example.CL1_inspiramotos_feignclient.feignclient;

import com.example.CL1_inspiramotos_feignclient.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "boredapi", url = "https://restcountries.com/v3.1/all")
public interface FeignClientBoredApi {
    @GetMapping("")
    Object obtenerActividad();
}
