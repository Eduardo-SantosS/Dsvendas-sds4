package com.cursosds.dsvendas.services;

import com.cursosds.dsvendas.dto.SaleDTO;
import com.cursosds.dsvendas.dto.SaleSuccessDTO;
import com.cursosds.dsvendas.dto.SaleSumDTO;
import com.cursosds.dsvendas.entities.Sale;
import com.cursosds.dsvendas.repositories.SaleRepository;
import com.cursosds.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDTO::new);
    }

    @Transactional
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
