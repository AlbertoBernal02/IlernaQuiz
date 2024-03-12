package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase JpanelF1_2 que representa un panel de juego relacionado con preguntas de Fórmula 1.
 */
public class JpanelF1_2 extends JPanel {
	/**
     * Constructor de la clase JpanelF1_2.
     * Inicializa el panel de juego y sus componentes.
     */
	public JpanelF1_2() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Cuál es el circuito más famoso de la Fórmula 1?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 116, 590, 143);
		
		
		add(lblNewLabel);

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondoJuegoR.png"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
