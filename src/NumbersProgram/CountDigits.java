package program1;

import java.util.Scanner;
/*
 * Class name - CountDigit
 * objective -  count all digit in number.
 * Author  -  Vivek Sharma
 * Date - 17 march 2022
 */
public class CountDigits {
    /*
     * Method name - count
     * objective  - count digit
     * paramt  -  int number
     * return - int count
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
		
		Scanner scn = new Scanner(System.in);
	    int number = scn.nextInt();
	    
	    CountDigits num = new CountDigits();
	    
	    System.out.println(num.count(number));

	}

}
