//João Alberto Benaci Torezan

public class ShellMaterialException extends Exception{

    public void shellMaterialErr() {
        Dialogs.createDialogs().errorDialog("String count must be maple; birch; oak; mahogany; poplar; steel; brass; aluminum; coper; bronze", "Shell material error");
    }
}
