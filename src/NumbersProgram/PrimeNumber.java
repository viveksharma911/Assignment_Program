package program1;

import java.util.Scanner;
/*
 * Class name - PrimeNumber
 * objective  - find prime number.
 * Author - Vivek Sharma
 * Date -   17 march 2022
 */
public class PrimeNumber {
    /*
     * Method Name -  isPrimne
     * Objective  - check the number it is prime or not\
     * Input Parametre   -  integer number
     * return value -  true or false
     */
	boolean isPrime(int number) {
		
		if(number ==  1) {
			return true;
		}
		for(int i=2;i<number;i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		   
		Scanner scn = new Scanner(System.in);
	    int number = scn.nextInt();
	    PrimeNumber obj = new PrimeNumber();
       if( obj.isPrime(number)) {
    	   System.out.println("It's a prime number");
       }else{
    	   System.out.println("It's not a prime number");
       };
	}

}
