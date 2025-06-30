//João Alberto Benaci Torezan

public class ItemNotFoundExeption extends Exception{
    
    private Dialogs dialogs = Dialogs.createDialogs();
    
    private String item;
    
    public ItemNotFoundExeption() {
        item = "";
    }
    
    public ItemNotFoundExeption(String item) { //Sobrecarga
        this.item = item;
    }
    
    public String getItem() {
        return item;
    }
    
    public void setItem(String item) {
        this.item = item;
    }
    
    public void itemNotFoundErr() {
        dialogs.errorDialog(item + " not found!", "Item not found error");
    }
}
