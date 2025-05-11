import java.util.ArrayList;

public class OperationLog {
    private ArrayList<Sale> sales;
    private ArrayList<Acquisition> acquisitions;

    public OperationLog() {
        sales = new ArrayList<>();
        acquisitions = new ArrayList<>();
    }

    public OperationLog(ArrayList<Sale> sales, ArrayList<Acquisition> acquisitions) {
        this.sales = sales;
        this.acquisitions = acquisitions;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public ArrayList<Acquisition> getAcquisitions() {
        return acquisitions;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }
    
    public void setAcquisitions(ArrayList<Acquisition> acquisitions) {
        this.acquisitions = acquisitions;
    }
}
