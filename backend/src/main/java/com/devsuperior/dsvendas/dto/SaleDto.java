package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDto implements Serializable {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDto seller;

    public SaleDto(){}

    public SaleDto(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDto seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public SaleDto(Sale sale) {
        id = sale.getId();
        visited = sale.getVisited();
        deals = sale.getDeals();
        amount = sale.getAmount();
        date = sale.getDate();
        seller = new SellerDto(sale.getSeller());
    }

    public Long getId() {
        return id;
    }

    public Integer getVisited() {
        return visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public SellerDto getSeller() {
        return seller;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSeller(SellerDto seller) {
        this.seller = seller;
    }
}
