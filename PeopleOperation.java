public class PeopleOperation {
    
    private Storage peopleStorage;
    private Read read = Read.createRead();
    private GetIdByCPF getId = new GetIdByCPF();

    public PeopleOperation() {
        peopleStorage = Storage.createStorage();
    }

    public PeopleOperation(Storage peoplStorage) {
        this.peopleStorage = peoplStorage;
    }

    public void addCustumer() {
        Customer c = new Customer();
        c.setName(read.readData("\nInsert Custumer Name: "));
        c.setId(Integer.parseInt(read.readData("Insert Custumer Id: ")));
        c.setCpf(read.readData("Insert Custumer CPF: "));
        c.setPhone(read.readData("Insert Custumer Phone: "));
        peopleStorage.getCustomers().add(c);
        System.out.println("\nOK!");
    }

    public void removeCustumer() {
        String cpf = read.readData("\nInsert Custumer CPF: ");
        peopleStorage.getCustomers().remove(getId.getCustumerId(cpf));
        System.out.println("\nOK!");
    }

    public void editCustumer() {
        String cpf = read.readData("\nInsert Custumer CPF: ");
        int id = getId.getCustumerId(cpf);

        String data = read.readData("Insert new Name: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setName(data);
        }

        data = read.readData("Insert new Id: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setId(Integer.parseInt(data));
        }

        data = read.readData("Insert new CPF: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setCpf(data);
        }

        data = read.readData("Insert new Phone: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setPhone(data);
        }
    }

    public void viewCustumer() {
        int id;
        String cpf = read.readData("\nInsert Custumer CPF: ");
        id = getId.getCustumerId(cpf);
        System.out.println("\nCustumer: ");
        System.out.println("Name: " + peopleStorage.getCustomers().get(id).getName());
        System.out.println("Id: " + peopleStorage.getCustomers().get(id).getId());
        System.out.println("CPF: " + peopleStorage.getCustomers().get(id).getCpf());
        System.out.println("Phone: " + peopleStorage.getCustomers().get(id).getPhone());
        System.out.println("Purchase count: " + peopleStorage.getCustomers().get(id).getPurchaseCount());
    }

    public void addEmployee() {
        Employee e = new Employee();
        e.setName(read.readData("\nInsert Employee Name: "));
        e.setId(Integer.parseInt(read.readData("Insert Employee Id: ")));
        e.setCpf(read.readData("Insert Employee CPF: "));
        e.setPhone(read.readData("Insert Employee Phone: "));
        e.setRole(read.readData("Insert Employee Role: "));
        peopleStorage.getEmployees().add(e);
    }

    public void removeEmployee() {
        String cpf = read.readData("\nInsert Employee CPF: ");
        peopleStorage.getEmployees().remove(getId.getEmployeeId(cpf));
        System.out.println("\nOK!");
    }

    public void editEmployee() {
        String cpf = read.readData("\nInsert Employee CPF: ");
        int id = getId.getEmployeeId(cpf);

        String data = read.readData("Insert new Name: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setName(data);
        }

        data = read.readData("Insert new Id: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setId(Integer.parseInt(data));
        }

        data = read.readData("Insert new CPF: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setCpf(data);
        }

        data = read.readData("Insert new Phone: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setPhone(data);
        }
        data = read.readData("Insert new Role: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setRole(data);
        }
    }

    public void viewEmployee() {
        int id;
        String cpf = read.readData("\nInsert Employee CPF: ");
        id = getId.getEmployeeId(cpf);
        System.out.println("\nEmployee: ");
        System.out.println("Name: " + peopleStorage.getEmployees().get(id).getName());
        System.out.println("Id: " + peopleStorage.getEmployees().get(id).getId());
        System.out.println("CPF: " + peopleStorage.getEmployees().get(id).getCpf());
        System.out.println("Phone: " + peopleStorage.getEmployees().get(id).getPhone());
        System.out.println("Role: " + peopleStorage.getEmployees().get(id).getRole());
    }
}
