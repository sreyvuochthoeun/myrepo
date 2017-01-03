/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkoop;

/**
 *
 * @author Srey Vouch
 */
public class Employee implements View{
    Double 	salary;
	String 	holiday;
	int 	years;
	String 	lastName;
	String 	birthDate;
	String firstName;
	
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	@Override
	public String getDataView() {
		// TODO Auto-generated method stub
		String displayEmpl = "";
		
		displayEmpl += "#########################################"; 
		displayEmpl += "\nFirst Name	: "	+	getFirstName()	; 
		displayEmpl += "\nLast Name		: "	+	getLastName()	; 
		displayEmpl += "\nDate of Birth	: "	+	getBirthDate()	; 
		displayEmpl += "\nHoliday		: "	+	getHoliday()	; 
		displayEmpl += "\nYear of Work	: "	+	getYears()		; 
		displayEmpl += "\nSalary		: "	+	getSalary()		; 
		displayEmpl += "\n#########################################"; 
		
		return displayEmpl;
	}
	
	
}
