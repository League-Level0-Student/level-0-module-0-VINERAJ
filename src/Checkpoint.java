import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color+" is also my favorite color!");
	Robot robot = new Robot();
	robot.setSpeed(50);
	robot.penDown();
	for(int i=0;i<4;i++) {
	robot.turn(120);
	robot.move(200);
	}
	robot.hide();
}
}
