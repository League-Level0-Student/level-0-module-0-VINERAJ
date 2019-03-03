import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "I know that you slept last summer, " +answer+ "!");
}
}
