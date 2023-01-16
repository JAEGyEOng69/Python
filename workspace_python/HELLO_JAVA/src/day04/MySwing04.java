package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MySwing04 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;
	private JTextField tf04;
	private JTextField tf05;
	private JTextField tf06;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing04 frame = new MySwing04();
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
	public MySwing04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf01 = new JTextField();
		tf01.setBounds(12, 21, 32, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);
		
		tf02 = new JTextField();
		tf02.setColumns(10);
		tf02.setBounds(56, 21, 32, 21);
		contentPane.add(tf02);
		
		tf03 = new JTextField();
		tf03.setColumns(10);
		tf03.setBounds(100, 21, 32, 21);
		contentPane.add(tf03);
		
		tf04 = new JTextField();
		tf04.setColumns(10);
		tf04.setBounds(144, 21, 32, 21);
		contentPane.add(tf04);
		
		tf05 = new JTextField();
		tf05.setColumns(10);
		tf05.setBounds(188, 21, 32, 21);
		contentPane.add(tf05);
		
		tf06 = new JTextField();
		tf06.setColumns(10);
		tf06.setBounds(238, 21, 32, 21);
		contentPane.add(tf06);
		
		JButton btn = new JButton("로또 생성하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(12, 63, 258, 23);
		contentPane.add(btn);
	}
	public void myclick() {
		int[] lotto = {1,2,3,4,5  ,6,7,8,9,10, 11,12,13,14,15,16,17,18,19,20,21,
							22, 23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40
							,41,42,43,44,45};
		for(int i=0; i<100;i++) {
			int rnd = (int)(Math.random()*45);
			int a= lotto[0];
			int b= lotto[rnd];
			lotto[0]=b;
			lotto[rnd]=a;
		}	
		tf01.setText(lotto[0]+"");
		tf02.setText(lotto[1]+"");
		tf03.setText(lotto[2]+"");
		tf04.setText(lotto[3]+"");
		tf05.setText(lotto[4]+"");
		tf06.setText(lotto[5]+"");
		
	}
}
