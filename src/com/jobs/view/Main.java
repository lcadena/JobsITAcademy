package com.jobs.view;

import com.jobs.application.JobsController;
import com.jobs.application.StaffMemberDTO;

import java.util.List;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666", "El voluntario no cobra");
		controller.createManagerEmployee("Pedro Manager", "Dirección molona 5", "665226666", 80.0);
		
		
		controller.payAllEmployeers();
		
		List<StaffMemberDTO> employeesList = controller.getAllEmployees();
		for (StaffMemberDTO emp : employeesList){
			System.out.println(emp);
		}
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");

		controller.deleteMember("Laura Employee");

		employeesList = controller.getAllEmployees();
		for (StaffMemberDTO emp : employeesList){
			System.out.println(emp);
		}
	}

}
