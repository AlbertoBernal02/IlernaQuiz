package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase JpanelIlerna que representa un panel de juego relacionado con preguntas sobre Ilerna.
 */
public class JpanelIlerna extends JPanel {

	/**
     * Constructor de la clase JpanelIlerna.
     * Inicializa el panel de juego y sus componentes.
     */
	public JpanelIlerna() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Quien es el jugador que más monitores ha roto en el curso?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 60, 590, 194);
		
		
		add(lblNewLabel);

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondoJuegoV.png"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
