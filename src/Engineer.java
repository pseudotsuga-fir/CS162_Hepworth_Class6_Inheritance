public class Engineer extends Employee{
    private int signBonus;
    /**
     * Parameterized constructor
     *@param name A variable of type String
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     */
    public Engineer(String name, int yearsOfExperience, int yearsAtCompany){
        super(name,75000.0 ,yearsOfExperience,yearsAtCompany,0);
        if(yearsAtCompany < 5) signBonus = 5000; else signBonus = 10000;
        if(yearsAtCompany == 1) setWeeksVacation(2); else if(yearsAtCompany >= 2) setWeeksVacation(3);
        setBaseSalary(getBaseSalary()*1.5);
    }
    /**
     * Returns the engineering department's motto
     * @return A value of data type String
     */
    @Override
    public String motto() {
        return "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }
    /**
     * Returns the employees name, salary, motto, amount of vacation days, and sign on bonus.
     * @return A value of data type String
     */
    @Override
    public String toString() {
        return super.toString() + "Sign on bonus: " + signBonus + "%n";
    }
}
