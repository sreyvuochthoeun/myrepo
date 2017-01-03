/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkoop;

import java.util.ArrayList;

/**
 *
 * @author Srey Vouch
 */
public class Homeworkoop {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
		
		ArrayList<Employee> empls = new ArrayList<>();//list arr
		
		Employee empl = new Employee(); 
		empl.setFirstName("Dara");//set val
		empl.setLastName("Sok");
                empl.setBirthDate("12/12/1990");
                empl.setSalary(150.5);
		empl.setYears(1);
                empl.setHoliday("18days");
                
		empls.add(empl);
		
		Developer dev = new Developer(empl);
		
		empls.add(dev);
		
		TeamLeader teamL = new TeamLeader();
		teamL.setFirstName("Chantha ");
		teamL.setLastName(" Pol");
                
		empls.add(teamL);
		
		for(Employee nEmpl : empls){
			System.out.println(nEmpl.getDataView());
		}
		
	}
    
}
