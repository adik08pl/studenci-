package com.stempien.studenci;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends CrudRepository<Student,Integer> { }
