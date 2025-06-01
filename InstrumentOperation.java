public class InstrumentOperation {
    private Storage instrumentStorage;
    private Read read = Read.createRead();
    private GetIdByCPF getId = new GetIdByCPF();

    public InstrumentOperation() {
        instrumentStorage = Storage.createStorage();
    }

    public InstrumentOperation(Storage instrmStorage) {
        this.instrumentStorage = instrmStorage;
    }

    public void addGuitar() {
        Guitar g  = new Guitar();
        g.setCategory(read.readData("Insert Category: "));
        g.setType(read.readData("Insert Type: "));
        g.setModel(read.readData("Insert Model: "));
        g.setBrand(read.readData("Insert Brand: "));
        g.setPrice(Float.parseFloat(read.readData("Insert Price: ")));
        g.setShape(read.readData("Insert Shape: "));
        g.setStringCount(Integer.parseInt(read.readData("Insert String Count: ")));
        instrumentStorage.getGuitarStock().add(g);
    }

    public void removeGuitar() {
        instrumentStorage.getGuitarStock().remove(getId.getGuitarId(read.readData("Insert Model: ")));
    }

    public void editGuitar() {
        
    }

    public void viewGuitar() {
        
    }

    public void addPiano() {
        Piano p = new Piano();
        p.setCategory(read.readData("Insert Category: "));
        p.setType(read.readData("Insert Type: "));
        p.setModel(read.readData("Insert Model: "));
        p.setBrand(read.readData("Insert Brand: "));
        p.setPrice(Float.parseFloat(read.readData("Insert Price: ")));
        p.setBodyType(read.readData("Insert Body Type: "));
        p.setKeyCount(Integer.parseInt(read.readData("Insert Key Count: ")));
        instrumentStorage.getPianoStock().add(p);
    }

    public void removePiano() {
        instrumentStorage.getGuitarStock().remove(getId.getPianoId(read.readData("Insert Model: ")));
    }

    public void editPiano() {
        
    }

    public void viewPiano() {
        
    }

    public void addDrums() {
        Drums d = new Drums();
        d.setCategory(read.readData("Insert Category: "));
        d.setType(read.readData("Insert Type: "));
        d.setModel(read.readData("Insert Model: "));
        d.setBrand(read.readData("Insert Brand: "));
        d.setPrice(Float.parseFloat(read.readData("Insert Price: ")));
        d.setShellMaterial(read.readData("Insert Shell Material: "));
        d.setPiecesCount(Integer.parseInt(read.readData("Insert Pieces Count: ")));
        instrumentStorage.getDrumsStock().add(d);
    }

    public void removeDrums() {
         instrumentStorage.getGuitarStock().remove(getId.getDrumstId(read.readData("Insert Model: ")));
    }

    public void editDrums() {
        
    }

    public void viewDrums() {
        
    }

}
