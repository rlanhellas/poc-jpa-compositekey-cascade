package br.com.lanhellas.pocjpacompositekeycascade.entity;

import javax.persistence.*;

@Entity
@Table(name = "sub_address")
public class SubAddress {

    @EmbeddedId
    private SubAddressPK pk;

    @Column
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "customer_number", referencedColumnName = "customer_number"),
            @JoinColumn(name = "zipcode", referencedColumnName = "zipcode"),
            @JoinColumn(name = "street", referencedColumnName = "street")
    })
    @MapsId("addressPK")
    private Address address;

    public SubAddressPK getPk() {
        return pk;
    }

    public void setPk(SubAddressPK pk) {
        this.pk = pk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
