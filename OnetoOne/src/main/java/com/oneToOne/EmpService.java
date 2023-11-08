package com.oneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	EmpDao ed;

	public String setAll(Employee emp) {
		return ed.setAll(emp);
	}

	public Employee getById(String name) {
		return ed.getById(name);
	}
	public List<Employee> getAllObj() {
		return ed.getAllObj();
	}

}
