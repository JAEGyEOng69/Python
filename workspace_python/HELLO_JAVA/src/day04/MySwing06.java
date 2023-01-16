package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField tfDan;
	JTextArea ta;
	JLabel lbl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("출력단수 :");
		lbl.setBounds(12, 10, 57, 15);
		contentPane.add(lbl);
		
		tfDan = new JTextField();
		tfDan.setBounds(93, 7, 116, 21);
		contentPane.add(tfDan);
		tfDan.setColumns(10);
		
		JButton btn = new JButton("출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(22, 35, 187, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(22, 68, 187, 183);
		contentPane.add(ta);
	}
	public void myclick() {
		int dan = Integer.parseInt(tfDan.getText());
		String dan2="";
		for(int i=1; i<10; i++) {
			dan2 += toString().format("%d X %d = %d\n",dan,i,dan*i);
//			ta.append(dan+"X"+i+"="+dan*i+"\n");
		}
		ta.setText(dan2);
		
	}
}
