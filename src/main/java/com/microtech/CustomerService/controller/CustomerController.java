package com.microtech.CustomerService.controller;

import com.microtech.CustomerService.entity.Customer;
import com.microtech.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

@PostMapping("/addcust")
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
    customerRepository.save(customer);
    return new ResponseEntity<>("Customer added succesfully", HttpStatus.CREATED);
}

@GetMapping("/allcust")
    public List<Customer> getAllCustomer(){
    return customerRepository.findAll();
}
}
