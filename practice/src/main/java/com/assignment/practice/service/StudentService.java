package com.assignment.practice.service;

import com.assignment.practice.model.Student;
import com.assignment.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
public List<Student> getStudents(){
    return studentRepository.findAll();
}

    public String addStudent(Student student) {
    studentRepository.save(student);
    return "STUDENT SAVED SUCCESSFULLY";
    }

    public String deleteStudent(Integer id) {
    studentRepository.deleteById(id);
    return "STUDENT DELETED";
    }
    public String updateStudent(Student student){
    studentRepository.save(student);
    return "Student Updated";
    }

    public String deleteStudentName(String name) {
    studentRepository.deleteByName(name);
    return "STUDENT DELETED WITH THE :name";
    }

    public String updateByStudentName(String oldName,String newName) {
    studentRepository.updateByStudentName(oldName,newName);
    return "NAME CHANGED";
    }


//    public String deleteStudentName(Integer id) {
//    studentRepository.deleteById(id);
//    return "Student Name deleted";
//    }
}
