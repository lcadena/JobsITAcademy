package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository = new EmployeeRepository();
		
	}
	
	public Employee createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
		return boss;
	}
	
	public Employee createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
		return employee;
	}

	public Employee createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		return manager;
	}

	public void payAllEmployeers() {
		List<AbsStaffMember> employeers = repository.getAllMembers();
		for (AbsStaffMember member : employeers) {
			member.pay();
		}

	}

	public List<StaffMemberDTO> getAllEmployees() throws Exception {
		List<StaffMemberDTO> members = new ArrayList<>();
		for (AbsStaffMember member : repository.getAllMembers()){
			members.add(new StaffMemberDTO(member));
		}
		return members;
	}

	public Volunteer createVolunteer(String name, String address, String phone, String descripcion) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, descripcion);
		repository.addMember(volunteer);
		return  volunteer;
	}

	public void deleteMember (String emp) throws Exception {
		for (AbsStaffMember member : repository.getAllMembers()){
			if (member.getName().equals(emp)){
				repository.deleteMember(member);
			}
		}
	}
	
}
