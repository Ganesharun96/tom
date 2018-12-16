package com.example.demo.service;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Input;
import com.example.demo.model.Output;
import com.example.demo.repository.CustomerRepository;

@Service
public class Calculation implements CustomerServiceInterface {
	@Autowired
	private CustomerRepository customerrepo;

	static float installmentAmount = (float) 0.0;
	static boolean installmentAmountFlag = true;

	// after addung unimplement method ..override annotation cause error
	@Override
	public void method(Input input) {
		float loanAmount = input.getLoanAmount();
		float rateOfInterest = input.getRateOfInterest();
		float tenure = input.getTenure();
		float numberofInstallments = input.getNumberofInstallments();
		for (int i1 = 0; i1 <= numberofInstallments; i1++) {

			loanAmount = calculateEMI(i1, loanAmount, rateOfInterest, tenure, numberofInstallments);
		}

	}

	public float calculateEMI(int value, float loanAmount, float rateOfInterest, float tenure,
			float numberOfInstallments) {

		float num = loanAmount * ((rateOfInterest) / 100 / numberOfInstallments);
		float deno1 = 1 + (rateOfInterest / numberOfInstallments);
		float deno2 = (float) (1 / (Math.pow(deno1, tenure)));
		float deno3 = 1 - deno2;

		if (installmentAmountFlag) {

			float installmentAmount = num / deno3;
			installmentAmountFlag = false;

		}

		float principle = installmentAmount - num;
		float outstandingPrinciple = loanAmount - principle;

		DecimalFormat formatter = new DecimalFormat("0.00");

		float outstandingPrinciple1 = Float.parseFloat(formatter.format(loanAmount));
		float interest = Float.parseFloat(formatter.format(num));
		float loanAmount1 = Float.parseFloat(formatter.format(principle));
//beow this code not required
		Output output = new Output();
		output.setPrincipals(loanAmount1);

		output.setInterst(interest);

		output.setEmi(Calculation.installmentAmount);

		output.setOutsandingPrincipals(outstandingPrinciple1);
		output.setValue(value);

		customerrepo.save(output);//

		System.out
				.println(formatter.format(value) + "  " + formatter.format(loanAmount) + "     " + formatter.format(num)
						+ "  " + formatter.format(principle) + "  " + formatter.format(installmentAmount));
		//

		return outstandingPrinciple;

	}

	// float repaymentSchedule(int i1, float loanAmount, float rateOfInterest, float
	// tenure, float numberOfInstallments) {
	//
	// float installmentAmount =calculateEMI( loanAmount, rateOfInterest, tenure,
	// numberOfInstallments);
	//
	// DecimalFormat formatter = new DecimalFormat("0.00");
	// float num1 = loanAmount * ((rateOfInterest / 100) / numberOfInstallments);
	// float principle = installmentAmount - num1;
	// float outstandingPrinciple = loanAmount - principle;
	//
	//
	// System.out.println(i1 + " " + formatter.format(loanAmount) + " " +
	// formatter.format(num1) + " "
	// + formatter.format(principle) + " " + formatter.format(installmentAmount));
	//
	// System.out.println();
	//// Output calcoutput = new Output();
	//// Float outstandingPrinciple = Float.parseFloat(formatter.format(principle));
	//// Float interest = Float.parseFloat(formatter.format(num1));
	//// Float loanAmount = Float.parseFloat(formatter.format(Pn));
	//// Float installmentAmount =
	// Float.parseFloat(formatter.format(emiInitializer));
	//
	//
	//
	// return outstandingPrinciple;
	//
	//
	// }
	// Output calcoutput = new Output();
	// Float outstandingPrinciple = Float.parseFloat(formatter.format(principle));
	// Float interest = Float.parseFloat(formatter.format(num1));
	// Float loanAmount = Float.parseFloat(formatter.format(Pn));
	// Float installmentAmount = Float.parseFloat(formatter.format(emiInitializer));

	// float loanAmount1;
	// float rateOfInterest;
	// float tenure;
	// public Calculation(float loanAmount1, float rateOfInterest, float tenure,
	// float numberofInstallments) {
	// super();
	// this.loanAmount1 = loanAmount1;
	// this.rateOfInterest = rateOfInterest;
	// this.tenure = tenure;
	// this.numberofInstallments = numberofInstallments;
	// }
	//
	// float numberofInstallments;
	//
	//
	// public void getInstallments() {
	//
	//
	// for (int i1 = 0; i1 <= 12; i1++) {
	//
	// loanAmount1 = repaymentSchedule(i1, loanAmount1, rateOfInterest, tenure,
	// numberofInstallments);
	// }
	// }

}