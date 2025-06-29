//João Alberto Benaci Torezan

public class Customer extends Person{
    private int purchaseCount;
    private String lastPurchaseDate;

    public Customer() {
        purchaseCount = 0;
        lastPurchaseDate = "";
    }

    public Customer(int purchaseCount, String lastPurchaseDate) { //Sobrecarga
        this.purchaseCount = purchaseCount;
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
    
    public String getlastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setlastPurchaseDate(String lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }
}
