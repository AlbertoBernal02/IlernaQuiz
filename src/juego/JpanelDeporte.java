package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase JpanelDeporte que representa un panel de juego relacionado con preguntas de deportes.
 */
public class JpanelDeporte extends JPanel {

	/**
     * Constructor de la clase JpanelDeporte.
     * Inicializa el panel de juego y sus componentes.
     */
	public JpanelDeporte() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿En qué deporte se utiliza una pelota de tamaño más grande?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 103, 590, 186);
		
		
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
