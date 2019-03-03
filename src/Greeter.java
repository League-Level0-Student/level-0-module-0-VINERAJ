import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your name?");
	System.out.println(answer);
	JOptionPane.showMessageDialog(null, "Hello, " +answer);
}
}
