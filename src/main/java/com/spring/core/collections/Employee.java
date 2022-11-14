package com.spring.core.collections;

import java.util.List;
import java.util.Map;

import lombok.ToString;

//@ToString
public class Employee {

	private String name;
	private List<String> phone;
	private Map<String, Integer> courseDuration;
	private Address adress;

	public Employee() {
		super();
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public Employee(String name, List<String> phone, Map<String, Integer> courseDuration, Address adress) {
		super();
		System.out.println("Employee(parameterized)");
		this.name = name;
		this.phone = phone;
		this.courseDuration = courseDuration;
		this.adress = adress;
	}

	public Employee(String name, Address adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", courseDuration=" + courseDuration + ", adress="
				+ adress + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Map<String, Integer> getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Map<String, Integer> courseDuration) {
		this.courseDuration = courseDuration;
	}

}
