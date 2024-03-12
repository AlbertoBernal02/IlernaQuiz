package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase JpanelArte_5 que representa un panel de juego relacionado con preguntas de arte.
 */
public class JpanelArte_5 extends JPanel {

	/**
     * Constructor de la clase JpanelArte_5.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;

	
	public JpanelArte_5() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿En qué año se estrenó la película Star Wars?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 150, 590, 150);
		
		
		add(lblNewLabel);

	}
	
	/**
     * Método paint para dibujar el fondo del panel de juego.
     * 
     * @param g se le imprime un fondo a este panel.
     */
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondoJuegoM.png"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
