package n1exercici2.Class;

public class OnSiteEmployee extends Employee {
    private static int Gasoil;

    public OnSiteEmployee(String name, String surname, int hourPrice, int gasoil) {
        super(name, surname, hourPrice);
        Gasoil = gasoil;
    }

    public static int getGasoil() {
        return Gasoil;
    }

    /**
     * Delete multiple items from the list.
     *
     * @deprecated  Not for public use.
     *    This method is expected to be retained only as a package
     *    private method.  Replaced by
     *    {getGasoil()}
     */
    @Deprecated
    public int priceGASOIL(){
        return Gasoil;
    }

    @Override
    public String CalculateSalary(int WorkedHours){
        return "As an On Site employee, " + getName() + " salary is : " +
                (WorkedHours*HourPrice) + Gasoil + "€.";

    }
}
