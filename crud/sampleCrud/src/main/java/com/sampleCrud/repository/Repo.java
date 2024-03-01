package com.sampleCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sampleCrud.model.Student;
@Repository
public interface Repo extends JpaRepository<Student, Integer>{

}
