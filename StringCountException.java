//João Alberto Benaci Torezan

public class StringCountException extends Exception{

    private Read read = Read.createRead();

    public StringCountException() {}
    
    public Guitar sceFix(Guitar exp) {
        System.out.println("String count must be within 6 - 18");
        try {
            exp.setStringCount(read.readInt("Insert String Count: "));    
        } 
        catch (StringCountException sce) {
            exp = sceFix(exp);
        }
        return exp;
    }

}
