package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class PedirInformacao {
    
    public static void main(String[] args) {
		JFrame frame = new JFrame("Informações");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}
 
    
    private static void placeComponents(JPanel panel) {
                
		panel.setLayout(null);

		JLabel userLabel = new JLabel("Digite o cpf:");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);


		JButton loginButton = new JButton("Enviar");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
	}
}
