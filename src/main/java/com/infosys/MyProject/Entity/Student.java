package com.infosys.MyProject.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String studentName;
    private String studentClass;
    @Id
    private String studentId;
    private Integer studentRollNumber;
    private String studentFatherName;
    private String studentMotherName;


}
