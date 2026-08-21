package com.security.SpringSecurity.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private  int id;
    private  String name;
    private  int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}
