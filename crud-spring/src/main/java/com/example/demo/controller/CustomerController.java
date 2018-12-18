package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.CustomerModel;

import com.example.demo.service.CustomerService;

public class CustomerController {
	@Autowired CustomerService customerservice;
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String read(Model model) {
		
		model.addAttribute("show", new CustomerModel());
		return "Display";
	}
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String printRepaymentSchedule(@ModelAttribute("show")CustomerModel customermodel,Model model)	{
			
		
		model.addAttribute("show",customermodel);
return "Display";	
		}
	
	
	

	
}
