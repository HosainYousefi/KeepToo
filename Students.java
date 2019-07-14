package h;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Students extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Students frame = new Students();
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
	public Students() {
		setResizable(false);
		setBounds(100, 100, 600, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 594, 456);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(0, 0, 594, 167);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(36, 11, 176, 65);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 4, 50, 50);
		label.setIcon(new ImageIcon(Students.class.getResource("/h/image/icons8_group_50px.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(label);
		
		JLabel lblStudents = new JLabel("Students");
		lblStudents.setBounds(60, 11, 106, 29);
		lblStudents.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudents.setForeground(Color.BLACK);
		lblStudents.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_2.add(lblStudents);
	}

}
