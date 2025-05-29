public class GetIdByCPF {

    Storage storage;


    public GetIdByCPF() {
        storage = Storage.createStorage();
    }

    public int getCustumerId(String cpf) {
        int custumerSize = storage.getCustomers().size();
        for(int i = 0; i < custumerSize; i++) {
            if(storage.getCustomers().get(i).getCpf().equals(cpf)) {
                return i;
            }
        }
        return 0;
    }

    public int getEmployeeId(String cpf) {
        int employeeSize = storage.getEmployees().size();
        for(int i = 0; i < employeeSize; i++) {
            if(storage.getEmployees().get(i).getCpf().equals(cpf)) {
                return i;
            }
        }
        return 0;
    }
}
