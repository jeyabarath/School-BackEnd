package com.jeyabarath.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeyabarath.app.model.Course;
import com.jeyabarath.app.model.Student;
import com.jeyabarath.app.model.StudentCourse;
import com.jeyabarath.app.repository.CourseRepository;
import com.jeyabarath.app.repository.StudentCourseRepository;
import com.jeyabarath.app.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StudentCourseRepository studentCourseRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	// retrieve all student from database
	public List<Student> getAllStudent()
	{
		List<Student> student=(List<Student>) studentRepository.findAll();
		return student;
	}
	
	// insert new student into database
	public Student addStudent(Student student)
	{			
		return studentRepository.save(student);
	}
	
	// get particular student by their ID
	public Optional<Student> getStudentId(int id)
	{
		return studentRepository.findById(id);
	}
	
	// update existing student 
	public Student updateStudent(Student student)
	{
				
		return studentRepository.save(student);
	}
	
	// delete particular student from database
	public void deleteStudent(int id)
	{
		studentRepository.deleteById(id);
	}

	// get particular student by their course ID
	public List<Student> getStudentByCourseId(int courseId)
	{
		List<Integer> studentIdList = studentCourseRepository.findAllStudentsByCourseId(courseId);
		List<Student> student=(List<Student>) studentRepository.findAllById(studentIdList);
		return student;
	}
	
	// get particular student by their course ID
	public List<Course> getAllCourse()
	{
		List<Course> course=(List<Course>) courseRepository.findAll();
		return course;
	}
	
	// register course for student into database
	public StudentCourse addStudentCourse(StudentCourse studentCourse)
	{			
		return studentCourseRepository.save(studentCourse);
	}
}
