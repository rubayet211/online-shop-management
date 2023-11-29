package info;
public class Employee implements java.io.Serializable {
    private int id;
    private String empName;
    private String salary;

    static final long serialVersionUID = 42L;

    public Employee(int id,  String empName, String salary) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return empName;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
