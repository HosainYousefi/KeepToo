package h;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Home extends JFrame{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 102);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(194, 115, 271, 25);
		textField.setForeground(Color.BLUE);
		textField.setColumns(10);
		textField.setBackground(new Color(0, 102, 255));
		panel.add(textField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(163, 115, 25, 25);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 0, 25, 25);
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(525, 11, 40, 30);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 40, 30);
		panel_3.add(label_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 52, 55);
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(-3, 12, 0, 0);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setBackground(Color.WHITE);
		panel_4.add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/h/image/icons8_home_filled_50px_1.png")));
		lblNewLabel.setBounds(2, 0, 50, 61);
		panel_4.add(lblNewLabel);
	}
}
