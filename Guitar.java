public class Guitar extends Instrument {
    String shape;
    int stringCount;

    public Guitar() {
        shape = "";
        stringCount = 0;
    }

    public Guitar(String shape, int stringCount) {
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

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }
}
