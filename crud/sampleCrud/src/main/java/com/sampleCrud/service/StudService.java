package com.sampleCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleCrud.model.Student;
import com.sampleCrud.repository.Repo;

@Service
public class StudService {
	@Autowired
	private Repo rep;
	
	public List<Student> listAll()
	{
		return rep.findAll();
	}
	public void save(Student s)
	{
		rep.save(s);
	}
	public Student get(int id)
	{
		return rep.findById(id).get();
	}
	public void delete(int id) {
		 rep.deleteById(id);
	}

}
