public class Stock {
    int stockId;
    String stockLocation;
    Guitar guitarStock[];
    Piano pianoStock[];
    Drums drumsStock[];

    public Stock() {
        stockId = 0;
        stockLocation = "";
    }

    public Stock(int stockId, String stockLocation, Guitar[] guitarStock, Piano[] pianoStock, Drums[] drumsStock) {
        this.stockId = stockId;
        this.stockLocation = stockLocation;
        this.guitarStock = guitarStock;
        this.pianoStock = pianoStock;
        this.drumsStock = drumsStock;
    }

    public int getStockId() {
        return stockId;
    }

    public String getStockLocation() {
        return stockLocation;
    }

    public Guitar[] getGuitarStock() {
        return guitarStock;
    }

    public Piano[] getPianoStock() {
        return pianoStock;
    }

    public Drums[] getDrumsStock() {
        return drumsStock;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public void setStockLocation(String stockLocation) {
        this.stockLocation = stockLocation;
    }

    public void setGuitarStock(Guitar[] guitarStock) {
        this.guitarStock = guitarStock;
    }

    public void setPianoStock(Piano[] pianoStock) {
        this.pianoStock = pianoStock;
    }

    public void setDrumsStock(Drums[] drumsStock) {
        this.drumsStock = drumsStock;
    }
}
