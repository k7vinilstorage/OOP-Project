//João Alberto Benaci Torezan

public class ShellMaterialException extends Exception{
    
    private Read read = Read.createRead();

    public ShellMaterialException() {}

    public Drums smeFix(Drums exp) {
        System.out.println("String count must be maple; birch; oak; mahogany; poplar; steel; brass; aluminum; coper; bronze");
        try {
            exp.setShellMaterial(read.readString("Insert Shell Material: "));    
        } 
        catch (ShellMaterialException sme) {
            exp = smeFix(exp);
        }
        return exp;
    }    
}
