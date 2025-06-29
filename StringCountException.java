//João Alberto Benaci Torezan

public class StringCountException extends Exception{
    public void stringCountErr() {
        Dialogs.createDialogs().errorDialog("String count must be within 6 - 18", "String count error");
    }
}
