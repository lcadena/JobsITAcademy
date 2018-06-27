package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	protected String descripcion;
	protected double salaryPerMonth;

	public Volunteer(String name, String address, String phone, String descripcion) throws Exception {
		super(name, address, phone);
		this.descripcion = descripcion;
	}

	
	@Override
	public void pay() {
		//TODO
		salaryPerMonth = 0;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
