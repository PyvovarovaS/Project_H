package homework6;

public class Employee {
    // fields
    private String lastName;
    private String firstName;
    private String position;
    private double ratePerHour;

    // constructor
    public Employee(String lastName, String firstName, String position, double ratePerHour){
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.ratePerHour = ratePerHour;
    }
    public Employee(String lastName, String firstName, String position){
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    // methods
    public String getFullName() {
        return lastName + " " + firstName;
    }

    // getters
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getPosition() { return position; }
    public double getRatePerHour() { return ratePerHour; }

    // setters
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setRatePerHour(double hourlyRate){
        this.ratePerHour = ratePerHour;
    }
}
