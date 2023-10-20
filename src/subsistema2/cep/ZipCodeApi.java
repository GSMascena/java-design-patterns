package subsistema2.cep;

public class ZipCodeApi {
    private  static ZipCodeApi instance;

    private ZipCodeApi() {
        super();
    }

    public static ZipCodeApi getInstance() {
        if (instance == null)
            instance = new ZipCodeApi();
        return instance;
    }

    public String retrieveCity (String zipCode) {
        return "São paulo";
    }

    public String retrieveState (String zipCode) {
        return "SP";
    }
}
