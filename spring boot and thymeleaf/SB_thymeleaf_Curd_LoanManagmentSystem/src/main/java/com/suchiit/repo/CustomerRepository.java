package com.suchiit.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
	@Query(value="select * from customerentity where dob between ?1 and ?2",nativeQuery = true)
	List<CustomerEntity> findAllBySDateEDate(Date sdate,Date edate);
			
}
