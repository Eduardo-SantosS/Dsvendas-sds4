package com.cursosds.dsvendas.dto;

import com.cursosds.dsvendas.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleSumDTO implements Serializable {

    private String saleName;
    private Double sum;

    public SaleSumDTO() {

    }

    public SaleSumDTO(Seller seller, Double sum) {
        saleName = seller.getName();
        this.sum = sum;
    }
}
