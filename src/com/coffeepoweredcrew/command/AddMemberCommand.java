package com.coffeepoweredcrew.command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

	private String emailAddress;
	private String listaName;

	// Might be loaded by class loaders
	private EWSService receiver;

	public AddMemberCommand(String emaildAddress, String listName, EWSService service) {
		this.emailAddress = emaildAddress;
		this.listaName = listName;
		this.receiver = service;
	}

	@Override
	public void execute() {
		this.receiver.addMember(emailAddress, listaName);
	}

}
