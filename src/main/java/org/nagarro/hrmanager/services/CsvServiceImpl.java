package org.nagarro.hrmanager.services;

import java.io.PrintWriter;


import org.nagarro.hrmanager.model.EmployeeModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/**
 * method to download emp details in csv format
 * 
 * @author vukkalkernandini
 *
 */
@Component("csv")
@Service
public class CsvServiceImpl implements CsvService{

	@Override
	public void downloadCsvFile(PrintWriter printWriter, EmployeeModel[] employees) {
		printWriter.write("Employeecode, EmployeeName , EmployeeLocation, email, dob\n");
		for(EmployeeModel employee: employees) {
			printWriter.write(employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpLocation()+","+employee.getEmail()
			+","+employee.getDob()+"\n");
		}
		
	}

}
