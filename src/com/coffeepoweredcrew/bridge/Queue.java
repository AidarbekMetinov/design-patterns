package com.coffeepoweredcrew.bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {

	private LinkedList<T> list;

	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T element) {
		// TODO Auto-generated method stub
		list.addLast(element);
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

}
