public class OperationMenu implements Tui{
    private Read read = Read.createRead();
    private OperationExec operation = new OperationExec();

    private int opType;

    public OperationMenu() {}

    @Override
    public void menu() {
        int op = 10;

        while(op != 0) {

            System.out.println("\n\n##     --Operation Menu--     ##");
            System.out.println("## 1- Acquisition                 ##");
            System.out.println("## 2- Sale                        ##");
            System.out.println("## 3- Display Acquisition         ##");
            System.out.println("## 4- Display Sale                ##");
            System.out.println("## 0- Exit                ##\n");

            
            op = read.readInt("Choose an option: ");
            
            switch(op) {
                case 1:
                    System.out.println("## 1- Guitar ##");
                    System.out.println("## 2- Piano  ##");
                    System.out.println("## 3- Drums  ##");

                    opType = read.readInt("Choose an option: ");

                    operation.acquisition(opType);
                    break;
                case 2:
                    System.out.println("## 1- Guitar ##");
                    System.out.println("## 2- Piano  ##");
                    System.out.println("## 3- Drums  ##");

                    opType = read.readInt("Choose an option: ");

                    operation.sale(opType);
                    break;
                case 3:
                    operation.showAcquisition();
                    break;
                case 4:
                    operation.showSale();
                    break;
            }
        }
    }
}
