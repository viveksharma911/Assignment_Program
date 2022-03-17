package com.sebone.numbers;

import java.util.Scanner;
/*
 * Class name -   PrimeNumber
 * objective  -   find prime number.
 * Author     -   @VivekSharma
 * Date       -   17 march 2022
 */
public class PrimeNumber {
    /*
     * Method Name       -  isPrimne
     * Objective         -  check the number it is prime or not.
     * Input Parameter   -  integer number
     * return value      -  true or false
     */
	boolean isPrime(int number) {
		boolean primeNumber = true;
		if(number ==  1) {
			return primeNumber;
		}
		for(int i=2;i<number;i++) {
			if(number%i == 0) {
				primeNumber = false;
			}
		}
		return primeNumber;
		
	}
	
	
	
	public static void main(String[] args) {
		   
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    PrimeNumber primenumber = new PrimeNumber();
	    boolean prime = primenumber.isPrime(number);
	    
       if( prime ) {
    	   System.out.println("It's a prime number");
       }else{
    	   System.out.println("It's not a prime number");
       };
	}

}
