public class Guitar extends Instrument {
    private String shape;
    private int stringCount;

    public Guitar() {
        shape = "";
        stringCount = 0;
    }

    public Guitar(String shape, int stringCount) { //Sobrecarga
        this.shape = shape;
        this.stringCount = stringCount;
    }

    public String getShape() {
        return shape;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setStringCount(int stringCount) throws StringCountException{
        if(stringCount > 5 && stringCount < 19) {
            this.stringCount = stringCount;
        }
        else {
            throw new StringCountException();
        }
    }
}
