import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

  class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    Exercise5 e = new Exercise5();
    employees.add(e.new Employee(105, "Swathi"));
    employees.add(e.new Employee(101, "Indhu"));
    employees.add(e.new Employee(106, "Sindhu"));

    //sort the list here

    for (Employee employee : employees) {
      System.out.println(employee.id + " " + employee.name);
    }
  }

}
