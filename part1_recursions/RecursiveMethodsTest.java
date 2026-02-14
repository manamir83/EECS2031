package part1_recursions;

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
	

	/********************************************************************/
	@Test
	public void test_maxChar_00() {
		char c = RecursiveMethods.maxChar3("h");
		char exp = 'h' ;
		assertEquals(exp, c);
	}
	
	 @Test
	public void test_maxChar_01() {
		char c = RecursiveMethods.maxChar3("abbL");
		char exp = 'b' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar_02() {
		char c = RecursiveMethods.maxChar3("helloWORLD");
		char exp = 'o' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar_03() {
		char c = RecursiveMethods.maxChar3("helloworld");
		char exp = 'w' ;
		assertEquals(exp, c);
	}
	@Test
	public void test_maxChar_04() {
		char c = RecursiveMethods.maxChar3("abbxL ? 12 x5y @");
		char exp = 'y' ;
		assertEquals(exp, c);
	}
	
	
	@Test
	public void test_maxChar_05() {
		char c = RecursiveMethods.maxChar3("abc123cab@");
		char exp = 'c' ;
		assertEquals(exp, c);
	}
	
	    
	    /********************************************************************/
	    @Test
		public void test_digitThree_00() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(0);
			int exp = 0;
			assertSame(exp, c);
		}
	    @Test
		public void test_digitThree_01() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(3);
			int exp = 1;
			assertSame(exp, c);
		}
	    @Test
		public void test_digitThree_02() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(2030);
			int exp = 1;
			assertSame(exp, c);
		} 
	    
	    @Test
		public void test_digitThree_03() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(20317836);
			int exp = 2;
			assertSame(exp, c);
		}
	    
	    @Test
		public void test_digitThree_04() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(1237465343);
			int exp = 3;
			assertSame(exp, c);
		}
	    @Test
		public void test_digitThree_05() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(19457);
			int exp = 0;
			assertSame(exp, c);
		}
	    @Test
		public void test_digitThree_06() {
			RecursiveMethods rm = new RecursiveMethods();
			int c = rm.numberOfThrees(765342);
			int exp = 1;
			assertSame(exp, c);
		}
	    


	//----------------------------------------------
	    /********************************************************************/
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
	    
}
