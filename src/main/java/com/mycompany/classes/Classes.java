package com.mycompany.classes;

import com.mycompany.professor.Professor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "classes")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false, name = "class_name")
    private String class_name;

    @Column(length = 100, nullable = false, name = "class_location")
    private String class_location;

    @Column(length = 5, nullable = false, name = "num_students")
    private Integer num_students;

    @OneToMany(mappedBy = "classes")
    private Set<Professor> professors;

}
