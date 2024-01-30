package com.training.task5.q3;

import com.training.task3.Student;
import com.training.task5.q3.repository.StudentRepository;

public class StudentService {
    @Inject
    public StudentRepository repository;

    public void insertStudent(Student student){
        repository.insert(student);
    }
}
