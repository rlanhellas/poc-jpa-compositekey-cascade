package br.com.lanhellas.pocjpacompositekeycascade.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;


@Embeddable
public class SubAddressPK implements Serializable {

    @Embedded
    private AddressPK addressPK;

    @Column(name = "sub")
    private String sub;

    public AddressPK getAddressPK() {
        return addressPK;
    }

    public void setAddressPK(AddressPK addressPK) {
        this.addressPK = addressPK;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
}
