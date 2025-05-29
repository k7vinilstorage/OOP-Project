public class PeopleOperation {
    
    Storage peopleStorage;
    Read read = Read.createRead();
    GetIdByCPF getId = new GetIdByCPF();

    public PeopleOperation() {
        peopleStorage = Storage.createStorage();
    }

    public PeopleOperation(Storage peoplStorage) {
        this.peopleStorage = peoplStorage;
    }

    public void addCustumer() {
        Customer c = new Customer();
        c.setName(read.readData("Insert Custumer Name: "));
        c.setId(Integer.parseInt(read.readData("Insert Custumer Id: ")));
        c.setCpf(read.readData("Insert Custumer CPF: "));
        c.setPhone(read.readData("Insert Custumer Phone: "));
        peopleStorage.getCustomers().add(c);
    }

    public void removeCustumer() {
        String cpf = read.readData("Insert Custumer CPF: ");
        peopleStorage.getCustomers().remove(getId.getCustumerId(cpf));
    }

    public void editCustumer() {
        
    }

    public void viewCustumer() {
        
    }

     public void addEmployee() {
        
    }

    public void removeEmployee() {
        
    }

    public void editEmployee() {
        
    }

    public void viewEmployee() {
        
    }

}
