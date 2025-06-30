//João Alberto Benaci Torezan

public class InputExceptionHandler implements InputExceptionHandlerInterface{
    
    private static InputExceptionHandler i;
    
    private InputExceptionHandler() {}
    
    //MÉTODO SINGLETON
    
    public static InputExceptionHandler createInputExeptionHandler() {
        if(i == null) {
            i = new InputExceptionHandler();
        }
        return i;
    }
    
    @Override
    public int InputInt(String input) throws IntInputErrorException{ //Sobrescrita

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
    public float InputFloat(String input) throws FloatInputErrorException{ //Sobrescrita

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
