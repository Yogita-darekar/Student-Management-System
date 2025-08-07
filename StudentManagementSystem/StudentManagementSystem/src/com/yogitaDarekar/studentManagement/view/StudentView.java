package com.yogitaDarekar.studentManagement.view;

import java.util.List;
import java.util.Scanner;

import com.yogitaDarekar.studentManagement.model.Student;
public class StudentView {

	    private final Scanner sc = new Scanner(System.in);

	    public int showMenu() {
	        System.out.println("\n=== Student Management System ===");
	        System.out.println("1. Add Student");
	        System.out.println("2. View All Students");
	        System.out.println("3. Update Student");
	        System.out.println("4. Delete Student");
	        System.out.println("5. Exit");
	        System.out.print("Enter choice: ");
	        return sc.nextInt();
	    }

	    public Student getStudentDetails() {
	        System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Marks: ");
	        double marks = sc.nextDouble();
	        return new Student(id, name, marks);
	    }

	    public int getStudentId() {
	        System.out.print("Enter Student ID: ");
	        return sc.nextInt();
	    }

	    public void showStudents(List<Student> students) {
	        if (students.isEmpty()) {
	            System.out.println("No student records found.");
	        } else {
	            for (Student student : students) {
	                System.out.println(student);
	            }
	        }
	    }

	    public void showMessage(String message) {
	        System.out.println(message);
	    }
	

}
