package com.training.task5.q3.repository;

import com.training.task3.Student;

public interface StudentRepository {
    public String findByName(String name);

    public void insert(Student student);

    public void update();

    public void delete();
}
