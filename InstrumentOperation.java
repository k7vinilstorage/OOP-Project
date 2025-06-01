public class InstrumentOperation {
    private Storage instrumentStorage;
    private Read read = Read.createRead();
    private GetArrayId getId = new GetArrayId();

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
        try {
            g.setStringCount(Integer.parseInt(read.readData("Insert String Count: ")));
        } 
        catch (StringCountException sce) {

        }
        instrumentStorage.getGuitarStock().add(g);
    }

    public void removeGuitar() {
        instrumentStorage.getGuitarStock().remove(getId.getGuitarId(read.readData("Insert Model: ")));
    }

    public void editGuitar() {
        String model = read.readData("\nInsert Model: ");
        int id = getId.getGuitarId(model);

        String data = read.readData("Insert new Type: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setType(data);
        }

        data = read.readData("Insert new Model: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setModel(data);
        }

        data = read.readData("Insert new Brand: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setBrand(data);
        }

        data = read.readData("Insert new Price: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setPrice(Float.parseFloat(data));
        }

        data = read.readData("Insert new Shape: ");
        if(!data.equals("")) {
            instrumentStorage.getGuitarStock().get(id).setShape(data);
        }

        data = read.readData("Insert new String Count: ");
        if(!data.equals("")) {
            try {
                instrumentStorage.getGuitarStock().get(id).setStringCount(Integer.parseInt(data));
            } 
            catch (StringCountException sce) {
                
            }
        }
    }

    public void viewGuitar() {
        int id = getId.getGuitarId(read.readData("Insert Model: "));
        System.out.println("\nGuitar: ");
        System.out.println("Category: " + instrumentStorage.getGuitarStock().get(id).getCategory());
        System.out.println("Type: " + instrumentStorage.getGuitarStock().get(id).getType());
        System.out.println("Model: " + instrumentStorage.getGuitarStock().get(id).getModel());
        System.out.println("Brand: " + instrumentStorage.getGuitarStock().get(id).getBrand());
        System.out.println("Availability: " + instrumentStorage.getGuitarStock().get(id).getAvailability());
        System.out.println("Price: " + instrumentStorage.getGuitarStock().get(id).getPrice());
        System.out.println("Shape: " + instrumentStorage.getGuitarStock().get(id).getShape());
        System.out.println("String Count: " + instrumentStorage.getGuitarStock().get(id).getStringCount());
    }

    public void addPiano() {
        Piano p = new Piano();
        p.setCategory(read.readData("Insert Category: "));
        p.setType(read.readData("Insert Type: "));
        p.setModel(read.readData("Insert Model: "));
        p.setBrand(read.readData("Insert Brand: "));
        p.setPrice(Float.parseFloat(read.readData("Insert Price: ")));
        p.setBodyType(read.readData("Insert Body Type: "));
        try {
            p.setKeyCount(Integer.parseInt(read.readData("Insert Key Count: ")));
        } 
        catch (KeyCountException kce) {
            
        }
        
        instrumentStorage.getPianoStock().add(p);
    }

    public void removePiano() {
        instrumentStorage.getGuitarStock().remove(getId.getPianoId(read.readData("Insert Model: ")));
    }

    public void editPiano() {
        String model = read.readData("\nInsert Model: ");
        int id = getId.getPianoId(model);

        String data = read.readData("Insert new Type: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setType(data);
        }

        data = read.readData("Insert new Model: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setModel(data);
        }

        data = read.readData("Insert new Brand: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setBrand(data);
        }

        data = read.readData("Insert new Price: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setPrice(Float.parseFloat(data));
        }

        data = read.readData("Insert new Body Type: ");
        if(!data.equals("")) {
            instrumentStorage.getPianoStock().get(id).setBodyType(data);
        }

        data = read.readData("Insert new String Count: ");
        if(!data.equals("")) {
            try {
                instrumentStorage.getPianoStock().get(id).setKeyCount(Integer.parseInt(data));
            } 
            catch (KeyCountException kce) {

            }
        }
    }

    public void viewPiano() {
        int id = getId.getPianoId(read.readData("Insert Model: "));
        System.out.println("\nPiano: ");
        System.out.println("Category: " + instrumentStorage.getPianoStock().get(id).getCategory());
        System.out.println("Type: " + instrumentStorage.getPianoStock().get(id).getType());
        System.out.println("Model: " + instrumentStorage.getPianoStock().get(id).getModel());
        System.out.println("Brand: " + instrumentStorage.getPianoStock().get(id).getBrand());
        System.out.println("Availability: " + instrumentStorage.getPianoStock().get(id).getAvailability());
        System.out.println("Price: " + instrumentStorage.getPianoStock().get(id).getPrice());
        System.out.println("Body Type: " + instrumentStorage.getPianoStock().get(id).getBodyType());
        System.out.println("Key Count: " + instrumentStorage.getPianoStock().get(id).getKeyCount());
    }

    public void addDrums() {
        Drums d = new Drums();
        d.setCategory(read.readData("Insert Category: "));
        d.setType(read.readData("Insert Type: "));
        d.setModel(read.readData("Insert Model: "));
        d.setBrand(read.readData("Insert Brand: "));
        d.setPrice(Float.parseFloat(read.readData("Insert Price: ")));
        d.setPiecesCount(Integer.parseInt(read.readData("Insert Pieces Count: ")));
        try {
            d.setShellMaterial(read.readData("Insert Shell Material: "));
        } 
        catch (ShellMaterialException sme) {
            
        }
        instrumentStorage.getDrumsStock().add(d);
    }

    public void removeDrums() {
         instrumentStorage.getGuitarStock().remove(getId.getDrumsId(read.readData("Insert Model: ")));
    }

    public void editDrums() {
        String model = read.readData("\nInsert Model: ");
        int id = getId.getDrumsId(model);

        String data = read.readData("Insert new Type: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setType(data);
        }

        data = read.readData("Insert new Model: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setModel(data);
        }

        data = read.readData("Insert new Brand: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setBrand(data);
        }

        data = read.readData("Insert new Price: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setPrice(Float.parseFloat(data));
        }

        data = read.readData("Insert new Shell Material: ");
        if(!data.equals("")) {
            try {
                instrumentStorage.getDrumsStock().get(id).setShellMaterial(data); 
            } 
            catch (ShellMaterialException sme) {

            }
        }

        data = read.readData("Insert new String Count: ");
        if(!data.equals("")) {
            instrumentStorage.getDrumsStock().get(id).setPiecesCount(Integer.parseInt(data));
        }
    }

    public void viewDrums() {
        int id = getId.getDrumsId(read.readData("Insert Model: "));
        System.out.println("\nDrums: ");
        System.out.println("Category: " + instrumentStorage.getDrumsStock().get(id).getCategory());
        System.out.println("Type: " + instrumentStorage.getDrumsStock().get(id).getType());
        System.out.println("Model: " + instrumentStorage.getDrumsStock().get(id).getModel());
        System.out.println("Brand: " + instrumentStorage.getDrumsStock().get(id).getBrand());
        System.out.println("Availability: " + instrumentStorage.getDrumsStock().get(id).getAvailability());
        System.out.println("Price: " + instrumentStorage.getDrumsStock().get(id).getPrice());
        System.out.println("Shell Material: " + instrumentStorage.getDrumsStock().get(id).getShellMaterial());
        System.out.println("Pieces Count: " + instrumentStorage.getDrumsStock().get(id).getPiecesCount());
    }

}
