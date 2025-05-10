public abstract class Person {
    private String name;
    private int id;
    private String cpf;
    private String phone;

    public Person() {
        name = "";
        id  = 0;
        cpf = "";
        phone = "";
    }

    public Person(String name, int id, String cpf, String phone) {
        this.name = name;
        this.id = id;
        this.cpf = cpf;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
