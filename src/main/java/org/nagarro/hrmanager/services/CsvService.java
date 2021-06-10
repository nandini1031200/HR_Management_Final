package org.nagarro.hrmanager.services;

import java.io.PrintWriter;


import org.nagarro.hrmanager.model.EmployeeModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/**
 * interface to download employee details in csv format
 * 
 * @author vukkalkernandini
 *
 */

public interface CsvService {

	public void downloadCsvFile(PrintWriter printWriter, EmployeeModel[] employeeModels);
}
