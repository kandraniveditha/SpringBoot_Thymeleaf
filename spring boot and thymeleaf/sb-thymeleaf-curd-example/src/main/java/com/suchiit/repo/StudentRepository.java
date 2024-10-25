package com.suchiit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

	List<StudentEntity>findByName(String name);
}
