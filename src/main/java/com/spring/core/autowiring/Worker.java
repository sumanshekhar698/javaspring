package com.spring.core.autowiring;

public class Worker {

	private Address adr;

	public Address getAdr() {
		return adr;
	}

	public Worker() {
		super();
	}

	public Worker(Address adr) {
		super();
		this.adr = adr;
		System.out.println("Worker(adr)");
	}

	@Override
	public String toString() {
		return "Worker [adr=" + adr + "]";
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

}
