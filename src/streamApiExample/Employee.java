package streamApiExample;

public class Employee {
    private String eName;
    private int eAge;
    private String eDepartment;
    private int eSalary;

    @Override
    public String toString() {

        return "Employee : " +
                "eName= " + eName +
                ", eAge=" + eAge +
                ", eDepartment= " + eDepartment +
                ", eSalary=" + eSalary
                ;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public String geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(String eDepartment) {
        this.eDepartment = eDepartment;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public Employee() {
    }

    public Employee(String eName, int eAge, String eDepartment, int eSalary) {
        this.eName = eName;
        this.eAge = eAge;
        this.eDepartment = eDepartment;
        this.eSalary = eSalary;
    }
}
