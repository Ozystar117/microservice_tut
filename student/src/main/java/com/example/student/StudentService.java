package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    // note: ideally dto should be passed as the parameter instead of the entity
    public void saveStudent(Student student){
        repository.save(student);
    }

    public List<Student> findAllStudents(){
        return repository.findAll();
    }
}
