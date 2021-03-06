package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.dto.SaleSuccessDto;
import com.devsuperior.dsvendas.dto.SaleSumDto;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        var response = service.findAll(pageable);

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller(){
        var response = service.amountGroupedBySeller();

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller(){
        var response = service.successGroupedBySeller();

        return ResponseEntity.ok(response);
    }

}
