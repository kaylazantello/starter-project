package com.w2retrieval.starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.w2retrieval.starterproject.model.W2;
import com.w2retrieval.starterproject.repository.W2Repository;

/*
@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
	}

}
*/

@SpringBootApplication
public class StarterProjectApplication implements CommandLineRunner {

	private W2Repository w2repository;

	@Autowired
	public StarterProjectApplication(W2Repository w2repository) {
		this.w2repository = w2repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// fetch an individual customer
		System.out.println("W-2 found with findByEmployeeSocialSecurityNumber(\"480-47-6564\"):");
		System.out.println("--------------------------------");
		System.out.println(w2repository.findByEmployeeSocialSecurityNumber("480-47-6564"));

		System.out.println("W-2 found with findByID(\"63718afd85264a9df817bf9b\"):");
		System.out.println("--------------------------------");
		System.out.println(w2repository.findById("63718afd85264a9df817bfaa"));
		/*
		System.out.println("W-2s found with findByEmployerAddressState(\"AZ\"):");
		System.out.println("--------------------------------");
		for (W2 w2 : w2repository.findByEmployerAddressState("AZ")) {
			System.out.println(w2);
		}*/
	}
}

