package gsm.designpatterns.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.ZipCodeApi;

public class Facade {
    public void migrateClient(String name, String zipCode) {
        String city = ZipCodeApi.getInstance().retrieveCity(zipCode);
        String state = ZipCodeApi.getInstance().retrieveState(zipCode);

        CrmService.saveClient(name, zipCode, city, state);
    }
}
