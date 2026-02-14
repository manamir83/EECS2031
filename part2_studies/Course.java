package part2_studies;


public class Course {
	
	/**
	 * private attributes
	 */
	private int code;  
	private String name;
	private Professor instructor;
	
	
	/**
	 * customer constructor
	 * 
	 * @param code  code of the course
	 * @param name  name of the course
	 * @param prof instructor of the course
	 */
	public Course(int code, String name, Professor prof) {
	    this.code= code;
	    this.name= name;
	    this.instructor = prof;
	}    
	
	/**
	 * getter for code
	 * @return the code
	 */
	 public int getCode() {
		 return code;
	 }
	 
	
	/**
	 * setter for code
	 * @param code the code to set
	 */
	 public void setCode(int code) {
		 this.code=code;
	 }
	
	/**
	 * getter for name
	 * @return the name
	 */
	 public String getName() {
		 return name;
	 }
	
	/**
	 * setter for name
	 * @param name the name to set
	 */
	 public void setName(String name) {
		 this.name= name;
	 }
	
	/**
	 * getter for instructor
	 * @return the instructor
	 */
	 public Professor getInstructor() {
		 return instructor;
	 }
	
	/**
	 * setter for instructor
	 * @param instructor the instructor to set
	 */
	 public void getInstructor(Professor instructor) {
		 this.instructor= instructor;
	 }
	
	/**
	 * string representation of this course
	 * in the format of "Course [code=cc, name=nn, instructor=instrucorName]"
	 * e.g., Course [code=2011, name=Sue, instructor=Sam]
	 * 
	 * return string representation of above format
	 */
	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + ", instructor=" + instructor.getName() + "]";
	}
	
		/**
	 * two Courses are equal if they have the same code and same name.
	 * Assume obj is of class Course and is not null
	 * 
	 * @param other course object
	 * @return true if they have same code and same name. False otherwise
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		Course other= (Course) obj;
		
		return this.code== other.code && this.name.equals(other.name);
		 
	}

}
