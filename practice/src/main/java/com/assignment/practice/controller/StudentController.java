package com.assignment.practice.controller;

import com.assignment.practice.model.Student;
import com.assignment.practice.model.StudentName;
import com.assignment.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("studentData")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

   @PostMapping("addStudent")
    public String addStudent(@RequestBody Student student){
   return studentService.addStudent(student);
   }
   @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id) {
       return studentService.deleteStudent(id);
   }
    @PutMapping("updateStudent")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("deleteStudentName/{name}")
    public String deleteStudentName(@PathVariable String name) {
        return studentService.deleteStudentName(name);
    }
    @PutMapping("updateStudentName/{oldName}")
    public String updateByStudentName(@RequestBody StudentName studentName,@PathVariable String oldName){
        return studentService.updateByStudentName(oldName,studentName.getName());
    }
    // @GetMapping is used for get apis to get information
    // @PostMapping is used to add data in the database
    // @PutMapping is used to update the existing data in the database
    //@DeleteMapping is used to delete data from database
}
