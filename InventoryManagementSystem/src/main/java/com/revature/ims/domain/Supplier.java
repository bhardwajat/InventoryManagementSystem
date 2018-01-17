package com.revature.ims.domain;

import javax.persistence.*;

/**
 * Created by socce on 6/27/2017.
 */
@Entity
@Table(name="SUPPLIER")

public class Supplier {

    private Integer s_id;
    private String s_name;
//    private Integer s_address;
    private Address s_address;

    public Supplier(){

    }

    public Supplier(int s_id, String s_name, Address s_address){
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_address = s_address;
    }

    @Id
    @Column(name="S_ID")
    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    @Column(name="S_NAME")
    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="S_ADDRESS")
//    public Integer getS_address() {
//        return s_address;
//    }
//
//    public void setS_address(Integer s_address) {
//        this.s_address = s_address;
//    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="S_ADDRESS")
    public Address getS_address() {
        return s_address;
    }

    public void setS_address(Address s_address) {
        this.s_address = s_address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_address=" + s_address +
                '}';
    }
}
