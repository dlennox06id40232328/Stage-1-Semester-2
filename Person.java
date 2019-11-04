package part01;

public class Person {
	private String forename,surname;
	
	public Person(String forename,String surname) {
		//Constructor for the Person object class
		this.forename=forename;
		this.surname = surname;
	}
	public String getDetails() {
		//This method returns the person's details,
		//e.g. forename = John, surname = Smith would return
		//Name: John Smith
		return "Name: "+this.forename+" "+ this.surname;
	}
	
	//Below are the getters and setters (i.e. accessors and mutators)
	public String getForename() {
		return this.forename;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setForename(String forename) {
		this.forename=forename;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
