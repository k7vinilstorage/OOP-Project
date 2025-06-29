//João Alberto Benaci Torezan

public class InputErrorException extends Exception{
    
    private Dialogs dialogs = Dialogs.createDialogs();
    
    public InputErrorException() {}

    public void intErr() {
        dialogs.errorDialog("The value must be an Int!", "Number Format Error");
    }
    
    public void floatErr() {
        dialogs.errorDialog("The value must be a Float!", "Number Format Error");
    }
}
