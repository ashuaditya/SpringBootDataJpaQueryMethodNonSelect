package com.app.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		
		int count = repo.updateCost(10.9, 15);
		System.out.println(count);
		System.out.println("==================================");
		int c = repo.removeData(16);
		System.out.println(c);
	}

}
