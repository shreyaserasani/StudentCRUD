package com.student.StudentCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
    private StudentRepository studentRepository;
	

	@Override
	public Student getStudentById(int id) {
		System.out.println(id);
		Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
		return null;
	}

    @Override
    public List<Student> fetchAllStudents() {
        List<Student> allStudents = studentRepository.findAll();
        return allStudents;
    }
    
    @Override
    public String deleteStudentById(int id) {
        if (studentRepository.findById(id).isPresent()) {
        	studentRepository.deleteById(id);
            return "Student deleted successfully";
        }
        return "No such employee in the database";
    }
    
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    @Override
    public Student updateStudentById(int id, Student student) {
        Optional<Student> student1 = studentRepository.findById(id);

        if (student1.isPresent()) {
            Student originalStudent = student1.get();

            if (Objects.nonNull(student.getFirstname()) && !"".equalsIgnoreCase(student.getFirstname())) {
                originalStudent.setFirstname(student.getFirstname());
            }
            if (Objects.nonNull(student.getLastname()) && !"".equalsIgnoreCase(student.getLastname())) {
                originalStudent.setLastname(student.getLastname());
            }
            return studentRepository.save(originalStudent);
        }
        return null;
    }
    
}