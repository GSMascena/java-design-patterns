package gsm.designpatterns.gof.strategy;

public class BehaviourNormal implements Behaviour {
    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}
