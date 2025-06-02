public class Acquisition extends Operation{
    private String supplyerName;

    public Acquisition() {
        supplyerName = "";
    }

    public Acquisition(String supplyerName) { //Sobrecarga
        this.supplyerName = supplyerName;
    }

    public String getSupplyerName() {
        return supplyerName;
    }

    public void setSupplyerName(String supplyerName) {
        this.supplyerName = supplyerName;
    }
}
