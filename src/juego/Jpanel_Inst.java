package juego;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jpanel_Inst extends JPanel {

	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Jpanel_Inst() {
		// Establecer el layout a null
				setLayout(null);
				
				JLabel lblNewLabel = new JLabel("<html><u><b>INSTRUCCIONES<b><u></html>");
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 60));
				lblNewLabel.setBounds(739, 150, 531, 90);
				add(lblNewLabel);


				JLabel lblNewLabel_1 = new JLabel("<html>1. Comienza el juego: El jugador tira el dado.</html>");
				lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_1.setForeground(new Color(255, 255, 255));
				lblNewLabel_1.setBounds(600, 260, 601, 47);
				add(lblNewLabel_1);

				JLabel lblNewLabel_2 = new JLabel("<html>2. Dependiendo del resultado del dado, nos habrá tocado alguna asignatura.</html>");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_2.setForeground(new Color(255, 255, 255));
				lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_2.setBounds(600, 340, 907, 74);
				add(lblNewLabel_2);

				JLabel lblNewLabel_3 = new JLabel("<html>3. Responder la pregunta: El jugador leera la pregunta y tendrá que elegir cual de las cuatro opciones es correcta.</html>");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_3.setForeground(new Color(255, 255, 255));
				lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_3.setBounds(600, 440, 907, 90);
				add(lblNewLabel_3);

				JLabel lblNewLabel_4 = new JLabel("<html>4. Si la respuesta del jugador es correcta, este anotará un punto. Si es incorrecta, no se le anotará ningún punto.</html>");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_4.setForeground(new Color(255, 255, 255));
				lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_4.setBounds(600, 540, 907, 90);
				add(lblNewLabel_4);

				JLabel lblNewLabel_5 = new JLabel("<html>5. Si el jugador todavía no ha conseguido la puntuación máxima seguirá jugando.</html>");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_5.setForeground(new Color(255, 255, 255));
				lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_5.setBounds(600, 640, 907, 90);
				add(lblNewLabel_5);

				JLabel lblNewLabel_6 = new JLabel("<html>6. Si el jugador ya tiene una puntuación de 5 puntos, habrá ganado el juego y este terminará.</html>");
				lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
				lblNewLabel_6.setForeground(new Color(255, 255, 255));
				lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel_6.setBounds(600, 740, 907, 90);
				add(lblNewLabel_6);
				



	}
	@Override
	public void paintComponent(Graphics g) {
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondo_inst.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
