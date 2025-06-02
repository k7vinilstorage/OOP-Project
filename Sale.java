public class Sale extends Operation{
   private Customer buyer;

    public Sale() {}

    public Sale(Customer buyer) { //Sobrecarga
        this.buyer = buyer;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }
}
