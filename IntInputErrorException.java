//João Alberto Benaci Torezan

public class IntInputErrorException extends Exception{
    
    private Dialogs dialogs = Dialogs.createDialogs();

    public void intErr(String value) {
        dialogs.errorDialog("The value " + value +" must be an Int!", "Number Format Error");
    }
}
