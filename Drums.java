public class Drums extends Instrument{
   private String shellMaterial;
   private int piecesCount;

    public Drums() {
        shellMaterial = "";
        piecesCount = 0;
    }

    public Drums(String shellMaterial, int piecesCount) {
        this.shellMaterial = shellMaterial;
        this.piecesCount = piecesCount;
    }
   
    public String getShellMaterial() {
        return shellMaterial;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public void setShellMaterial(String shellMaterial) {
        this.shellMaterial = shellMaterial;
    }

    public void setPiecesCount(int piecesCount) {
        this.piecesCount = piecesCount;
    }
}
