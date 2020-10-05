package br.com.lanhellas.pocjpacompositekeycascade.controller;

import br.com.lanhellas.pocjpacompositekeycascade.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<Integer> create() {
        return ResponseEntity.ok(customerService.createCustomerWithAddress());
    }

}
