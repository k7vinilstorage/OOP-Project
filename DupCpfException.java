//João Alberto Benaci Torezan

public class DupCpfException extends Exception{
       
    public void DupCpfErr() {
        Dialogs.createDialogs().errorDialog("CPF already registered", "Duplicated CPF Error");
    }
}
