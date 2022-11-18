package com.spring.core.autowiring;

public class Employee {

	private Address adr;

	public Address getAdr() {
		return adr;
	}

	public Employee() {
		super();
	}

	public Employee(Address adr) {
		super();
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Worker [adr=" + adr + "]";
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

}
