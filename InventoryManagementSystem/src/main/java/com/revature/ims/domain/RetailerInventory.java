package com.revature.ims.domain;

import javax.persistence.*;

/**
 * Created by socce on 7/6/2017.
 */
@Entity
@Table(name="RETAILER_INVENTORY")
public class RetailerInventory {

    private Integer ri_id;
    private Retailer ri_retailer;
    private Products ri_product;
    private Integer ri_product_quantity;
    private Integer getRi_product_threshold;

    public RetailerInventory(){}

    @Id
    @Column(name="RI_ID")
    public Integer getRi_id() {
        return ri_id;
    }

    public void setRi_id(Integer ri_id) {
        this.ri_id = ri_id;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="RI_RETAILER")
    public Retailer getRi_retailer() {
        return ri_retailer;
    }

    public void setRi_retailer(Retailer ri_retailer) {
        this.ri_retailer = ri_retailer;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="RI_PRODUCT")
    public Products getRi_product() {
        return ri_product;
    }

    public void setRi_product(Products ri_product) {
        this.ri_product = ri_product;
    }

    @Column(name="RI_PRODUCT_QUANTITY")
    public Integer getRi_product_quantity() {
        return ri_product_quantity;
    }

    public void setRi_product_quantity(Integer ri_product_quantity) {
        this.ri_product_quantity = ri_product_quantity;
    }

    @Column(name="RI_PRODUCT_THRESHOLD")
    public Integer getGetRi_product_threshold() {
        return getRi_product_threshold;
    }

    public void setGetRi_product_threshold(Integer getRi_product_threshold) {
        this.getRi_product_threshold = getRi_product_threshold;
    }

    @Override
    public String toString() {
        return "RetailerInventory{" +
                "ri_id=" + ri_id +
                ", ri_retailer=" + ri_retailer +
                ", ri_product=" + ri_product +
                ", ri_product_quantity=" + ri_product_quantity +
                ", getRi_product_threshold=" + getRi_product_threshold +
                '}';
    }
}
