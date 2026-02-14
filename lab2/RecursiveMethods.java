package eecs2030.lab2;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Winter 2026
 * EECS2030 Lab2 
 * Requirement:
 * You are required to implement all methods recursively.
 * You receive a zero if there is any occurrence of a loop (e.g., for, while). 
 *  
 * <p><strong> Do not use a loop. Use only recursion.
 *  Solutions using loop will not receive credit.</strong></p>
 * 
 */

public class RecursiveMethods {
	
	
	//Q1
	/** 
	 * A recursive function that returns the sum of the integers 1 through n where n is a strictly positive integer.
	 * Note that the sum might overflow if n is too large; this method does not
	 * check if the sum overflows (i.e., it's the client's problem)
	 * 
	 * 
	 * @param n a strictly positive number
	 * @return the sum 1 + 2 + ... + n
	 */
	public static int sum(int n) {

		//if(n<=1) {
			//return n;
		//}
		// make this method recursive, or, call a recursive helper function
		//return n+sum(n-1);
		
		if(n<=0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return n+ sum(n-1);


	}
	
	
	
	//Q2
	/**
	 * <p> A recursive function that returns a String 
	 * composed of {@code n} occurrences of character {@code c} . </p>
	 * 
	 * 
	 * <pre>
	 *  Example:
	 *  repeatCharNTimes(2, 'd')  return  "dd"
	 *  repeatCharNTimes(3, 'c')  return  "ccc"
	 *  repeatCharNTimes(5, 'a')  return  "aaaaa"
	 *   
	 *  </pre>
	 *  
	 * @param n : 
	 * 			Number of occurrence 
	 * @param c:
	 * 			Char to be repeated 
	 * 
	 * @return
	 * 		return String composed of {@code n} occurrences of character {@code c}.
	 * 
	 * @pre. 
	 * 		{@code n >= 0}.
	 */
	public static String repeatCharNTimes(int n, char c) {
		
		if(n<=0) {
			return "";
		}
		// make this method recursive, or, call a recursive helper function
		return c+repeatCharNTimes(n-1,c);
	}
	
	//Q3
	/**
	 * 
	 * <p> A recursive function numberOfFirstCharBeginning, which  
	 * returns the number of times the first char of string {@code str}
	 * appears (consecutively) AT THE BEGINING of the given string {@code str}.
	 * </p>
	 * 
	 *  
	 *   
	 * <p> Hint: You can use String functions such as charAt, length, and substring.</p>
	 *  
	 *  <pre>
	 *  Example:
	 *  numberOfFirstChar("")  return 0 , empty string 
	 *  numberOfFirstChar("bbbcfreb$b") return  3
	 *  numberOfFirstChar("beqecb$bbb") return  1
	 *  
	 *  </pre>
	 *  
	 * @param str   is not null String 
	 * 
	 * @return
	 * 			the number of times
	 * 			the first char of string str appears at the beginning of string str.
	 * 			
	 * 
	 * @pre. 
	 * 		{@code str }   is not null String 
	 */
	public static int numberOfFirstCharBeginning(String str) {
        // base case
		if(str ==  null || str.isEmpty()) { // if(str.length()==0)
			return 0;
		} // base case , if 1 char left or the first 2 don't match
		if(str.length()==1 || str.charAt(0) != str.charAt(1)){
			return 1;
		}
		return 1+ numberOfFirstCharBeginning(str.substring(1));
	}

	
	//Q4
	/**
	 * 
	 * <p> A recursive function numberOfFirstChar, which 
	 * returns the number of times the first char of string {@code str}
	 * appears in string {@code str}.
	 * </p>
	 * 
	 *   
	 * <p> Hint: You can use String functions such as charAt, length, and substring.</p>
	 * <p> Hint: You may need to use a (recursive) helper function which take more arguments</p>
	 *  
	 *  <pre>
	 *  Example:
	 *  numberOfFirstChar0("")  return 0 , empty string 
	 *  numberOfFirstChar0("bbbcfreb$b") return  5
	 *  numberOfFirstChar0("beqbecb$bbb") return  6
	 *  
	 *  </pre>
	 *  
	 * @param str   is not null String 
	 * 
	 * @return
	 * 			the number of times
	 * 			the first char of string str appears in the string str.
	 * 			
	 * 
	 * @pre. 
	 * 		{@code str }   is not null String 
	 */
	public static int numberOfFirstChar(String str) {

		if(str==null || str.isEmpty()) { // if(str.length()==0)
			return 0;
		}
		//Identify the character we are looking for the first one
		char target =str.charAt(0);
		//use the helper or search the whole string for that target
		return numberOfFirstChar_Helper(target, str);
		
		// you may need a helper function!
				
	}
	private static int numberOfFirstChar_Helper(char target, String str) {
		if(str.isEmpty()) { // if(str.length()==0)
			return 0;
		}
		//Recursive step; if the first char matches the target count is 1otherwise 0 
		int count;
		if(str.charAt(0)== target) { // look at the first character
				count =1;
		}else {
		    count =0;
		}
		return count + numberOfFirstChar_Helper(target,str.substring(1));
	}
	
	  
	//Q5
	/**
	 * <p> A recursive function returns Yorknacci number y(n). </p>
	 * 
	 * <p> Recall the Fibonacci numbers: Fibonacci number an is defined as the sum of
	 * the 2 previous Fibonacci numbers: a(n) = a(n-1)+a(n-2), with a(0) =0,  a(1) = a(2) = 1..
	 * Based on Fibonacci numbers, we define the Yorknacci numbers as the list of numbers
	 * where Yorknacci number y(n)  is defined as <strong> the sum of the previous 3
	 * Yorknacci numbers if n is odd and the sum of the previous 2 Yorknacci numbers if n is even.</strong>
	 * The first three Yorknacci numbers y(0), y(1), and y(2) are 1. 
	 * {@code y(0)=y(1)=y(2)=1}
	 * 
	 * <pre>
	 *  Example:
	 *  yorknacci(0)  return 1 
	 *  yorknacci(1)  return 1
	 *  yorknacci(2)  return 1
	 *  yorknacci(3)  return 3
	 *  yorknacci(4)  return 4    
	 *  yorknacci(5)  return 8 
	 * 
	 *  *  </pre>
	 *   * 
	 * @param n :
	 * 			integer value for Yorknacci,  {@code n>=0 }
	 * 
	 * @return
	 * 			Return Yorknacci number y(n).
	 * 
	 * @pre. {@code n>=0}
	 */
	public static int yorknacci(int n) {
		
		if(n<=2) {
			return 1;
		}
		if(n%2==0) { // even
			return yorknacci(n-1) + yorknacci(n-2);
		}
		
		return yorknacci(n-1) + yorknacci(n-2)+ yorknacci(n-3);
	}
	
	
   
	
	//Q6
	/**
	 * <p> Write a recursive function that returns the 'largest' char in the argument string.
	 * A char is larger than the other if it appears later in the ASCII table than the other char.
	 * Assume the string is non-empty
	 * 
	 * <pre>
	 *  Example:
	 * maxChar("x") returns 'x'
	 * maxChar("Hello") returns 'o' 
	 * maxChar("abc123c") returns 'c'
	 * 
	 * @param s the string to examine 
	 * @return  the max char in s
	*/
	public static char maxChar (String s) {
		if(s.length()==1) { // one character
			return s.charAt(0);
		}
		char first= s.charAt(0);
		char maxRest = maxChar(s.substring(1)); // find the largest in the remaining substring
		
		if(first> maxRest) {
			return first;
		}
		// pass substring in recursive calls
		return maxRest;
	}
	
	//Q7
	/** 
	 * <p> Write a recursive function that returns the 'largest' char in the argument string.
	 * A char is larger than the other if it appears later in the ASCII table than the other char.
	 * Assume the string is non-empty
	 * 
	 * <pre>
	 *  Example:
	 * maxChar("x") returns 'x'
	 * maxChar("Hello") returns 'o' 
	 * maxChar("abc123c") returns 'c'
	 * 
	 * @param s the string to examine 
	 * @return  the max char in s
	*/
	public static char maxChar2 (String s) { // similar to Q6 but different technique  
		
		return maxChar2_Helper(s, 0); // helper start at index 0
	}					
		// pass string s, and sliding index!
		
		// you may need a helper function !!
	public static char maxChar2_Helper(String s, int a) {
		
		if(a == s.length()-1) { // if we are at last char it's the max
			return s.charAt(a);
		}
	    //create and hold the char at the current index
		char current = s.charAt(a);
		char maxRest= maxChar2_Helper(s, a+1);// ask helper to find max of remaining char
		
		if(current >maxRest) { 
			return current;
		}
		return maxRest;
		
	}
	   

	 //Q8
	  /** 
		 * A recursive function that returns whether or not an array represents an arithmetic sequence.
		 * An arithmetic sequence has a common difference between every two adjacent terms.   
		 * The array may or may not be empty.
		 * e.g., isArithmeticArray({1, 3, 5, 8, 10}) returns false and 
		 * isArithmeticArray({1, 3, 5, 7, 9}) returns true (because the common difference is 2).
		 * @param a an array
		 * @return true if input array a represents an arithmetic sequence; false otherwise.
		 * 
		 */
		 public static boolean isArithmeticArray(int[] a) {
			
			 if(a.length <=2) { //if(a.length <=1)
				 return true;
			 }
			 int q= a[1] -a[0]; // common difference
			 
			 // you may need a helper function!!
			 return isArithmaticHelper(a, 0, q);
		}
		 public static boolean isArithmaticHelper(int[] a, int index, int q) {
			 //if we reached the last element , mean all previous pairs matched
			 if(index == a.length -1) {
				 return true; // if index second from last so no check
			 }
			 //check if the current gap matches the q 
			 if(a[index +1] - a[index] != q) {
				 return false;// check current q
			 }
			 //recursive step check the next pair
			 return isArithmaticHelper(a, index+1, q); 
		 }
		
		 
	  
	 
	 
}