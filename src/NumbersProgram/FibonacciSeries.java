package program1;

import java.util.Scanner;

public class FibonacciSeries {
    void printSeries(int number) {
    	
    	int n1 = 0;
    	int n2 = 1;
    	
    	for(int i=2;i<number;i++) {
    		int n3 = n1+n2;
    		
    		System.out.println(n3);
    		
    		
    		n2 = n3;
    		n1 = n2;
    	
    	}
    	
    }
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    int number = scn.nextInt();
	    
	    FibonacciSeries feb = new FibonacciSeries();
	    feb.printSeries(number);
	}

}
