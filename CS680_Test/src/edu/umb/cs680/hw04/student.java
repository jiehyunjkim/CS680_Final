package edu.umb.cs680.hw04;

public class student{
	
	public static enum StudentStatus{
		Instate, Outstate, Intl;
	}
	
	private float tuition;
	private String name;
	private int i20num;
	private String usAddr;
	private int yrsInState;
	private String foreignAddr;
	private StudentStatus status; 
	
	protected student(String name, String usAddr, int yrsInState, int i20num, String foreignAddr, StudentStatus status) {
		this.name = name;
		this.usAddr = usAddr;
		this.yrsInState = yrsInState;
		this.i20num = i20num;
		this.foreignAddr = foreignAddr;
		this.status = status;
	}
	
	static student createInStateStudent(String name, String usAddr) {
		return new student(name, usAddr, null, null, null, status.Instate);
	}
	static student createOutStateStudent(String name, String usAddr, int yrsInState) {
		return new student(name, usAddr, null, null, null, state.Outstate);
	}
	static student createIntlStateStudent(String name, String usAddr, int i20num, String foreignAddr) {
		return new student(name, usAddr, null, i20num, foreignAddr, status.Intl);
	}
	
	public float getTuition() {
		return tuition;
	}
	public String getName() {
		return name;
	}
	public int geti20num() {
		return i20num;
	}
	public String getusAddr() {
		return usAddr;
	}
	public int getyrsInState() {
		return yrsInState;
	}
	public String getforeignAddr() {
		return foreignAddr;
	}
	public StudentStatus getStatus() {
		return status;
	}
	
}
