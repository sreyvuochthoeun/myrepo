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
public class TeamLeader extends Employee implements View{
    int projectNum;

	public int getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	@Override
	public String getDataView() {
		// TODO Auto-generated method stub
//		Developer devloper = new Developer();
		String dis = "";
		
		dis += getFirstName().toUpperCase(); 
		dis += getLastName().toUpperCase(); 
		dis += "\n" + getProjectNum(); 
				
		return dis;
	}
	
	
}
