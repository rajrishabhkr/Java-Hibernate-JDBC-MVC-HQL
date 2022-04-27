    public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee()
    {
        
    }
    
    public Employee(String firstname, String lastname, int salary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
