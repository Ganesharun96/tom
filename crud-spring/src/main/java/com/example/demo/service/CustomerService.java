package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;

public class CustomerService implements CustomerServiceInterface {
	@Autowired CustomerRepository customerrepository;

	@Override
	public void method(CustomerModel customermodel) {
		
	 String customerName=customermodel.getCustomerName();
		 String customerAddress=customermodel.getCustomerAddress();
		 String customerPincode=customermodel.getCustomerPincode();
		 String customerEmail=customermodel.getCustomerEmail();
		 String customerNumber=customermodel.getCustomerNumber();
		 String registrationDate=customermodel.getRegistrationDate();
		 String createdBy=customermodel.getCreatedBy();
		 String modifiedBy=customermodel.getModifiedBy();
		
	}
	CustomerModel customermodel=new CustomerModel();
//	customermodel.set();
}
