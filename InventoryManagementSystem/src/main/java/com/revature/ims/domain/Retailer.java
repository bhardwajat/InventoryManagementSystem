package com.revature.ims.domain;


import javax.persistence.*;

/**
 * Created by David Griffith on 6/27/2017.
 */
@Entity
@Table(name="RETAILER")
public class Retailer {

    private Integer id;
    private String name;
    private Address address;

    public Retailer(){}

    public Retailer(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Id
    @Column(name="R_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="R_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="R_ADDRESS")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
