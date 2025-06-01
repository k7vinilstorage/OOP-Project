public class KeyCountException extends Exception{
    
    private Read read = Read.createRead();

    public KeyCountException() {}

    public Piano kceFix(Piano exp) {
        System.out.println("Key count must be within 19 - 108"); 
        try {
            exp.setKeyCount(Integer.parseInt(read.readData("Insert Key Count: ")));
        } 
        catch (KeyCountException kce) {
            exp = kceFix(exp);
        }
        return exp;
    }
}
