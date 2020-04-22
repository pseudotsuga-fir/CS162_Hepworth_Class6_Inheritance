public class ProjectManager extends Employee{
    private int stockShares = 0;
    /**
     * Parameterized constructor
     *@param name A variable of type String
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     */
    public ProjectManager(String name, int yearsOfExperience, int yearsAtCompany){
        super(name,75000.0 ,yearsOfExperience,yearsAtCompany,0);
        stockShares = yearsAtCompany*100;
        if(yearsAtCompany == 1) setWeeksVacation(3); else if(yearsAtCompany >= 2) setWeeksVacation(4);
        setBaseSalary(getBaseSalary()*2);
    }
    /**
     * Returns the project managers' motto
     * @return A value of data type String
     */
    @Override
    public String motto() {
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }
    /**
     * Returns the employees name, salary, motto, amount of vacation days, and shares of company stock.
     * @return A value of data type String
     */
    @Override
    public String toString() {
        return super.toString() + "Shares of company stock: " + stockShares + "%n";
    }
}
