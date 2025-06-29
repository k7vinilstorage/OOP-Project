//João Alberto Benaci Torezan

public class Employee extends Person{
    private String role;
    private String hireDate;

    public Employee() {
        role = "";
        hireDate = "";
    }

    public Employee(String role, String hireDate) { //Sobrecarga
        this.role = role;
        this.hireDate = hireDate;
    }

    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
