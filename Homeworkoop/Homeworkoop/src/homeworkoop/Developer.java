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
public class Developer extends Employee implements View{
    String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public Developer(Employee empl){
		this.firstName 	= empl.getFirstName();
		this.lastName 	= empl.getLastName();
		this.salary		= empl.getSalary();
	}
	
	@Override
	public String getDataView() {
		// TODO Auto-generated method stub
		String displayEmpl = "";
		displayEmpl += ""+getFirstName() + getLastName() + " : " + getComment() + " : " + getSalary(); 
		
		return displayEmpl;
	}
}
