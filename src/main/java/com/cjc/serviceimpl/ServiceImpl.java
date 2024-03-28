package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repository.HomeRepository;
import com.cjc.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository homerepo;
	@Override
	public void saveEmployee(Employee emp) {
		homerepo.save(emp);
	}
	@Override
	public List<Employee> getEmployee(String username, String password) {
		if(username.equals("admin")&& password.equals("admin")) {
//		return (List<Employee>) homerepo.findAll();
			return homerepo.getAlldata();
		}else {
//		return homerepo.findAllByUsernameAndPassword(username, password);
			return homerepo.getSpecificData(username, password);
		}

	}
	@Override
	public List<Employee> deleteEmployee(int eid) {
		
//		homerepo.deleteById(eid);
 
//		return (List<Employee>) homerepo.findAll();
		
		 homerepo.deleteEmployee1(eid);
		 
		 return homerepo.getAlldata();
	 
	}
	
	@Override
	public Employee editEmployee(int eid) {
		
//		return homerepo.findById(eid).get();
		
		return homerepo.editEmployee(eid);
	}
	
	@Override
	public List<Employee> updateEmployee(Employee e) {
		homerepo.save(e);
//		return (List<Employee>) homerepo.findAll();
		return homerepo.getAlldata();
	}
	
}
