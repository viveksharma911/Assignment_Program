package com.sebone.numbers;

import java.util.Scanner;
/*
 * class name -  SumNumbers
 * objective  -  sum of n numbers
 * author     -  @VivekSharma
 * Date       -  17 march 2022
 */
public class SumNumbers {
	/*
	 * Method name     -  getSum
	 * objective       -  get sum of n numbers
	 * Input Parameter -  integer number
	 * Return value    -  integer sum
	 * 
	 */
    int getSum(int number) {
    	int countsum = 0;
    	for(int i=1;i<=number;i++) {
    		countsum += i;
    	}
    	return countsum;
    }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
        SumNumbers sumnumber = new SumNumbers();
        int sum = sumnumber.getSum(number);
        
        System.out.println(sum);
        
	}

}
