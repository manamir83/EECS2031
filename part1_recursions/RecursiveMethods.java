package part1_recursions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Winter 2026
 * EECS2030 Lab3 
 * Requirement:
 * You are required to implement all methods recursively.
 * You receive a zero if there is any occurrence of a loop (e.g., for, while). 
 *  
 * <p><strong> Do not use a loop. Use only recursion.
 *  Solutions using loop will not receive credit.</strong></p>
 * 
 */

public class RecursiveMethods {
	
		
	/*************************************************************
	 * <p> Write a recursive function that returns the 'largest' char in the argument string.
	 * A char is larger than the other if it appears later in the ASCII table than the other char.
	 * Assume the string is non-empty
	 * 
	 * use 'divide and conquer'.
	 * create helper function as needed
	 * 
	 *  
	 *  Example:
	 * maxChar("x") returns 'x'
	 * maxChar("Hello") returns 'o' 
	 * maxChar("abc123c") returns 'c'
	 * 
	 * @param s the string to examine 
	 * @return  the max char in s
	/**************************************************************/
	 
		public static char maxChar3 (String s) {
			if(s.length() ==1) {
				return s.charAt(0);
			}
			// make this method recursive, or, call a recursive helper function
			int mid= s.length()/2;
			String leftPart= s.substring(0,mid);
			String rightPart=s.substring(mid);
			//finding the max in each half
			char maxLeft= maxChar3(leftPart);
			char maxRight= maxChar3(rightPart);
			// return the larger of the 2 result
			return(maxLeft > maxRight)? maxLeft : maxRight;
			
		 }
		   

	  
		  /*************************************************************
		 * <p> Write a recursive function that determines the number of digit 3 in the argument integer,
			 * including 0.
			 * 
			 * Assume n is &gt; 0
			 * 
			 * Example:
			 * numberOfThrees(4) returns 0 , as there are no digit 3 in it.
			 * numberOfThrees(2030) returns 1, as there are one digit 3 in it.
			 * numberOfThrees(12373) returns 2, as there are two digit 3 in it.
			 * numberOfThrees(76542) returns 0, as there are no digit 3 in it.
			 *  
			 * @param n  a positive integer to examine 
			 * @return  number of digit three in n
			 ***************************************************************/
			
		  //hint: we reduce the problem to smaller version by removing the last digit.  Eventually the number a single digit number.
		  //  n%10 will give the value of last digit
		  //  n/10 will give the value of last digit removed
		  public int numberOfThrees(int n){
		  if(n==0) {
			  return 0;
		  }
			    
		 // make this method recursive, or, call a recursive helper function
			int count = (n%10==3) ? 1:0;
							 
				 return count + numberOfThrees(n/10);
				 
			}
			
  }