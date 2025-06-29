
import java.util.Date;

public class GetDate {
    
    private static GetDate gd;
    
    private GetDate() {}
    
    public static GetDate createGetDate() {
        if(gd == null) {
            gd = new GetDate();
        }
        return gd;
    }
    
    String getDate() {
        Date data = new Date();
        return (data.getDate() + "/" + data.getMonth() + "/" + data.getYear());
    }
}
