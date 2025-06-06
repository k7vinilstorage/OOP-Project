//João Alberto Benaci Torezan

public class InstrumentOperation implements InstrumentOpInterface{
    private Storage instrumentStorage;
    private Read read = Read.createRead();
    private GetArrayId getId = new GetArrayId();

    public InstrumentOperation() {
        instrumentStorage = Storage.createStorage();
    }

    public InstrumentOperation(Storage instrmStorage) { //Sobrecarga
        this.instrumentStorage = instrmStorage;
    }

    @Override
    public void addGuitar() { //Sobrescrita
        Guitar g  = new Guitar();
        g.setCategory(read.readString("Insert Category: "));
        g.setType(read.readString("Insert Type: "));
        g.setModel(read.readString("Insert Model: "));
        g.setBrand(read.readString("Insert Brand: "));
        g.setPrice(read.readFloat("Insert Price: "));
        g.setShape(read.readString("Insert Shape: "));
        try {
            g.setStringCount(read.readInt("Insert String Count: "));
        } 
        catch (StringCountException sce) {
            g = sce.sceFix(g);
        }
        instrumentStorage.getGuitarStock().add(g); //Reflexividade
    }

    @Override
    public void removeGuitar() { //Sobrescrita
        instrumentStorage.getGuitarStock().remove(getId.getGuitarId(read.readString("Insert Model: "))); 
    }

    @Override
    public void editGuitar() { //Sobrescrita
        String model = read.readString("\nInsert Model: ");
        int id = getId.getGuitarId(model);

        String data = read.readString("Insert new Type: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setType(data); //Reflexividade
        }

        data = read.readString("Insert new Model: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setModel(data); //Reflexividade
        }

        data = read.readString("Insert new Brand: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setBrand(data); //Reflexividade
        }

        float dataF = read.readFloat("Insert new Price: ");
        if(!(dataF == 0)) {
            instrumentStorage.getGuitarStock().get(id).setPrice(dataF); //Reflexividade
        }

        data = read.readString("Insert new Shape: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setShape(data); //Reflexividade
        }

        int dataI = read.readInt("Insert new String Count: ");
        if(!(dataI == 0)) {
            try {
                instrumentStorage.getGuitarStock().get(id).setStringCount(dataI); //Reflexividade
            } 
            catch (StringCountException sce) {
                instrumentStorage.getGuitarStock().set(id, sce.sceFix(instrumentStorage.getGuitarStock().get(id))); //Reflexividade
            }
        }
    }

    @Override
    public void viewGuitar() { //Sobrescrita
        int id = getId.getGuitarId(read.readString("Insert Model: "));
        System.out.println("\nGuitar: ");
        System.out.println("Category: " + instrumentStorage.getGuitarStock().get(id).getCategory()); //Reflexividade
        System.out.println("Type: " + instrumentStorage.getGuitarStock().get(id).getType()); //Reflexividade
        System.out.println("Model: " + instrumentStorage.getGuitarStock().get(id).getModel()); //Reflexividade
        System.out.println("Brand: " + instrumentStorage.getGuitarStock().get(id).getBrand()); //Reflexividade
        System.out.println("Availability: " + instrumentStorage.getGuitarStock().get(id).getAvailability()); //Reflexividade
        System.out.println("Price: " + instrumentStorage.getGuitarStock().get(id).getPrice()); //Reflexividade
        System.out.println("Shape: " + instrumentStorage.getGuitarStock().get(id).getShape()); //Reflexividade
        System.out.println("String Count: " + instrumentStorage.getGuitarStock().get(id).getStringCount()); //Reflexividade
    }

    @Override
    public void addPiano() { //Sobrescrita
        Piano p = new Piano();
        p.setCategory(read.readString("Insert Category: "));
        p.setType(read.readString("Insert Type: "));
        p.setModel(read.readString("Insert Model: "));
        p.setBrand(read.readString("Insert Brand: "));
        p.setPrice(read.readFloat("Insert Price: "));
        p.setBodyType(read.readString("Insert Body Type: "));
        try {
            p.setKeyCount(read.readInt("Insert Key Count: "));
        } 
        catch (KeyCountException kce) {
            p = kce.kceFix(p);
        }
        
        instrumentStorage.getPianoStock().add(p); //Reflexividade
    }

    @Override
    public void removePiano() { //Sobrescrita
        instrumentStorage.getGuitarStock().remove(getId.getPianoId(read.readString("Insert Model: ")));
    }

