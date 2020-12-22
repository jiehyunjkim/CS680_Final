package edu.umb.cs680.hw15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;



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

public abstract class APFSsortFS{
	public String name;
	public int capacity;
	private ApfsDirectory parent;
	
	public APFSsortFS(String name, int capacity) {
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
	
	class ApfsDirectory extends APFSsortFS{
		private APFSsortFS child;
		private LinkedList<APFSsortFS> children;
		private LinkedList<APFSsortFS> subdir;
		private LinkedList<APFSsortFS> files;
		private int count;
		private int size;
		
		ApfsDirectory(String name, int capacity){
			super(name, capacity);
		}
		private void appendChild() {
			this.children.add(child);
			child.setParent(this);
		};
		private int countChildren() {
			return count;
		};
		private APFSsortFS children(){
			return this.child;
		};
		private int getTotalSize() {
			return size;
		};
		public boolean isDirectory() {
			return true;
		}
		
		///////Sorting/////////
		private LinkedList<APFSsortFS> getChildren(){
			return this.children;
		};
		
		public class alphabetChild implements Comparator<APFSsortFS>{
			public int compare(APFSsortFS a1, APFSsortFS a2){
				return a1.toString().compareTo(a2.toString());
			}
		}
		
		private LinkedList<APFSsortFS> getSubDirectories(){
			return this.subdir;
		};
		
		public class alphabetDir implements Comparator<APFSsortFS>{
			public int compare(APFSsortFS a1, APFSsortFS a2){
				return a1.toString().compareTo(a2.toString());
			}
		}
		
		private LinkedList<APFSsortFS> getFiles(){
			return this.files;
		}
		
		public class alphabetfile implements Comparator<APFSsortFS>{
			public int compare(APFSsortFS a1, APFSsortFS a2){
				return a1.toString().compareTo(a2.toString());
			}
		}
	}

	class ApfsFile extends APFSsortFS{
		ApfsFile(String name, int capacity){
			super(name, capacity);
		}
		
		public boolean isDirectory() {
			return false;
		}
	}

	class ApfsLink extends APFSsortFS{
		
		ApfsLink(String name, int capacity){
			super(name, capacity);
		};
		
	}
	
	public void main(String[] args) {
		ArrayList<APFSsortFS> APFSList = new ArrayList<>();
		
		APFSList.add(new APFSsortFS("apfs", 500));
		APFSList.add(new APFSsortFS("file", 24000));
		
		Collections.sort(APFSList, (APFSsortFS a1, APFSsortFS a2) -> a1[0].compareTo(a2[0]));
		Collections.sort(APFSList, (APFSsortFS a1, APFSsortFS a2) -> a1.toString().compareTo(a2.toString()));
		
		
	}
}





