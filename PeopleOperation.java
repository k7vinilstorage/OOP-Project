public class PeopleOperation implements PeopleOpInterface{
    
    private Storage peopleStorage;
    private Read read = Read.createRead();
    private GetArrayId getId = new GetArrayId();

    public PeopleOperation() {
        peopleStorage = Storage.createStorage();
    }

    public PeopleOperation(Storage peoplStorage) { //Sobrecarga
        this.peopleStorage = peoplStorage;
    }

    @Override
    public void addCustumer() {
        Customer c = new Customer();
        c.setName(read.readString("\nInsert Custumer Name: "));
        c.setId(read.readInt("Insert Custumer Id: "));
        c.setCpf(read.readString("Insert Custumer CPF: "));
        c.setPhone(read.readString("Insert Custumer Phone: "));
        peopleStorage.getCustomers().add(c); //Reflexividade
        System.out.println("\nOK!");
    }

    @Override
    public void removeCustumer() {
        String cpf = read.readString("\nInsert Custumer CPF: ");
        peopleStorage.getCustomers().remove(getId.getCustumerId(cpf)); //Reflexividade
        System.out.println("\nOK!");
    }

    @Override
    public void editCustumer() {
        String cpf = read.readString("\nInsert Custumer CPF: ");
        int id = getId.getCustumerId(cpf);

        String data = read.readString("Insert new Name: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setName(data); //Reflexividade
        }

        int dataI = read.readInt("Insert new Id: ");
        if(!(dataI == 0)) {
            peopleStorage.getCustomers().get(id).setId(dataI); //Reflexividade
        }

        data = read.readString("Insert new CPF: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setCpf(data); //Reflexividade
        }

        data = read.readString("Insert new Phone: ");
        if(!data.equals("")) {
            peopleStorage.getCustomers().get(id).setPhone(data); //Reflexividade
        }
    }

    @Override
    public void viewCustumer() {
        int id;
        String cpf = read.readString("\nInsert Custumer CPF: ");
        id = getId.getCustumerId(cpf);
        System.out.println("\nCustumer: ");
        System.out.println("Name: " + peopleStorage.getCustomers().get(id).getName()); //Reflexividade
        System.out.println("Id: " + peopleStorage.getCustomers().get(id).getId()); //Reflexividade
        System.out.println("CPF: " + peopleStorage.getCustomers().get(id).getCpf()); //Reflexividade
        System.out.println("Phone: " + peopleStorage.getCustomers().get(id).getPhone()); //Reflexividade
        System.out.println("Purchase count: " + peopleStorage.getCustomers().get(id).getPurchaseCount()); //Reflexividade
    }

    @Override
    public void addEmployee() {
        Employee e = new Employee();
        e.setName(read.readString("\nInsert Employee Name: "));
        e.setId(read.readInt("Insert Employee Id: "));
        e.setCpf(read.readString("Insert Employee CPF: "));
        e.setPhone(read.readString("Insert Employee Phone: "));
        e.setRole(read.readString("Insert Employee Role: "));
        peopleStorage.getEmployees().add(e); //Reflexividade
    }

    @Override
    public void removeEmployee() {
        String cpf = read.readString("\nInsert Employee CPF: ");
        peopleStorage.getEmployees().remove(getId.getEmployeeId(cpf)); //Reflexividade
        System.out.println("\nOK!");
    }

    @Override
    public void editEmployee() {
        String cpf = read.readString("\nInsert Employee CPF: "); //Reflexividade
        int id = getId.getEmployeeId(cpf);

        String data = read.readString("Insert new Name: "); 
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setName(data); //Reflexividade
        }

        int dataI = read.readInt("Insert new Id: ");
        if(!(dataI == 0)) {
            peopleStorage.getEmployees().get(id).setId(dataI); //Reflexividade
        }

        data = read.readString("Insert new CPF: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setCpf(data); //Reflexividade
        }

        data = read.readString("Insert new Phone: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setPhone(data); //Reflexividade
        }
        data = read.readString("Insert new Role: ");
        if(!data.equals("")) {
            peopleStorage.getEmployees().get(id).setRole(data); //Reflexividade
        }
    }

    @Override
    public void viewEmployee() {
        int id;
        String cpf = read.readString("\nInsert Employee CPF: ");
        id = getId.getEmployeeId(cpf);
        System.out.println("\nEmployee: ");
        System.out.println("Name: " + peopleStorage.getEmployees().get(id).getName()); //Reflexividade
        System.out.println("Id: " + peopleStorage.getEmployees().get(id).getId()); //Reflexividade
        System.out.println("CPF: " + peopleStorage.getEmployees().get(id).getCpf()); //Reflexividade
        System.out.println("Phone: " + peopleStorage.getEmployees().get(id).getPhone()); //Reflexividade
        System.out.println("Role: " + peopleStorage.getEmployees().get(id).getRole()); //Reflexividade
    }
}