package mx.coatltech.customer.repository;

import mx.coatltech.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, String> {


}
