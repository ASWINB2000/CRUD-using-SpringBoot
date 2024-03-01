package com.sampleCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sampleCrud.model.Student;
import com.sampleCrud.service.StudService;
@RestController
public class Main {
	@Autowired
	private StudService ser;
	
	
	@RequestMapping("/")
	public String view(Model m)
	{
		List<Student> liststudent=ser.listAll();
		m.addAttribute("liststudent",liststudent);
		System.out.println("Get /");
		return "index";
	}
	@RequestMapping("/new")
	public String add(Model m)
	{
		m.addAttribute("student",new Student());
		System.out.println("done");
		return "new";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("student") Student s)
	{
		System.out.println(s);
		ser.save(s);
		return "redirect:/";
	}

    @RequestMapping("/edit/{id}")
    public String edit( @PathVariable("id") int id, Model model) {
        // Retrieve the student by ID
        Student s = ser.get(id);

        // Add the student to the model
        model.addAttribute("student", s);

        // Return the view for editing
        return "new";
    }
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		ser.delete(id);
		return "redirect:/";
		}
}
