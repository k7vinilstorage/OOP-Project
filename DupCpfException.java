//João Alberto Benaci Torezan

public class NegativeNumberException extends Exception{
    
    String info;
    
    public NegativeNumberException() {
        info = "";
    }
    
    public NegativeNumberException(String info) {
        this.info = info;
    }
    
    public void negativeNumErr() {
        Dialogs.createDialogs().errorDialog(info + " must be a positive Number", "Negative Number Error");
    }
}
