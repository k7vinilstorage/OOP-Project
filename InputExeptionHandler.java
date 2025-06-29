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
    
    public int InputInt(String input) throws InputErrorException{

        int iRet = -1;

        try {
            iRet = Integer.parseInt(input);
        } 
        catch (NumberFormatException nfe) {
            throw new InputErrorException();
        }

        return iRet;
    }
    
    public float InputFloat(String input) throws InputErrorException{

        float fRet = -1;

        try {
            fRet = Float.parseFloat(input);
        } 
        catch (NumberFormatException nfe) {
            throw new InputErrorException();
        }

        return fRet;
    }
}
