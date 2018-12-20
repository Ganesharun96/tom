package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerService implements CustomerServiceInterface {
	@Autowired 
	CustomerRepository customerrepository;



	@Override
	public void method(CustomerModel customermodel) {
	
		CustomerModel	cmodel=new CustomerModel();
		
		cmodel.setCreatedBy(customermodel.getCreatedBy());
		cmodel.setCustomerAddress(customermodel.getCustomerAddress());
		cmodel.setCustomerPincode(customermodel.getCustomerPincode());
		cmodel.setCustomerEmail(customermodel.getCustomerEmail());
		cmodel.setCustomerName(customermodel.getCustomerName());
		cmodel.setCustomerNumber(customermodel.getCustomerNumber());
		cmodel.setModifiedDate(customermodel.getModifiedDate());
		cmodel.setRegistrationDate(customermodel.getRegistrationDate());
		cmodel.setCustomerCode(customermodel.getCustomerCode());
	
	

 customerrepository.save(cmodel);
	}



	@Override
	public List<CustomerModel> calc() {
		// TODO Auto-generated method stub
		
		return customerrepository.findAll();
	}



	@Override
	public void searcher(int id, Model model) {
		model.addAttribute("put",customerrepository.findById(id));
		
	}

//	@Override
//	public List<CustomerModel> calc(Model model) {
//		model.addAttribute("results",customerrepository.findAll());
//		return customerrepository.findAll();
//	}

	
	
		 
	}

