public class PeopleMenu {

    //get custumer
    //get employee
    //add employee
    //add custumer
    //update employee
    //update custumer
    //display employee
    //display custumer
    //del employee
    //del custumer

    Storage peopleStorage;

    public PeopleMenu() {
        peopleStorage = Storage.createStorage();
    }

    public PeopleMenu(Storage peoplStorage) {
        this.peopleStorage = peoplStorage;
    }
    
}
