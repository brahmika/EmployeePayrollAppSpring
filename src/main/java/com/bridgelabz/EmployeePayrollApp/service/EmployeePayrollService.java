package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeePayrollService
        implements IEmployeePayrollService {

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return null;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(
            long empId) {
        return null;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(
            EmployeePayrollDTO employeePayrollDTO) {
        return null;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(
            long empId, EmployeePayrollDTO employeePayrollDTO) {
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(long empId) {
    }
}