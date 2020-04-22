import java.sql.SQLOutput;

/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant and Andrew Hepworth
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int weeksVacation;
    /**
     * Parameterless constructor
     */
    public Employee(){
        name = "";
        baseSalary = 75000.0;
        yearsOfExperience = 0;
        yearsAtCompany = 0;
        weeksVacation = 0;
    }

    /**
     * Parameterized constructor
     *@param name A variable of type String
     *@param baseSalary A variable of type double
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     *@param weeksVacation A variable of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, int weeksVacation){
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
        this.weeksVacation = weeksVacation;
    }
    /**
     * Get the name of the employee.
     * @return String.
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name of the employee.
     * @param name of type String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the base salary of the employee.
     * @return double.
     */
    public double getBaseSalary() {
        return baseSalary;
    }
    /**
     * Set the base salary of the employee.
     * @param baseSalary of type double.
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    /**
     * Get the years of experience of the employee.
     * @return int.
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    /**
     * Set the years of experience of the employee.
     * @param yearsOfExperience of type int.
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    /**
     * Get the years at the company of the employee.
     * @return String.
     */
    public int getYearsAtCompany() {
        return yearsAtCompany;
    }
    /**
     * Set the years at the company of the employee.
     * @param yearsAtCompany of type int.
     */
    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }
    /**
     * Set the weeks of vacation time of the employee.
     * @param weeksVacation of type int.
     */
    public void setWeeksVacation(int weeksVacation) {
        this.weeksVacation = weeksVacation;
    }
    /**
     * Set the years at the company of the employee.
     * @return int.
     */
    public int getWeeksVacation() {
        return weeksVacation;
    }
    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Name: " + name + "%nSalary: " + baseSalary + "%nMoto: " + motto() + "%nVacation days: " + weeksVacation * 7 + "%n";
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto() {
        return "We value our employees";
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Josh", 75000.0, 1, 1, 1);
        Employee e2 = new TechnicalWriter("Anna", 1 , 2);
        System.out.printf(e1.toString());
        System.out.printf(e2.toString());
    }
}