public class Engineer extends Employee{
    public Engineer(String name, int yearsOfExperience, int yearsAtCompany){
        super(name,75000.0 ,yearsOfExperience,yearsAtCompany,0);
        if(yearsAtCompany == 1) setWeeksVacation(2);
        else if(yearsAtCompany >= 2) setWeeksVacation(3);
    }
}
