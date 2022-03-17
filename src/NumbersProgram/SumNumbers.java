package program1;

import java.util.Scanner;
/*
 * class name - SumNumbers
 * objective - sum of n numbers
 * author - Vive Sharma
 * Date - 17 march 2022
 */
public class SumNumbers {
	/*
	 * Method name - getSum
	 * objective - get sum of n numbers
	 * Input Parametre - int number
	 * Return value - integer sum
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
		
		Scanner scn = new Scanner(System.in);
	    int number = scn.nextInt();
        SumNumbers num = new SumNumbers();
        System.out.println(num.getSum(number));
        
	}

}
