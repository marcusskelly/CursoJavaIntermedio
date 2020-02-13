package graficabarras;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GraficaBarras extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	boolean bandera = false;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraficaBarras frame = new GraficaBarras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GraficaBarras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Color favorito");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Rojo:");
		lblNewLabel_1.setBounds(10, 203, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Verde:");
		lblNewLabel_2.setBounds(10, 228, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Azul:");
		lblNewLabel_3.setBounds(10, 253, 46, 14);
		contentPane.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(39, 200, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(39, 253, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(49, 225, 76, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("Graficar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bandera = true;
				repaint();
			}
		});
		btnNewButton.setBounds(286, 224, 89, 23);
		contentPane.add(btnNewButton);
	}

	public int MayorValor(int valor_rojo, int valor_verde, int valor_azul) {
		if (valor_rojo > valor_verde && valor_rojo > valor_azul) {
			return valor_rojo;
		} else if (valor_verde > valor_azul) {
			return valor_verde;
		} else {
			return valor_azul;
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (bandera == true) {

			String string_rojo = textField.getText();
			String string_verde = textField_1.getText();
			String string_azul = textField_2.getText();

			int int_rojo = Integer.parseInt(string_rojo);
			int int_verde = Integer.parseInt(string_verde);
			int int_azul = Integer.parseInt(string_azul);

			int valor_Mayor = MayorValor(int_rojo, int_verde, int_azul);

			int largo_Rojo = int_rojo * 400 / valor_Mayor;
			int largo_Verde = int_verde * 400 / valor_Mayor;
			int largo_Azul = int_azul * 400 / valor_Mayor;

			g.setColor(new Color(255, 0, 0));
			g.fillRect(100, 70, largo_Rojo, 40);
			g.drawString("Color Rojo", 500, 90);

			g.setColor(new Color(0, 130, 0));
			g.fillRect(100, 120, largo_Verde, 40);
			g.drawString("Color Verde", 500, 150);

			g.setColor(new Color(0, 0, 255));
			g.fillRect(100, 170, largo_Azul, 40);
			g.drawString("Color Azul", 500, 200);

		}
	}
}
