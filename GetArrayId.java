//João Alberto Benaci Torezan

public class GetArrayId {

    private Storage storage;

    public GetArrayId() {
        storage = Storage.createStorage();
    }

    public GetArrayId(Storage storage) { //Sobrecarga
        this.storage = storage;
    }

    public int getCustumerId(String cpf) {
        int custumerSize = storage.getCustomers().size();
        for(int i = 0; i < custumerSize; i++) {
            try { 
                if(storage.getCustomers().get(i).getCpf().equals(cpf)) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    }

    public int getEmployeeId(String cpf) {
        int employeeSize = storage.getEmployees().size();
        for(int i = 0; i < employeeSize; i++) {
            try { 
                if(storage.getEmployees().get(i).getCpf().equals(cpf)) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    }

    public int getGuitarId(String model) {
        int guitarSize = storage.getGuitarStock().size();
        for(int i = 0; i < guitarSize; i++) {
            try { 
                if(storage.getGuitarStock().get(i).getModel().equals(model)) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    }

    public int getPianoId(String model) {
        int pianoSize = storage.getPianoStock().size();
        for(int i = 0; i < pianoSize; i++) {
            try { 
                if(storage.getPianoStock().get(i).getModel().equals(model)) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    }

    public int getDrumsId(String model) {
        int drumsSize = storage.getDrumsStock().size();
        for(int i = 0; i < drumsSize; i++) {
            try { 
                if(storage.getDrumsStock().get(i).getModel().equals(model)) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    }

    public int getAcquisitionId(int OpId) {
        int acqSize = storage.getAcquisitions().size();
        for(int i = 0; i <  acqSize; i++) {
            try { 
                if(storage.getAcquisitions().get(i).getOpId() == OpId) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    }

    public int getSaleId(int OpId) {
        int saleSize = storage.getSales().size();
        for(int i = 0; i <  saleSize; i++) {
            try { 
                if(storage.getSales().get(i).getOpId() == OpId) { //Reflexividade
                    return i;
                }
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Indice não encontrado !");
            }
        }
        return 0;
    } 
}
