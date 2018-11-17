package com.test;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hubei {
    private int sid;
    private String name;
    private Double price;

    public Hubei() {
    }

    public Hubei(int sid, String name, Double price) {
        this.sid = sid;
        this.name = name;
        this.price = price;
    }

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hubei hubei = (Hubei) o;

        if (sid != hubei.sid) return false;
        if (name != null ? !name.equals(hubei.name) : hubei.name != null) return false;
        if (price != null ? !price.equals(hubei.price) : hubei.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
