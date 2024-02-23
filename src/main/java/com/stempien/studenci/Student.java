package com.stempien.studenci;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

        public String firstName;
        public String lastName;
        public Integer year;
        public Boolean isFemale;
    public Student() {

}

    public Student(String firstName, String lastName, Integer year, Boolean isFemale) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.year=year;
        this.isFemale=isFemale;
    }
}
