package com.jobs.application;

import com.jobs.domain.AbsStaffMember;

public class StaffMemberDTO {
    protected String name;
    protected String address;
    protected String phone;
    protected double totalPaid=0;

    public StaffMemberDTO(AbsStaffMember emp) throws Exception {
        if (emp == null) {
            throw new Exception();
        }
        this.name = emp.getName();
        this.address = emp.getAddress();
        this.phone = emp.getPhone();
        this.totalPaid = emp.getTotalPaid();
    }

    public String toString(){
        String result = "";
        result += "\nName: " + name + "\nAddress: " + address +
                "\nPhone: " + phone + "\nTotalPaid: " + totalPaid;
        return result;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public String getPhone() {
        return phone;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

}
