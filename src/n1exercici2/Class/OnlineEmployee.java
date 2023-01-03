package n1exercici2.Class;

public class OnlineEmployee extends Employee {

    private final int INTERNET = 35;

    public OnlineEmployee(String name, String surname, int hourPrice) {
        super(name, surname, hourPrice);
    }

    public int getINTERNET() {
        return INTERNET;
    }

    /**
     * Delete multiple items from the list.
     *
     * @deprecated  Not for public use.
     *    This method is expected to be retained only as a package
     *    private method.  Replaced by
     *    {getINTERNET()}
     */
    @Deprecated
    public int priceINTERNET(){
        return INTERNET;
    }

    @Override
    public String CalculateSalary(int WorkedHours){
        return "As an online employee, " + getName() + " salary is: " +
                (WorkedHours*HourPrice) + INTERNET + "€.";
    }
}
