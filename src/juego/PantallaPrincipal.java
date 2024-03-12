package juego;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 /**
 * Clase PantallaPrincipal que representa la pantalla principal del juego.
 */
public class PantallaPrincipal extends JPanel {

	JLabel lblIlernaquiz = new JLabel("ILERNAQUIZ");
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);

	 /**
     * Constructor de la clase PantallaPrincipal.
     * Inicializa la pantalla principal del juego.
     */
	public PantallaPrincipal() {
		// Establecer el layout a null
		setLayout(null);
		// Boton de instrucciones
		
		lblIlernaquiz.setForeground(new Color(255, 255, 255));

		
		// -----------------------------------------------------------------------------------
		// Configurar la posición y el tamaño del label
		lblIlernaquiz.setFont(new Font("Broadway", Font.ITALIC, 50));
		lblIlernaquiz.setBounds(800, 150, 363, 50); // Establecer posición y tamaño del label
		add(lblIlernaquiz);
		
		
		// foto logo IlernaQuiz
        JLabel Label_trivia = new JLabel();
        Label_trivia.setBounds(732, 229, 1244, 725); // Establece el tamaño adecuado para la imagen
        add(Label_trivia);
        
        // Cargar la imagen desde el paquete de recursos
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/recursos/PreguntadosIconos.png"));
        Label_trivia.setIcon(imagen1);
	}


	
	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondotrivia.jpg"));
		g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}
}