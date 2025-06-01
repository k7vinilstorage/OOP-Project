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

    public void acquisition(int acqType) {
        Acquisition acq = new Acquisition();
        
        acq.setOpId(Integer.parseInt(read.readData("Insert OpId: ")));
        acq.setProductAmount(Integer.parseInt(read.readData("Insert Product Amount: ")));
        acq.setInCharge(operationStorage.getEmployees().get(getId.getEmployeeId(read.readData("Insert Employee CPF: "))));
        acq.setDate(read.readData("Insert Date: "));
        acq.setTotalCost(Float.parseFloat(read.readData("Insert Total Cost")));
        acq.setSupplyerName(read.readData("Insert Supplyer Name: "));

        int id;

        switch(acqType) {
            case 1:
                id = getId.getGuitarId(read.readData("Insert Guitar Model: "));
                acq.setProduct(operationStorage.getGuitarStock().get(id));
                operationStorage.getGuitarStock().get(id).setAvailability(operationStorage.getGuitarStock().get(id).getAvailability() + acq.getProductAmount());
                break;
            case 2:
                id = getId.getPianoId(read.readData("Insert Piano Model: "));
                acq.setProduct(operationStorage.getPianoStock().get(id));
                operationStorage.getPianoStock().get(id).setAvailability(operationStorage.getPianoStock().get(id).getAvailability() + acq.getProductAmount());
                break;
            case 3:
                id = getId.getDrumsId(read.readData("Insert Drums Model: "));
                acq.setProduct(operationStorage.getDrumsStock().get(id));
                operationStorage.getDrumsStock().get(id).setAvailability(operationStorage.getDrumsStock().get(id).getAvailability() + acq.getProductAmount());
                break;
        }
    }

    public void sale(int saleType) {
        Sale sale = new Sale();
        
        sale.setOpId(Integer.parseInt(read.readData("Insert OpId: ")));
        sale.setProductAmount(Integer.parseInt(read.readData("Insert Product Amount: ")));
        sale.setInCharge(operationStorage.getEmployees().get(getId.getEmployeeId(read.readData("Insert Employee CPF: "))));
        sale.setDate(read.readData("Insert Date: "));
        sale.setTotalCost(Float.parseFloat(read.readData("Insert Total Cost")));
        sale.setBuyer(operationStorage.getCustomers().get(getId.getCustumerId(read.readData("Insert Custumer CPF: "))));

        int id;

        switch(saleType) {
            case 1:
                id = getId.getGuitarId(read.readData("Insert Guitar Model: "));
                sale.setProduct(operationStorage.getGuitarStock().get(id));
                operationStorage.getGuitarStock().get(id).setAvailability(operationStorage.getGuitarStock().get(id).getAvailability() + sale.getProductAmount());
                break;
            case 2:
                id = getId.getPianoId(read.readData("Insert Piano Model: "));
                sale.setProduct(operationStorage.getPianoStock().get(id));
                operationStorage.getPianoStock().get(id).setAvailability(operationStorage.getPianoStock().get(id).getAvailability() + sale.getProductAmount());
                break;
            case 3:
                id = getId.getDrumsId(read.readData("Insert Drums Model: "));
                sale.setProduct(operationStorage.getDrumsStock().get(id));
                operationStorage.getDrumsStock().get(id).setAvailability(operationStorage.getDrumsStock().get(id).getAvailability() + acq.getProductAmount());
                break;
        }
    }

    public void showAcquisition() {

    }

    public void showSale() {

    }

}
