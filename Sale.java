public class Sale {
    private int saleId;
    private Instrument product;
    private Employee seller;
    private Customer buyer;

    public Sale() {
        saleId = 0;
    }

    public Sale(int saleId, Instrument product, Employee seller, Customer buyer) {
        this.saleId = saleId;
        this.product = product;
        this.seller = seller;
        this.buyer = buyer;
    }

    public int getSaleId() {
        return saleId;
    }

    public Instrument getProduct() {
        return product;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public Employee getSeller() {
        return seller;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }
    
    public void setProduct(Instrument product) {
        this.product = product;
    }
    
    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }
    
    public void setSeller(Employee seller) {
        this.seller = seller;
    }
}
