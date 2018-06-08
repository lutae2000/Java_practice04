package com.javaex.problem01;

public class Depart extends Employee {
	

	String depart;
	sdfsdfsdf
	public Depart(String name,int salary ,String depart) {
		super(name, salary);
		this.depart = depart;
	}

	public Depart(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	public void getInformation() {
        System.out.println("이름:" + getName() + "연봉:" + getSalary() + "부서 :"+depart);
    }

}
