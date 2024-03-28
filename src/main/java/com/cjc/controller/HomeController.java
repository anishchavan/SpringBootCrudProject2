package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Employee;
import com.cjc.servicei.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI si;
	@RequestMapping("/")
	public String loginPageInitially() {
		return "login";
	}
	
	@RequestMapping("/reg")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping("/submit")
	public String saveEmployee(@ModelAttribute Employee emp) {
		si.saveEmployee(emp);
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String getEmployee(@RequestParam String username, @RequestParam String password, Model m) {
		List<Employee> list = si.getEmployee(username, password);
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editEmployee(@RequestParam int eid, Model m) {
		Employee emp = si.editEmployee(eid);
		m.addAttribute("data", emp);
		return "edit";
	}
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam int eid, Model m) {
		List<Employee> list = si.deleteEmployee(eid);
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/update")
	public String updateEmployee(@ModelAttribute Employee e, Model m) {
		List<Employee> list = si.updateEmployee(e);
		m.addAttribute("data", list);
		return "success";
	}
}
