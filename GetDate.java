//João Alberto Benaci Torezan

import java.time.LocalDate;

public class GetDate {
    
    private static GetDate gd;
    
    private GetDate() {}
    
    //MÉTODO SINGLETON
    
    public static GetDate createGetDate() {
        if(gd == null) {
            gd = new GetDate();
        }
        return gd;
    }
    
    String getDate() {
        return (LocalDate.now().getDayOfMonth()+ "/" + LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear());
    }
}
