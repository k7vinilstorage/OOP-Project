
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao
 */
public class Dialogs {
    
    private static Dialogs dialogs;
    
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
    
}
