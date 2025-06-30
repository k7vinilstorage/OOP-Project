//João Alberto Benaci Torezan

public class CpfExceptionHandler{
    
    private static BDStorage storage = BDStorage.createStorage();
    
    private static CpfExceptionHandler i;
    
    private CpfExceptionHandler() {}
    
    //MÉTODO SINGLETON
    
    public static CpfExceptionHandler createCpfExceptionHandler() {
        if(i == null) {
            i = new CpfExceptionHandler();
        }
        return i;
    }
    
    public String verifyCpf(String cpf) throws DupCpfException{
        for(Customer c : storage.getCustomers()) {
            if(c.getCpf().equals(cpf)) {
                throw new DupCpfException();
            }
        }
        for(Employee e : storage.getEmployees()) {
            if(e.getCpf().equals(cpf)) {
                throw new DupCpfException();
            }
        }
        return cpf;
    }
}
