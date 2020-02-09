package com.myassesment.calculate.controller;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.omg.IOP.ExceptionDetailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myassesment.calculate.exception.ApplicationError;
import com.myassesment.calculate.exception.EceptionMessge;

import io.swagger.annotations.ApiOperation;

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
	@ApiOperation("Multiplies two numbers passed as path parameters")
	 public String multiplyTwoNumbers(@PathVariable("a") @NotNull Integer num1, @PathVariable("b") @NotNull Integer num2)  throws Exception  {
		        return String.format("Multiplicaiton of two numbers is = "+(num1 * num2));
	    }

}
