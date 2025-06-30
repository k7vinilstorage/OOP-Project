//João Alberto Benaci Torezan

public class FloatInputErrorException extends Exception{
    
    private Dialogs dialogs = Dialogs.createDialogs();
        
    public void floatErr(String value) {
        dialogs.errorDialog("The value " + value + " must be a Float!", "Number Format Error");
    }
}
