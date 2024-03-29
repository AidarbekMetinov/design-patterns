package com.coffeepoweredcrew.chainofresponsibility;

import java.time.LocalDate;

import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
		LeaveApprover chain = createChain();

		LeaveApplication application = LeaveApplication.getBuilder()//
				.withType(Type.Sick)//
				.from(LocalDate.now())//
				.to(LocalDate.of(2024, 3, 31))//
				.build();

		System.out.println(application);
		System.out.println("***********************************************");

		chain.processLeaveApplication(application);

		System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
}
