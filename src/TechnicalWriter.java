public class TechnicalWriter extends Employee{
    /**
     * Parameterized constructor
     *@param name A variable of type String
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     */
    public TechnicalWriter(String name, int yearsOfExperience, int yearsAtCompany){
        super(name,75000.0 ,yearsOfExperience,yearsAtCompany,0);
        if(yearsAtCompany == 1) setWeeksVacation(1); else if(yearsAtCompany >= 2) setWeeksVacation(2);
    }
    /**
     * Returns the Technical Writing department's motto
     * @return A value of data type String
     */
    @Override
    public String motto() {
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
}
