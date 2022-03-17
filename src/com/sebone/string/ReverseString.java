package com.sebone.string;

import java.util.Scanner;
/*
 * Class name  -  ReverseString
 * Author      -  @Viveksharma
 * objective   -  reverse a string 
 * date        -  17  march 2022 
 */
public class ReverseString {
	
	/*
	 * Method name     -  stringReverse
	 * objective       -  for reverse the string
	 * input parameter -  string
	 * return value    -  string
	 */
    String stringReverse(String str) {
    	
    	String string1 = "";
    	
    	for(int i = str.length()-1;i>=0;i--) {
    		string1 += str.charAt(i);
    	}
    	return string1;
    }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    String string = scanner.nextLine();
	    
	    ReverseString reversestring = new ReverseString();
	    String answer = reversestring.stringReverse(string);
	    
	    System.out.println(answer);
	    

	}

}
