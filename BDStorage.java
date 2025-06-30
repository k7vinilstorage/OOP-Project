//João Alberto Benaci Torezan

import java.util.ArrayList;

public class BDStorage {

    private GetArrayId garrid = GetArrayId.createGetArrayId();
    
    private static BDStorage SingleStorage;

    private ArrayList<Guitar> guitarStock;
    private ArrayList<Piano> pianoStock;
    private ArrayList<Drums> drumsStock;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers;
    private ArrayList<Sale> sales;
    private ArrayList<Acquisition> acquisitions;
    
    private int saleIds;
    private int acquisitionIds;
    private int customerIds;
    private int employeeIds;
    
    private BDStorage() {
        guitarStock = new ArrayList<>();
        pianoStock = new ArrayList<>();
        drumsStock = new ArrayList<>();
        employees = new ArrayList<>();
        customers = new ArrayList<>();
        sales = new ArrayList<>();
        acquisitions = new ArrayList<>();
        
        saleIds = 0;
        acquisitionIds = 0;
        customerIds = 0;
        employeeIds = 0;
    }

    //MÉTODO SINGLETON
    
    public static BDStorage createStorage() {
        if(SingleStorage == null) {
            SingleStorage = new BDStorage();
        }
        return SingleStorage;
    }
    
    public int getSaleIds() {
        return saleIds;
    }
    
    public int getAcquisitionIds() {
        return acquisitionIds;
    }
    
    public int getCustumerIds() {
        return customerIds;
    }
    
    public int getEmployeeIds() {
        return employeeIds;
    }
    
    public void setSaleIds(int saleIds) {
        this.saleIds = saleIds;
    }
    
    public void setAcquisitionIds(int acquisitionIds) {
        this.acquisitionIds = acquisitionIds;
    }
    
    public void setCustumerIds(int custumerIds) {
        this.customerIds = custumerIds;
    }
    
    public void setEmployeeIds(int employeeIds) {
        this.employeeIds = employeeIds;
    }

    public ArrayList<Guitar> getGuitarStock() {
        return guitarStock;
    }

    public ArrayList<Piano> getPianoStock() {
        return pianoStock;
    }
    public ArrayList<Drums> getDrumsStock() {
        return drumsStock;
    }

    public void setGuitarStock(ArrayList<Guitar> guitarStock) {
        this.guitarStock = guitarStock;
    }

    public void setPianoStock(ArrayList<Piano> pianoStock) {
        this.pianoStock = pianoStock;
    }

    public void setDrumsStock(ArrayList<Drums> drumsStock) {
        this.drumsStock = drumsStock;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
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
