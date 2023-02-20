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
import org.bson.Document;

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

		//System.out.println("W-2 found with findBySocialSecurityNumber(\"130217924\"):");
		//W2 w2 = w2repository.findBySocialSecurityNumber("130217924");
		System.out.println("W-2 found with findBySocialSecurityNumber(\"219466820\"):");
		W2 w2 = w2repository.findBySocialSecurityNumber("219466820");

		System.out.println(w2);

		String w2_id = w2.getId();
		System.out.println(w2_id);

		/*System.out.println("W2s found with findAll():");
		System.out.println("-------------------------------");
		for (W2 w2 : w2repository.findAll()) {
			System.out.println(w2);
		}
		System.out.println();*/

		//System.out.println("W-2 found with findByID(\"63d831d093e6ebbc1f938c77\"):");
		//System.out.println("--------------------------------");
		//System.out.println(w2repository.findById("63ce0834eb364fc81a43b662"));
		try {
			File myObj = new File(w2_id + ".ofx");
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
			FileWriter ofxFile = new FileWriter(w2_id + ".ofx");
			//OFX Headers
			ofxFile.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + "<?OFX OFXHEADER=\"200\" VERSION=\"202\" SECURITY=\"NONE\" OLDFILEUID=\"NONE\" NEWFILEUID=\"NONE\"?>");
			ofxFile.write("<OFX>\n" +
					"    <SIGNONMSGSRSV1>\n" +
					"        <SONRS>\n" +
					"            <STATUS>\n" +
					"                <CODE>0</CODE>\n" +
					"                <SEVERITY>INFO</SEVERITY>\n" +
					"                <MESSAGE>Successful Login</MESSAGE>\n" +
					"            </STATUS>\n" +
					"            <DTSERVER>39210131000000</DTSERVER>\n" +
					"            <LANGUAGE>ENG</LANGUAGE>\n" +
					"            <FI>\n" +
					"                <ORG>fiName</ORG>\n" +
					"                <FID>fiId</FID>\n" +
					"            </FI>\n" +
					"        </SONRS>\n" +
					"    </SIGNONMSGSRSV1>\n" +
					"    <TAXW2MSGSRSV1>\n" +
					"        <TAXW2TRNRS>\n" +
					"            <TRNUID>_GUID_</TRNUID>\n" +
					"            <STATUS>\n" +
					"                <CODE>0</CODE>\n" +
					"                <SEVERITY>INFO</SEVERITY>\n" +
					"                <MESSAGE>SUCCESS</MESSAGE>\n" +
					"            </STATUS>");
			ofxFile.write("\t\t\t<TAXW2RS>\n");
			ofxFile.write("\t\t\t\t<TAXW2_V200>\n");
			//ofxFile.write("\t<TAXYEAR>2023</TAXYEAR>\n");
			// 3.2.9 EMPLOYER
			ofxFile.write("\t\t\t\t<EMPLOYER>\n");
			ofxFile.write("\t\t\t\t\t<FEDIDNUMBER>" + w2.getFEID() + "</FEDIDNUMBER>\n");
			ofxFile.write("\t\t\t\t\t<NAME1>" + w2.getName1() + "</NAME1>\n");
			ofxFile.write("\t\t\t\t\t<ADDR1>" + w2.getAddr1() + "</ADDR1>\n");
			ofxFile.write("\t\t\t\t\t<CITY>" + w2.getEmployerCity() + "</CITY>\n");
			ofxFile.write("\t\t\t\t\t<STATE>" + w2.getEmployerState() + "</STATE>\n");
			ofxFile.write("\t\t\t\t\t<POSTALCODE>" + w2.getEmployerPostal() + "</POSTALCODE>\n");
			ofxFile.write("\t\t\t\t</EMPLOYER>\n");
			// 3.2.10 EMPLOYEE
			ofxFile.write("\t\t\t\t<EMPLOYEE>\n");
			ofxFile.write("\t\t\t\t\t<SSN>" + w2.getSSN() + "</SSN>\n");
			ofxFile.write("\t\t\t\t\t<FIRSTNAME>" + w2.getFirstName() +"</FIRSTNAME>\n");
			ofxFile.write("\t\t\t\t\t<MIDDLENAME>" + w2.getMiddleInt() +"</MIDDLENAME>\n");
			ofxFile.write("\t\t\t\t\t<LASTNAME>" + w2.getLastName() +"</LASTNAME>\n");
			ofxFile.write("\t\t\t\t\t<ADDR1>" + w2.getAdr1() + "</ADDR1>\n");
			ofxFile.write("\t\t\t\t\t<CITY>" + w2.getCity() + "</CITY>\n");
			ofxFile.write("\t\t\t\t\t<STATE>" + w2.getState() + "</STATE>\n");
			ofxFile.write("\t\t\t\t\t<POSTALCODE>" + w2.getZip() + "</POSTALCODE>\n");
			ofxFile.write("\t\t\t\t</EMPLOYEE>\n");
			ofxFile.write("\t\t\t\t<SSN>" + w2.getSSN() + "</SSN>\n");
			ofxFile.write("\t\t\t\t</EMPLOYEE>\n");
			ofxFile.write("\t\t\t\t<ORIGINALW2>");
			ofxFile.write("\t<TAXYEAR>2023</TAXYEAR>\n");

			//3.2.7
			System.out.println("Employees = " + w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees());
			System.out.println("Employees belongs to: " + (w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees()).getClass());
			System.out.println("Employee = " + w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee());
			System.out.println("Employee belongs to: " + (w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee()).getClass());
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("EEFormData = " + w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData());
			System.out.println("EEFormData belongs to: " + (w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData()).getClass());
			System.out.println("EETaxData = " + w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData().getEeTaxData());
			System.out.println("EETaxData belongs to: " + (w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData().getEeTaxData()).getClass());

			System.out.println("EETaxData[0] = " + w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData().getEeTaxData().get(0));
			System.out.println("EETaxData[0] belongs to: " + w2.getReportDefinition().getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData().getEeTaxData().get(0).getClass());

			//Document doc = w2.getReport().getCompanies().getCompany().getEmployees().getEmployee().get(0).getEeFormData().getEeTaxData().get(0);

			ofxFile.write("\t\t\t\t<WAGES>" + w2.getWages() + "<WAGES/>\n");
			ofxFile.write("\t\t\t\t<FEDTAXWH>" + w2.getFedTaxWh() + "</FEDTAXWH>\n");
			ofxFile.write("\t\t\t\t<SSWAGES>" + w2.getSSWages() + "</SSWAGES>\n");
			ofxFile.write("\t\t\t\t<SSTAXWH>" + w2.getSSTaxWH() + "</SSTAXWH>\n");
			ofxFile.write("\t\t\t\t<MEDICAREWAGES>" + w2.getMedCareWages() + "</MEDICAREWAGES>\n");
          	ofxFile.write("\t\t\t\t<MEDICARETAXWH>" + w2.getMedCareTaxWH() + "</MEDICARETAXWH>\n");
			ofxFile.write("\t\t\t\t<SSTIPS>" + w2.getSSTips() + "</SSTIPS>\n");
            ofxFile.write("\t\t\t\t<ALLOCATEDTIPS>nu</ALLOCATEDTIPS>\n");
            ofxFile.write("\t\t\t\t<DEPCAREBENEFIT>nu</DEPCAREBENEFIT>\n");
            ofxFile.write( "\t\t\t\t<NONQUALPLAN>nu</NONQUALPLAN>\n");

			ofxFile.write("\t\t\t\t</TAXW2_V200>\n");
			ofxFile.write("\t\t\t</TAXW2RS>\n");
			ofxFile.write("\t\t</TAXW2TRNRS>\n");
			ofxFile.write("\t</TAXW2MSGSRSV1>\n");
			ofxFile.write("</OFX>");
			ofxFile.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}

