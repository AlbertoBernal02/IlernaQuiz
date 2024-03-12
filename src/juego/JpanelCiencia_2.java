package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JpanelCiencia_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public JpanelCiencia_2() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Cuál es la partícula subatómica con carga eléctrica negativa?</html>");
		
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 150, 590, 90);
		
		
		add(lblNewLabel);

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondotrivia.jpg"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
