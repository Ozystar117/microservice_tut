package com.example.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    public void save(@RequestBody Student student){
        service.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(service.findAllStudents());
    }
    
    
}
