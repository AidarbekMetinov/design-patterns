package com.coffeepoweredcrew.composite;

//Leaf node in composite pattern
public class BinaryFile extends File {

	private long size;

	public BinaryFile(String name, long size) {
		super(name);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "\t" + size);
	}

	@Override
	public void addFile(File file) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Leaf node does not support add operation");
	}

	@Override
	public File[] getFiles() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Leaf node does not support get operation");
	}

	@Override
	public boolean removeFile(File file) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Leaf node does not support remove operation");
	}

}
