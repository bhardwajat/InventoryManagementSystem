package com.revature.ims.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Created by socce on 7/6/2017.
 */
@Entity
@Table(name="ADDRESS")
public class Address {

    private Integer a_id;
    private String a_street;
    private String a_city;
    private String a_state;
    private String a_zip;

    public Address(){}

    @Id
    @Column(name="A_ID")
    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    @Column(name="A_STREET")
    public String getA_street() {
        return a_street;
    }

    public void setA_street(String a_street) {
        this.a_street = a_street;
    }

    @Column(name="A_CITY")
    public String getA_city() {
        return a_city;
    }

    public void setA_city(String a_city) {
        this.a_city = a_city;
    }

    @Column(name="A_STATE")
    public String getA_state() {
        return a_state;
    }

    public void setA_state(String a_state) {
        this.a_state = a_state;
    }

    @Column(name="A_ZIP")
    public String getA_zip() {
        return a_zip;
    }

    public void setA_zip(String a_zip) {
        this.a_zip = a_zip;
    }
//    private Collection<Supplier> supplier = new ArrayList<>();
//
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Address")
//    public Collection<Supplier> getSupplier() {
//        return supplier;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "a_id=" + a_id +
                ", a_street='" + a_street + '\'' +
                ", a_city='" + a_city + '\'' +
                ", a_state='" + a_state + '\'' +
                ", a_zip='" + a_zip + '\'' +
                '}';
    }
}
