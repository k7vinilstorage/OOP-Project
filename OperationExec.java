public class OperationExec {
    private Storage operationStorage;
    private Read read = Read.createRead();
    private GetArrayId getId = new GetArrayId();

    public OperationExec() {
        operationStorage = Storage.createStorage();
    }

    public OperationExec(Storage operationStorage) {
        this.operationStorage = operationStorage;
    }

    public void acquisition() {

    }

    public void sale() {
        
    }
}
