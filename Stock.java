import java.util.ArrayList;

public class Stock {
    ArrayList<Guitar> guitarStock;
    ArrayList<Piano> pianoStock;
    ArrayList<Drums> drumsStock;

    public Stock() {
        guitarStock = new ArrayList<>();
        pianoStock = new ArrayList<>();
        drumsStock = new ArrayList<>();
    }

    public Stock(ArrayList<Guitar> guitarStock, ArrayList<Piano> pianoStock, ArrayList<Drums> drumsStock) {
        this.guitarStock = guitarStock;
        this.pianoStock = pianoStock;
        this.drumsStock = drumsStock;
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
}
