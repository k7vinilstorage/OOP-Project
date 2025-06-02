public class PeopleMenu implements Tui{

    private Read read = Read.createRead();
    private PeopleOperation operation = new PeopleOperation();

    public PeopleMenu() {}

    @Override
    public void menu() {
        int op = 10;

        while(op != 0) {

            System.out.println("\n\n## --People Menu--  ##");
            System.out.println("## 1- Add Custumer      ##");
            System.out.println("## 2- Remove Custumer   ##");
            System.out.println("## 3- Edit Custumer     ##");
            System.out.println("## 4- Display Custumer  ##");
            System.out.println("## 5- Add Employee      ##");
            System.out.println("## 6- Remove Employee   ##");
            System.out.println("## 7- Edit Employee     ##");
            System.out.println("## 8- Display Employee  ##");
            System.out.println("## 0- Exit              ##\n");

            
            op = read.readInt("Choose an option: ");
            
            switch(op) {
                case 1:
                    operation.addCustumer();
                    break;
                case 2:
                    operation.removeCustumer();
                    break;
                case 3:
                    operation.editCustumer();
                    break;
                case 4:
                    operation.viewCustumer();
                    break;
                case 5:
                    operation.addEmployee();
                    break;
                case 6:
                    operation.removeEmployee();
                    break;
                case 7:
                    operation.editEmployee();
                    break;
                case 8:
                    operation.viewEmployee();
                    break;
            }
        }
    }
}
