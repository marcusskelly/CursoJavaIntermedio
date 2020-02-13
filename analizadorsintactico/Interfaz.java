package analizadorsintactico;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txt_expresion;

	/**
	 * Launch the application.
	 */
	public boolean ValidarExpresion() {
		Pila pila = new Pila() {
		String cadena = txt_expresion.getText();
		
		for(int i = 0; i<cadena.length();i++) {
			if(cadena.charAt(i)== " ( " || cadena.chartAt(i)== " [ " || cadena.chartAt(i)==" { ") {
				pila.Insertar(cadena.chartAt(i));
			}else {
				
				if (cadena.charAt(i)== ") ") {
					
					if(pila.extraer() != " {") {
						return false;
					}
				}else {
					
					if(cadena.charAt(i)=="]") {
						
						if(pila.Extraer()!= "[") {
							return false;
						}
					}else {
						if(cadena.charAt(i)==")") {
							if(pila.Extraer()!= "(") {
								return false;
							}
						}
					}
				}
			}
		}
		
		
	
	
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		txt_expresion = new JTextField();
		txt_expresion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txt_expresion.setHorizontalAlignment(SwingConstants.LEFT);
		txt_expresion.setText("txt_expresion");
		contentPane.add(txt_expresion, BorderLayout.NORTH);
		txt_expresion.setColumns(10);

		JButton btnNewButton = new JButton("Validar expresion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
	}

}
