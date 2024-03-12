package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase JpanelIlerna_5 que representa un panel de juego relacionado con preguntas sobre Ilerna.
 */
public class JpanelIlerna_5 extends JPanel {
	/**
     * Constructor de la clase JpanelIlerna_4.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;


	public JpanelIlerna_5() {

		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Somos más guapos que los de DAM?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 150, 590, 139);
		
		
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
