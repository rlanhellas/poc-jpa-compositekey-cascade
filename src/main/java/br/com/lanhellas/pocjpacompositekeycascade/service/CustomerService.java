package br.com.lanhellas.pocjpacompositekeycascade.service;

import br.com.lanhellas.pocjpacompositekeycascade.entity.*;
import br.com.lanhellas.pocjpacompositekeycascade.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public int createCustomerWithAddress() {
        Customer customer = new Customer();
        customer.setName("RONALDO");

        for (int i = 0; i < 1; i++) {
            Address address = new Address();
            address.setCustomer(customer);
            address.setDescription("Random Address");

            AddressPK addressPK = new AddressPK();
            addressPK.setStreet("Random street");
            addressPK.setZipCode("1111111");
            address.setId(addressPK);

            SubAddress subAddress = new SubAddress();
            subAddress.setAddress(address);
            subAddress.setDescription("Random SubAddress");

            SubAddressPK subAddressPK = new SubAddressPK();
            subAddressPK.setSub("SUB");
            subAddress.setPk(subAddressPK);

            address.getSubAddressSet().add(subAddress);

            customer.getAddressSet().add(address);
        }

        customer = customerRepository.save(customer);
        return customer.getCustomerNumber();
    }

}
