package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
public class MySwing09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private String Num = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing09 frame = new MySwing09();
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
	public MySwing09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(62, 10, 132, 21);
		contentPane.add(tf);
		tf.setColumns(10);

		btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);

			}

		
		});
		btn1.setBounds(48, 41, 53, 23);
		contentPane.add(btn1);
		btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn2.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn2.setBounds(108, 41, 53, 23);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn3.getText();
//
//				tf.setText(Num);
				
				myclick(e);
			}
		});
		btn3.setBounds(168, 40, 58, 23);
		contentPane.add(btn3);

		btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn4.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn4.setBounds(48, 74, 53, 23);
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn5.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn5.setBounds(108, 74, 53, 23);
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn6.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn6.setBounds(168, 73, 58, 23);
		contentPane.add(btn6);

		btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn7.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn7.setBounds(48, 106, 53, 23);
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn8.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn8.setBounds(108, 106, 53, 23);
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn9.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn9.setBounds(168, 106, 58, 23);
		contentPane.add(btn9);

		btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Num += btn0.getText();
//
//				tf.setText(Num);
				myclick(e);
			}
		});
		btn0.setBounds(48, 139, 53, 23);
		contentPane.add(btn0);

		JButton btnCall = new JButton("CALL");
		btnCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "입력한 번호 : " + tf.getText());
			}
		});
		btnCall.setBounds(108, 139, 86, 23);
		contentPane.add(btnCall);
	}

	public void myclick(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		String str_new = b.getText();
		String str_old= tf.getText();
		tf.setText(str_old+str_new);
		
	}

}
