public class Main {
    public static void main(String[] args) {
        Read read = Read.createRead();

        PeopleMenu people = new PeopleMenu();
        InstrumentMenu instrument = new InstrumentMenu();
        OperationMenu operation = new OperationMenu();

        int op = 10;

        while(op != 0) {

            System.out.println("\n\n## --Guitar Store-- ##");
            System.out.println("## 1- Operation     ##");
            System.out.println("## 2- Instruments   ##");
            System.out.println("## 3- People        ##");
            System.out.println("## 0- Exit          ##\n");
            
            op = read.readInt("Choose an option: ");
            

            switch(op) {
                case 1:
                    operation.menu();
                    break;
                case 2:
                    instrument.menu();
                    break;
                case 3:
                    people.menu();
                    break;
            }
        }
    }
}
