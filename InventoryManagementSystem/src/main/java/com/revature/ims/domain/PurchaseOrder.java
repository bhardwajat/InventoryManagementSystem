package com.revature.ims.domain;

/**
 * Created by akshat on 6/27/17.
 */
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="PURCHASE_ORDER")
public class PurchaseOrder {
    private Integer po_id;
    private Date po_timestamp;
    private Supplier po_supplier;
    private Retailer po_retailer;
    private Double po_cost;

    public PurchaseOrder(){

    }

    public PurchaseOrder(int po_id, Date po_timestamp, Supplier po_supplier, Retailer po_retailer, double po_cost){
        this.po_id = po_id;
        this.po_timestamp = po_timestamp;
        this.po_supplier = po_supplier;
        this.po_retailer = po_retailer;
        this.po_cost = po_cost;
    }

    @Id
    @Column(name="PO_ID")
    public Integer getPo_id() {
        return po_id;
    }

    public void setPo_id(Integer po_id) {
        this.po_id = po_id;
    }

    @Column(name="PO_TS")
    public Date getPo_timestamp() {
        return po_timestamp;
    }

    public void setPo_timestamp(Date po_timestamp) {
        this.po_timestamp = po_timestamp;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="PO_SUPPLIER")
    public Supplier getPo_supplier() {
        return po_supplier;
    }

    public void setPo_supplier(Supplier po_supplier) {
        this.po_supplier = po_supplier;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="PO_RETAILER")
    public Retailer getPo_retailer() {
        return po_retailer;
    }

    public void setPo_retailer(Retailer po_retailer) {
        this.po_retailer = po_retailer;
    }

    @Column(name="PO_COST")
    public Double getPo_cost() {
        return po_cost;
    }

    public void setPo_cost(Double po_cost) {
        this.po_cost = po_cost;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "po_id=" + po_id +
                ", po_timestamp=" + po_timestamp +
                ", po_supplier=" + po_supplier +
                ", po_retailer=" + po_retailer +
                ", po_cost=" + po_cost +
                '}';
    }
}
