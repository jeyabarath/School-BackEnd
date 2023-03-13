package com.jeyabarath.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jeyabarath.app.model.StudentCourse;

public interface StudentCourseRepository extends CrudRepository<StudentCourse, Integer>{
	
	@Modifying
    @Query(value = "insert into tbl_student_course (course_id,student_id) VALUES (:courseId,:studentId)", nativeQuery = true)
    @Transactional
    void insertStudentCourse(@Param("courseId") String courseId, @Param("studentId") Long studentId);
	
	@Query(value = "SELECT u.student_id FROM tbl_student_course u WHERE u.course_id= :courseId", nativeQuery = true)
	List<Integer> findAllStudentsByCourseId(@Param("courseId") int courseId);

}
