package com.assignment.driver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.assignment.customexpection.MyException;
import com.assignment.queue.service.impl.Myqueue;
import com.assignment.studentinfo.StudentInfo;

public class Driver {

	public static <E> void main(String[] args) throws MyException {
		MyException ex = new MyException(null);
		StudentInfo<E> stud = new StudentInfo<E>("Sanket", "Akola", 88, 75.66); // constant values for StudentInfo  object.
																			
		Myqueue<StudentInfo> myq = new Myqueue<>();
		Queue<Object> q = new LinkedList<Object>(); // for Queue- Collection
		// Queue<Integer> q = new LinkedList<Integer>();  // for_object_of_wrapper_class_and_integer_datatype.
		

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.print(
						"\n*******************************************\nPress \n1 for insert \n2 for Delete \n3 for Display \n4 for Size \n5 for Insert Student \n");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Entering 1M elements :");
					long startTime = System.currentTimeMillis();

					for (int i = 1; i <= 1000000; i++) {        //change the condition as per records..
						//for Queue in Collection
						
						// Integer ele = i; // for object of wrapper class (Integer) for Queue in collection
						// q.add(stud); // for inserting user define class StudentInfo of object stud. 
						// q.add(i); // for inserting integer values in Queue.
						// q.add(ele); // for inserting wrapper class object into the queue.
						
						// for Queue class 
						// myq.insert(i); // for inserting integer values in Class Queue.
						// myq.insert(ele); // for inserting object of wrapper class(Integer)
						   myq.insert(stud); // for inserting user define class object stud

					}

					long endTime = System.currentTimeMillis();
					long timeElapsed = endTime - startTime;
					System.out.println("1M records are Inserted succesfully");
					System.out.println("Execution time in sec : " + timeElapsed / 1000F);

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
					StudentInfo stud1 = new StudentInfo(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
					myq.insert(stud1);
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
