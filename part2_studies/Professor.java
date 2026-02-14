package part2_studies;

public class Professor {
	
	
	/**
	 * private fields
	 */
	private String name;
	private int year;
	
	/**
	 * customer constructor
	 * 
	 * @param name name to set
	 * @param year year to set
	 */
	public Professor(String name, int year) {
		this.name=name;
		this.year=year;
	}
	
	/**
	 * getter for name
	 * @return  name
	 */
	 public  String getName() {
		 return name;
	 }
	
	/**
	 * setter for name
	 * @param name name to set
	 */
	 public void setName(String name) {
		 this.name=name;
	 }
	
	/**
	 * getter for year
	 * @return year
	 */
	 public int getYear() {
		 return year;	 }
	/**
	 * setter for year
	 * @param year year to set
	 */
	 public void setYear(int year) {
		 this.year=year;
	 }
	
	

}
