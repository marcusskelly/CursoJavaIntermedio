package graficas;

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

public class GraficaCircular extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	boolean bandera = false;

	private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {
		bandera = true;
		repaint();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraficaCircular frame = new GraficaCircular();
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
	public GraficaCircular() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Color Favorito");
		lblNewLabel.setBounds(180, 11, 82, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Rojo:");
		lblNewLabel_1.setBounds(10, 199, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Verde:");
		lblNewLabel_2.setBounds(10, 224, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Azul:");
		lblNewLabel_3.setBounds(10, 249, 46, 14);
		contentPane.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(40, 196, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(50, 221, 74, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(40, 246, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("Graficar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bandera = true;
				repaint();
			}
		});
		btnNewButton.setBounds(278, 221, 89, 23);
		contentPane.add(btnNewButton);
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

			int total_votos = int_rojo + int_verde + int_azul;

			int grados_rojo = int_rojo * 360 / total_votos;
			int grados_verde = int_verde * 360 / total_votos;
			int grados_azul = int_azul * 360 / total_votos;

			g.setColor(new Color(255, 0, 0));
			g.fillArc(25, 80, 200, 200, 0, grados_rojo);
			g.fillRect(250, 120, 20, 20);
			g.drawString("Color Rojo", 275, 135);

			g.setColor(new Color(0, 130, 0));
			g.fillArc(25, 80, 200, 200, grados_rojo, grados_verde);
			g.fillRect(250, 150, 20, 20);
			g.drawString("Color Verde", 275, 165);

			g.setColor(new Color(0, 0, 255));
			g.fillArc(25, 80, 200, 200, grados_rojo + grados_verde, grados_azul);
			g.fillRect(250, 180, 20, 20);
			g.drawString("Color Azul", 275, 195);

		}
	}
}
