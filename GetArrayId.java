//João Alberto Benaci Torezan

public class GetArrayId implements GetArrayIdInterface{
    
    private BDStorage storage;

    private static GetArrayId garid;
    
    private GetArrayId() {
        storage = BDStorage.createStorage();
    }

    public static GetArrayId createGetArrayId() {
        if(garid == null) {
            garid = new GetArrayId();
        }
        return garid;
    }

    @Override
    public int getCustomerId(String cpf) throws ItemNotFoundExeption{
        int custumerSize = storage.getCustomers().size();
        for(int i = 0; i < custumerSize; i++) {
            if(storage.getCustomers().get(i).getCpf().equals(cpf)) { //Reflexividade
                return i;
            }
        }  
        throw new ItemNotFoundExeption("Customer");
    }

    @Override
    public int getEmployeeId(String cpf) throws ItemNotFoundExeption{
        int employeeSize = storage.getEmployees().size();
        for(int i = 0; i < employeeSize; i++) {
            if(storage.getEmployees().get(i).getCpf().equals(cpf)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Employee");
    }

    @Override
    public int getGuitarId(String model) throws ItemNotFoundExeption{
        int guitarSize = storage.getGuitarStock().size();
        for(int i = 0; i < guitarSize; i++) {
            if(storage.getGuitarStock().get(i).getModel().equals(model)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Guitar");
    }

    @Override
    public int getPianoId(String model) throws ItemNotFoundExeption{
        int pianoSize = storage.getPianoStock().size();
        for(int i = 0; i < pianoSize; i++) {
            if(storage.getPianoStock().get(i).getModel().equals(model)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Piano");
    }

    @Override
    public int getDrumsId(String model) throws ItemNotFoundExeption{
        int drumsSize = storage.getDrumsStock().size();
        for(int i = 0; i < drumsSize; i++) {
            if(storage.getDrumsStock().get(i).getModel().equals(model)) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Drums");
    }

    @Override
    public int getAcquisitionId(int OpId) throws ItemNotFoundExeption{
        int acqSize = storage.getAcquisitions().size();
        for(int i = 0; i <  acqSize; i++) {
            if(storage.getAcquisitions().get(i).getOpId() == OpId) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Acquisition");
    }

    @Override
    public int getSaleId(int OpId) throws ItemNotFoundExeption{
        int saleSize = storage.getSales().size();
        for(int i = 0; i <  saleSize; i++) {
            if(storage.getSales().get(i).getOpId() == OpId) { //Reflexividade
                return i;
            }
        }
        throw new ItemNotFoundExeption("Sale");
    } 
}
