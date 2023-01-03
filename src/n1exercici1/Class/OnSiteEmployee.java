package n1exercici1.Class;

public class OnSiteEmployee extends Employee {
    private static int Gasoil;

    public OnSiteEmployee(String name, String surname, int hourPrice, int gasoil) {
        super(name, surname, hourPrice);
        Gasoil = gasoil;
    }

    @Override
    public String CalculateSalary(int WorkedHours){
        return "As an On Site employee, " + getName() + " salary, with the " + Gasoil + "€ paid gasoline included is: " +
                (WorkedHours*HourPrice) + Gasoil + "€.";
    }
}
