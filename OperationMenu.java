public class OperationMenu {
    private Read read = Read.createRead();
    private OperationExec operation = new OperationExec();

    public OperationMenu() {}

    public void menu() {
        int op = 10;

        while(op != 0) {

            System.out.println("\n\n## --Operation Menu-- ##");
            System.out.println("## 1- Acquisition         ##");
            System.out.println("## 2- Sale                ##");
            System.out.println("## 0- Exit                ##\n");

            
            op = Integer.parseInt(read.readData("Choose an option: "));
            
            switch(op) {
                case 1:
                    operation.acquisition();
                    break;
                case 2:
                    operation.sale();
                    break;
            }
        }
    }
}
