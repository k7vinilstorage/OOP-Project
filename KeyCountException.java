//João Alberto Benaci Torezan

public class KeyCountException extends Exception{
    public void keyCountErr() {
        Dialogs.createDialogs().errorDialog("Key count must be within 19 - 108", "Key count error");
    }
}
