package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class layout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					layout frame = new layout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public layout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton btnNewButton = new JButton("1");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		contentPane.add(btnNewButton_3);
	}

}
