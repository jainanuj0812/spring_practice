package com.luv2code.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerGenericExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<CusotmerErrorResponse> handleException(CustomerRuntimeException exe) {
		
		CusotmerErrorResponse error = new CusotmerErrorResponse(HttpStatus.NOT_FOUND.value(), System.currentTimeMillis(), exe.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<CusotmerErrorResponse> handleException(RuntimeException exe) {
		
		CusotmerErrorResponse error = new CusotmerErrorResponse(HttpStatus.BAD_REQUEST.value(), System.currentTimeMillis(), exe.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
