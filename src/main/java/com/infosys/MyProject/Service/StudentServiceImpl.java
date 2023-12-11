package com.infosys.MyProject.Service;

import com.infosys.MyProject.Entity.Student;
import com.infosys.MyProject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudentRecords() {
        return studentRepository.findAll();
    }

    @Override
    public Student createOneStudent(Student student) {
        return studentRepository.save(student);
    }
}
