package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase JpanelDeporte_3 que representa un panel de juego relacionado con preguntas de deportes.
 */
public class JpanelDeporte_3 extends JPanel {
	/**
     * Constructor de la clase JpanelDeporte_3.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;


	public JpanelDeporte_3() {


		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Cuántos jugadores hay en un equipo de fútbol?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 150, 590, 139);
		
		
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