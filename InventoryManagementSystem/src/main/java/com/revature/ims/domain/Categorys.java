package com.revature.ims.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by David Griffith on 6/27/2017.
 */

@Entity
@Table(name="CATEGORYS")
public class Categorys {
    private Integer id;
    private String name;
    private List<Products> products;
    private List<Products> productsInCat;


    public Categorys(){}

    public Categorys(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name="C_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="C_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //this puts all of the categories for a particular product in to the domain.Product list of categories
    //@JsonIgnore is required on this side otherwise you will get a stackoverflow when it tries to write to JSON
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "productCategories")
    @JsonIgnore
    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Categorys{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                ", productsInCat=" + productsInCat +
                '}';
    }
}

