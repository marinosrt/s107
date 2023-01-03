package n1exercici1.Class;

public class OnlineEmployee extends Employee {

    private final int INTERNET = 35;

    public OnlineEmployee(String name, String surname, int hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public String CalculateSalary(int WorkedHours){
        return "As an online employee, " + getName() + " salary, with the " + INTERNET + "€ paid Internet included is: " +
                (WorkedHours*HourPrice) + INTERNET + "€.";
    }
}
