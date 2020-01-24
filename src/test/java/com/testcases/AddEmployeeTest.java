package com.testcases;

import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class AddEmployeeTest extends CommonMethods {
	
	/*Sprint 5
US 16767: As an admin I should be able to add an employee 

TC: Add Employee
Step 1. navigate to the application
Step 2: login into the application
Step 3: navigate to add employee page
Step 4: add employee by providing fname. mname, lname
Step 5: verify employee has been added successfully*/
	
		@Test
		
		public void addEmployeeValidation() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();

		
		
		}

}
