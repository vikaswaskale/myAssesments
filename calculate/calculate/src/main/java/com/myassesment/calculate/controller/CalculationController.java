package com.myassesment.calculate.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController
{
	
	    /**
	     * Get method to provide the calculation of two numbers
	     * 
	     * @param num1
	     * @param num2
	     * @return String results of multiplication
	     */
	   
	@GetMapping (value = "/multiply/{a},{b}")
	 public String multiplyTwoNumbers(@PathVariable("a") @NotNull Integer num1, @PathVariable("b") @NotNull Integer num2){
		        return String.format("Multiplicaiton of two numbers is = "+(num1 * num2));
	    }

}
