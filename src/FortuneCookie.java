import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();

		cookie.showButton();
	}

	public void showButton() {
		
		System.out.println("Button");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton jButton = new JButton();
		jButton.addActionListener(this);
		jButton.setVisible(true);
		frame.add(jButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "you will have good luck in 5 hours");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "you will have bad luck in 5 hours");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "you will be punched by a person +0m0<0W afternoon");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "you will buy a new house");
		}
		if (rand == 5) {
			JOptionPane.showMessageDialog(null,
					"The the next time you enter a raffle, or lottery, you will win no matter what ");
		}
	}
}