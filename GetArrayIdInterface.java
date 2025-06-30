//João Alberto Benaci Torezan

public interface GetArrayIdInterface {
    public int getCustomerId(String cpf) throws ItemNotFoundExeption;
    public int getEmployeeId(String cpf) throws ItemNotFoundExeption;
    public int getGuitarId(String model) throws ItemNotFoundExeption;
    public int getPianoId(String model) throws ItemNotFoundExeption;
    public int getDrumsId(String model) throws ItemNotFoundExeption;
    public int getAcquisitionId(int OpId) throws ItemNotFoundExeption;
    public int getSaleId(int OpId) throws ItemNotFoundExeption;
}
