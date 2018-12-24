package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CustomerModel;


public interface CustomerRepository extends JpaRepository<CustomerModel,Integer>{

 public CustomerModel findBycustomerCode(Integer customerCode);

public CustomerModel deleteBycustomerCode(Integer customerCode);

	

}
