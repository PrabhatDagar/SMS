package com.project.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.SMS.entity.Student;
import com.project.SMS.repository.StudentRepository;
import com.project.SMS.service.StudentService;

@Service
public class StudentSerivceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentSerivceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
