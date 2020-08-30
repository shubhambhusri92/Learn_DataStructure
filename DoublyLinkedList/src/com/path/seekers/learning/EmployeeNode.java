package com.path.seekers.learning;

public class EmployeeNode {

	private EmployeeNode previous;
	private Employee employee;
	private EmployeeNode next;

	// here we construct using employee because we don't know yet which node will be
	// next
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public String toString() {
		return employee.toString();
	}

	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

}
