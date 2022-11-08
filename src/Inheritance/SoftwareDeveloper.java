package Inheritance;

public class SoftwareDeveloper extends Empoyee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    SoftwareDeveloper(int employeeCode,String name,String programmingLanguage)
    {
        super(employeeCode,name);
        this.programmingLanguage=programmingLanguage;
    }

    public void getDetails()
    {
        System.out.println(employeeCode+" "+name+" "+programmingLanguage);
    }
}
