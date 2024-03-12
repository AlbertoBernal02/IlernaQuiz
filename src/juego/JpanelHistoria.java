package juego;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 * Clase JpanelHistoria que representa un panel de juego relacionado con preguntas de historia.
 */
public class JpanelHistoria extends JPanel {
	/**
     * Constructor de la clase JpanelHistoria.
     * Inicializa el panel de juego y sus componentes.
     */
	private static final long serialVersionUID = 1L;

	
	public JpanelHistoria() {
        setLayout(null);

		JLabel lblNewLabel = new JLabel("<html>¿Cuál fue la primera civilización en desarrollar un sistema de escritura?</html>");
		
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
		lblNewLabel.setBounds(680, 85, 590, 204);
		
		
		add(lblNewLabel);

	}
	
	@Override
	public void paintComponent(Graphics g) {
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondoJuegoAz.png"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}