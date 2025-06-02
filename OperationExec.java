public class OperationExec implements OperationExecInterface{
    private Storage operationStorage;
    private Read read = Read.createRead();
    private GetArrayId getId = new GetArrayId();

    public OperationExec() {
        operationStorage = Storage.createStorage();
    }

    public OperationExec(Storage operationStorage) { //Sobrecarga
        this.operationStorage = operationStorage;
    }

    @Override
    public void acquisition(int acqType) { //Sobrescrita
        Acquisition acq = new Acquisition();
        
        acq.setOpId(read.readInt("Insert OpId: "));
        acq.setProductAmount(read.readInt("Insert Product Amount: "));
        acq.setInCharge(operationStorage.getEmployees().get(getId.getEmployeeId(read.readString("Insert Employee CPF: ")))); //Reflexividade
        acq.setDate(read.readString("Insert Date: "));
        acq.setSupplyerName(read.readString("Insert Supplyer Name: "));
        
        int id;
        
        switch(acqType) {
            case 1:
            id = getId.getGuitarId(read.readString("Insert Guitar Model: "));
            acq.setProduct(operationStorage.getGuitarStock().get(id)); //Reflexividade
            operationStorage.getGuitarStock().get(id).setAvailability(operationStorage.getGuitarStock().get(id).getAvailability() + acq.getProductAmount()); //Reflexividade
            break;
            case 2:
            id = getId.getPianoId(read.readString("Insert Piano Model: "));
            acq.setProduct(operationStorage.getPianoStock().get(id)); //Reflexividade
            operationStorage.getPianoStock().get(id).setAvailability(operationStorage.getPianoStock().get(id).getAvailability() + acq.getProductAmount()); //Reflexividade
            break;
            case 3:
            id = getId.getDrumsId(read.readString("Insert Drums Model: "));
            acq.setProduct(operationStorage.getDrumsStock().get(id)); //Reflexividade
            operationStorage.getDrumsStock().get(id).setAvailability(operationStorage.getDrumsStock().get(id).getAvailability() + acq.getProductAmount()); //Reflexividade
            break;
        }

        acq.setTotalCost(acq.getProductAmount() * acq.getProduct().getPrice());
        operationStorage.getAcquisitions().add(acq); //Reflexividade
    }

    @Override
    public void sale(int saleType) { //Sobrescrita
        Sale sale = new Sale();
        
        sale.setOpId(read.readInt("Insert OpId: "));
        sale.setProductAmount(read.readInt("Insert Product Amount: "));
        sale.setInCharge(operationStorage.getEmployees().get(getId.getEmployeeId(read.readString("Insert Employee CPF: ")))); //Reflexividade
        sale.setDate(read.readString("Insert Date: "));
        sale.setBuyer(operationStorage.getCustomers().get(getId.getCustumerId(read.readString("Insert Custumer CPF: ")))); //Reflexividade
        sale.getBuyer().setPurchaseCount(sale.getBuyer().getPurchaseCount() + sale.getProductAmount());

        int id;

        switch(saleType) {
            case 1:
                id = getId.getGuitarId(read.readString("Insert Guitar Model: "));
                sale.setProduct(operationStorage.getGuitarStock().get(id)); //Reflexividade
                operationStorage.getGuitarStock().get(id).setAvailability(operationStorage.getGuitarStock().get(id).getAvailability() - sale.getProductAmount()); //Reflexividade
                break;
            case 2:
                id = getId.getPianoId(read.readString("Insert Piano Model: "));
                sale.setProduct(operationStorage.getPianoStock().get(id)); //Reflexividade
                operationStorage.getPianoStock().get(id).setAvailability(operationStorage.getPianoStock().get(id).getAvailability() - sale.getProductAmount()); //Reflexividade
                break;
            case 3:
                id = getId.getDrumsId(read.readString("Insert Drums Model: "));
                sale.setProduct(operationStorage.getDrumsStock().get(id)); //Reflexividade
                operationStorage.getDrumsStock().get(id).setAvailability(operationStorage.getDrumsStock().get(id).getAvailability() - sale.getProductAmount()); //Reflexividade
                break;
        }
        sale.setTotalCost(sale.getProductAmount() * sale.getProduct().getPrice());
        operationStorage.getSales().add(sale); //Reflexividade
    }

    @Override
    public void showAcquisition() { //Sobrescrita
        int id;
        id = getId.getAcquisitionId(read.readInt("Insert Operation OpId: "));
        System.out.println("OpId: " + operationStorage.getAcquisitions().get(id).getOpId()); //Reflexividade
        System.out.println("Product Amount: " + operationStorage.getAcquisitions().get(id).getProductAmount()); //Reflexividade 
        System.out.println("Product Model: " + operationStorage.getAcquisitions().get(id).getProduct().getModel()); //Reflexividade
        System.out.println("Employee in Charge: " + operationStorage.getAcquisitions().get(id).getInCharge().getName()); //Reflexividade
        System.out.println("Date: " + operationStorage.getAcquisitions().get(id).getDate()); //Reflexividade
        System.out.println("Total Cost: " + operationStorage.getAcquisitions().get(id).getTotalCost()); //Reflexividade
        System.out.println("Supplyer Name: " + operationStorage.getAcquisitions().get(id).getSupplyerName()); //Reflexividade
    }

    @Override
    public void showSale() {
        int id;
        id = getId.getSaleId(read.readInt("Insert Operation OpId: "));
        System.out.println("OpId: " + operationStorage.getSales().get(id).getOpId()); //Reflexividade
        System.out.println("Product Amount: " + operationStorage.getSales().get(id).getProductAmount()); //Reflexividade
        System.out.println("Product Model: " + operationStorage.getSales().get(id).getProduct().getModel()); //Reflexividade
        System.out.println("Employee in Charge: " + operationStorage.getSales().get(id).getInCharge().getName()); //Reflexividade
        System.out.println("Date: " + operationStorage.getSales().get(id).getDate()); //Reflexividade
        System.out.println("Total Cost: " + operationStorage.getSales().get(id).getTotalCost()); //Reflexividade
        System.out.println("Buyer: " + operationStorage.getSales().get(id).getBuyer().getName()); //Reflexividade
    }

}
