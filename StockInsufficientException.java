//João Alberto Benaci Torezan

public class StockInsufficientException extends Exception{
    
    String info;
    
    public StockInsufficientException() {
        info = "";
    }
    
    public StockInsufficientException(String info) {
        this.info = info;
    }
    
    public void StockInsufficientErr() {
        Dialogs.createDialogs().errorDialog(info + " stock insufficient", "Stock insufficient");
    }
}
