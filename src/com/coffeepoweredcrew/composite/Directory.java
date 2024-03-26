package com.coffeepoweredcrew.composite;

import java.util.ArrayList;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File {

	private List<File> children = new ArrayList<File>();

	public Directory(String name) {
		super(name);
	}

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println(getName());
		children.forEach(File::ls);
	}

	@Override
	public void addFile(File file) {
		// TODO Auto-generated method stub
		children.add(file);
	}

	@Override
	public File[] getFiles() {
		// TODO Auto-generated method stub
		return children.toArray(new File[children.size()]);
	}

	@Override
	public boolean removeFile(File file) {
		// TODO Auto-generated method stub
		return children.remove(file);
	}

}
