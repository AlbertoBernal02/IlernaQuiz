package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase JpanelDeporte_4 que representa un panel de juego relacionado con preguntas de deportes.
 */
public class JpanelDeporte_4 extends JPanel {
	/**
     * Constructor de la clase JpanelDeporte_4.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;

	public JpanelDeporte_4() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Cuál es el máximo ganador de títulos de Wimbledon en categoría individual masculina?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 48, 590, 266);
		
		
		add(lblNewLabel);

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondoJuegoA.png"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
