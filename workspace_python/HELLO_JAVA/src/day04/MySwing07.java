package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing07 extends JFrame {

	private JPanel contentPane;
	private JTextField tfMine;
	private JTextField tfCom;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 frame = new MySwing07();
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
	public MySwing07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMine = new JLabel("나 :");
		lblMine.setBounds(12, 10, 57, 15);
		contentPane.add(lblMine);
		
		JLabel lblCom = new JLabel("컴");
		lblCom.setBounds(12, 37, 57, 15);
		contentPane.add(lblCom);
		
		JLabel lblResult = new JLabel("결과 :");
		lblResult.setBounds(12, 62, 57, 15);
		contentPane.add(lblResult);
		
		tfMine = new JTextField();
		tfMine.setBounds(81, 7, 116, 21);
		contentPane.add(tfMine);
		tfMine.setColumns(10);
		
		tfCom = new JTextField();
		tfCom.setColumns(10);
		tfCom.setBounds(81, 34, 116, 21);
		contentPane.add(tfCom);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		tfResult.setBounds(81, 59, 116, 21);
		contentPane.add(tfResult);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}

		});
		btn.setBounds(12, 87, 185, 23);
		contentPane.add(btn);
	}
	public void myclick() {
		// TODO Auto-generated method stub
		String mine = tfMine.getText();
		String com = "";
		String result = "";
		
		double rnd = Math.random();
		if(rnd>0.66) {
			com="가위";
		}else if(rnd<0.33){
			com="주먹";
		}else {
			com="보";
		}
		
		
		if(mine.equals("가위") && com.equals("보")||
		   mine.equals("주먹") && com.equals("가위")||
		   mine.equals("보") && com.equals("주먹")) {
			result="승리";
		}else if(mine.equals(com)){
			result="비김";
		}else {
			result="패배";
			
		}
		tfCom.setText(com);
		tfResult.setText(result);
		
	}

}
