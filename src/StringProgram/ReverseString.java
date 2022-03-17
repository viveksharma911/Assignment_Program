package program2;

import java.util.Scanner;
/*
 * Class name  - ReverseString
 * Author -   vivek sharma
 * objective - reverse a string 
 * date - 17  march 2022 
 */
public class ReverseString {
	/*
	 * Method name -  stringReverse
	 * objective - for reverse string
	 * input para - string
	 * return value - string
	 */
    String stringReverse(String str) {
    	
    	String str1 = "";
    	for(int i = str.length()-1;i>=0;i--) {
    		str1 += str.charAt(i);
    	}
    	return str1;
    }
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    String str = scn.nextLine();
	    
	    ReverseString rev = new ReverseString();
	    
	    System.out.println(rev.stringReverse(str));
	    

	}

}
