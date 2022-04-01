package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class Calculadora implements ActionListener {
	private double number;
	private double result;
	private String operationChar;

	private JFrame frame;
	private JTextField operation;
	private JTextField textResult;
	private JPanel botones;
	private JButton buttonLeft;
	private JButton button7;
	private JButton buttonRight;
	private JButton buttonMS;
	private JButton buttonMPlus;
	private JButton buttonMR;
	private JButton button8;
	private JButton button9;
	private JButton buttonBar;
	private JButton buttonSQRT;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton buttonMultiply;
	private JButton buttonPercentage;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonMinus;
	private JButton buttonResult;
	private JButton button0;
	private JButton buttonPoint;
	private JButton buttonPolarity;
	private JButton buttonPlus;
	private JButton buttonDelete;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmAboutUs;
	private JMenuItem mntmExit;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton buttonAC;
	private JButton buttonArrow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		this.initialize();
		this.listeners();
	}

	public void listeners() {
		button0.addActionListener(this);
		
		button1.addActionListener(this);

		button2.addActionListener(this);

		button3.addActionListener(this);

		button4.addActionListener(this);

		button5.addActionListener(this);

		button6.addActionListener(this);

		button7.addActionListener(this);

		button8.addActionListener(this);

		button9.addActionListener(this);

		buttonLeft.addActionListener(this);

		buttonRight.addActionListener(this);

		buttonMS.addActionListener(this);

		buttonMR.addActionListener(this);

		buttonMPlus.addActionListener(this);

		buttonBar.addActionListener(this);

		buttonSQRT.addActionListener(this);

		buttonMultiply.addActionListener(this);

		buttonPercentage.addActionListener(this);

		buttonMinus.addActionListener(this);

		buttonResult.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonPoint.addActionListener(this);
		buttonPolarity.addActionListener(this);
		buttonDelete.addActionListener(this);
		buttonAC.addActionListener(this);
		buttonArrow.addActionListener(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.setBackground(new Color(105, 105, 105));
		frame.setBounds(100, 100, 550, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		textResult = new JTextField();
		textResult.setFont(new Font("Liberation Mono", Font.BOLD, 50));
		textResult.setForeground(new Color(255, 255, 255));
		textResult.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);

		operation = new JTextField();
		operation.setBorder(new EmptyBorder(0, 0, 0, 0));
		operation.setCaretColor(new Color(0, 0, 0));
		operation.setFont(new Font("Likhan", Font.ITALIC, 25));
		operation.setForeground(new Color(255, 255, 255));
		operation.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(operation);
		operation.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		botones = new JPanel();
		botones.setBackground(new Color(105, 105, 105));
		panel.add(botones, BorderLayout.CENTER);
		botones.setLayout(new GridLayout(0, 5, 5, 5));

		button0 = new JButton("0");
		button0.setForeground(new Color(255, 255, 255));
		button0.setBackground(new Color(0, 0, 205));

		button1 = new JButton("1");
		button1.setForeground(new Color(255, 255, 255));
		button1.setBackground(new Color(0, 0, 255));

		button2 = new JButton("2");
		button2.setForeground(new Color(255, 255, 255));
		button2.setBackground(new Color(0, 0, 255));

		button3 = new JButton("3");
		button3.setForeground(new Color(255, 255, 255));
		button3.setBackground(new Color(0, 0, 255));

		button4 = new JButton("4");
		button4.setForeground(new Color(255, 255, 255));
		button4.setBackground(new Color(0, 0, 255));

		button5 = new JButton("5");
		button5.setForeground(new Color(255, 255, 255));
		button5.setBackground(new Color(0, 0, 255));

		button6 = new JButton("6");
		button6.setForeground(new Color(255, 255, 255));
		button6.setBackground(new Color(0, 0, 255));

		button7 = new JButton("7");
		button7.setForeground(new Color(255, 255, 255));
		button7.setBackground(new Color(0, 0, 255));

		button8 = new JButton("8");
		button8.setForeground(new Color(255, 255, 255));
		button8.setBackground(new Color(0, 0, 255));

		button9 = new JButton("9");
		button9.setForeground(new Color(255, 255, 255));
		button9.setBackground(new Color(0, 0, 255));

		buttonLeft = new JButton("(");
		buttonLeft.setEnabled(false);
		buttonLeft.setBackground(new Color(0, 0, 0));
		buttonLeft.setForeground(Color.WHITE);

		buttonRight = new JButton(")");
		buttonRight.setEnabled(false);
		buttonRight.setBackground(new Color(0, 0, 0));
		buttonRight.setForeground(Color.WHITE);

		buttonMS = new JButton("MS");
		buttonMS.setEnabled(false);
		buttonMS.setBackground(new Color(255, 255, 255));

		buttonMR = new JButton("MR");
		buttonMR.setEnabled(false);
		buttonMR.setBackground(new Color(255, 255, 255));

		buttonMPlus = new JButton("M+");
		buttonMPlus.setEnabled(false);
		buttonMPlus.setBackground(new Color(255, 255, 255));

		buttonBar = new JButton("/");
		buttonBar.setForeground(new Color(255, 255, 255));
		buttonBar.setBackground(new Color(65, 105, 225));

		buttonSQRT = new JButton("sqrt");
		buttonSQRT.setForeground(new Color(255, 255, 255));
		buttonSQRT.setBackground(new Color(65, 105, 225));

		buttonMultiply = new JButton("*");
		buttonMultiply.setForeground(new Color(255, 255, 255));
		buttonMultiply.setBackground(new Color(65, 105, 225));

		buttonPercentage = new JButton("%");
		buttonPercentage.setForeground(new Color(255, 255, 255));
		buttonPercentage.setBackground(new Color(65, 105, 225));

		buttonMinus = new JButton("-");
		buttonMinus.setForeground(new Color(255, 255, 255));
		buttonMinus.setBackground(new Color(65, 105, 225));
		
		buttonPoint = new JButton(",");
		buttonPoint.setBackground(new Color(0, 0, 0));
		buttonPoint.setForeground(new Color(255, 255, 255));

		buttonPolarity = new JButton("+/-");
		buttonPolarity.setForeground(new Color(255, 255, 255));
		buttonPolarity.setBackground(new Color(65, 105, 225));
		buttonPlus = new JButton("+");
		buttonPlus.setForeground(new Color(255, 255, 255));
		buttonPlus.setBackground(new Color(65, 105, 225));
		
		buttonResult = new JButton("=");
		buttonResult.setBackground(new Color(0, 0, 0));
		buttonResult.setForeground(new Color(255, 255, 255));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(105, 105, 105));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(105, 105, 105));

		buttonDelete = new JButton("C");
		buttonDelete.setForeground(new Color(255, 255, 255));
		buttonDelete.setBackground(new Color(0, 0, 0));
		
		
		buttonAC = new JButton("AC");
		buttonAC.setForeground(new Color(255, 255, 255));
		buttonAC.setBackground(new Color(0, 0, 0));
		
		
		buttonArrow = new JButton("<-");
		buttonArrow.setForeground(new Color(255, 255, 255));
		buttonArrow.setBackground(new Color(0, 0, 0));
		

		// Añadimos los botones al programa
		botones.add(panel_1);
		botones.add(panel_2);
		botones.add(buttonDelete);
		botones.add(buttonAC);
		botones.add(buttonArrow);
		botones.add(buttonLeft);
		botones.add(buttonRight);
		botones.add(buttonMS);
		botones.add(buttonMR);
		botones.add(buttonMPlus);
		botones.add(button7);
		botones.add(button8);
		botones.add(button9);
		botones.add(buttonBar);
		botones.add(buttonSQRT);
		botones.add(button4);
		botones.add(button5);
		botones.add(button6);
		botones.add(buttonMultiply);
		botones.add(buttonPercentage);
		botones.add(button1);
		botones.add(button2);
		botones.add(button3);
		botones.add(buttonMinus);
		botones.add(buttonResult);
		botones.add(button0);
		botones.add(buttonPoint);
		botones.add(buttonPolarity);
		botones.add(buttonPlus);
		
		menuBar = new JMenuBar();
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setBackground(new Color(105, 105, 105));
		menuBar.setForeground(new Color(255, 255, 255));
		frame.setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setForeground(new Color(255, 255, 255));
		menuBar.add(mnArchivo);
		
		mntmAboutUs = new JMenuItem("About us...");
		mntmAboutUs.setBorder(new LineBorder(new Color(0, 0, 0)));
		mntmAboutUs.setBackground(new Color(105, 105, 105));
		mntmAboutUs.setForeground(new Color(255, 255, 255));
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Denis Duran Ibañez","About us...", JOptionPane.PLAIN_MESSAGE);
			}
		});
		mnArchivo.add(mntmAboutUs);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.setBorder(new LineBorder(new Color(0, 0, 0)));
		mntmExit.setBackground(new Color(105, 105, 105));
		mntmExit.setForeground(new Color(255, 255, 255));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmExit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object fuente = e.getSource();
		/* Numbers */
		if (fuente == button0) {
			textResult.setText(textResult.getText() + button0.getText());
			operation.setText(operation.getText() + button0.getText());
		} else if (fuente == button1) {
			textResult.setText(textResult.getText() + button1.getText());
			operation.setText(operation.getText() + button1.getText());
		} else if (fuente == button2) {
			textResult.setText(textResult.getText() + button2.getText());
			operation.setText(operation.getText() + button2.getText());
		} else if (fuente == button3) {
			textResult.setText(textResult.getText() + button3.getText());
			operation.setText(operation.getText() + button3.getText());
		} else if (fuente == button4) {
			textResult.setText(textResult.getText() + button4.getText());
			operation.setText(operation.getText() + button4.getText());
		} else if (fuente == button5) {
			textResult.setText(textResult.getText() + button5.getText());
			operation.setText(operation.getText() + button5.getText());
		} else if (fuente == button6) {
			textResult.setText(textResult.getText() + button6.getText());
			operation.setText(operation.getText() + button6.getText());
		} else if (fuente == button7) {
			textResult.setText(textResult.getText() + button7.getText());
			operation.setText(operation.getText() + button7.getText());
		} else if (fuente == button8) {
			textResult.setText(textResult.getText() + button8.getText());
			operation.setText(operation.getText() + button8.getText());
		} else if (fuente == button9) {
			textResult.setText(textResult.getText() + button9.getText());
			operation.setText(operation.getText() + button9.getText());
		}

		/* Decimals */
		else if (fuente == buttonPoint) {
			operation.setText(operation.getText() + ".");
			textResult.setText(textResult.getText() + ".");
		}

		/* Operations */
		else if (fuente == buttonPlus) {
			this.operationChar = buttonPlus.getText();
			operation.setText(operation.getText() + buttonPlus.getText());
			this.number = Double.parseDouble(textResult.getText());
			textResult.setText("");
		} else if (fuente == buttonMinus) {
			this.operationChar = buttonMinus.getText();
			operation.setText(operation.getText() + buttonMinus.getText());
			this.number = Double.parseDouble(textResult.getText());
			textResult.setText("");
		} else if (fuente == buttonBar) {
			this.operationChar = buttonBar.getText();
			operation.setText(operation.getText() + buttonBar.getText());
			this.number = Double.parseDouble(textResult.getText());
			textResult.setText("");
		} else if (fuente == buttonMultiply) {
			this.operationChar = buttonMultiply.getText();
			operation.setText(operation.getText() + buttonMultiply.getText());
			this.number = Double.parseDouble(textResult.getText());
			textResult.setText("");
		} else if (fuente == buttonPercentage) {
			this.operationChar = buttonPercentage.getText();
			operation.setText(operation.getText() + buttonPercentage.getText());
			this.number = Double.parseDouble(textResult.getText());
			textResult.setText("");
		} else if (fuente == buttonSQRT) {
			this.operationChar = buttonSQRT.getText();
			operation.setText(operation.getText() + "^");
			this.number = Double.parseDouble(textResult.getText());
			textResult.setText("");
		} else if (fuente == buttonPolarity) {
			this.operationChar = buttonPolarity.getText();
			String aux=textResult.getText();
			this.number = Double.parseDouble(textResult.getText());
			this.number -= this.number * 2;
			textResult.setText(Double.toString(this.number));
			if(textResult.getText().endsWith(".0")) {
				textResult.setText(textResult.getText().replace(".0",""));
			}
			operation.setText(operation.getText().replace(aux,textResult.getText()));
		} else if (fuente == buttonDelete) {
			this.number=0;
			operation.setText("");
			textResult.setText("");
		}else if (fuente == buttonAC) {
			this.number=0;
			textResult.setText("");
		}else if (fuente == buttonArrow) {
			String aux=textResult.getText();
			String aux2=operation.getText();
			textResult.setText(textResult.getText().substring(0,aux.length()-1));
			operation.setText(operation.getText().substring(0,aux2.length()-1));
		}else if (fuente == buttonResult) {
			operation.setText(operation.getText()+buttonResult.getText());
			Double secondNumber=Double.parseDouble(textResult.getText());
			switch (this.operationChar) {
				case "+":
					this.result=this.number + secondNumber; 
					break;
				case "-":
					this.result=this.number - secondNumber; 
					break;
				case "*":
					this.result=this.number * secondNumber; 
					break;
				case "/":
					this.result=this.number / secondNumber; 
					break;
				case "%":
					this.result=this.number * secondNumber/100; 
					break;
				case "sqrt":
					this.result=Math.pow(this.number,secondNumber); 
					break;
			}
			textResult.setText(Double.toString(this.result));
			
			if(textResult.getText().endsWith(".0")) {
				textResult.setText(textResult.getText().replace(".0",""));
			}
			
			operation.setText(operation.getText()+textResult.getText());
			
		}
		

	}

}
