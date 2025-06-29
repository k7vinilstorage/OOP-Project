//João Alberto Benaci Torezan

public class Drums extends Instrument{
   private String shellMaterial;
   private int piecesCount;

    public Drums() {
        shellMaterial = "";
        piecesCount = 0;
    }

    public Drums(String shellMaterial, int piecesCount) { //Sobrecarga
        this.shellMaterial = shellMaterial;
        this.piecesCount = piecesCount;
    }
   
    public String getShellMaterial() {
        return shellMaterial;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public void setShellMaterial(String shellMaterial) throws ShellMaterialException{
        if(shellMaterial.equals("maple") || shellMaterial.equals("birch") || shellMaterial.equals("oak") || shellMaterial.equals("mahogany") || shellMaterial.equals("poplar") || shellMaterial.equals("steel") || shellMaterial.equals("brass") || shellMaterial.equals("aluminum") || shellMaterial.equals("coper") || shellMaterial.equals("bronze")) {
            this.shellMaterial = shellMaterial;
        }
        else {
            throw new ShellMaterialException();
        }
    }

    public void setPiecesCount(int piecesCount) {
        this.piecesCount = piecesCount;
    }
}