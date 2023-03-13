package com.jeyabarath.app.service;

import java.util.List;
import java.util.Optional;

import com.jeyabarath.app.model.Course;
import com.jeyabarath.app.model.Student;
import com.jeyabarath.app.model.StudentCourse;

public interface IStudentService {

	// retrieve all student from database
	public List<Student> getAllStudent();
	
	// insert new student into database
	public Student addStudent(Student student);
	
	// get particular student by their ID
	public Optional<Student> getStudentId(int id);
	
	// update existing student 
	public Student updateStudent(Student student);
	
	// delete particular student from database
	public void deleteStudent(int id);
	
	// get particular student by their course ID
	public List<Student> getStudentByCourseId(int courseId);

	public List<Course> getAllCourse();

	public StudentCourse addStudentCourse(StudentCourse studentCourse);
}