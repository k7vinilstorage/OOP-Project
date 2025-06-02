public class OperationExec implements OperationExecInterface{
    private Storage operationStorage;
    private Read read = Read.createRead();
    private GetArrayId getId = new GetArrayId();

    public OperationExec() {
        operationStorage = Storage.createStorage();
    }

    public OperationExec(Storage operationStorage) {
        this.operationStorage = operationStorage;
    }

    @Override
    public void acquisition(int acqType) {
        Acquisition acq = new Acquisition();
        
        acq.setOpId(Integer.parseInt(read.readData("Insert OpId: ")));
        acq.setProductAmount(Integer.parseInt(read.readData("Insert Product Amount: ")));
        acq.setInCharge(operationStorage.getEmployees().get(getId.getEmployeeId(read.readData("Insert Employee CPF: "))));
        acq.setDate(read.readData("Insert Date: "));
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

        acq.setTotalCost(acq.getProductAmount() * acq.getProduct().getPrice());
        operationStorage.getAcquisitions().add(acq);
    }

    @Override
    public void sale(int saleType) {
        Sale sale = new Sale();
        
        sale.setOpId(Integer.parseInt(read.readData("Insert OpId: ")));
        sale.setProductAmount(Integer.parseInt(read.readData("Insert Product Amount: ")));
        sale.setInCharge(operationStorage.getEmployees().get(getId.getEmployeeId(read.readData("Insert Employee CPF: "))));
        sale.setDate(read.readData("Insert Date: "));
        sale.setBuyer(operationStorage.getCustomers().get(getId.getCustumerId(read.readData("Insert Custumer CPF: "))));
        sale.getBuyer().setPurchaseCount(sale.getBuyer().getPurchaseCount() + sale.getProductAmount());

        int id;

        switch(saleType) {
            case 1:
                id = getId.getGuitarId(read.readData("Insert Guitar Model: "));
                sale.setProduct(operationStorage.getGuitarStock().get(id));
                operationStorage.getGuitarStock().get(id).setAvailability(operationStorage.getGuitarStock().get(id).getAvailability() - sale.getProductAmount());
                break;
            case 2:
                id = getId.getPianoId(read.readData("Insert Piano Model: "));
                sale.setProduct(operationStorage.getPianoStock().get(id));
                operationStorage.getPianoStock().get(id).setAvailability(operationStorage.getPianoStock().get(id).getAvailability() - sale.getProductAmount());
                break;
            case 3:
                id = getId.getDrumsId(read.readData("Insert Drums Model: "));
                sale.setProduct(operationStorage.getDrumsStock().get(id));
                operationStorage.getDrumsStock().get(id).setAvailability(operationStorage.getDrumsStock().get(id).getAvailability() - sale.getProductAmount());
                break;
        }
        sale.setTotalCost(sale.getProductAmount() * sale.getProduct().getPrice());
        operationStorage.getSales().add(sale);
    }

    @Override
    public void showAcquisition() {
        int id;
        id = getId.getAcquisitionId(Integer.parseInt(read.readData("Insert Operation OpId: ")));
        System.out.println("OpId: " + operationStorage.getAcquisitions().get(id).getOpId());
        System.out.println("Product Amount: " + operationStorage.getAcquisitions().get(id).getProductAmount());
        System.out.println("Product Model: " + operationStorage.getAcquisitions().get(id).getProduct().getModel());
        System.out.println("Employee in Charge: " + operationStorage.getAcquisitions().get(id).getInCharge().getName());
        System.out.println("Date: " + operationStorage.getAcquisitions().get(id).getDate());
        System.out.println("Total Cost: " + operationStorage.getAcquisitions().get(id).getTotalCost());
        System.out.println("Supplyer Name: " + operationStorage.getAcquisitions().get(id).getSupplyerName());
    }

    @Override
    public void showSale() {
        int id;
        id = getId.getSaleId(Integer.parseInt(read.readData("Insert Operation OpId: ")));
        System.out.println("OpId: " + operationStorage.getSales().get(id).getOpId());
        System.out.println("Product Amount: " + operationStorage.getSales().get(id).getProductAmount());
        System.out.println("Product Model: " + operationStorage.getSales().get(id).getProduct().getModel());
        System.out.println("Employee in Charge: " + operationStorage.getSales().get(id).getInCharge().getName());
        System.out.println("Date: " + operationStorage.getSales().get(id).getDate());
        System.out.println("Total Cost: " + operationStorage.getSales().get(id).getTotalCost());
        System.out.println("Buyer: " + operationStorage.getSales().get(id).getBuyer().getName());
    }

}
