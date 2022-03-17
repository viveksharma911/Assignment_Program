package com.sebone.numbers;

import java.util.Scanner;
/*
 * Class Name -  FactorialNumber
 * objective  -  factorial of given n number.
 * Author     -  @Viveksharma
 * date       -  17 march 2022
 */
public class FactorialNumber {
    /*
     * Method Name   -  getFactorial
     * objective     -  factorial of n number
     * @param number -  integer number
     * @return       -  integer factorial_number
     */
	int getFactorial(int number) {
		
		int count = 1;
		for(int i=number;i>0;i--) {
			count =  count*i;
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    
	    FactorialNumber factorialnumber = new FactorialNumber();
	    int factnumber = factorialnumber.getFactorial(number);
	    
	    System.out.println(factnumber);

	}

}
