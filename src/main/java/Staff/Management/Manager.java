package Staff.Management;

public class Manager extends Staff.Employee{

    private String deptName;

    public Manager(String name, String niNumber, double salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;

    }

    public String getDeptName() {
        return deptName;
    }


}
