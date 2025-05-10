

public class Main {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Guitar g1 = new Guitar();
        Drums d1 = new Drums();

        p1.setCategory("String");
        p1.setType("Acoustic");
        p1.setModel("P01");
        p1.setBrand("Yamaha");
        p1.setPrice((float)3576.78);
        p1.setBodyType("Grand Piano");
        p1.setKeyCount(81);
        
        System.out.println("\n\nPiano: \n");
        System.out.println(p1.getCategory());
        System.out.println(p1.getType());
        System.out.println(p1.getModel());
        System.out.println(p1.getBrand());
        System.out.println(p1.getPrice());
        System.out.println(p1.getBodyType());
        System.out.println(p1.getKeyCount());

    
        g1.setCategory("String");
        g1.setType("Eletric");
        g1.setModel("G01");
        g1.setBrand("Gibson");
        g1.setPrice((float)3576.78);
        g1.setShape("Les Paul");
        g1.setStringCount(6);
        
        System.out.println("\n\nGuitar: \n");
        System.out.println(g1.getCategory());
        System.out.println(g1.getType());
        System.out.println(g1.getModel());
        System.out.println(g1.getBrand());
        System.out.println(g1.getPrice());
        System.out.println(g1.getShape());
        System.out.println(g1.getStringCount());


        d1.setCategory("Percusion");
        d1.setType("Acoustic");
        d1.setModel("D01");
        d1.setBrand("Pearl");
        d1.setPrice((float)3576.78);
        d1.setShellMaterial("Maple");
        d1.setPiecesCount(5);

        System.out.println("\n\nDrums: \n");
        System.out.println(d1.getCategory());
        System.out.println(d1.getType());
        System.out.println(d1.getModel());
        System.out.println(d1.getBrand());
        System.out.println(d1.getPrice());
        System.out.println(d1.getShellMaterial());
        System.out.println(d1.getPiecesCount());
    }
}
