package com.revature.ims.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by David Griffith on 6/27/2017.
 */
@Entity
@Table(name="RETAILER_SALE")
public class RetailerSales {
    private Integer id;
    private Retailer retailer;
    private Products product;
    private Integer productQuantity;
    private Float cost;
    private Date date;

    public RetailerSales(){}

    public RetailerSales(int id, Retailer retailer, Products product, int productQuantity, float cost, Date date){
        this.id = id;
        this.retailer = retailer;
        this.product = product;
        this.productQuantity = productQuantity;
        this.cost = cost;
        this.date = date;
    }

    @Override
    public String toString() {
        return "RetailerSales{" +
                "id=" + id +
                ", retailer=" + retailer +
                ", product=" + product +
                ", productQuantity=" + productQuantity +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }

    @Id
    @Column(name="RS_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="RS_RETAILER")
    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="RS_PRODUCT")
    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    @Column(name="RS_PRODUCT_QUANTITY")
    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Column(name="RS_COST")
    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Column(name="RS_TS")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
