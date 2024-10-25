package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

	//findbyxxx(-) xxx stands on entity class property name
	public StudentEntity findBySname(String sname);
	public StudentEntity findBySadd(String sadd);
	public StudentEntity findBySnameAndSadd(String sname, String sadd);

	//customized Query
	@Query("Select sname from StudentEntity")
	List<String>getStudentNames();
	
	@Query("Select sname,sadd from StudentEntity")
	List<Object[]>getStudentPersonalInfo();
}
