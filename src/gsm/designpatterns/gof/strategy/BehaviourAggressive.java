package gsm.designpatterns.gof.strategy;

public class BehaviourAggressive implements Behaviour {
    @Override
    public void move() {
        System.out.println("Moving aggressively...");
    }
}
