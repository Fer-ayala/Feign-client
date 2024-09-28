package com.example.CL1_inspiramotos_feignclient.controller;

import com.example.CL1_inspiramotos_feignclient.service.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/combined")
    public String getCombinedData() {
        return apiService.getCombinedData();
    }
}
