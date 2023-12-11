package com.infosys.MyProject.Service;

import com.infosys.MyProject.Entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudentRecords();

    public Student createOneStudent(Student student);

}
