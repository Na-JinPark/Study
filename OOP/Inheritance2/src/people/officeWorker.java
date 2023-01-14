package people;

public class officeWorker extends staff {
    public String department;

    public officeWorker(String name, long number, String schoolName, long staffnumber, String department){
        super(name, number, schoolName, staffnumber);
        this.department = department;
    }
}
