package com.design.creational;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees employees = new Employees();
		employees.loadData();

		Employees emp1 = (Employees) employees.clone();
		Employees emp2 = (Employees) employees.clone();

		emp1.getEmpList().add("Sajal");
		emp2.getEmpList().add("Gaurav");
		emp2.getEmpList().remove("Kushal");

		System.out.println("Employee 1 : " + emp1.getEmpList());
		System.out.println("Employee 2 : " + emp2.getEmpList());
	}

}

class Employees implements Cloneable {
	// create constructors
	// remove setters

	private List<String> empList;

	public Employees(List<String> empList) {
		this.empList = empList;
	}

	public Employees() {
		empList = new ArrayList<>();
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void loadData() {
		empList.add("Nishant");
		empList.add("Niwesh");
		empList.add("Kushal");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String emp : this.empList) {
			temp.add(emp);
		}
		return new Employees(temp);

	}
}
