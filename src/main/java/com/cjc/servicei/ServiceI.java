package com.cjc.servicei;

import java.util.List;

import com.cjc.model.Employee;

public interface ServiceI {

	void saveEmployee(Employee emp);

	List<Employee> getEmployee(String username, String password);

	List<Employee> deleteEmployee(int eid);

	Employee editEmployee(int eid);

	List<Employee> updateEmployee(Employee e);


}
