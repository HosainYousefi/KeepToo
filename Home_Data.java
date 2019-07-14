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
import java.awt.FlowLayout;

public class Home_Data extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Data frame = new Home_Data();
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
	public Home_Data() {
		setResizable(false);
		setBounds(100, 100, 600, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 594, 167);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(36, 11, 135, 65);
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Home_Data.class.getResource("/h/image/icons8_home_filled_50px_1.png")));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_2);
		
		JLabel label = new JLabel("Home");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(label);
	}

}
