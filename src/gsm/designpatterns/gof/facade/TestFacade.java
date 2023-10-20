package gsm.designpatterns.gof.facade;

public class TestFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrateClient("Gabriel", "12354321");
    }
}
