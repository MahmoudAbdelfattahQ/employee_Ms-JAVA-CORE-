package employee_ms;

import java.util.ArrayList;


public class Employee extends Person implements ContractDepartment {

    private String enteryDate;
    private int contractDuration;
    private int noticePeriod;
    private double salary;
    private ArrayList<Projects> proj = new ArrayList();

    public Employee() {
    }

    public Employee(String name, int age, String postions ) {
        super(name, age, postions);
        }

//    public Employee(String name, String postions) {
//        this.name = name;
//        this.salary = calculateSalary(postions);
//    }

    public String getPostions() {
        return postions;
    }

    public void setPostions(String postions) {
        this.postions = postions;
    }

    
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void enteryDate(String ed) {
        this.enteryDate = ed;
    }

    @Override
    public void contractDuration(int cd) {
        this.contractDuration = cd;
    }

    @Override
    public void noticePeriod(int np) {
        this.noticePeriod = np;
    }

    @Override
    public double calculateSalary() {
        
        switch (postions) {
            case "manager":
                salary = 50000.0;
                break;
            case "engineer":
                salary = 60000.0;
                break;
            case "officeboy":
                salary = 55000.0;
                break;

            default:
                return 0;
        }
        return salary;
    }

    public void addProject(Projects project) {

        proj.add(project);
    }

    public void removeproject(Projects project) {

        proj.remove(project);
    }

    public ArrayList<Projects> getProjects() {
        return  proj;
    }
}
