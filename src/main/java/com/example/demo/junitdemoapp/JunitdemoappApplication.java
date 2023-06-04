package com.example.demo.junitdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitdemoappApplication {
// Testing der Hauptfunktion durch ein Beispiel
	public static void main(String[] args) {
		SpringApplication.run(JunitdemoappApplication.class, args);
		int number = 1234;
			String romanNumeral = RomanNumeralsConverter.convertToRoman(number);
			
			System.out.println("Number: " + number);
			System.out.println("Roman Numeral: " + romanNumeral);
	}

}
