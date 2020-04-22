public class TechnicalWriter extends Employee{
    public TechnicalWriter(String name, int yearsOfExperience, int yearsAtCompany){
        super(name,75000.0 ,yearsOfExperience,yearsAtCompany,0);
        if(yearsAtCompany == 1) setWeeksVacation(1);
        else if(yearsAtCompany >= 2) setWeeksVacation(2);
    }
}
