package com.jeyabarath.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeyabarath.app.model.Course;
import com.jeyabarath.app.model.Student;
import com.jeyabarath.app.model.StudentCourse;
import com.jeyabarath.app.service.IStudentService;

@RestController
@RequestMapping("students")
@CrossOrigin(origins = "http://localhost:8082") 
public class StudentController {

	@Autowired
	IStudentService studentService;
	
	// get all student from database
	@GetMapping("all")
	public List<Student> getAllStudent()
	{
		List<Student> student=(List<Student>) studentService.getAllStudent(); 
		return student;
	}
	
	// get all student from database by courseId
	@GetMapping("all/{id}")
	public List<Student> getAllStudentByCourseId(@PathVariable int id)
	{
		List<Student> student=(List<Student>) studentService.getStudentByCourseId(id); 
		return student;
	}
	
	// add new student into database
	@PostMapping("add")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	// get particular student by their ID
	@GetMapping("student/{id}")
	public Optional<Student> getStudentId(@PathVariable int id)
	{
		return studentService.getStudentId(id);
	}
	
	// update student 
	@PutMapping("update/{id}")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	// delete student from database
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}
	
	// get all student from database
	@GetMapping("all/course")
	public List<Course> getAllCourse()
	{
		List<Course> course=(List<Course>) studentService.getAllCourse(); 
		return course;
	}
	
	// add new student and course into database
	@PostMapping("add/student/course")
	public StudentCourse addStudentCourse(@RequestBody StudentCourse studentCourse)
	{
		return studentService.addStudentCourse(studentCourse);
	}
	
}
