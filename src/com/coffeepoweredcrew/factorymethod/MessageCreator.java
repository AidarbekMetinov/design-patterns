package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * This is our abstract "creator". The abstract method createMessage() has to be
 * implemented by its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = creatMessage();

		msg.addDefaultHeaders();
		msg.encrypt();

		return msg;
	}

	protected abstract Message creatMessage();
}
