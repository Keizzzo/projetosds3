package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true) //readOnly => não fazer lock no BD
    public Page<SaleDto> findAll(Pageable pageable){
        sellerRepository.findAll(); // JPARepository Armazena em Cache e Evita busca repetitiva de vendedores
        var result =  repository.findAll(pageable);

        return result.map(SaleDto::new);
    }

}
