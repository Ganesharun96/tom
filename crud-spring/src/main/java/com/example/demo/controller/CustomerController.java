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

import com.example.demo.model.CustomerModel;

import com.example.demo.service.CustomerService;
@Controller
public class CustomerController {
	
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String read(Model model) {
		
		model.addAttribute("show", new CustomerModel());
		return "Display";
	}
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String printRepaymentSchedule(@Valid @ModelAttribute("show")CustomerModel customermodel,BindingResult result)	{
		
		if(result.hasErrors()) {
			
			            return  "Display";
			            }
		return "Print";
			    }

       
		
}
