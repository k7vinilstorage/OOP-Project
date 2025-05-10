public class Employee extends Person{
    private String role;

    public Employee() {
        role = "";
    }

    public Employee(int id, String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}
