
public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock();
        OperationLog log1 = new OperationLog();
        Employee e1 = new Employee();
        Customer c1 = new Customer();
        log1.getSales().add(new Sale());
        log1.getAcquisitions().add(new Acquisition());

        e1.setName("Jomar");
        e1.setId(1);
        e1.setCpf("1234567");
        e1.setPhone("12345");
        e1.setRole("Gerente");
        
        c1.setName("Euclides");
        c1.setId(2);
        c1.setCpf("876543");
        c1.setPhone("09876");
        c1.setPurchaseCount(1);

        stock1.getGuitarStock().add(new Guitar());
        stock1.getPianoStock().add(new Piano());
        stock1.getDrumsStock().add(new Drums());

        stock1.getGuitarStock().get(0).setCategory("String");
        stock1.getGuitarStock().get(0).setType("Eletric");
        stock1.getGuitarStock().get(0).setModel("LesPaul Studio");
        stock1.getGuitarStock().get(0).setBrand("Gibson");
        stock1.getGuitarStock().get(0).setAvailability(3);
        stock1.getGuitarStock().get(0).setPrice((float)2500.00);
        stock1.getGuitarStock().get(0).setShape("LesPaul");
        stock1.getGuitarStock().get(0).setStringCount(6);

        stock1.getPianoStock().get(0).setCategory("String");
        stock1.getPianoStock().get(0).setType("Acoustic");
        stock1.getPianoStock().get(0).setModel("P2000");
        stock1.getPianoStock().get(0).setBrand("Yamaha");
        stock1.getPianoStock().get(0).setAvailability(2);
        stock1.getPianoStock().get(0).setPrice((float)22500.00);
        stock1.getPianoStock().get(0).setBodyType("Grand Piano");
        stock1.getPianoStock().get(0).setKeyCount(88);
        
        stock1.getDrumsStock().get(0).setCategory("Percusion");
        stock1.getDrumsStock().get(0).setType("Acoustic");
        stock1.getDrumsStock().get(0).setModel("D46738");
        stock1.getDrumsStock().get(0).setBrand("Pearl");
        stock1.getDrumsStock().get(0).setAvailability(1);
        stock1.getDrumsStock().get(0).setPrice((float)5500.00);
        stock1.getDrumsStock().get(0).setShellMaterial("Maple");
        stock1.getDrumsStock().get(0).setPiecesCount(7);

        log1.getAcquisitions().get(0).setOpId(1);
        log1.getAcquisitions().get(0).setProductAmount(1);
        log1.getAcquisitions().get(0).setProduct(stock1.getGuitarStock().get(0));
        log1.getAcquisitions().get(0).setInCharge(e1);
        log1.getAcquisitions().get(0).setDate("02/09/1500");
        log1.getAcquisitions().get(0).setTotalCost((float)2500.00);
        log1.getAcquisitions().get(0).setSupplyerName("Gibson");

        log1.getSales().get(0).setOpId(2);
        log1.getSales().get(0).setProductAmount(1);
        log1.getSales().get(0).setProduct(stock1.getGuitarStock().get(0));
        log1.getSales().get(0).setInCharge(e1);
        log1.getSales().get(0).setDate("02/09/1500");
        log1.getSales().get(0).setTotalCost((float)2500.00);
        log1.getSales().get(0).setBuyer(c1);
    }
}
