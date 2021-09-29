package com.cursosds.dsvendas.dto;

import com.cursosds.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO() {

    }

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
