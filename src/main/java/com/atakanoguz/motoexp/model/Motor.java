package com.atakanoguz.motoexp.model;

import javax.persistence.*;


@Entity
@Table(name = "motors")
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "trade_mark_name")
    private String trademark;

    @Column(name = "model_name")
    private String model;

    @Column(name = "miles")
    private Long miles;

    @Column(name = "cc_Power")
    private Long ccPower;

    @Column(name = "transmission")
    private String transmission;


    public Motor() {

    }

    public Motor(long id, String trademark, String model, Long miles, Long ccPower, String transmission) {
        this.id = id;
        this.trademark = trademark;
        this.model = model;
        this.miles = miles;
        this.ccPower = ccPower;
        this.transmission = transmission;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getMiles() {
        return miles;
    }

    public void setMiles(Long miles) {
        this.miles = miles;
    }

    public Long getCcPower() {
        return ccPower;
    }

    public void setCcPower(Long ccPower) {
        this.ccPower = ccPower;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
