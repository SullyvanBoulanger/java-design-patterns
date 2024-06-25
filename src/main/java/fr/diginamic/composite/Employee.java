package fr.diginamic.composite;

public class Employee implements IElement {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public double calcSalary() {
        return salary;
    }
    
}
