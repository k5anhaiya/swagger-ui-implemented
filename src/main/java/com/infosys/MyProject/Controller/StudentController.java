package com.infosys.MyProject.Controller;


import com.infosys.MyProject.Entity.Student;
import com.infosys.MyProject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/infosys")
public class StudentController {


    @Autowired
    StudentService service;

    @GetMapping("/test")
    public String Test(){
        return "Test is Sucessfully called.";
    }
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudentRecords(){
        return service.getAllStudentRecords();
    }

    @PostMapping("/createStudent/{student}")
    public Student createOneStudent(@RequestBody Student student){
        return service.createOneStudent(student);
    }
}
