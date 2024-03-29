package com.coffeepoweredcrew.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command c1 = new AddMemberCommand("A@A.com", "spam", service);
		Command c2 = new AddMemberCommand("B@A.com", "spam", service);
		Command c3 = new AddMemberCommand("C@A.com", "spam", service);
		Command c4 = new AddMemberCommand("D@A.com", "spam", service);

		MailTasksRunner tasksRunner = MailTasksRunner.getInstance();
		tasksRunner.addCommand(c1);
		tasksRunner.addCommand(c2);
		tasksRunner.addCommand(c3);
		tasksRunner.addCommand(c4);

		Thread.sleep(3000);
		tasksRunner.shutdown();
	}

}
