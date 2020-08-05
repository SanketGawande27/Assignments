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

		return "\nStudentInfo [name = " + name + ", rollno = " + rollno + ", marks = " + marks + ", " + "Address = "
				+ address + "]\n";

	}

}

/*
 * String result = ""; Node obj = front; while (obj != null) { result +=
 * obj.getobj(); result += ", ";
 * 
 * obj = obj.getNext(); } if (result == "") return "Empty...";
 * 
 * return "StudentInfo [name=" + name + ", rollno=" + rollno + ", marks=" +
 * marks + ", " + "Address =" + address + "]";
 * 
 */

/*
 * // String result = ""; Node ptr = obj;while(ptr!=null) { // result +=
 * ptr.getobj(); System.out.println(ptr.getobj()); // if (ptr.getNext() != null)
 * { // result += ", "; // } // ptr = ptr.getNext();
 * 
 * }if(result=="")return"Queue is Empty ...! ";
 * 
 * return"StudentInfo [name="+name+", rollno="+rollno+", marks="+marks+", "
 * +"Address ="+address+"]";
 * 
 * // System.out.println(ptr.getobj()); }
 * 
 * }
 */