package h;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.GrayFilter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;

//import org.w3c.dom.css.RGBColor; 

import java.awt.SystemColor;
import javax.swing.BoxLayout;

public class Swingf {

	private JFrame frame;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swingf window = new Swingf();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Swingf() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.getContentPane().setLayout(null);
		frame.setPreferredSize(new Dimension(600, 485));
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 594, 151);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 255));
		textField.setBackground(Color.WHITE);
		textField.setBounds(194, 115, 271, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_9.setBounds(163, 115, 25, 25);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_search_20px_1.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 25, 25);
		panel_9.add(lblNewLabel_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColor(panel_11);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_11);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
		});
		panel_11.setBackground(new Color(255, 255, 255));
		panel_11.setBounds(544, 11, 40, 30);
		panel.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(0, 0, 40, 30);
		panel_11.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_gmail_20px.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_navigation_50px.png")));
		lblNewLabel_3.setBounds(28, 11, 50, 80);
		panel.add(lblNewLabel_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(28, 27, 190, 49);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("KeepToo");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel_4.setBounds(48, 0, 131, 49);
		panel_8.add(lblNewLabel_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(50, 81, 120, 23);
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("School Management");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(0, 0, 120, 23);
		panel_10.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 149, 594, 307);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
		 public void mouseEntered(MouseEvent e) {
				setColor(panel_2); 
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_2);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				new Home_Data().show();
			}
		});
		panel_2.setForeground(new Color(0, 191, 255));
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(174, 65, 80, 72);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBackground(new Color(0, 191, 255));
		lblNewLabel.setForeground(new Color(0, 191, 255));
		lblNewLabel.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_home_filled_50px_1.png")));
		
		JLabel lblHome = new JLabel("Home");
		panel_2.add(lblHome, BorderLayout.SOUTH);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setForeground(new Color(0, 191, 255));
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColor(panel_3);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_3);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				new Students().show();
			}
		});
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(264, 65, 80, 72);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label, BorderLayout.CENTER);
		label.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_group_50px.png")));
		label.setForeground(new Color(0, 191, 255));
		label.setBackground(new Color(0, 191, 255));
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblStudent, BorderLayout.SOUTH);
		lblStudent.setForeground(new Color(0, 191, 255));
		lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColor(panel_4);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_4);
			}
		});
		panel_4.setBackground(SystemColor.controlHighlight);
		panel_4.setBounds(354, 65, 80, 72);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_1, BorderLayout.CENTER);
		label_1.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_tuition_50px.png")));
		label_1.setForeground(new Color(0, 191, 255));
		label_1.setBackground(new Color(0, 191, 255));
		
		JLabel lblTimetable = new JLabel("TimeTable");
		lblTimetable.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblTimetable, BorderLayout.SOUTH);
		lblTimetable.setForeground(new Color(0, 191, 255));
		lblTimetable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColor(panel_5);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_5);
			}
		});
		panel_5.setForeground(new Color(0, 191, 255));
		panel_5.setBackground(SystemColor.controlHighlight);
		panel_5.setBounds(174, 147, 80, 72);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(label_2, BorderLayout.CENTER);
		label_2.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_settings_50px.png")));
		label_2.setForeground(new Color(0, 191, 255));
		label_2.setBackground(new Color(0, 191, 255));
		
		JLabel lblSetting = new JLabel("Setting");
		lblSetting.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblSetting, BorderLayout.SOUTH);
		lblSetting.setForeground(new Color(0, 191, 255));
		lblSetting.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColor(panel_6);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_6);
			}
		});
		panel_6.setBackground(SystemColor.controlHighlight);
		panel_6.setBounds(354, 147, 80, 72);
		panel_1.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label_3, BorderLayout.CENTER);
		label_3.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_download_50px_3.png")));
		
		JLabel lblUpdate = new JLabel("Update");
		lblUpdate.setVerticalAlignment(SwingConstants.TOP);
		lblUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblUpdate, BorderLayout.SOUTH);
		lblUpdate.setForeground(new Color(0, 191, 255));
		lblUpdate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setColor(panel_7);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetColor(panel_7);
			}
		});
		panel_7.setBackground(SystemColor.controlHighlight);
		panel_7.setBounds(264, 147, 80, 72);
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(label_6, BorderLayout.CENTER);
		label_6.setIcon(new ImageIcon(Swingf.class.getResource("/h/image/icons8_list_50px.png")));
		label_6.setForeground(new Color(0, 191, 255));
		label_6.setBackground(new Color(0, 191, 255));
		
		JLabel lblClasses = new JLabel("Classes");
		lblClasses.setVerticalAlignment(SwingConstants.TOP);
		lblClasses.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblClasses, BorderLayout.SOUTH);
		lblClasses.setForeground(new Color(0, 191, 255));
		lblClasses.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
			
		
		frame.pack();
		
	}
	
	
	public void setColor(JPanel panel1) {
		 panel1.setBackground(new Color(197, 197, 197));
	}
public void resetColor(JPanel panel1) {
	panel1.setBackground(new Color(240, 240, 240));
	}
}
