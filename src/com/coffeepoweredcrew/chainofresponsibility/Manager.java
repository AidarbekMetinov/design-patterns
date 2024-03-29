package com.coffeepoweredcrew.chainofresponsibility;
//A concrete handler

public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			return true;
		case PTO:
			if (application.getNoOfDays() <= 5) {
				return true;
			}
		default:
			return false;
		}
	}

}