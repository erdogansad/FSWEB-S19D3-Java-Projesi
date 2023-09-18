package com.workintech.S19D3.service;

import java.util.List;

import com.workintech.S19D3.entity.Student;

public interface StudentService {
    List<Student> findAll();

    Student findById(int id);

    Student save(Student student);

    Student delete(String tckn);
}