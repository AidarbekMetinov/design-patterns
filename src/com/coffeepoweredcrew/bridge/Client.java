package com.coffeepoweredcrew.bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<Integer>(new SinglyLinkedList<Integer>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(90);

		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());

	}

}
