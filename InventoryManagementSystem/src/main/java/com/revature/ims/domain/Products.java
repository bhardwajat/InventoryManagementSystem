package com.revature.ims.domain;

import javax.persistence.*;
import java.util.List;


/**
 * Created by akshat on 6/27/17.
 */

@Entity
@Table(name="PRODUCT")
public class Products {
    private Integer product_id;
    private String product_name;
    private String product_supprice;
    private String product_retprice;
    private List<Categorys> productCategories;
    private List<Categorys> categories;

    public Products(){

    }

    public Products(int product_id, String product_name, String product_supprice, String product_retprice){
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_supprice = product_supprice;
        this.product_retprice = product_retprice;
    }

    @Id
    @Column(name="P_ID")
    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    @Column(name="P_NAME")
    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @Column(name="P_SUPPLIER_PRICE")
    public String getProduct_supprice() {
        return product_supprice;
    }

    public void setProduct_supprice(String product_supprice) {
        this.product_supprice = product_supprice;
    }

    @Column(name="P_RETAILER_PRICE")
    public String getProduct_retprice() {
        return product_retprice;
    }

    public void setProduct_retprice(String product_retprice) {
        this.product_retprice = product_retprice;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PRODUCT_CATEGORY", joinColumns = {
            @JoinColumn(name = "P_ID") },
            inverseJoinColumns = { @JoinColumn(name = "C_ID") })
//    @JsonManagedReference
    public List<Categorys> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<Categorys> productCategories) {
        this.productCategories = productCategories;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_supprice='" + product_supprice + '\'' +
                ", product_retprice='" + product_retprice + '\'' +
                ", productCategories=" + productCategories +
                ", categories=" + categories +
                '}';
    }


}

