package com.sebone.numbers;
//com.<org name>
import java.util.Scanner;
/*
 * Class name -  CountDigit
 * objective  -  count all digit in given number.
 * Author     -  @VivekSharma
 * Date       -  17 march 2022
 */
public class CountDigits {
    /*
     * Method name  - count
     * objective    - for counting all digit
     * parameter    - integer number
     * return value - integer count
     */
	int count(int number) {
		
		int digit = 0;
		while(number!=0) {
			number = number/10;
			digit++;
		}
		return digit;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    
	    CountDigits CountDigits = new CountDigits();
	    int sum = CountDigits.count(number);
	    
	    System.out.println(sum);

	}

}
