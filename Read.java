import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

    private static Read ReadUnic; //1°  single

    private Read() {} //2° single

    public static Read createRead() { //3° single
        if(ReadUnic == null) {
            ReadUnic = new Read();
        }

        return ReadUnic;
    }

    public String readString(String label) {

        System.out.print(label);

        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader bufKeyboard = new BufferedReader(keyboard);

        String ret = "";

        try{
            ret = bufKeyboard.readLine();
        }
        catch(IOException ioe) {
            System.out.println("ERROR JVM or RAM");
        }

        return ret;
    }
    
    public int readInt(String label) {

        System.out.print(label);

        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader bufKeyboard = new BufferedReader(keyboard);

        String ret = "";
        int iRet;

        try{
            ret = bufKeyboard.readLine();
        }
        catch(IOException ioe) {
            System.out.println("ERROR JVM or RAM");
        }

        try {
            iRet = Integer.parseInt(ret);
        } 
        catch (NumberFormatException nfe) {
            System.out.println("The value must be an integer!");
            iRet = readInt(label);
        }

        return iRet;
    }

    public float readFloat(String label) {

        System.out.print(label);

        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader bufKeyboard = new BufferedReader(keyboard);

        String ret = "";
        float fRet;

        try{
            ret = bufKeyboard.readLine();
        }
        catch(IOException ioe) {
            System.out.println("ERROR JVM or RAM");
        }

        try {
            fRet = Float.parseFloat(ret);
        } 
        catch (NumberFormatException nfe) {
            System.out.println("The value must be a float!");
            fRet = readFloat(label);
        }

        return fRet;
    }
}
