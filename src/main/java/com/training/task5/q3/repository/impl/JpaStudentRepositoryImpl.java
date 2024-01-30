package com.training.task5.q3.repository.impl;

import com.training.task3.Student;
import com.training.task5.q3.repository.StudentRepository;

public class JpaStudentRepositoryImpl implements StudentRepository {

    @Override
    public String findByName(String name) {
        return name;
    }

    @Override
    public void insert(Student student) {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
