package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
 /**
 * Clase RespuestaErronea que representa un panel para mostrar una respuesta incorrecta.
 */
public class RespuestaErronea extends JPanel {
	/**
     * Constructor de la clase RespuestaErronea.
     * Inicializa el panel de respuesta incorrecta.
     */
	private static final long serialVersionUID = 1L;

	public RespuestaErronea() {

		setLayout(null);	
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/error.png"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}
}