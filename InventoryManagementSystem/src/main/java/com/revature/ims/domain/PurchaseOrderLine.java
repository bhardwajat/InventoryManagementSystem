package com.revature.ims.domain;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by socce on 7/6/2017.
 */
@Entity
@Table(name="PO_LINE")
public class PurchaseOrderLine {

    private Integer pol_id;
    private PurchaseOrder pol_po;
    private Products pol_product;
    private Integer pol_quantity;
    private Integer pol_cost;

    public PurchaseOrderLine(){}

    @Id
    @Column(name="POL_ID")
    public Integer getPol_id() {
        return pol_id;
    }

    public void setPol_id(Integer pol_id) {
        this.pol_id = pol_id;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="POL_PO")
    public PurchaseOrder getPol_po() {
        return pol_po;
    }

    public void setPol_po(PurchaseOrder pol_po) {
        this.pol_po = pol_po;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="POL_PRODUCT")
    public Products getPol_product() {
        return pol_product;
    }

    public void setPol_product(Products pol_product) {
        this.pol_product = pol_product;
    }

    @Column(name="POL_QUANTITY")
    public Integer getPol_quantity() {
        return pol_quantity;
    }

    public void setPol_quantity(Integer pol_quantity) {
        this.pol_quantity = pol_quantity;
    }

    @Column(name="POL_COST")
    public Integer getPol_cost() {
        return pol_cost;
    }

    public void setPol_cost(Integer pol_cost) {
        this.pol_cost = pol_cost;
    }

    @Override
    public String toString() {
        return "PurchaseOrderLine{" +
                "pol_id=" + pol_id +
                ", pol_po=" + pol_po +
                ", pol_porduct=" + pol_product +
                ", pol_quantity=" + pol_quantity +
                ", pol_cost=" + pol_cost +
                '}';
    }
}
