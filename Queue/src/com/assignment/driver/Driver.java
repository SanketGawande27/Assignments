package com.assignment.driver;

import java.util.Scanner;

import com.assignment.customexpection.MyException;
import com.assignment.queue.service.impl.Myqueue;
import com.assignment.studentinfo.StudentInfo;

public class Driver {

	public static <E> void main(String[] args) throws MyException {
		MyException ex = new MyException(null);
		Myqueue<StudentInfo> myq = new Myqueue<>();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.print(
						"\n*******************************************\nPress \n1 for insert \n2 for Delete \n3 for Display \n4 for Size \n5 for Insert Student \n");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter new element: ");
					String element = sc.next();
					myq.insert(element);
					break;

				case 2:
					try {
						System.out.print("Deleted Element: " + myq.delete());
					} catch (MyException ex1) {
						System.out.print(ex1.getMessage());
					}
					break;

				case 3:
					System.out.println(myq);
					break;

				case 4:
					System.out.print("Total Size :" + myq.size());
					break;

				case 5:
					System.out.println("Enter Student Information : Name, Address, Rollno, Marks");
					StudentInfo stud = new StudentInfo(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
					// String Name = sc.next();
					// String Addr = sc.next();
					// int rollNO = sc.nextInt();
					// double MArks = sc.nextDouble();
					// StudentInfo stud = new StudentInfo(Name, Addr, rollNO, MArks);
					myq.insert(stud);
					System.out.println("Entry Added Successfully");

					break;

				default:
					System.out.println("Input in wrong... \nEnter Correct Input.....! ");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}