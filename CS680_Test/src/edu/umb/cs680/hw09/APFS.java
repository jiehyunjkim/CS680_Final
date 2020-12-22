package edu.umb.cs680.hw09;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class APFS{
	public String name;
	public int capacity;
	private ApfsDirectory parent;
	
	public APFS(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public ApfsDirectory createDefaultroot() {
		return new ApfsDirectory();
	}
	
	public ApfsDirectory getRootDir() {
		return null;
	}
	public void setParent(Directory par) {
		this.parent = par;
	}
}

class ApfsDirectory extends APFS{
	private APFS child;
	private LinkedList<APFS> children;
	private int count;
	private int size;
	
	ApfsDirectory(String name, int capacity){
		super(name, capacity);
	}

	private LinkedList<APFS> getChildren(){
		return this.children;
	};
	private void appendChild() {
		this.children.add(child);
		child.setParent(this);
	};
	private int countChildren() {
		return count;
	};
	private APFS children(){
		return this.child;
	};
	private LinkedList<ApfsDirectory> getSubDirectories(){
		return null;
	}
	private LinkedList<ApfsFile> getFiles(){
		return null;
	}
	private int getTotalSize() {
		return size;
	};
	public boolean isDirectory() {
		return true;
	}
}

class ApfsFile extends APFS{
	ApfsFile(String name, int capacity){
		super(name, capacity);
	}
	
	public boolean isDirectory() {
		return false;
	}
}

class ApfsLink extends APFS{
	
	ApfsLink(String name, int capacity){
		super(name, capacity);
	};
	
}