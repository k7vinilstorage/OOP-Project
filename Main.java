public class Main {
    public static void main(String[] args) {
        Read read = Read.createRead();

        int op = 10;

        while(op != 0) {

            System.out.println("## --Guitar Store-- ##");
            System.out.println("## 1- Operation     ##");
            System.out.println("## 2- Instruments   ##");
            System.out.println("## 3- People        ##");
            System.out.println("## 0- Exit          ##\n");
            op = Integer.parseInt(read.readData("Esolha uma opção: "));
            

            switch(op) {
                case 1:
                    //entar no menu de operações
                    break;
                case 2:
                 //entar no menu de instrumentos
                    break;
                case 3:
                 //entar no menu de pessoas
                    break;
            }
        }
    }
}
