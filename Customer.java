//João Alberto Benaci Torezan

public class Customer extends Person{
    private int purchaseCount;

    public Customer() {
        purchaseCount = 0;
    }

    public Customer(int purchaseCount) { //Sobrecarga
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
}
