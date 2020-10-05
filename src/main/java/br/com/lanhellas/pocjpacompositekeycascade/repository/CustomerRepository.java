package br.com.lanhellas.pocjpacompositekeycascade.repository;

import br.com.lanhellas.pocjpacompositekeycascade.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
