package com.w2retrieval.starterproject;

import java.util.ArrayList;
import java.util.List;

import com.w2retrieval.starterproject.model.BasicEmployeeInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.w2retrieval.starterproject.model.W2;
import com.w2retrieval.starterproject.model.ReportRunInfo;
import com.w2retrieval.starterproject.repository.W2Repository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

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

		System.out.println("W-2 found with findByRunDate(\"2022-10-06\"):");
		System.out.println("--------------------------------");
		ReportRunInfo w2info = w2repository.findByRunDate("2022-10-06");
		System.out.println(w2info);
		System.out.println(w2info.getRunDate());

		System.out.println("W-2 found with findBySocialSecurityNumber(\"130217924\"):");
		System.out.println("--------------------------------");
		W2 w2 = w2repository.findBySocialSecurityNumber("130217924");
		System.out.println(w2);

		/*System.out.println("W2s found with findAll():");
		System.out.println("-------------------------------");
		for (W2 w2 : w2repository.findAll()) {
			System.out.println(w2);
		}
		System.out.println();*/

		System.out.println("W-2 found with findByID(\"63d831d093e6ebbc1f938c77\"):");
		System.out.println("--------------------------------");
		System.out.println(w2repository.findById("63d831d093e6ebbc1f938c77"));

		/*try {
			File myObj = new File("63718afd85264a9df817bf9b.ofx");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}*/

		/*try {
			FileWriter ofxFile = new FileWriter("63718afd85264a9df817bf9b.ofx");
			ofxFile.write("<TAXW2RS>\n");
			//ofxFile.write("\t<SSN>" + w2.getEmployeeSocialSecurityNumber() + "</SSN>\n");
			ofxFile.write("<TAXW2_V200>\n");
			ofxFile.write("\t<TAXYEAR>2023</TAXYEAR>\n");
			// 3.2.9 EMPLOYER
			ofxFile.write("\t<EMPLOYER>\n");
			//ofxFile.write("\t\t<FEDIDNUMBER>" + w2.getEmployerIdNo() + "</FEDIDNUMBER>\n");
			//ofxFile.write("\t\t<NAME1>" + w2.getEmployerName() + "</NAME1>\n");
//			ofxFile.write("\t\t<ADDR1>" + w2.getEmployerAddressLine1() + "</ADDR1>\n");
//			ofxFile.write("\t\t<CITY>" + w2.getEmployerAddressCity() + "</CITY>\n");
//			ofxFile.write("\t\t<STATE>" + w2.getEmployerAddressState() + "</STATE>\n");
//			ofxFile.write("\t\t<POSTALCODE>" + w2.getEmployerAddressZip() + "</POSTALCODE>\n");
			ofxFile.write("\t</EMPLOYER>\n");
			// 3.2.10 EMPLOYEE
			ofxFile.write("\t<EMPLOYEE>\n");
//			ofxFile.write("\t<SSN>" + w2.getEmployeeSocialSecurityNumber() + "</SSN>\n");
//			ofxFile.write("\t<FIRSTNAME>" + w2.getEmployeeSocialSecurityNumber() + "</FIRSTNAME>\n");
			ofxFile.write("\t</EMPLOYEE>\n");

			ofxFile.write("</TAXW2_V200>\n");
			ofxFile.write("</TAXW2RS>\n");
			ofxFile.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}*/

	}
}

