package n1exercici1.Java;

import n1exercici1.Class.Employee;
import n1exercici1.Class.OnSiteEmployee;
import n1exercici1.Class.OnlineEmployee;

public class Main {

    public static void main(String[] args) {
        Employee employee;

        employee = new OnlineEmployee("Adrián", "Cast", 60);
        System.out.println(employee.getName() + " " + employee.getSurname() + ". " + employee.CalculateSalary(50));
        employee = new OnSiteEmployee("Eloi", "Bart", 120, 25);
        System.out.println(employee.getName() + " " + employee.getSurname() + ". " + employee.CalculateSalary(62));
        employee = new OnlineEmployee("Laure", "Vischj", 30);
        System.out.println(employee.getName() + " " + employee.getSurname() + ". " + employee.CalculateSalary(40));


    }
}