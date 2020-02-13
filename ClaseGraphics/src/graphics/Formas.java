package graphics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formas extends JFrame {

	private JPanel contentPane;

	public Formas() {

		this.setBounds(0, 0, 600, 400);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formas frame = new Formas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);
		g.drawLine(0, 70, 100, 70);
		g.drawRect(150, 70, 50, 70);
		g.drawRoundRect(250, 70, 50, 70, 6, 6);
		g.drawOval(350, 70, 50, 70);

		int vectorX[] = { 500, 550, 450 };
		int vectory[] = { 70, 120, 120 };
		g.drawPolygon(vectorX, vectory, 3);

		g.setColor(Color.GREEN);
		g.fillRect(150, 270, 50, 70);
		g.fillRoundRect(250, 270, 50, 70, 6, 6);
		g.fillOval(350, 270, 50, 70);

		int[] vectorx2 = { 500, 550, 450 };
		int[] vectory2 = { 270, 320, 320 };
		g.fillPolygon(vectorx2, vectory2, 3);

	}

}
