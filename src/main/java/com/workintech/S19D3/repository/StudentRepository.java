package com.workintech.S19D3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.workintech.S19D3.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.tckn = :tckn")
    Optional<Student> findStudentByTckn(String tckn);

}
