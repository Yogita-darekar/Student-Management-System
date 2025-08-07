package com.yogitaDarekar.studentManagement.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
	

 {
	    private final List<Student> students = new ArrayList<>();

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public List<Student> getAllStudents() {
	        return new ArrayList<>(students); // Return a copy
	    }

	    public Student findStudentById(int id) {
	        for (Student s : students) {
	            if (s.getId() == id) return s;
	        }
	        return null;
	    }

	    public boolean updateStudent(int id, String name, double marks) {
	        Student student = findStudentById(id);
	        if (student != null) {
	            student.setName(name);
	            student.setMarks(marks);
	            return true;
	        }
	        return false;
	    }

	    public boolean deleteStudent(int id) {
	        Student student = findStudentById(id);
	        if (student != null) {
	            students.remove(student);
	            return true;
	        }
	        return false;
	    }
	}


}
