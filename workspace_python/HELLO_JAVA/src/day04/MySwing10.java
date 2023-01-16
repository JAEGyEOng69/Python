package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing10 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JTextArea ta;
	String com = "123";
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing10 frame = new MySwing10();
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
	public MySwing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 235, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl = new JLabel("세자리수 :");
		lbl.setBounds(36, 13, 90, 15);
		contentPane.add(lbl);

		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.CENTER);
		tf.setBounds(111, 10, 75, 21);
		contentPane.add(tf);
		tf.setColumns(10);

		JButton btn = new JButton("맞추기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(29, 45, 90, 23);
		contentPane.add(btn);

		ta = new JTextArea();
		ta.setBounds(29, 76, 157, 324);
		contentPane.add(ta);
		
		btnReset = new JButton("리셋");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myreset();
//				JOptionPane.showMessageDialog(null, com + "컴퓨터 숫자");
			}
			
		});
		btnReset.setBounds(131, 45, 76, 23);
		contentPane.add(btnReset);
		
		setCom();
	}
	public void myreset() {
		ta.setText("");
		tf.setText("");
		setCom();
	}
	
	public void setCom() {
		int[] lotto = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < 100; i++) {
			int rnd = (int) (Math.random() * 9);
			int a = lotto[0];
			int b = lotto[rnd];
			lotto[0] = b;
			lotto[rnd] = a;
		}
		com = lotto[0]+""+lotto[1]+""+lotto[2];
		System.out.println(com);
	}
	
	public int getStrike(String com, String mine) {

		int cnt = 0;
		String subcom1 = com.substring(0, 1);
		String subcom2 = com.substring(1, 2);
		String subcom3 = com.substring(2, 3);

		String submine1 = mine.substring(0, 1);
		String submine2 = mine.substring(1, 2);
		String submine3 = mine.substring(2, 3);

		if (subcom1.equals(submine1))
			cnt++;
		if (subcom2.equals(submine2))
			cnt++;
		if (subcom3.equals(submine3))
			cnt++;

		return cnt;
	}

	public int getBall(String com, String mine) {

		int cnt1 = 0;
		String subcom1 = com.substring(0, 1);
		String subcom2 = com.substring(1, 2);
		String subcom3 = com.substring(2, 3);

		String submine1 = mine.substring(0, 1);
		String submine2 = mine.substring(1, 2);
		String submine3 = mine.substring(2, 3);

		if (subcom1.equals(submine2) || subcom1.equals(submine3))
			cnt1++;
		if (subcom2.equals(submine1) || subcom2.equals(submine3))
			cnt1++;
		if (subcom3.equals(submine1) || subcom3.equals(submine2))
			cnt1++;

		return cnt1;
	}

	public void myclick() {
		String mine = tf.getText();
		int s = getStrike(com, mine);
		int b = getBall(com, mine);
		System.out.println(s + "S" + "," + b + "B");
		
		ta.append(tf.getText() + "->" + s + "S" + "," + b + "B" + "\n");
		tf.setText("");

		if (s == 3) {
			JOptionPane.showMessageDialog(null, mine + "사용자 승리");
		}

	}
}
