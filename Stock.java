public class Stock {
    Guitar guitarStock[];
    Piano pianoStock[];
    Drums drumsStock[];

    public Stock() {

    }

    public Stock(int stockId, String stockLocation, Guitar[] guitarStock, Piano[] pianoStock, Drums[] drumsStock) {
        this.guitarStock = guitarStock;
        this.pianoStock = pianoStock;
        this.drumsStock = drumsStock;
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
