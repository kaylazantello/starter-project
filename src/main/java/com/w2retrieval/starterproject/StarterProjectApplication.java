package com.w2retrieval.starterproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.w2retrieval.starterproject.model.W2;
import com.w2retrieval.starterproject.repository.W2Repository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

@SpringBootApplication
@EnableMongoRepositories
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
		W2 w2 = w2repository.findByEmployeeSocialSecurityNumber("480-47-6564");
		System.out.println(w2);
		//System.out.println(w2repository.findByEmployeeSocialSecurityNumber("480-47-6564"));

		System.out.println("W-2 found with findByID(\"63718afd85264a9df817bf9b\"):");
		System.out.println("--------------------------------");
		System.out.println(w2repository.findById("63718afd85264a9df817bfaa"));

		try {
			File myObj = new File("63718afd85264a9df817bf9b.ofx");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try {
			FileWriter ofxFile = new FileWriter("63718afd85264a9df817bf9b.ofx");
			ofxFile.write("<TAXW2RS>\n");
			ofxFile.write("\t<SSN>" + w2.getEmployeeSocialSecurityNumber() + "</SSN>\n");
			ofxFile.write("<TAXW2_V200>\n");
			ofxFile.write("\t<TAXYEAR>2023</TAXYEAR>\n");
			//
			ofxFile.write("\t<EMPLOYER>\n");
			ofxFile.write("\t\t<FEDIDNUMBER>" + w2.getEmployerIdNo() + "</FEDIDNUMBER>\n");
			ofxFile.write("\t\t<NAME1>" + w2.getEmployerName() + "</NAME1>\n");
			ofxFile.write("\t\t<ADDR1>" + w2.getEmployerAddressLine1() + "</ADDR1>\n");
			ofxFile.write("\t\t<CITY>" + w2.getEmployerAddressCity() + "</CITY>\n");
			ofxFile.write("\t\t<STATE>" + w2.getEmployerAddressState() + "</STATE>\n");
			ofxFile.write("\t\t<POSTALCODE>" + w2.getEmployerAddressZip() + "</POSTALCODE>\n");
			ofxFile.write("\t</EMPLOYER>\n");
			ofxFile.write("</TAXW2_V200>\n");
			ofxFile.write("</TAXW2RS>\n");
			ofxFile.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}


		/*System.out.println("W-2s found with findByEmployerAddressState(\"AZ\"):");
		System.out.println("--------------------------------");
		for (W2 w2 : w2repository.findByEmployerAddressState("AZ")) {
			System.out.println(w2);
		}*/
	}
}

