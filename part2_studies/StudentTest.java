package part2_studies;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

 
 
//import myUtil.MyArrayList;

//import Course;

//import studentSystem.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

//ALREADY IMPLEMENTED; DO NOT MODIFY 
//NO NEED TO SUBMIT THIS FILE

/*
* Tests included in this class serve as documentation on how instances of a
* class work.
* 
* Be sure to also read the question instructions carefully
* 
* Programming IDEs such as Eclipse are able to fix such compilation errors for
* you. However, you are advised to follow the guidance as specified in the
* written Lab instructions PDF to fix these compilation errors manually,
* because: 1) it helps you better understand how the intended classes and
* methods work together; and 2) you may be tested in a written test or exam
* without the assistance of IDEs.
* 
*/


public class StudentTest {

	 
	
	@Test
	public void test0_00_serialYorkID() { // name aa to make sure run first in Junit4
		//Student.serial = 0; // manually reset for testing purposes
		Student s = new Student("John", 2);
		assertNotNull(s);
		assertEquals("York-1", s.getYorkID());
		assertEquals("John", s.getName());
		assertEquals(2, s.getYear());
		
		
		assertNotNull(s);
		Student s2 = new Student("Lisa", 1);
		assertEquals("York-2", s2.getYorkID());
		
		assertNotNull(s);
		Student s3 = new Student("Lean", 2);
		assertEquals("York-3", s3.getYorkID());
		
		Student s4 = new Student("Jeff", 3);
		assertEquals("York-4", s4.getYorkID());
		
		Student s5 = new Student("Al", 4);
		assertEquals("York-5", s5.getYorkID());
		
		Student s6 = new Student("Sue", 4);
		assertEquals("York-6", s6.getYorkID());
		
		Student s7 = new Student("Lida S", 3);
		assertEquals("York-7", s7.getYorkID());
		
		Student s8 = new Student("Rui", 1);
		assertEquals("York-8", s8.getYorkID());
		
		Student s9 = new Student("Lam", 2);
		assertEquals("York-9", s9.getYorkID());
		
		Student s10 = new Student("Xiue", 3);
		assertEquals("York-10", s10.getYorkID());
		
		Student s11 = new Student("Lee", 4);		
		assertEquals("York-11", s11.getYorkID());
				 
	}
	
	
	@Test
	public void test0_01_toString() { // name 01 to make sure run second in Junit4, (so id=12)
		Student s = new Student("John", 2);
		assertNotNull(s);
		
		String exp = "York-12 John 2 []";
		System.out.println(s);
		assertEquals(exp, s.toString());
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		Course course2 = new Course(2011,"Data Stucture", new Professor("Jeff", 30));
		Course course3 = new Course(2001,"Theory of Computation", new Professor("Jack", 12));
		assertNotNull(course1); assertNotNull(course2);assertNotNull(course3);
		ArrayList<Course> c  = new ArrayList<>();
		c.add(course1); 
		s.setCourses(c);  // avoid courseEnrol method
		System.out.println(s);
		
		String exp2 = "York-12 John 2 [2030]";
		assertEquals(exp2, s.toString());
		
		
		c.add(course2); c.add(course3);
		s.setCourses(c);  // avoid courseEnrol method
		System.out.println(s);
		String exp3 = "York-12 John 2 [2030-2011-2001]";
		assertEquals(exp3, s.toString());
	}
		
	@Test
	public void test0_02_enrolTotalCourse() {
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		Course course2 = new Course(2011,"Data Stucture", new Professor("Jeff", 30));
		Course course3 = new Course(2001,"Theory of Computation", new Professor("Jack", 12));
		assertNotNull(course1); assertNotNull(course2);assertNotNull(course3);
		/*ArrayList<Course> c  =new ArrayList<>();
		c.add(course1); c.add(course2); c.add(course3);*/
		
		Student s = new Student("Lee", 2);		
		 
		assertEquals(0, s.totalCourses());
		
		s.enrollCourse(course1);
		assertEquals(1, s.totalCourses());
		
		s.enrollCourse(course2);
		assertEquals(2, s.totalCourses());
		
		s.enrollCourse(course3);
		assertEquals(3, s.totalCourses());
		
		String exp = "York-13 Lee 2 [2030-2011-2001]";
		assertEquals(exp, s.toString());
		
				
	}
	
