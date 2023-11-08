package com.oneToOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/emp")
public class EmpController {
	@Autowired
	EmpService es;
	@PostMapping("/setAll")
	public String setAll(@RequestBody Employee emp) {
		return es.setAll(emp);
	}@GetMapping("/get/{name}")
	public Employee getById(@PathVariable String name) {
		return es.getById(name);
	}@GetMapping("/getAll")
	public List<Employee> getAllObj() {
		return es.getAllObj();
	}

}
