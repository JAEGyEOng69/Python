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

public class MySwing08 extends JFrame {

	private JPanel contentPane;
	private JTextField tFirst;
	private JTextField tFlast;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 frame = new MySwing08();
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
	public MySwing08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirst = new JLabel("첫 별수 :");
		lblFirst.setBounds(12, 10, 57, 15);
		contentPane.add(lblFirst);
		
		JLabel lblLast = new JLabel("끝별수 :");
		lblLast.setBounds(12, 35, 57, 15);
		contentPane.add(lblLast);
		
		tFirst = new JTextField();
		tFirst.setBounds(81, 7, 116, 21);
		contentPane.add(tFirst);
		tFirst.setColumns(10);
		
		tFlast = new JTextField();
		tFlast.setColumns(10);
		tFlast.setBounds(81, 32, 116, 21);
		contentPane.add(tFlast);
		
		JButton btn = new JButton("별 출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(12, 63, 185, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(12, 96, 185, 229);
		contentPane.add(ta);
	}
	public String drawStar(int cnt) {
		String ret = "";
		for(int i =0;i<cnt; i++) {
			ret += "*";
		}
		ret +="\n";
		return ret;
	}
	public void myclick() {
//		int first = Integer.parseInt(tFirst.getText());
//		int last = Integer.parseInt(tFlast.getText());
//		for(int i = first; i<=last; i++) {
//			for(int j=1; j<=i; j++) {
//				ta.append("*");
//			}
//			ta.append("\n");
//		}
		String a = tFirst.getText();
		String b = tFlast.getText();
		int aa= Integer.parseInt(a);
		int bb= Integer.parseInt(b);
		
		String txt = "";
		for(int i=aa; i<=bb; i++) {
			txt +=drawStar(i);
		}
		
//		txt +=drawStar(1);
//		txt +=drawStar(3);
		ta.setText(txt);
		
	}

}
