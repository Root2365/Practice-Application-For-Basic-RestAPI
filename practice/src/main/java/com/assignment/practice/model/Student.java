package com.assignment.practice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
   @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "student_name")
    private String studentName;
}
