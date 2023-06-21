package TicTacToeGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class TicTacToeGame implements ActionListener{

	JFrame frmTictactoeGameBy;
	JButton b1;
	JButton b0;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JLabel txt;
	int c=0;
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeGame window = new TicTacToeGame();
					window.frmTictactoeGameBy.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToeGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
		public void initialize() {
		frmTictactoeGameBy = new JFrame();
		frmTictactoeGameBy.setTitle("TicTacToe Game By Anil");
		frmTictactoeGameBy.setBounds(100, 100, 450, 503);
		frmTictactoeGameBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoeGameBy.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 204));
		panel.setBounds(0, 0, 434, 464);
		frmTictactoeGameBy.getContentPane().add(panel);
		panel.setLayout(null);
		
		b0 = new JButton("");
		b0.setBorder(new LineBorder(new Color(204, 0, 0), 2));
		b0.setForeground(new Color(102, 0, 204));
		b0.setFont(new Font("Tahoma", Font.BOLD, 50));
		b0.setBounds(53, 49, 99, 95);
		panel.add(b0);
		b0.addActionListener(this);
		
		
		
		
		
		b2 = new JButton("");
		b2.setBorder(new LineBorder(new Color(0, 204, 0), 2));
		b2.setForeground(new Color(102, 0, 204));
		b2.setFont(new Font("Tahoma", Font.BOLD, 50));
		b2.setBounds(271, 49, 99, 95);
		panel.add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("");
		b3.setBorder(new LineBorder(new Color(0, 255, 255), 2));
		b3.setForeground(new Color(102, 0, 204));
		b3.setFont(new Font("Tahoma", Font.BOLD, 50));
		b3.setBounds(53, 155, 99, 95);
		panel.add(b3);
		b3.addActionListener(this);
		
		b4 = new JButton("");
		b4.setBorder(new LineBorder(new Color(102, 51, 0), 2));
		b4.setForeground(new Color(102, 0, 204));
		b4.setFont(new Font("Tahoma", Font.BOLD, 50));
		b4.setBounds(162, 157, 99, 95);
		panel.add(b4);
		b4.addActionListener(this);
		
		b5 = new JButton("");
		b5.setBorder(new LineBorder(new Color(255, 0, 255), 2));
		b5.setForeground(new Color(102, 0, 204));
		b5.setFont(new Font("Tahoma", Font.BOLD, 50));
		b5.setBounds(271, 155, 99, 95);
		panel.add(b5);
		b5.addActionListener(this);
		
		b6 = new JButton("");
		b6.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		b6.setForeground(new Color(102, 0, 204));
		b6.setFont(new Font("Tahoma", Font.BOLD, 50));
		b6.setBounds(53, 261, 99, 95);
		panel.add(b6);
		b6.addActionListener(this);
		
		b7 = new JButton("");
		b7.setBorder(new LineBorder(new Color(255, 102, 0), 2));
		b7.setForeground(new Color(102, 0, 204));
		b7.setFont(new Font("Tahoma", Font.BOLD, 50));
		b7.setBounds(162, 261, 99, 95);
		panel.add(b7);
		b7.addActionListener(this);
		
		b8 = new JButton("");
		b8.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b8.setForeground(new Color(102, 0, 204));
		b8.setFont(new Font("Tahoma", Font.BOLD, 50));
		b8.setBounds(271, 261, 99, 95);
		panel.add(b8);
		b8.addActionListener(this);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 153));
		panel_1.setBounds(10, 11, 414, 442);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//here
		JButton startAgain = new JButton("Start Again");
		startAgain.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		startAgain.setBackground(new Color(0, 255, 255));
		startAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				b0.setText(null);
				b1.setText(null);
				b2.setText(null);
				b3.setText(null);
				b4.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b8.setText(null);
				txt.setText(null);
			}
			
			
		});
		
		startAgain.setFont(new Font("Tahoma", Font.BOLD, 16));
		startAgain.setForeground(new Color(102, 0, 204));
		startAgain.setBounds(0, 419, 414, 23);
		panel_1.add(startAgain);
		
		txt = new JLabel("");
		txt.setForeground(new Color(102, 0, 204));
		txt.setFont(new Font("Tahoma", Font.BOLD, 32));
		txt.setBorder(new LineBorder(new Color(102, 0, 204), 3));
		txt.setBounds(42, 359, 317, 49);
		panel_1.add(txt);
		
		b1 = new JButton("");
		b1.setBounds(152, 38, 99, 96);
		panel_1.add(b1);
		b1.setBorder(new LineBorder(new Color(102, 0, 204), 2));
		b1.setForeground(new Color(102, 0, 204));
		b1.setFont(new Font("Tahoma", Font.BOLD, 50));
		b1.addActionListener(this);
		
		
	}

	
	private JPanel panel_1;
	
	
	public void actionPerformed(ActionEvent e) {
		JButton bt=(JButton)e.getSource();
		if(c%2==0)
		{
			bt.setLabel("X");
		}
		
		else
		{
			bt.setLabel("0");
		}
		//bt.removeActionListener(this);
		c++;
		if(b0.getLabel()=="X" && b1.getLabel()=="X" && b2.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b0.getLabel()=="0" && b1.getLabel()=="0" && b2.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		}
		else if(b3.getLabel()=="X" && b4.getLabel()=="X" && b5.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b3.getLabel()=="0" && b4.getLabel()=="0" && b5.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		}
		else if(b6.getLabel()=="X" && b7.getLabel()=="X" && b8.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b6.getLabel()=="0" && b7.getLabel()=="0" && b8.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		
		}
		
		else if(b0.getLabel()=="X" && b3.getLabel()=="X" && b6.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b0.getLabel()=="0" && b3.getLabel()=="0" && b6.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		
		}
		
		else if(b1.getLabel()=="X" && b4.getLabel()=="X" && b7.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b1.getLabel()=="0" && b4.getLabel()=="0" && b7.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		
		}
		
		else if(b2.getLabel()=="X" && b5.getLabel()=="X" && b8.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b2.getLabel()=="0" && b5.getLabel()=="0" && b8.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		
		}
		
		
		else if(b0.getLabel()=="X" && b4.getLabel()=="X" && b8.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b0.getLabel()=="0" && b4.getLabel()=="0" && b8.getLabel()=="0")
		{
			txt.setText("player 0 is winner");
		
		}
		
		
		else if(b2.getLabel()=="X" && b4.getLabel()=="X" && b6.getLabel()=="X")
		{
			txt.setText("player X is winner");
		}
		else if(b2.getLabel()=="0" && b4.getLabel()=="0" && b6.getLabel()=="0")
		{
			
			txt.setText("player 0 is winner");
		
		} 
	
		
	}
}
