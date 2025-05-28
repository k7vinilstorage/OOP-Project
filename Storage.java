import java.util.ArrayList;

public class Storage {

    private static Storage SingleStorage;

    private ArrayList<Guitar> guitarStock;
    private ArrayList<Piano> pianoStock;
    private ArrayList<Drums> drumsStock;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers;
    private ArrayList<Sale> sales;
    private ArrayList<Acquisition> acquisitions;

    private Storage() {
        guitarStock = new ArrayList<Guitar>();
        pianoStock = new ArrayList<Piano>();
        drumsStock = new ArrayList<Drums>();
        employees = new ArrayList<Employee>();
        customers = new ArrayList<Customer>();
        sales = new ArrayList<Sale>();
        acquisitions = new ArrayList<Acquisition>();
    }

    private Storage(ArrayList<Guitar> guitarStock, ArrayList<Piano> pianoStock, ArrayList<Drums> drumsStock, ArrayList<Employee> employees, ArrayList<Customer> customers, ArrayList<Sale> sales, ArrayList<Acquisition> acquisitions) {
        this.guitarStock = guitarStock;
        this.pianoStock = pianoStock;
        this.drumsStock = drumsStock;
        this.employees = employees;
        this.customers = customers;
        this.sales = sales;
        this.acquisitions = acquisitions;
    }

    public static Storage createStorage() {
        if(SingleStorage == null) {
            SingleStorage = new Storage();
        }

        return SingleStorage;
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
