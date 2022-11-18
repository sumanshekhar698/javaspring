package com.spring.core.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Employee {

	
	@Qualifier("adr1")
	@Autowired
	private Address adr;

	public Address getAdr() {
		return adr;
	}

	public Employee() {
		super();
	}

	public Employee(Address adr1) {
		super();
		this.adr = adr1;
	}

	@Override
	public String toString() {
		return "Worker [adr=" + adr + "]";
	}

	public void setAdr(Address adr) {
		this.adr = adr;
		System.out.println("SETTER CALLED");
	}

}
