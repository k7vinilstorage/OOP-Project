

public class GetArrayId {

    private Storage storage;


    public GetArrayId() {
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

    public int getGuitarId(String model) {
        int guitarSize = storage.getGuitarStock().size();
        for(int i = 0; i < guitarSize; i++) {
            if(storage.getGuitarStock().get(i).getModel().equals(model)) {
                return i;
            }
        }
        return 0;
    }

    public int getPianoId(String model) {
        int pianoSize = storage.getPianoStock().size();
        for(int i = 0; i < pianoSize; i++) {
            if(storage.getPianoStock().get(i).getModel().equals(model)) {
                return i;
            }
        }
        return 0;
    }

    public int getDrumsId(String model) {
        int drumsSize = storage.getDrumsStock().size();
        for(int i = 0; i < drumsSize; i++) {
            if(storage.getDrumsStock().get(i).getModel().equals(model)) {
                return i;
            }
        }
        return 0;
    }
}
