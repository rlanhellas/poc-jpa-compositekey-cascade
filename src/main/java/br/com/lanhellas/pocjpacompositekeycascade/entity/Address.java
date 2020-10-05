package br.com.lanhellas.pocjpacompositekeycascade.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Address {

    @EmbeddedId
    private AddressPK id;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_number", referencedColumnName = "customer_number", insertable = false, updatable = false)
    @MapsId("customerNumber")
    private Customer customer;

    @OneToMany(mappedBy = "address", targetEntity = SubAddress.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SubAddress> subAddressSet = new HashSet<>();

    public AddressPK getId() {
        return id;
    }

    public void setId(AddressPK id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<SubAddress> getSubAddressSet() {
        return subAddressSet;
    }

    public void setSubAddressSet(Set<SubAddress> subAddressSet) {
        this.subAddressSet = subAddressSet;
    }
}
