package br.com.lanhellas.pocjpacompositekeycascade.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GenericAddressPK implements Serializable {

    @Column(name = "customer_number")
    private int customerNumber;

    @Column(name = "zipcode")
    private String zipCode;

    @Column(name = "street")
    private String street;

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
