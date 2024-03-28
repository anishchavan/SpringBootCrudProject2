package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findAllByUsernameAndPassword(String username, String password);

	@Query("from Employee")
	public List<Employee> getAlldata();
	
	
	@Query("from Employee where username=:username and password=:password")
	public List<Employee> getSpecificData(String username, String password);
	
	@Transactional
	@Modifying
	@Query("delete from Employee where eid=:eid")
	void deleteEmployee1(int eid);
	
	@Query("from Employee where eid=:eid")
	Employee editEmployee(int eid);
}
