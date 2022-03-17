package program1;

import java.util.Scanner;
/*
 * Class Name - FactorialNumber
 * objetive - get factorial of n number
 * Author - vivek sharma
 * date - 17 march 2022
 */
public class FactorialNumber {
    /*
     * Method Name -  getFactorial
     * objective - factorial of n number
     * @param number - int number
     * @return - int number
     */
	int getFactorial(int number) {
		
		int count = 1;
		for(int i=number;i>0;i--) {
			count =  count*i;
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    int number = scn.nextInt();
	    
	    FactorialNumber num = new FactorialNumber();
	    
	    System.out.println(num.getFactorial(number));

	}

}
