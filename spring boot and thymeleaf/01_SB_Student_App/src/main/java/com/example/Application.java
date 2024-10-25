package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.StudentEntity;
import com.example.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =SpringApplication.run(Application.class, args);
	StudentRepo daoImpl=ctx.getBean(StudentRepo.class);
	
//		StudentEntity stuEn=new StudentEntity();
//		stuEn.setSname("kandra");
//		stuEn.setSadd("bng");
//		
//		StudentEntity saveEnt = daoImpl.save(stuEn);
//		
//		if(saveEnt!=null)
//		
//			System.out.println("Data Inserted Successfully ");
//		else 
//			System.out.println("Data Not Inserted Successfully");

//		List<StudentEntity>studentInfo=daoImpl.findAll();
//				
//		for(StudentEntity stu:studentInfo) {
//			
//			System.out.println(stu.getSno() +"\t"+ stu.getSname() +"\t"+ stu.getSadd() );
//	
//		}
		
//	Optional<StudentEntity> findById= daoImpl.findById(1);
//	
//	StudentEntity stu=findById.get();
//	if(stu!=null)
//		System.out.println(stu.getSno() +"\t"+ stu.getSname() +"\t"+ stu.getSadd());
//	else
//		System.out.println("Record is not Found");
//	}
	
//	StudentEntity stu = daoImpl.findBySname("chowdary");
//	System.out.println(stu.getSno() +"\t"+ stu.getSname() +"\t"+ stu.getSadd());
	
	List<String>studentNames=daoImpl.getStudentNames();
	
	for(String name: studentNames) {
		System.out.println(name);
	}
	List<Object[]> studentPersonalInfo =daoImpl.getStudentPersonalInfo();
	
	for(Object obj[]: studentPersonalInfo) {
		System.out.println(obj[0]+" " +obj[1]);
	}
	
	daoImpl.deleteById(4);
	}
}
