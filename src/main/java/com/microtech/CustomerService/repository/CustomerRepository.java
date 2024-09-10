package com.microtech.CustomerService.repository;

import com.microtech.CustomerService.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> { //unique value jonno


}
