public class InstrumentMenu implements Tui{
    private Read read = Read.createRead();
    private InstrumentOperation operation = new InstrumentOperation();

    public InstrumentMenu() {}

    @Override
    public void menu() { //Sobrescrita
        int op = 15;

        while(op != 0) {

            System.out.println("\n\n## --Instrument Menu-- ##");
            System.out.println("## 1- Add Guitar           ##");
            System.out.println("## 2- Remove Guitar        ##");
            System.out.println("## 3- Edit Guitar          ##");
            System.out.println("## 4- Display Guitar       ##");
            System.out.println("## 5- Add Piano            ##");
            System.out.println("## 6- Remove Piano         ##");
            System.out.println("## 7- Edit Piano           ##");
            System.out.println("## 8- Display Piano        ##");
            System.out.println("## 9- Add Drums            ##");
            System.out.println("## 10- Remove Drums        ##");
            System.out.println("## 11- Edit Drums          ##");
            System.out.println("## 12- Display Drums       ##");
            System.out.println("## 0- Exit                 ##\n");

            
            op = read.readInt("Choose an option: ");
            
            switch(op) {
                case 1:
                    operation.addGuitar();
                    break;
                case 2:
                    operation.removeGuitar();
                    break;
                case 3:
                    operation.editGuitar();
                    break;
                case 4:
                    operation.viewGuitar();
                    break;
                case 5:
                    operation.addPiano();
                    break;
                case 6:
                    operation.removePiano();
                    break;
                case 7:
                    operation.editPiano();
                    break;
                case 8:
                    operation.viewPiano();
                    break;
                case 9:
                    operation.addDrums();
                    break;
                case 10:
                    operation.removeDrums();
                    break;
                case 11:
                    operation.editDrums();
                    break;
                case 12:
                    operation.viewDrums();
                    break;
            }
        }
    }
}
