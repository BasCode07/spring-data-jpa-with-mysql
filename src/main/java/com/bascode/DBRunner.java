package com.bascode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBRunner implements CommandLineRunner {
    
	@Autowired
	EmployeRepositry empRep;
	
	@Override
	public void run(String... args) {
		
		empRep.saveAll(List.of(
				new Employee(1001, "Samson", 50000.0, "Development"),
				new Employee(1002, "Tunde", 35000.0, "HR"),
				new Employee(1003, "wale", 100000.0, "Tester"),
				new Employee(1004, "john", 40000.0, "Manager"),
				new Employee(1005, "tade", 20000.0, "Development"),
				new Employee(1006, "Dele", 50000.0, "Enginer"),
				new Employee(1007, "Emannuel", 40000.0, "Designer"),
				new Employee(1008, "shola", 20000.0, "FrontEnd"),
				new Employee(1009, "tolu", 10000.0, "Tester"),
				new Employee(1010, "Femi", 50000.0, "Development")
				
				));
		
		System.out.println("===========All Data Saved Into Database=============== ");
         		
	}
	
}
