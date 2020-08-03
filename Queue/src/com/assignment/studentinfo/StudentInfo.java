package com.assignment.studentinfo;

public class StudentInfo<E> {
	private String name, address;
	private int rollno;
	private double marks;

	public StudentInfo(String name, String address, int rollno, double marks) {
		super();
		this.name = name;
		this.address = address;
		this.rollno = rollno;
		this.marks = marks;
	}

	public StudentInfo() {
		name = null;
		address = null;
		rollno = 00;
		marks = 00;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override

	public String toString() {

		return "StudentInfo [name=" + name + ", rollno=" + rollno + ", marks=" + marks + ", " + "Address =" + address
				+ "]\n";

	}

}
