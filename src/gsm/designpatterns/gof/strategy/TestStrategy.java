package gsm.designpatterns.gof.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Behaviour normal = new BehaviourNormal();
        Behaviour defensive = new BehaviourDefensive();
        Behaviour aggressive = new BehaviourAggressive();

        Robot robot = new Robot();

        robot.setBehaviour(normal);
        robot.move();

        robot.setBehaviour(defensive);
        robot.move();

        robot.setBehaviour(aggressive);
        robot.move();
    }
}
