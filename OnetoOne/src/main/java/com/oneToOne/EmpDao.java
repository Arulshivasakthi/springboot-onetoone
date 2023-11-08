package com.oneToOne;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	@Autowired
	EmpRepo er;

	public String setAll(Employee emp) {
        er.save(emp);
		return "Saved";
	}
	public Employee getById(String name) {
		return er.findById(1).get();
	}
	public List<Employee> getAllObj() {
		return  er.findAll();
	}

}