	@Test
	public void test0_03_getCourse() {
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		Course course2 = new Course(2011,"Data Stucture", new Professor("Jeff", 30));
		Course course3 = new Course(2001,"Theory of Computation", new Professor("Jack", 12));
		assertNotNull(course1); assertNotNull(course2);assertNotNull(course3);
		/*ArrayList<Course> c  =new ArrayList<>();
		c.add(course1); c.add(course2); c.add(course3);
		
		Student s = new Student("Lee", 2);
		s.setCourses(c);   // avoid ehrollCourse methods, for testing*/
		
		Student s = new Student("Lee", 2);
		s.enrollCourse(course1);s.enrollCourse(course2);s.enrollCourse(course3);
		
		assertEquals(3, s.totalCourses());
		Course cGet = s.getCourse(2);
		assertTrue(cGet==course3);  // same object
		
		Course cGet0 = s.getCourse(0);
		assertTrue(cGet0==course1);  // same object
		
		
		String title = s.getCourseTitle(1);
		assertEquals(title, "Data Stucture");
		String name = s.getInstrucorName(1);
		System.out.println(name);
		assertEquals(name, "Jeff");
		
		
		String title0 = s.getCourseTitle(0);
		assertEquals(title0, "Advanced OOP");
		String name0 = s.getInstrucorName(0);
		System.out.println(name0);
		assertEquals(name0, "Sam");
					
	}
	
	@Test
	public void test0_04_dropCourse00() {
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		Course course2 = new Course(2011,"Data Stucture", new Professor("Jeff", 30));
		Course course3 = new Course(2001,"Theory of Computation", new Professor("Jack", 12));
		/*assertNotNull(course1); assertNotNull(course2);assertNotNull(course3);
		ArrayList<Course> c  =new ArrayList<>();
		c.add(course1); c.add(course2); c.add(course3);
		
		Student s = new Student("Lee", 2);
		s.setCourses(c);  // avoid enrollment method*/
		
		Student s = new Student("Lee", 2);
		s.enrollCourse(course1);s.enrollCourse(course2);s.enrollCourse(course3);
		
		boolean taken = s.hasTaken (course1);
		assertTrue(taken);
		Course course4 = new Course(4413,"Ecommere",  new Professor("Joe", 12) );
		
		assertFalse( s.hasTaken (course4));
		
		boolean b = s.dropCourse(course2);
		assertTrue( b);
		assertFalse( s.hasTaken (course2));
		assertEquals(2, s.totalCourses());
		
		b = s.dropCourse(course4);
		assertFalse( b);
		
		Course cx = s.dropCourse(1);
		assertFalse( s.hasTaken (course3));
		assertTrue(course3 == cx);
		assertEquals(1, s.totalCourses());
	 
	}
	
	/*@Test
	public void test0_enrolCourse() {
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		Course course2 = new Course(2011,"Data Stucture", new Professor("Jeff", 30));
		Course course3 = new Course(2001,"Theory of Computation", new Professor("Jack", 12));
		assertNotNull(course1); assertNotNull(course2);assertNotNull(course3);
		
		Student s = new Student("Lee", 2);		
		
		assertEquals(0, s.totalCourses());
		
		s.enrollCourse(course1);
		assertEquals(1, s.totalCourses());
		
		s.enrollCourse(course2);
		assertEquals(2, s.totalCourses());
		
		s.enrollCourse(course3);
		assertEquals(3, s.totalCourses());
				
	}*/
	
	 
	 
	
	@Test
	public void test0_course_toString() {
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		
		String exp = "Course [code=2030, name=Advanced OOP, instructor=Sam]";
		assertEquals(exp, course1.toString());
				
				
		Course course2 = new Course(2011,"Data Stucture", new Professor("Jeff", 30));
		exp = "Course [code=2011, name=Data Stucture, instructor=Jeff]";
		assertEquals(exp, course2.toString());
	
	}
	@Test
	public void test0_course_equals() {
	
		Course course1 = new Course(2030,"Advanced OOP",  new Professor("Sam", 10) );
		
		Course course2 = new Course(2030,"Advanced OOP", new Professor("Jeff", 30));
		
		assertEquals(course1, course2);
				
		Course course3 = new Course(3020,"Advanced OOP", new Professor("Jeff", 30));
		assertNotEquals(course1, course3);
		assertNotEquals(course2, course3);

	}
	
	
	 
	
	
}
