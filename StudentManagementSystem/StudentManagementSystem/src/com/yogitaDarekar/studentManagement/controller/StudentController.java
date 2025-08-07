package com.yogitaDarekar.studentManagement.controller;

import java.util.List;

import com.yogitaDarekar.studentManagement.model.Student;
import com.yogitaDarekar.studentManagement.model.StudentDatabase;
import com.yogitaDarekar.studentManagement.view.StudentView;
public class StudentController {

	    private final StudentDatabase model;
	    private final StudentView view;

	    public StudentController(StudentDatabase model, StudentView view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void start() {
	        while (true) {
	            int choice = view.showMenu();
	            switch (choice) {
	                case 1 -> addStudent();
	                case 2 -> viewAllStudents();
	                case 3 -> updateStudent();
	                case 4 -> deleteStudent();
	                case 5 -> {
	                    view.showMessage("✅ Exiting the system.");
	                    return;
	                }
	                default -> view.showMessage("❌ Invalid choice.");
	            }
	        }
	    }

	    private void addStudent() {
	        Student student = view.getStudentDetails();
	        model.addStudent(student);
	        view.showMessage("✅ Student added.");
	    }

	    private void viewAllStudents() {
	        List<Student> students = model.getAllStudents();
	        view.showStudents(students);
	    }

	    private void updateStudent() {
	        int id = view.getStudentId();
	        Student existing = model.findStudentById(id);
	        if (existing != null) {
	            Student updated = view.getStudentDetails();
	            model.updateStudent(id, updated.getName(), updated.getMarks());
	            view.showMessage("✅ Student updated.");
	        } else {
	            view.showMessage("❌ Student not found.");
	        }
	    }

	    private void deleteStudent() {
	        int id = view.getStudentId();
	        boolean result = model.deleteStudent(id);
	        view.showMessage(result ? "✅ Student deleted." : "❌ Student not found.");
	    }
	


}
