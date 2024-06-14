package com.example.employees;
import org.springframework
        .stereotype
        .Repository;


@Repository
public class EmployeeDAO {


    // Method to return the list
    public Employees getAllEmployees()
    {

        return EmployeeManager.list;
    }


    // Method to add an employee
    // to the employees list
    public void
    addEmployee(Employee employee)
    {
        EmployeeManager.list.getEmployeeList()
                .add(employee);

    }
}

