package com.stempien.studenci;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private final StudentsRepository studentsRepository;

    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public void save(String firstName, String lastName, Integer year, Boolean isFemale) {
        studentsRepository.save(new Student(firstName,lastName,year,isFemale));
    }

    public List<Student> getAll() {
        return  (List<Student>) studentsRepository.findAll();


    }
}
