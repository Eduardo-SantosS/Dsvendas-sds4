package com.cursosds.dsvendas.dto;

import com.cursosds.dsvendas.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleSuccessDTO implements Serializable {

    private String saleName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO() {

    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        saleName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
