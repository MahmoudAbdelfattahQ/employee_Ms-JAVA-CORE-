package employee_ms;

public abstract class Person {

    protected String name;
    protected int age;
    protected String postions;

    public Person() {
    }

    public Person(String name, int age ,String postions) {
        this.name = name;
        this.age = age;
        this.postions = postions;
    }
    
  abstract public double calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
}