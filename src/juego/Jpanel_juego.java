package juego;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

/**
 * Clase Jpanel_juego que representa un panel de juego para ILERNAQUIZ.
 */
public class Jpanel_juego extends JPanel {

    JLabel lblIlernaquiz = new JLabel("ILERNAQUIZ");
    Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
    
  

    /**
     * Constructor de la clase Jpanel_juego.
     * Inicializa el panel de juego y sus componentes.
     */
    public Jpanel_juego() {
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("JUGUEMOS!!");
        lblNewLabel.setForeground(new Color(255, 0, 128));
        lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
        lblNewLabel.setBounds(800, 150, 470, 90);
        add(lblNewLabel);
        
       
        JLabel Label_dado = new JLabel();
        Label_dado.setBounds(600, 250, 960, 540); // Establece el tamaño adecuado para la imagen
        add(Label_dado);
        
        // Cargar la imagen desde el paquete de recursos
        ImageIcon imagen = new ImageIcon(getClass().getResource("/recursos/dado.com.png"));
        Label_dado.setIcon(imagen);
        
    }

     /**
     * Método paintComponent para dibujar el fondo del panel de juego.
     */
    @Override
    public void paintComponent(Graphics g) {
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/fondotrivia.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
