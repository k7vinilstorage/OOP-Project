/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao
 */
public class InputExceptionHandler implements InputExceptionHandlerInterface{
    
    private static InputExceptionHandler i;
    
    private InputExceptionHandler() {}
    
    public static InputExceptionHandler createInputExeptionHandler() {
        if(i == null) {
            i = new InputExceptionHandler();
        }
        return i;
    }
    
    @Override
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
    
    @Override
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
