package com.oneToOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	

}
