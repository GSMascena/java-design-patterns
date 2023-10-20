package gsm.designpatterns.gof.strategy;

public class BehaviourDefensive implements Behaviour {
    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}
