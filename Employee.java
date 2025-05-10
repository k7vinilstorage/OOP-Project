public class Employee extends Person{
    private int id;
    private String role;

    public Employee() {
        id = 0;
        role = "";
    }

    public Employee(int id, String role) {
        this.id = id;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}
