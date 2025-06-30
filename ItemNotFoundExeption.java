//João Alberto Benaci Torezan

public class ItemNotFoundExeption extends Exception{
   
    private String item;
    
    public ItemNotFoundExeption() {
        item = "";
    }
    
    public ItemNotFoundExeption(String item) { //Sobrecarga
        this.item = item;
    }
    
    public void itemNotFoundErr() {
        Dialogs.createDialogs().errorDialog(item + " not found!", "Item not found error");
    }
}
