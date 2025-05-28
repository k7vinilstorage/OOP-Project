import java.util.ArrayList;

public class People {
    ArrayList<Employee> employees;
    ArrayList<Customer> customers;

    public People() {

    }

    public People(ArrayList<Employee>  employees, ArrayList<Customer> customers) {
        this.employees = employees;
        this.customers = customers;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
