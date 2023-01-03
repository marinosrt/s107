package n1exercici2.Class;

public class Employee {

    protected String Name;
    protected String Surname;
    protected double HourPrice;

    public Employee(String name, String surname, int hourPrice) {
        Name = name;
        Surname = surname;
        HourPrice = hourPrice;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public double getHourPrice() {
        return HourPrice;
    }

    public String CalculateSalary(int WorkedHours){
        return getName() + " salary is: " + WorkedHours*HourPrice + "€.";
    }
}