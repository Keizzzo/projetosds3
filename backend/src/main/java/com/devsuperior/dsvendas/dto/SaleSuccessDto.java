package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDto implements Serializable {
    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDto(){}

    public SaleSuccessDto(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public Long getVisited() {
        return visited;
    }

    public Long getDeals() {
        return deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}
