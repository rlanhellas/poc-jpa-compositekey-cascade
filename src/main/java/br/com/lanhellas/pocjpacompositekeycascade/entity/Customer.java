package br.com.lanhellas.pocjpacompositekeycascade.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ_GEN")
    @SequenceGenerator(name = "CUSTOMER_SEQ_GEN", sequenceName = "CUSTOMER_SEQ", allocationSize = 1)
    @Column(name = "customer_number")
    private int customerNumber;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "customer", targetEntity = Address.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Address> addressSet = new HashSet<>();

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }
}
