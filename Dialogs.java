//João Alberto Benaci Torezan

import javax.swing.JOptionPane;

public class Dialogs {
    
    private static Dialogs dialogs;
    
    //MÉTODO SINGLETON
    
    public static Dialogs createDialogs() {
        if(dialogs == null) {
            dialogs = new Dialogs();
        }
        return dialogs;
    }
        
    public void infoDialog(String info, String title) {
        JOptionPane.showMessageDialog(
                        null,
                        info,
                        title,
                        JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public void errorDialog(String info, String title) {
        JOptionPane.showMessageDialog(
                        null,
                        info,
                        title,
                        JOptionPane.ERROR_MESSAGE
        );
    }    
}
