//João Alberto Benaci Torezan

public abstract class Operation {
    private int opId;
    private int productAmount;
    private Instrument product;
    private String productType;
    private Employee inCharge;
    private String date;
    private float totalCost;

    public Operation() {
        opId = 0;
        productAmount = 0;
        productType = "";
        date = "";
        totalCost = 0;
    }

    public Operation(int opId, int productAmount, Instrument product, String productType, Employee inCharge, String date, float totalCost) { //Sobrecarga
        this.opId = opId;
        this.productAmount = productAmount;
        this.product = product;
        this.productType = productType;
        this.inCharge = inCharge;
        this.date = date;
        this.totalCost = totalCost;
    }

    public int getOpId() {
        return opId;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public Instrument getProduct() {
        return product;
    }
    
    public String getProductType() {
        return productType;
    }

    public Employee getInCharge() {
        return inCharge;
    }

    public String getDate() {
        return date;
    }
    public float getTotalCost() {
        return totalCost;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }
    
    public void setProductAmount(int productAmount) throws NegativeNumberException{
        if(productAmount > 0) {
            this.productAmount = productAmount;
        }
        else {
            throw new NegativeNumberException("Product amount");
        }
    }

    public void setProduct(Instrument product) {
        this.product = product;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setInCharge(Employee inCharge) {
        this.inCharge = inCharge;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}
