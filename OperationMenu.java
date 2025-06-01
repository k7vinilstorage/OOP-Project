public class OperationMenu {
    private Read read = Read.createRead();
    private OperationExec operation = new OperationExec();

    private int opType;

    public OperationMenu() {}

    public void menu() {
        int op = 10;

        while(op != 0) {

            System.out.println("\n\n## --Operation Menu-- ##");
            System.out.println("## 1- Acquisition         ##");
            System.out.println("## 2- Sale                ##");
            System.out.println("## 3- Acquisition         ##");
            System.out.println("## 4- Sale                ##");
            System.out.println("## 0- Exit                ##\n");

            
            op = Integer.parseInt(read.readData("Choose an option: "));
            
            switch(op) {
                case 1:
                    System.out.println("## 1- Guitar ##");
                    System.out.println("## 2- Piano  ##");
                    System.out.println("## 3- Drums  ##");

                    opType = Integer.parseInt(read.readData("Choose an option: "));

                    operation.acquisition(opType);
                    break;
                case 2:
                    System.out.println("## 1- Guitar ##");
                    System.out.println("## 2- Piano  ##");
                    System.out.println("## 3- Drums  ##");

                    opType = Integer.parseInt(read.readData("Choose an option: "));

                    operation.sale(opType);
                    break;
            }
        }
    }
}
