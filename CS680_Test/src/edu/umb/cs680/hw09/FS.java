package edu.umb.cs680.hw09;

import java.util.LinkedList;

public abstract class FS{
	public String name;
	public int capacity;
	public int size;
	public int id;
	private Directory parent;
	private FS root;
	
	public FS(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		FS root = createDefaultroot();
		if(root.isDirectory() && capacity >= root.getSize()) {
			setRoot(root);
			this.id = root.hashCode();
			return root;
		}else {
			return null;
		}
	}
	
	protected abstract FS createDefaultroot();

	public FS() {};
	public Directory getParent() {
		return this.parent;
	}
	public void setParent(Directory par) {
		this.parent = par;
	}
	public int getSize() { 
		return this.size; 
	}
	public boolean isDirectory() {
		return true;
	}
	private void setRoot(FS root) {
		this.root = root;
		rootDirs.add(root);
	}
	public int getCapacitiy() {
		return this.capacity;
	}

	
}


class Directory extends FS{
	private FS child;
	private LinkedList<FS> children;
	private int count;
	
	Directory(String name, int capacity){
		super(name, capacity);
	}

	private LinkedList<FS> getChildren(){
		return this.children;
	};
	private void appendChild() {
		this.children.add(child);
		child.setParent(this);
	};
	private int countChildren() {
		return count;
	};
	private FS children(){
		return this.child;
	};
	private LinkedList<Directory> getSubDirectories(){
		return null;
	}
	private int getTotalSize() {
		return size;
	};
	public boolean isDirectory() {
		return true;
	}
}



