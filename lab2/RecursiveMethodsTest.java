package eecs2030.lab2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;
//import org.junit.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RecursiveMethodsTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	public static double delta = 0.0000001;
	
	//@Rule
	//public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	
	
	/*******************************************************************/
	@Test
	public void test_sumNint_01() {
		
		int e = 0;
		for (int n=1; n<1000; n++) {
			e += n;
			assertEquals("Failed: sum(" + n + ")", e, RecursiveMethods.sum(n) );
		}
			
	}
	/*******************************************************************/

	@Test
	public void test_repeatCharNTimes_01() {

		String rest = RecursiveMethods.repeatCharNTimes(4, 'e');
		String exp = "eeee" ;
		assertTrue(exp.equals(rest));
	}
	@Test
	public void test_repeatCharNTimes_02() {
		String rest = RecursiveMethods.repeatCharNTimes(10, 'A');
		String exp = "AAAAAAAAAA" ;
		assertTrue(exp.equals(rest));
	}
	
	@Test
	public void test_repeatCharNTimes_03() {
		String rest = RecursiveMethods.repeatCharNTimes(0, 'A');
		String exp = "" ;
		assertTrue(exp.equals(rest));
	}
	
	@Test
	public void test_repeatCharNTimes_04() {
		String rest = RecursiveMethods.repeatCharNTimes(7, 'A');
		String exp = "AAAAAAA" ;
		assertTrue(exp.equals(rest));
	}
	
	@Test
	public void test_repeatCharNTimes_05() {
		String rest = RecursiveMethods.repeatCharNTimes(10, '*');
		String exp = "**********" ;
		assertTrue(exp.equals(rest));
	}
	
	/*******************************************************************/
	/*@Test
	public void test_IntegerToBinary_01() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(1);
		int[] exp = {1};
		assertArrayEquals(exp, rest);
		
	}
	@Test
	public void test_IntegerToBinary_02() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(4);
		int[] exp = {1, 0, 0};
		assertArrayEquals(exp, rest);
		
	}
	@Test
	public void test_IntegerToBinary_03() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(9);
		int[] exp = {1,0,0,1};
		assertArrayEquals(exp, rest);
		
	}
	
	@Test
	public void test_IntegerToBinary_04() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(13);
		int[] exp = {1,1,0,1};
		assertArrayEquals(exp, rest);
		
	}
	
	@Test
	public void test_IntegerToBinary_05() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(32);
		int[] exp = {1, 0, 0, 0, 0,0};
		assertArrayEquals(exp, rest);
		
	}
	@Test
	public void test_IntegerToBinary_06() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(107);
		int[] exp = {1, 1, 0, 1, 0, 1,1};
		assertArrayEquals(exp, rest);
		
	}
	@Test
	public void test_IntegerToBinary_07() {
		RecursiveMethods rm = new RecursiveMethods();
		int[] rest = rm.IntegerToBinary(65535);
		int[] exp = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		assertArrayEquals(exp, rest);
		
	}*/
	/*******************************************************************/
	
    /*************************************************************/
	
	@Test
	public void test_numberOfFirstCharBeginning_01() {
		int  rest = RecursiveMethods.numberOfFirstCharBeginning("aaaxd%fdsaefg");
		int  exp = 3;
		assertTrue( exp==rest );
	}
	
	
	@Test
	public void test_numberOfFirstCharBeginning_02() {
		int  rest = RecursiveMethods.numberOfFirstCharBeginning("drfefdsefg");
		int  exp = 1;
		assertTrue( exp==rest );
	}
	
	@Test
	public void test_numberOfFirstCharBeginning_03() {
		
		int  rest = RecursiveMethods.numberOfFirstCharBeginning("");
		int  exp = 0;
		assertTrue( exp==rest );
	}
	
	@Test
	public void test_numberOfFirstCharBeginning_04() {
		
		int  rest = RecursiveMethods.numberOfFirstCharBeginning("bbbcfreb$b");
		int  exp = 3;
		assertTrue( exp==rest );
	}
	
	/********************************************/
	@Test
	public void test_numberOfFirstChar_01() {
		int  rest = RecursiveMethods.numberOfFirstChar("aaaxd%fdsaefg");
		int  exp = 4;
		assertTrue( exp==rest );
	}
	
	
	@Test
	public void test_numberOfFirstChar_02() {
		int  rest = RecursiveMethods.numberOfFirstChar("drfefdsefg");
		int  exp = 2;
		assertTrue( exp==rest );
	}
	
	@Test
	public void test_numberOfFirstChar_03() {
		int  rest = RecursiveMethods.numberOfFirstChar("");
		int  exp = 0;
		assertTrue( exp==rest );
	}
	
	@Test
	public void test_numberOfFirstChar_04() {
		int  rest = RecursiveMethods.numberOfFirstChar("bbbcfreb$b");
		int  exp = 5;
		assertTrue( exp==rest );
	}
	
	/********************************************************************/
	@Test
	public void test_maxChar_00() {
		char c = RecursiveMethods.maxChar("h");
		char exp = 'h' ;
		assertEquals(exp, c);
	}
	
	 @Test
	public void test_maxChar_01() {
		char c = RecursiveMethods.maxChar("abbL");
		char exp = 'b' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar_02() {
		char c = RecursiveMethods.maxChar("helloWORLD");
		char exp = 'o' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar_03() {
		char c = RecursiveMethods.maxChar("helloworld");
		char exp = 'w' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar_04() {
		char c = RecursiveMethods.maxChar("abbxL ? 12 x5y @");
		char exp = 'y' ;
		assertEquals(exp, c);
	}
	
	
	@Test
	public void test_maxChar_05() {
		char c = RecursiveMethods.maxChar("abc123cab@");
		char exp = 'c' ;
		assertEquals(exp, c);
	}
	/********************************************************************/
	@Test
	public void test_maxChar2_00() {
		char c = RecursiveMethods.maxChar2("h");
		char exp = 'h' ;
		assertEquals(exp, c);
	}
	
	 @Test
	public void test_maxChar2_01() {
		char c = RecursiveMethods.maxChar2("abbL");
		char exp = 'b' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar2_02() {
		char c = RecursiveMethods.maxChar2("helloWORLD");
		char exp = 'o' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar2_03() {
		char c = RecursiveMethods.maxChar2("helloworld");
		char exp = 'w' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar2_04() {
		char c = RecursiveMethods.maxChar2("abbxL ? 12 x5y @");
		char exp = 'y' ;
		assertEquals(exp, c);
	}
	
	
	@Test
	public void test_maxChar2_05() {
		char c = RecursiveMethods.maxChar2("abc123cab@");
		char exp = 'c' ;
		assertEquals(exp, c);
	}
/******************************************************************/
	@Test
	public void test_yorknacci_01() {
		 
		int  rest = RecursiveMethods.yorknacci(0);
		int  exp = 1;
		assertTrue(exp==rest);
	}
	@Test
	public void test_yorknacci_02() {
		 
		int  rest = RecursiveMethods.yorknacci(1);
		int  exp = 1;
		assertTrue(exp==rest);
	}
	
	@Test
	public void test_yorknacci_03() {
		 
		int  rest = RecursiveMethods.yorknacci(2);
		int  exp = 1;
		assertTrue(exp==rest);
	}
	
	@Test
	public void test_yorknacci_04() {
		 
		int  rest = RecursiveMethods.yorknacci(4);
		int  exp = 4;
		assertTrue(exp==rest);
	}
	
	
	@Test
	public void test_yorknacci_05() {
		 
		int  rest = RecursiveMethods.yorknacci(20);
		int  exp = 26244;
		assertTrue(exp==rest);
	}
	
	 
	 /********************************************************************/
    @Test
	public void testIsArithmeticArray_01() {
		int[] a = {};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_02() {
		  
		int[] a = {7};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_03() {
		int[] a = {7, 10};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_04() {
		int[] a = {10, 7};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_05() {
		int[] a = {1,3, 5};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_06() {
		int[] a = {1, 3, 7};
		assertFalse(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_07() {
		int[] a = {7, 10, 13, 16, 19, 22, 25, 28};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_08() {
		int[] a = {7, 10, 13, 16, 20, 23, 26, 29};
		assertFalse(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_09() {
		int[] a = {7, 10, 13, 16, 19, 22, 25, 29};
		assertFalse(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_10() {
		int[] a = {29, 26, 23, 20, 17, 14, 11, 8};
		assertTrue(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_11() {
		int[] a = {29, 26, 23, 20, 16, 13, 10, 7};
		assertFalse(RecursiveMethods.isArithmeticArray(a));
	}
	
	@Test
	public void testIsArithmeticArray_12() {
		int[] a = {29, 25, 22, 19, 16, 13, 10, 7};
		assertFalse(RecursiveMethods.isArithmeticArray(a));
	} 
	 
//	
//	
//	@Test
//	public void test_power_00() {
//		RecursiveMethods rm = new RecursiveMethods();
//		double c = rm.power(2, 0);
//		//System.out.println(c);
//		double exp = 1;
//		assertEquals(exp, c, delta);
//	}
//	
//	@Test
//	public void test_power_01() {
//		RecursiveMethods rm = new RecursiveMethods();
//		double c = rm.power(2, 3);
//		//System.out.println(c);
//		double exp = 8;
//		assertEquals(exp, c, delta);
//	}
//	 @Test
//	public void test_power_02() {
//		RecursiveMethods rm = new RecursiveMethods();
//		double c = rm.power(-2, 5);
//		//System.out.println(c);
//		double exp = -32;
//		assertEquals(exp, c, delta);
//	}
//	 @Test
//	public void test_power_03() {
//		RecursiveMethods rm = new RecursiveMethods();
//		double c = rm.power(2, -3);
//		//System.out.println(c);
//		double exp = 0.125;
//		assertEquals(exp, c, delta);
//		}
//	
//	 @Test
//	public void test_power_04() {
//		RecursiveMethods rm = new RecursiveMethods();
//		double c = rm.power(2, -6);
//		//System.out.println(c);
//		double exp = 0.015625;
//		assertEquals(exp, c, delta);
//	}
//	
//	 @Test
//	public void test_power_05() {
//		RecursiveMethods rm = new RecursiveMethods();
//		double c = rm.power(-2, -5);
//		//System.out.println(c);
//		double exp = -0.03125;
//		assertEquals(exp, c, delta);
//	}
//	/********************************************************************/
//	 @Test
//	public void test_readLine_01() throws FileNotFoundException{
//		RecursiveMethods rm = new RecursiveMethods();
//		//System.out.println(System.getProperty("user.dir") + System.getProperty("file.separator"));
//		Scanner scan = new Scanner(new File("file.txt"));//file.txt"));
//		System.out.println("------------------------");
//		rm.printLines(scan);
//		System.out.println("------------------------");
//		//System.out.println(systemOutRule.getLog());
//		//assertEquals(exp, c, delta);
//	}
//	 
//	 /********************************************************************/
//	   @Test
//		public void test_palindrome_01() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("d");
//			assertTrue(c);
//		}
//	   @Test
//		public void test_palindrome_02() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("dad");
//			assertTrue(c);
//		}
//	    @Test
//		public void test_palindrome_03() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("Dad");
//			assertFalse(c);
//		}
//	    @Test
//		public void test_palindrome_04() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("li Saxxxas IL");
//			assertFalse(c);
//		} 
//	    @Test
//		public void test_palindrome_05() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("li SaxxxaS il");
//			assertTrue(c);
//		}
//	    @Test
//		public void test_palindrome_06() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("1234 5 4321");
//			assertTrue(c);
//		}
//	    @Test
//		public void test_palindrome_07() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("that is a is taht");
//			assertFalse(c);
//		}
//	    @Test
//		public void test_palindrome_08() {
//			RecursiveMethods rm = new RecursiveMethods();
//			boolean c = rm.isPalindrome("that is a si taht");
//			assertTrue(c);
//		}
//	    /********************************************************************/
//	    @Test
//		public void test_sum_00() {
//			RecursiveMethods rm = new RecursiveMethods();
//			List<Integer> li = new ArrayList<>();
//			int s = rm.sum(li);
//			int exp = 0;
//			assertSame(exp, s);
//			
//			li = new LinkedList<>();
//			assertSame(exp, rm.sum(li));
//		}
//			
//	    @Test
//		public void test_sum_01() {
//			RecursiveMethods rm = new RecursiveMethods();
//			List<Integer> li = Arrays.asList(7);
//			int s = rm.sum(li);
//			int exp = 7;
//			assertSame(exp, s);
//		}
//	    
//	    @Test
//		public void test_sum_02() {
//			RecursiveMethods rm = new RecursiveMethods();
//			List<Integer> li = Arrays.asList(7,3,5);
//			int s = rm.sum(li);
//			int exp = 15;
//			assertSame(exp, s);
//		}
//	    @Test
//		public void test_sum_03() {
//			RecursiveMethods rm = new RecursiveMethods();
//			List<Integer> li = Arrays.asList(7,3,5, 6, 8, 9, 2, 0, -1);
//			int s = rm.sum(li);
//			int exp = 39;
//			assertSame(exp, s);
//		}
//	    
//	    /********************************************************************/
//	    @Test
//		public void test_evenDigits_00() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(0);
//			int exp = 1;
//			assertSame(exp, c);
//		}
//	    @Test
//		public void test_evenDigits_01() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(3);
//			int exp = 0;
//			assertSame(exp, c);
//		}
//	    @Test
//		public void test_evenDigits_02() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(2030);
//			int exp = 3;
//			assertSame(exp, c);
//		} 
//	    
//	    @Test
//		public void test_evenDigits_03() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(2031);
//			int exp = 2;
//			assertSame(exp, c);
//		}
//	    
//	    @Test
//		public void test_evenDigits_04() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(1237);
//			int exp = 1;
//			assertSame(exp, c);
//		}
//	    @Test
//		public void test_evenDigits_05() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(19357);
//			int exp = 0;
//			assertSame(exp, c);
//		}
//	    @Test
//		public void test_evenDigits_06() {
//			RecursiveMethods rm = new RecursiveMethods();
//			int c = rm.evenDigits(765342);
//			int exp = 3;
//			assertSame(exp, c);
//		}
//	    

//	 /******************************************************************/
//	 private List<Integer> a2l(int[] a) {
//		List<Integer> list = new ArrayList<>();
//		for(int i = 0; i < a.length; i ++) {
//			list.add(a[i]);
//		}
//		return list;
//	}
	
}
