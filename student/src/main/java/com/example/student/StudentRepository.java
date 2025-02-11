package com.example.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    // @Query("SELECT s FROM Student s WHERE s.schoolId = :schoolId")
    // List<Student> findAllBySchoolId(@Param("schoolId") Integer schoolId);
    @Query("SELECT s FROM Student s WHERE s.schoolId = :schoolId")
    List<Student> findAllBySchoolId(@Param("schoolId") Integer schoolId);
}
