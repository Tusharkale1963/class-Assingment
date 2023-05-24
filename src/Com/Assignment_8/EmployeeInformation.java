package Com.Assignment_8;

import java.util.Scanner;

public class EmployeeInformation  {
	String firstName;
	String lastName;
	 String city ;
	 long mobileNumber; 
	static String country ="India";
	public String getFirstName() {
		return firstName;
	}
	Scanner sc=new Scanner(System.in);
	String FirstName=sc.nextLine();
	public void setFirstName(String FirstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void getUserInput() {
		
	}
}
