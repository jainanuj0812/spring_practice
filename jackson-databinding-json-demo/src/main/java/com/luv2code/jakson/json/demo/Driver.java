package com.luv2code.jakson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			ObjectMapper objMapper = new ObjectMapper();
			
			Student theStudent  = objMapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println("firstName....." + theStudent.getFirstName());
			
			System.out.println("lastName....." + theStudent.getLastName());
			
			Address address = theStudent.getAddress();
			
			System.out.println("street....." + address.getStreet());
			
			System.out.println("city....." + address.getCity());
			
			System.out.println("zip....." + address.getZip());
			
			
			for(String tempLan: theStudent.getLanguages()) {
				System.out.println(tempLan);
			}
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
