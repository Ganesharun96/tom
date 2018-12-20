package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.CustomerModel;

import com.example.demo.service.CustomerService;



@Controller
public class CustomerController {
	@Autowired
	
	private CustomerService customerservice;

	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String read(Model model) {
		
		model.addAttribute("show", new CustomerModel());
		return "Display";
	}

	@RequestMapping(value="/adder", method= RequestMethod.POST)
	public String printRepaymentSchedule(@Valid @ModelAttribute("show")CustomerModel customermodel,BindingResult result,Model model)	{
		
		if(result.hasErrors()) {
			
			            return  "Display";
			             }
		 customerservice.method(customermodel);
//		customerservice.calc(model);
		
		model.addAttribute("results",customerservice.calc());
          return "Print";
			    }
	
	@RequestMapping(value="/search", method =  RequestMethod.GET)
	public String getInstNo(Model model)
	{	
		model.addAttribute("put",new CustomerModel());

        return "Searchget";
	}
	@RequestMapping(value="/final", method =  RequestMethod.POST)
	public String printInstNo(@RequestParam("customerCode")int theid, Model model)
	{	
	customerservice.searcher(theid,model);
        return "Searchershow";
	}
	

       
		
}
