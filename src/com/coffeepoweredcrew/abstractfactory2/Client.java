package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity capacity, int storageMib) {
		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) {
		Client awsClient = new Client(new GoogleResourceFactory());

		Instance i1 = awsClient.createServer(Capacity.micro, 20480);
		i1.start();
		i1.stop();
	}

}
