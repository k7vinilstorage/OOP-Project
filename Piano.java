public class Piano extends Instrument{
    private String bodyType;
    private int keyCount;

    public Piano() {
        bodyType = "";
        keyCount = 0;
    }

    public Piano(String bodyType, int keyCount) {
        this.bodyType = bodyType;
        this.keyCount = keyCount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getKeyCount() {
        return keyCount;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }  
}
