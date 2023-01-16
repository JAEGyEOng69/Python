package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MySwing02 extends JFrame {

	private JPanel contentPane;
	JLabel lbl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing02 frame = new MySwing02();
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
	public MySwing02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("100");
		lbl.setBounds(80, 29, 57, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("decrease");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
					


			}
		});
		btn.setBounds(210, 25, 97, 23);
		contentPane.add(btn);
		
		JButton btn2 = new JButton("++");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick2();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(210, 58, 97, 23);
		contentPane.add(btn2);
	}
	
	public void myclick() {
		int count = Integer.parseInt(lbl.getText());
		count -= 1;
		lbl.setText(String.valueOf(count));
	}
	public void myclick2() {
		int count = Integer.parseInt(lbl.getText());
		count += 1;
		lbl.setText(String.valueOf(count));	
		
	}

}
