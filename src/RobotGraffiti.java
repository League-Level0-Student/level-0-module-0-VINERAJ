import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot robot = new Robot();
	robot.penDown();
	robot.setSpeed(50);
	robot.turn(160);
	robot.move(200);
	robot.turn(-140);
	robot.move(200);
	robot.hide();
}
}
