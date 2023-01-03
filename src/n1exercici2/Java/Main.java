package n1exercici2.Java;

import n1exercici2.Class.Employee;
import n1exercici2.Class.OnSiteEmployee;
import n1exercici2.Class.OnlineEmployee;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Employee employee;
        OnlineEmployee employeeOnline;
        OnSiteEmployee employeeOnSite;


        employee = new Employee("Marta", "Jimenez", 40);
        System.out.println(employee.getName() + " " + employee.getSurname() + ". " + employee.CalculateSalary(45));

        employeeOnline = new OnlineEmployee("Adrián", "Cast", 60);
        System.out.println(employeeOnline.getName() + " " + employeeOnline.getSurname() + ". " + employeeOnline.CalculateSalary(50) +
                " This includes the " + employeeOnline.priceINTERNET() + "€ from the Internet connection bill");

        employeeOnSite = new OnSiteEmployee("Eloi", "Bart", 120, 25);
        System.out.println(employeeOnSite.getName() + " " + employeeOnSite.getSurname() + ". " + employeeOnSite.CalculateSalary(62) +
                " This includes the " + employeeOnSite.priceGASOIL() + "€ from the Gasoil bill");

        employeeOnline = new OnlineEmployee("Laure", "Vischj", 30);
        System.out.println(employeeOnline.getName() + " " + employeeOnline.getSurname() + ". " + employeeOnline.CalculateSalary(40) +
                " This includes the " + employeeOnline.priceINTERNET() + "€ from the Internet connection bill");
    }
}
