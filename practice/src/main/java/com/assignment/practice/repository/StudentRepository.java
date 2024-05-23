package com.assignment.practice.repository;

import com.assignment.practice.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Student s WHERE s.studentName=:name")
    public void deleteByName(String name);
    @Transactional
    @Modifying
    @Query("UPDATE Student s SET s.studentName=:newName WHERE s.studentName=:oldName")
    public void updateByStudentName(String oldName, String newName);
}
