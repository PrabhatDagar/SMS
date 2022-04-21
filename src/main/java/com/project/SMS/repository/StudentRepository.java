package com.project.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.SMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
