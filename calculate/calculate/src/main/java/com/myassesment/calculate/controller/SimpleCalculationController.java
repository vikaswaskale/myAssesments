package com.myassesment.calculate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class SimpleCalculationController {
	
	    /**
	     * Get method to provide the calculation of two numbers
	     * 
	     * @param num1
	     * @param num2
	     * @return String results of multiplication
	     */
	   
	@GetMapping (value = "/multiply/{num1},{num2}")
	@ApiOperation("Multiplies two numbers passed as path parameters")
	 public String mul(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
	        return String.format("Multiplicaiton of two numbers is = "+(num1 * num2));
	    }

}
