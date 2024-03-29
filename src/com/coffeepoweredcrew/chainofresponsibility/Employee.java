package com.coffeepoweredcrew.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

	private String role;
	private LeaveApprover successor;

	public Employee(String role, LeaveApprover successor) {
		this.role = role;
		this.successor = successor;
	}

	@Override
	public void processLeaveApplication(LeaveApplication application) {
		// TODO Auto-generated method stub
		if (!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		} else {
			application.approve(getApproverRole());
		}
	}

	protected abstract boolean processRequest(LeaveApplication application);

	@Override
	public String getApproverRole() {
		// TODO Auto-generated method stub

		return role;
	}

}