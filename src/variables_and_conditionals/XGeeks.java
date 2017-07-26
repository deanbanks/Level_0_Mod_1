package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String deen = "fly";
		String kyren = "invisable";
		String amaan = "run fast";
		String matin = "time travel";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("enter a name");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (answer.equals("deen")) {
			JOptionPane.showMessageDialog(null, deen);
		} else if (answer.equals("matin")) {
			JOptionPane.showMessageDialog(null, matin);
		} else if (answer.equals("kyren")) {
			JOptionPane.showMessageDialog(null, kyren);
		} else if (answer.equals("amaan")) {
			JOptionPane.showMessageDialog(null, amaan);
		}
	}
}
