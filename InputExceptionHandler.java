/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao
 */
public class InputExeptionHandler {
    
    private static InputExeptionHandler i;
    
    private InputExeptionHandler() {}
    
    public static InputExeptionHandler createInputExeptionHandler() {
        if(i == null) {
            i = new InputExeptionHandler();
        }
        return i;
    }
    
    public int InputInt(String input) throws IntInputErrorException{

        int iRet = 0;

        try {
            iRet = Integer.parseInt(input);
            return iRet;
        } 
        catch (NumberFormatException nfe) {
            throw new IntInputErrorException();
        }
    }
    
    public float InputFloat(String input) throws FloatInputErrorException{

        float fRet = 0;

        try {
            fRet = Float.parseFloat(input);
            return fRet;
        } 
        catch (NumberFormatException nfe) {
            throw new FloatInputErrorException();
        }
    }
}
