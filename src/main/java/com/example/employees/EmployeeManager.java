package com.example.employees;

public class EmployeeManager {

    static Employees list
            = new Employees();

    static
    {

        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Peter",
                        "Pan",
                        "peter.pan@test.com"));

        list.getEmployeeList().add(
                new Employee(
                        2, "Jane",
                        "Doe",
                        "jane.doe@test.com"));

        list.getEmployeeList().add(
                new Employee(
                        3, "Ray",
                        "Tumbleweed",
                        "ray.tumbleweed@test.com"));


    }
}
