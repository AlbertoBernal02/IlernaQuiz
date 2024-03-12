package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase JpanelF1_5 que representa un panel de juego relacionado con preguntas de Fórmula 1.
 */
public class JpanelF1_5 extends JPanel {
	/**
     * Constructor de la clase JpanelF1_5.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;


	public JpanelF1_5() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Qué piloto ha causado más sensación en la parrilla?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 36, 590, 219);
		
		
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
