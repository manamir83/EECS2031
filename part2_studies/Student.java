package part2_studies;
import java.util.ArrayList;

public class Student {
	
     
	
    /**
     * private fields
     */
    private String yorkID;
	private String name;
	private int year;
	private ArrayList<Course> courses; // list of courses completed or completing
	
	// other field as needed
	private static int serial =1;
	
	/**
	 * customer constructor 
	 * set id such that each student has a unique 
     * yorkID in the format of York-X, where X is the serial number, starting from 1. That is, 
     * the very first student object automatically gets ID 'York-1', the second student object 
     * gets ID 'York-2', the 75th student object gets ID 'York-75' etc.    
     * Add attribute as needed.
     * 
     * Also create the courses array 
	 * 
	 * @param name  name to set
	 * @param year  year to set
	 */
	public Student(String name, int year) {
		 this.name=name;
		 this.year=year;
		 this.courses = new ArrayList<Course>();
		 
		 this.yorkID="York-" + serial;
		 serial++;
	 }
	
	/**
	 * getter for York ID
	 * @return York ID
	 */
	public String getYorkID() {
		return yorkID;
	}

 

	/**
	 * getter for name
	 * @return name
	 */
	 public String getName() {
		 return name;
	 }

 
	
	/**
	 * getter for year
	 * @return year
	 */
	 public int getYear() {
		 return year;
	 }
	
	 
	/**
	 * getter for courses
	 * @return course array
	 */
	 public ArrayList<Course> getCourses(){
		 return courses;
	 }

	// set 
	// testing purposes
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	
	/**
	  * enroll/add course c 
	  * @param c  the course to enroll
	  * 
	*/
	public void enrollCourse(Course c){
		 this.courses.add(c);
	}
	
	/**
	 * drop course c. Return true if course is dropped. return false if no such
	 * course exist in the list.
	 * 
	 * @param c  the course to drop
	 * @return true if the course is removed, false if have not taken the course
	 */
	public boolean dropCourse (Course c) {
		 return this.courses.remove(c);
	}
	
	/**
	 * drop the ith course in the list. 
	 * assume i is valid, i.e., 0 &lt;= i &lt; number of courses
	 * 
	 * @param i  the index of course to drop
	 * @return true if the course dropped, false otherwise
	 */
	
	public Course dropCourse (int i) {
		 return this.courses.remove(i);
	}
	
	/**
	 * get the ith course in the list. 
	 * assume i is valid, i.e.,  0 &lt;= i &lt;   number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the course at the position  
	 */
	public Course getCourse(int i) {
		 return this.courses.get(i);
	}
	
	 
	/**
	 * get the title of the ith course in the list. 
	 * assume i is valid, i.e., 0  0 &lt;= i &lt; number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the title of course at the position
	 */
	
	public String getCourseTitle(int i) {
		 return this.courses.get(i).getName();
	}
	
	
	
	/**
	 * get the instructor's name of the ith course in the list. 
	 * assume i is valid, i.e., 0  0 &lt;= i &lt; number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the name of instructor of course at the position
	 */
	
	 
	public String getInstrucorName(int i) {
		 // Student -> Course -> Professor -> Name
		return this.courses.get(i).getInstructor().getName();
	}
	
	 
	/**
	 * get total number of courses has taken or is taking
	 *
	 * @return the number of courses taken or taking
	 */
	public int totalCourses() {
		 return this.courses.size();
	}
	
	//
	//return false otherwise
	
	/**
	 * determine if course c has been completed or is taking
	 * @param c  course to check	 
	 * @return true if the course has been taken or is taking, return false otherwise
	 */
	public boolean hasTaken (Course c){
		// check if course is taken
		for(int i=0; i<courses.size();i++) {
			if(courses.get(i).equals(c)) {
				return true;
			}
		}
		 return false;
	}


	@Override
	/**
	 * return a string representation of the student
	 * in the form of ID name year [courses]
	 * e.g., 
	 * York-02 Sue 2 []
	 * York-02 Sue 2 [1022]
	 * York-02 Sue 2 [1012 1022 2011]
	 * 
	 * @return a string representation of above format
	 **/
	public String toString() {
		 
		String result = yorkID + " " + name + " " + year + " [";
		
		// adding codes manually
		for(int i=0; i< courses.size();i++) {
			int code=courses.get(i).getCode();
			result = result + code;
			
			// only add hyphen if its not the last element
			if(i< courses.size() -1) {
				result = result + "-";
			}
		}
		result= result + "]";
		return result;
	}
	
	
	

	
	
	
	
	
	
	
	
	

}
