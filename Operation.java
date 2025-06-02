public abstract class Operation {
    private int opId;
    private int productAmount;
    private Instrument product;
    private Employee inCharge;
    private String date;
    private float totalCost;

    public Operation() {
        opId = 0;
        productAmount = 0;
        date = "";
        totalCost = 0;
    }

    public Operation(int opId, int productAmount, Instrument product, Employee inCharge, String date, float totalCost) { //Sobrecarga
        this.opId = opId;
        this.productAmount = productAmount;
        this.product = product;
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
    
    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public void setProduct(Instrument product) {
        this.product = product;
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
