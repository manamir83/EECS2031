package part3_exceptions;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import part3_exceptions_work.ATM;
import part3_exceptions_work.DiskFileProcessor;
 

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class part3Test {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	*/

@Test
public void test0_00_deposit_0() { 
	//Student.serial = 0; // manually reset fo
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20,  30, 40, 50};
	String resu[] = ATM.depositMe(acc, amounts);
	String expectedResu[] = {"success", "success", "success", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(1150, bal, 0.0001);
	
}
@Test
public void test0_00_deposit_1() { 
	 
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, -30, 40, 50};
	String resu[] = ATM.depositMe(acc, amounts);
	String expectedResu[] = {"success", "success", "failure (negative amount)", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(1120, bal, 0.0001);
	
}
@Test
public void test0_00_deposit_2() {   
	 
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 650, 40, 50};
	String resu[] = ATM.depositMe(acc, amounts);
	String expectedResu[] = {"success", "success", "failure (beyond half balance)", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(1120, bal, 0.0001);
	
}

@Test
public void test0_00_deposit_3() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, -20, 650, 40, 500, 900};
	String resu[] = ATM.depositMe(acc, amounts);
	String expectedResu[] = {"success", "failure (negative amount)", "failure (beyond half balance)", "success", "success","failure (beyond half balance)" };
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(1550, bal, 0.0001);
	
}



@Test
public void test0_00_withdraw_0() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 30, 40, 50};
	String resu[] = ATM.withdrawMe(acc, amounts);
	String expectedResu[] = {"success", "success", "success", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(850, bal, 0.0001);
	
}

@Test
public void test0_00_withdraw_1() {  
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 972, 40, 50 };
	String resu[] = ATM.withdrawMe(acc, amounts);
	String expectedResu[] = {"success", "success", "failure (need 100 balance)", "success", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(880, bal, 0.0001);
	
}
@Test
public void test0_00_withdraw_2() {  
	 
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, 30, -40, 50 };
	String resu[] = ATM.withdrawMe(acc, amounts);
	String expectedResu[] = {"success", "success", "success", "failure (negative amount)","success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(890, bal, 0.0001);
	
}
@Test
public void test0_00_withdraw_3() { // name aa to make sure run first in Junit4
	//Student.serial = 0; // manually reset fo
	SavingsAccount acc = new SavingsAccount(1000);
	double amounts[] = {10, 20, -40, 860, 70,  6 };
	String resu[] = ATM.withdrawMe(acc, amounts);
	System.out.println(Arrays.toString(resu));
	String expectedResu[] = {"success", "success","failure (negative amount)", "success", "failure (need 100 balance)", "success"};
	assertArrayEquals(resu, expectedResu);
	
	double bal = acc.getBalance();
	assertEquals(104, bal, 0.0001);
	
}


//***********************************************************/
@Test
public void test0_00_openFile_0() {  
	String files[] = {"abc.txt", "b.txt"};
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST"};
	assertArrayEquals(expectedResu, lines);
		
	
}

@Test
public void test0_00_openFile_1() {  
	String files[] = {"abc.txt", "b.txt", "xyz.txt"};
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST", "hello from xyz.txt"};
	assertArrayEquals(expectedResu, lines );
		
}
@Test
public void test0_00_openFile_2() {  
	String files[] = {"abc.txt", "b.txt", "xyz.txt", "xyz", "ATM.c" };
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST", "hello from xyz.txt", "FILE DOESN'T EXIST", "FILE DOESN'T EXIST"};
	assertArrayEquals(expectedResu, lines );
}

@Test
public void test0_00_openFile_3() {  
	String files[] = {"abc.txt", "b.txt", "xyz.txt", "resume.pdf", "NewFile.xml"};
	String lines[] = DiskFileProcessor.readFiles(files);
	
	System.out.println(Arrays.toString(lines));
	
	String expectedResu[] = {"hello from abc.txt", "FILE DOESN'T EXIST", "hello from xyz.txt","FILE DOESN'T EXIST", "<?xml version=1.0 encoding=UTF-8?>" };
	assertArrayEquals(expectedResu, lines );
}


 
}