    @Override
    public void editPiano() { //Sobrescrita
        String model = read.readString("\nInsert Model: ");
        int id = getId.getPianoId(model);

        String data = read.readString("Insert new Type: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setType(data); //Reflexividade
        }

        data = read.readString("Insert new Model: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setModel(data); //Reflexividade
        }

        data = read.readString("Insert new Brand: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setBrand(data); //Reflexividade
        }

        float dataF = read.readFloat("Insert new Price: ");
        if(!(dataF == 0)) {
            instrumentStorage.getPianoStock().get(id).setPrice(dataF); //Reflexividade
        }

        data = read.readString("Insert new Body Type: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setBodyType(data); //Reflexividade
        }

        int dataI = read.readInt("Insert new key Count: ");
        if(!(dataI == 0)) {
            try {
                instrumentStorage.getPianoStock().get(id).setKeyCount(dataI); //Reflexividade
            } 
            catch (KeyCountException kce) {
                instrumentStorage.getPianoStock().set(id, kce.kceFix(instrumentStorage.getPianoStock().get(id))); //Reflexividade
            }
        }
    }

    @Override
    public void viewPiano() { //Sobrescrita
        int id = getId.getPianoId(read.readString("Insert Model: "));
        System.out.println("\nPiano: ");
        System.out.println("Category: " + instrumentStorage.getPianoStock().get(id).getCategory()); //Reflexividade
        System.out.println("Type: " + instrumentStorage.getPianoStock().get(id).getType()); //Reflexividade
        System.out.println("Model: " + instrumentStorage.getPianoStock().get(id).getModel()); //Reflexividade
        System.out.println("Brand: " + instrumentStorage.getPianoStock().get(id).getBrand()); //Reflexividade
        System.out.println("Availability: " + instrumentStorage.getPianoStock().get(id).getAvailability()); //Reflexividade
        System.out.println("Price: " + instrumentStorage.getPianoStock().get(id).getPrice()); //Reflexividade
        System.out.println("Body Type: " + instrumentStorage.getPianoStock().get(id).getBodyType()); //Reflexividade
        System.out.println("Key Count: " + instrumentStorage.getPianoStock().get(id).getKeyCount()); //Reflexividade
    }

    @Override
    public void addDrums() { //Sobrescrita
        Drums d = new Drums();
        d.setCategory(read.readString("Insert Category: "));
        d.setType(read.readString("Insert Type: "));
        d.setModel(read.readString("Insert Model: "));
        d.setBrand(read.readString("Insert Brand: "));
        d.setPrice(read.readFloat("Insert Price: "));
        d.setPiecesCount(read.readInt("Insert Pieces Count: "));
        try {
            d.setShellMaterial(read.readString("Insert Shell Material: "));
        } 
        catch (ShellMaterialException sme) {
            d = sme.smeFix(d);
        }
        instrumentStorage.getDrumsStock().add(d); //Reflexividade
    }

    @Override
    public void removeDrums() { //Sobrescrita
         instrumentStorage.getGuitarStock().remove(getId.getDrumsId(read.readString("Insert Model: ")));
    }

    @Override
    public void editDrums() { //Sobrescrita
        String model = read.readString("\nInsert Model: ");
        int id = getId.getDrumsId(model);

        String data = read.readString("Insert new Type: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setType(data); //Reflexividade
        }

        data = read.readString("Insert new Model: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setModel(data); //Reflexividade
        }

        data = read.readString("Insert new Brand: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setBrand(data); //Reflexividade
        }

        float dataF = read.readFloat("Insert new Price: ");
        if(!(dataF == 0)) {
            instrumentStorage.getDrumsStock().get(id).setPrice(dataF); //Reflexividade
        }

        int dataI = read.readInt("Insert new Pieces Count: ");
        if(!(dataI == 0)) {
            instrumentStorage.getDrumsStock().get(id).setPiecesCount(dataI); //Reflexividade
        }

        data = read.readString("Insert new Shell Material: ");
        if(!data.equals("")) {
            try {
                instrumentStorage.getDrumsStock().get(id).setShellMaterial(data); //Reflexividade
            } 
            catch (ShellMaterialException sme) {
                instrumentStorage.getDrumsStock().set(id, sme.smeFix(instrumentStorage.getDrumsStock().get(id))); //Reflexividade
            }
        }
    }

    @Override
    public void viewDrums() { //Sobrescrita
        int id = getId.getDrumsId(read.readString("Insert Model: "));
        System.out.println("\nDrums: ");
        System.out.println("Category: " + instrumentStorage.getDrumsStock().get(id).getCategory()); //Reflexividade
        System.out.println("Type: " + instrumentStorage.getDrumsStock().get(id).getType()); //Reflexividade
        System.out.println("Model: " + instrumentStorage.getDrumsStock().get(id).getModel()); //Reflexividade
        System.out.println("Brand: " + instrumentStorage.getDrumsStock().get(id).getBrand()); //Reflexividade
        System.out.println("Availability: " + instrumentStorage.getDrumsStock().get(id).getAvailability()); //Reflexividade
        System.out.println("Price: " + instrumentStorage.getDrumsStock().get(id).getPrice()); //Reflexividade
        System.out.println("Shell Material: " + instrumentStorage.getDrumsStock().get(id).getShellMaterial()); //Reflexividade
        System.out.println("Pieces Count: " + instrumentStorage.getDrumsStock().get(id).getPiecesCount()); //Reflexividade
    }

}
