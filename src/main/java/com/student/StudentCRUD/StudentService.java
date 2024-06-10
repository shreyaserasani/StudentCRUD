package com.student.StudentCRUD;

import java.util.List;

public interface StudentService {

	Student saveStudent(Student student); //Inserts into Student table 'C'
	Student getStudentById(int id); //Read the student 'R'
	List<Student> fetchAllStudents(); //Reads all the students 'R'
	Student updateStudentById(int id, Student student); //Update - 'U'
	String deleteStudentById(int id); //Delete - 'D'
}