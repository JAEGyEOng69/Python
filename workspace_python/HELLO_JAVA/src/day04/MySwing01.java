package day04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing01 extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MySwing01 frame = new MySwing01();
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
	public MySwing01()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null); // 앱솔루트 
		
		JLabel lbl = new JLabel("Good Morning");
		lbl.setBounds(96, 50, 98, 15);
		contentPane.add(lbl);
		
		
		JButton btn = new JButton("click");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl.setText("Good Evening");
			}
		});
		btn.setBounds(238, 46, 97, 23);
		contentPane.add(btn);
		JButton b = new JButton("push me");
//		btn.addActionListener(new ActionListener() {
//
//		    @Override
//		    public void actionPerformed(ActionEvent e) {
//		    	lbl.setText("Good Evening");
//		    }
//		    
//		});
		
		
		
	}
	
}
