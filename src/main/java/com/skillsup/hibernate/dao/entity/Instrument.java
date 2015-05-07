package com.skillsup.hibernate.dao.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "INSTRUMENT")
public class Instrument {

    @Id
    @Column
    private long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "Producer")
    private String producer;

    @Column(name = "PROD_DATE")
    private Date prodDate;

    @Column(name = "PURCH_DATE")
    private Date purchDate;

    @OneToMany(mappedBy = "instrument")
    @Fetch(FetchMode.JOIN)
    private Set<Student> students;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Date getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(Date purchDate) {
        this.purchDate = purchDate;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", producer='" + producer + '\'' +
                ", prodDate=" + prodDate +
                ", purchDate=" + purchDate +
                ", students=" + students +
                '}';
    }
}
