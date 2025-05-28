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

    public String readData(String label) {

        System.out.print(label);

        InputStreamReader keyboard = new InputStreamReader(System.in);
        BufferedReader bufKeyboard = new BufferedReader(keyboard);

        String ret = "";

        try{
            ret = bufKeyboard.readLine();
        }
        catch(IOException ioe) {
            System.out.println("ERRO JVM ou RAM");
        }

        return ret;
    }
}
