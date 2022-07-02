
// This is a library used to introduce Graphical User Interfaces (GUIs) to user input
import javax.swing.JOptionPane;

class GUI_intro{
	public static void main(String[] args){
		
		// The showInputDialog function shows an input box with a message
		// text that was passed in its parameter, storing the input in
		// the 'name' variable
		String name = JOptionPane.showInputDialog("Enter your name:");

		// The showMessageDialog function shows a message box with the
		// text that was passed in its parameter
		JOptionPane.showMessageDialog(null, "Hello, " + name);

		// The parseInt function converts the string entered in the
		// showInputDialog function to an integer value
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

		// The parseDouble function converts the string entered in the
		// showInputDialog function to a double value
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm):"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
	}
}