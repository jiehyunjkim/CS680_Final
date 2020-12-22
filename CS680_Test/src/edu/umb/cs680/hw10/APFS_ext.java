package edu.umb.cs680.hw10;

import java.time.LocalDateTime;
import java.util.LinkedList;

import edu.umb.cs680.hw07.Directory;
import edu.umb.cs680.hw07.FileSystem;

import java.nio.file.Files;


class ApfsVisitor{
	private static ApfsVisitor INSTANCE = new ApfsVisitor();
	private ApfsVisitor() { }
	
	private static ApfsVisitor getFileSystem() {
		return INSTANCE;}
	
	public LinkedList<ApfsDirectory> getRootDirs() {
		return null;
	}
	
	public void appendRootDir() {}
	
	public void <ApfsLink> visit();
	public void <ApfsDirectory> visit();
	public void <ApfsFile> visit();
	
	public void ApfsCountingVisitor(){
		private int dirNum = 0;
		private int fileNum = 0;
		private int linkNum = 0;
		
		private void <ApfsLink>visit(){
			linkNum++;
		}
		public void <ApfsDirectory> visit(){
			dirNum++;
		}
		public void <ApfsFile> visit(){
			fileNum++;
		}
	}

	public void ApfsFileCrawlingVisitor(){
		private LinkedList<ApfsFile> files;
		private void <ApfsLink>visit(){
			return;
		}
		public void <ApfsDirectory> visit(){
			return;
		}
		public void <ApfsFile> visit(){
			files.add(file);
		}
		public LinkedList<ApfsFile> getFiles;
	}

	public void ApfsFileSearchVisitor(){
		private String FileName;
		private LinkedList<File> foundFiles;
		
		public void Link visit() {
			return;
		}
		public void Directory visit() {
			return;
		}
		public void File visit() {
			if(file.getName().equals(filename)){
				foundFiles.add(file);
			}
		}
		public LinkedList getFoundFiles();
	}

}

public abstract class APFS_ext{
	public String name;
	public int capacity;
	private ApfsDirectory parent;
	
	public APFS_ext(String name, int capacity) {
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
	
	class ApfsDirectory extends APFS_ext{
		private APFS_ext child;
		private LinkedList<APFS_ext> children;
		private int count;
		private int size;
		
		ApfsDirectory(String name, int capacity){
			super(name, capacity);
		}

		private LinkedList<APFS_ext> getChildren(){
			return this.children;
		};
		private void appendChild() {
			this.children.add(child);
			child.setParent(this);
		};
		private int countChildren() {
			return count;
		};
		private APFS_ext children(){
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

	class ApfsFile extends APFS_ext{
		ApfsFile(String name, int capacity){
			super(name, capacity);
		}
		
		public boolean isDirectory() {
			return false;
		}
	}

	class ApfsLink extends APFS_ext{
		
		ApfsLink(String name, int capacity){
			super(name, capacity);
		};
		
	}


}

