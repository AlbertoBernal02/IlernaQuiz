package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
 /**
 * Clase JpanelIlerna_2 que representa un panel de juego relacionado con preguntas sobre Ilerna.
 */
public class JpanelIlerna_2 extends JPanel {
	 /**
     * Constructor de la clase JpanelIlerna_2.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;

	public JpanelIlerna_2() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Cuál es el bocata favorito de 1º de DAW?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 119, 590, 121);
		
		
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