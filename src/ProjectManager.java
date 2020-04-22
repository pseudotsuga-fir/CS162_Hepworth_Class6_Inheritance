public class ProjectManager extends Employee{
    public ProjectManager(String name, int yearsOfExperience, int yearsAtCompany){
        super(name,75000.0 ,yearsOfExperience,yearsAtCompany,0);
        if(yearsAtCompany == 1) setWeeksVacation(3);
        else if(yearsAtCompany >= 2) setWeeksVacation(4);
    }
}
