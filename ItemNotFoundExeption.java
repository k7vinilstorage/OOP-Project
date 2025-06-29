public class ItemNotFoundExeption extends Exception{
    
    private Dialogs dialogs = Dialogs.createDialogs();
    
    public void itemNotFoundErr() {
        dialogs.errorDialog("Object not found!", "Item not found error");
    }
}
