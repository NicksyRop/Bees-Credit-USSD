package com.ussd.bees;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ussd {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public  Integer id;
    public  String full_names;
    public  String phoneNumber;
    public String model;
    public Integer amount;
    public String loanType;

    public Ussd(String full_names, String phoneNumber, String model, Integer amount, String loanType) {
        this.full_names = full_names;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.amount = amount;
        this.loanType = loanType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_names() {
        return full_names;
    }

    public void setFull_names(String full_names) {
        this.full_names = full_names;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @Override
    public String toString() {
        return "Ussd{" +
                "id=" + id +
                ", full_names='" + full_names + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", model='" + model + '\'' +
                ", amount=" + amount +
                ", loanType='" + loanType + '\'' +
                '}';
    }
}
