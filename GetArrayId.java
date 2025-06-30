//João Alberto Benaci Torezan

public class GetArrayId implements GetArrayIdInterface{
    
    private BDStorage storage;

    private static GetArrayId garid;
    
    private GetArrayId() {
        storage = BDStorage.createStorage();
    }

    //MÉTODO SINGLETON
    
    public static GetArrayId createGetArrayId() {
        if(garid == null) {
            garid = new GetArrayId();
        }
        return garid;
    }

    @Override
    public int getCustomerId(String cpf) throws ItemNotFoundExeption{ //Sobrescrita
        int custumerSize = storage.getCustomers().size(); //Reflexividade
        for(int i = 0; i < custumerSize; i++) {
            if(storage.getCustomers().get(i).getCpf().equals(cpf)) { //Reflexividade
                return i;
            }
        }  
        throw new ItemNotFoundExeption("Customer");
    }

    @Override
    public int getEmployeeId(String cpf) throws ItemNotFoundExeption{ //Sobrescrita
        int employeeSize = storage.getEmployees().size(); //Reflexividade
        for(int i = 0; i < employeeSize; i++) {
            if(storage.getEmployees().get(i).getCpf().equals(cpf)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Employee");
    }

    @Override
    public int getGuitarId(String model) throws ItemNotFoundExeption{ //Sobrescrita
        int guitarSize = storage.getGuitarStock().size(); //Reflexividade
        for(int i = 0; i < guitarSize; i++) {
            if(storage.getGuitarStock().get(i).getModel().equals(model)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Guitar");
    }

    @Override
    public int getPianoId(String model) throws ItemNotFoundExeption{ //Sobrescrita
        int pianoSize = storage.getPianoStock().size(); //Reflexividade
        for(int i = 0; i < pianoSize; i++) {
            if(storage.getPianoStock().get(i).getModel().equals(model)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Piano");
    }

    @Override
    public int getDrumsId(String model) throws ItemNotFoundExeption{ //Sobrescrita
        int drumsSize = storage.getDrumsStock().size(); //Reflexividade
        for(int i = 0; i < drumsSize; i++) {
            if(storage.getDrumsStock().get(i).getModel().equals(model)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Drums");
    }

    @Override
    public int getAcquisitionId(int OpId) throws ItemNotFoundExeption{ //Sobrescrita
        int acqSize = storage.getAcquisitions().size(); //Reflexividade
        for(int i = 0; i <  acqSize; i++) {
            if(storage.getAcquisitions().get(i).getOpId() == OpId) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Acquisition");
    }

    @Override
    public int getSaleId(int OpId) throws ItemNotFoundExeption{ //Sobrescrita
        int saleSize = storage.getSales().size(); //Reflexividade
        for(int i = 0; i <  saleSize; i++) {
            if(storage.getSales().get(i).getOpId() == OpId) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Sale");
    } 
}
