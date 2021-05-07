package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDto implements Serializable {
    private String sellerName;
    private Double sum;

    public SaleSumDto(){}

    public SaleSumDto(Seller sellerName, Double sum) {
        this.sellerName = sellerName.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
