package juego;

/**
 * Clase Frame que representa la interfaz gráfica del juego.
 * Esta clase contiene todos los componentes necesarios para el funcionamiento del juego.
 * 
 * @author AlbertoBernal y JulioGarcía
 * @version 1.0
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; // Importar para mezclar las respuestas
import java.util.Random;


public class Frame extends JFrame {

	PantallaPrincipal panel1 = new PantallaPrincipal();
	Jpanel_Inst panel2 = new Jpanel_Inst();
	Jpanel_juego panel3 = new Jpanel_juego();    
	JpanelHistoria panel4 = new JpanelHistoria();
	JpanelF1_1 panel5 = new JpanelF1_1();
	JpanelArte panel6 = new JpanelArte();
	JpanelIlerna panel7 = new JpanelIlerna();
	JpanelDeporte panel8 = new JpanelDeporte();
	JpanelF1_2 panel9 = new JpanelF1_2();
	JpanelDeporte_2 panel10 = new JpanelDeporte_2();
	JpanelArte_2 panel11 = new JpanelArte_2();
	JpanelHistoria_2 panel12 = new JpanelHistoria_2();
	JpanelArte_3 panel13 = new JpanelArte_3();
	JpanelArte_4 panel14 = new JpanelArte_4();
	JpanelArte_5 panel15 = new JpanelArte_5();
	JpanelHistoria_3 panel16 = new JpanelHistoria_3();
	JpanelHistoria_4 panel17 = new JpanelHistoria_4();
	JpanelHistoria_5 panel18 = new JpanelHistoria_5();
	JpanelDeporte_3 panel19 = new JpanelDeporte_3();
	JpanelF1_3 panel20 = new JpanelF1_3();
	JpanelF1_4 panel21 = new JpanelF1_4();
	JpanelDeporte_4 panel22 = new JpanelDeporte_4();
	JpanelDeporte_5 panel23 = new JpanelDeporte_5();
	JpanelF1_5 panel24 = new JpanelF1_5();
	JpanelIlerna_2 panel30 = new JpanelIlerna_2();
	JpanelIlerna_3 panel31 = new JpanelIlerna_3();
	JpanelIlerna_4 panel32 = new JpanelIlerna_4();
	JpanelIlerna_5 panel33 = new JpanelIlerna_5();
	RespuestaErronea panel34 = new RespuestaErronea();

	// ---------------------------------------------------

	JButton btn_inst = new JButton("Instrucciones");
	JButton btn_jugar = new JButton("Jugar"); 
	// ---------------------------------------------------
	JButton tirarDado = new JButton("TIRAR EL DADO"); 
	// ---------------------------------------------------
	JButton btn_menu = new JButton("Volver al menú"); 
	// -----------------------------------------------------
	JButton btn_error = new JButton ("Nuevo Intento");
	//-----------------------------------------------------
	// botones historia 1
	JButton btn_historia1 = new JButton("Egipcios"); 
	JButton btn_historia2 = new JButton("Sumerios"); //--
	JButton btn_historia3 = new JButton("Griegos"); 
	JButton btn_historia4 = new JButton("Romanos"); 

	// botones historia 2
	JButton btn_historia1_2 = new JButton("El bombardeo de Hiroshima y Nagasaki"); 
	JButton btn_historia2_2 = new JButton("La invasión de Normandía"); 
	JButton btn_historia3_2 = new JButton("La rendición de Japón"); 
	JButton btn_historia4_2 = new JButton("La rendición de Alemania nazi");//--

	// botones historia 3
	JButton btn_historia1_3 = new JButton("La Toma de la Bastilla"); //--
	JButton btn_historia2_3 = new JButton("La Declaración de los Derechos del Hombre y del Ciudadano"); 
	JButton btn_historia3_3 = new JButton("La muerte del Rey Luis XVI"); 
	JButton btn_historia4_3 = new JButton("La Juramentación del Juego de Pelota");

	// botones historia 4
	JButton btn_historia1_4 = new JButton(" El desarrollo del ferrocarril y la máquina de vapor"); 
	JButton btn_historia2_4 = new JButton("El aumento de la producción industrial y el comercio"); 
	JButton btn_historia3_4 = new JButton("El crecimiento de las ciudades y la clase obrera"); 
	JButton btn_historia4_4 = new JButton("Todas las anteriores");//--

	// botones historia 5
	JButton btn_historia1_5 = new JButton("1985"); 
	JButton btn_historia2_5 = new JButton("1989"); //--
	JButton btn_historia3_5 = new JButton("1990"); 
	JButton btn_historia4_5 = new JButton("1991");

	// botones deporte
	JButton btn_deporte1 = new JButton("Tenis"); 
	JButton btn_deporte2 = new JButton("Golf"); 
	JButton btn_deporte3 = new JButton("Baloncesto"); //--
	JButton btn_deporte4 = new JButton("Rugby"); 

	// botones deporte_2
	JButton btn_deporte1_2 = new JButton("Brasil"); 
	JButton btn_deporte2_2 = new JButton("Alemania"); 
	JButton btn_deporte3_2 = new JButton("Francia"); //--
	JButton btn_deporte4_2 = new JButton("Argentina"); 

	// botones deporte_3
	JButton btn_deporte1_3 = new JButton("10"); 
	JButton btn_deporte2_3 = new JButton("11"); //--
	JButton btn_deporte3_3 = new JButton("12"); 
	JButton btn_deporte4_3 = new JButton("33"); 

	// botones deporte_4
	JButton btn_deporte1_4 = new JButton("Roger Federer"); 
	JButton btn_deporte2_4 = new JButton("Rafael Nadal"); 
	JButton btn_deporte3_4 = new JButton("Novak Djokovic");//-- 
	JButton btn_deporte4_4 = new JButton("Pete Sampras"); 

	// botones deporte_5
	JButton btn_deporte1_5 = new JButton("Estados Unidos"); //--
	JButton btn_deporte2_5 = new JButton("Francia"); 
	JButton btn_deporte3_5 = new JButton("Italia");
	JButton btn_deporte4_5 = new JButton("Japón"); 

	// botones F1 1
	JButton btn_f1 = new JButton("Michael Schumacher"); 
	JButton btn_f2 = new JButton("Lewis Hamilton"); //--
	JButton btn_f3 = new JButton("Juan Manuel Fangio");
	JButton btn_f4 = new JButton("Alain Prost");

	// botones F1 2
	JButton btn_f1_2 = new JButton("Spa-Francorchamps"); 
	JButton btn_f2_2 = new JButton("Monza");
	JButton btn_f3_2 = new JButton("Silverstone");
	JButton btn_f4_2 = new JButton("Mónaco");//--

	// botones F1 3
	JButton btn_f1_3 = new JButton("Ferrari"); //--
	JButton btn_f2_3 = new JButton("Mercedes");
	JButton btn_f3_3 = new JButton("McLaren");
	JButton btn_f4_3 = new JButton("Williams");

	// botones F1 4
	JButton btn_f1_4 = new JButton("369,9 km/h");
	JButton btn_f2_4 = new JButton("372,5 km/h");//--
	JButton btn_f3_4 = new JButton("397,4 km/h");
	JButton btn_f4_4 = new JButton("413,3 km/h");

	// botones F1 5
	JButton btn_f1_5 = new JButton("Ayrton Senna");
	JButton btn_f2_5 = new JButton("Michael Schumacher");
	JButton btn_f3_5 = new JButton("Fernando Alonso (El Nano)");//--
	JButton btn_f4_5 = new JButton("Nicholas Latifi");

	//botones Arte 1
	JButton btnarte1 = new JButton("Avatar (2009)"); 
	JButton btnarte2 = new JButton("Avengers: Endgame (2019)");
	JButton btnarte3 = new JButton("Titanic (1997)");
	JButton btnarte4 = new JButton("Avatar: The Way of Water (2022)");//--

	//botones Arte 2
	JButton btnarte1_2 = new JButton("J.R.R. Tolkien"); //--
	JButton btnarte2_2 = new JButton("C.S. Lewis");
	JButton btnarte3_2 = new JButton("George R.R. Martin");
	JButton btnarte4_2 = new JButton("J.K. Rowling");

	//botones Arte 3
	JButton btnarte1_3 = new JButton("Ocho apellidos vascos"); //--
	JButton btnarte2_3 = new JButton("Lo imposible");
	JButton btnarte3_3 = new JButton("Campeones");
	JButton btnarte4_3 = new JButton("Torrente 4");

	//botones Arte 4
	JButton btnarte1_4 = new JButton("Juego de Tronos"); 
	JButton btnarte2_4 = new JButton("Breaking Bad");
	JButton btnarte3_4 = new JButton("Stranger Things");//--
	JButton btnarte4_4 = new JButton("The Big Bang Theory");

	//botones Arte 5
	JButton btnarte1_5 = new JButton("1977"); //--
	JButton btnarte2_5 = new JButton("1980");
	JButton btnarte3_5 = new JButton("1983");
	JButton btnarte4_5 = new JButton("1986");

	//botones Ilerna1
	JButton btnilerna1 = new JButton("Jimmy No Fear"); 
	JButton btnilerna2 = new JButton("José"); //--
	JButton btnilerna3 = new JButton("Jose");
	JButton btnilerna4 = new JButton("Rogolo");

	//botones Ilerna2
	JButton btnilerna1_2 = new JButton("Empanao Ali-Oli caliente"); 
	JButton btnilerna2_2 = new JButton("Tortilla Mayo");
	JButton btnilerna3_2 = new JButton("PRG");//--
	JButton btnilerna4_2 = new JButton("Hamburguesa queso mayo");

	//botones Ilerna3
	JButton btnilerna1_3 = new JButton("José"); 
	JButton btnilerna2_3 = new JButton("El Lokito");//--
	JButton btnilerna3_3 = new JButton("Matito");
	JButton btnilerna4_3 = new JButton("Bertico");

	//botones Ilerna4
	JButton btnilerna1_4 = new JButton("Dos"); 
	JButton btnilerna2_4 = new JButton("Cero");
	JButton btnilerna3_4 = new JButton("Nueve");//--
	JButton btnilerna4_4 = new JButton("Cinco");

	//botones Ilerna5
	JButton btnilerna1_5 = new JButton("Si"); 
	JButton btnilerna2_5 = new JButton("No");
	JButton btnilerna3_5 = new JButton("Obvio");//--
	JButton btnilerna4_5 = new JButton("No sabe Nocontesta");
	/*
	   private int puntos = 0; // Variable para almacenar el puntaje
	   private JLabel lblPuntos; // El JLabel que mostrará los punto
	 */

	public Frame(){
		// Establecer el icono de la ventana
		ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/LogoTrivia.png")); // Ruta a tu icono
		setIconImage(icono.getImage());


		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null); 
		/*
		JLabel lblPuntos = new JLabel("Puntos: "+ puntos);
	       lblPuntos.setForeground(new Color(255, 0, 128));
	       lblPuntos.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
	       lblPuntos.setBounds(0, 0, 291, 90);
	       add(lblPuntos);
		 */

		panel1.setBounds(0, 0, 1920, 1080);
		panel2.setBounds(0, 0, 1920, 1080);
		panel3.setBounds(0, 0, 1920, 1080);
		panel4.setBounds(0, 0, 1920, 1080);
		panel5.setBounds(0, 0, 1920, 1080);
		panel6.setBounds(0, 0, 1920, 1080);
		panel7.setBounds(0, 0, 1920, 1080);
		panel8.setBounds(0, 0, 1920, 1080);
		panel9.setBounds(0, 0, 1920, 1080);
		panel10.setBounds(0, 0, 1920, 1080);
		panel11.setBounds(0, 0, 1920, 1080);
		panel12.setBounds(0, 0, 1920, 1080);
		panel13.setBounds(0, 0, 1920, 1080);
		panel14.setBounds(0, 0, 1920, 1080);
		panel15.setBounds(0, 0, 1920, 1080);
		panel16.setBounds(0, 0, 1920, 1080);
		panel17.setBounds(0, 0, 1920, 1080);
		panel18.setBounds(0, 0, 1920, 1080);
		panel19.setBounds(0, 0, 1920, 1080);
		panel20.setBounds(0, 0, 1920, 1080);
		panel21.setBounds(0, 0, 1920, 1080);
		panel22.setBounds(0, 0, 1920, 1080);
		panel23.setBounds(0, 0, 1920, 1080);
		panel24.setBounds(0, 0, 1920, 1080);
		panel30.setBounds(0, 0, 1920, 1080);
		panel31.setBounds(0, 0, 1920, 1080);
		panel32.setBounds(0, 0, 1920, 1080);
		panel33.setBounds(0, 0, 1920, 1080);
		panel34.setBounds(0, 0, 1920, 1080);

		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);     
		this.add(panel7);     
		this.add(panel8); 
		this.add(panel9); 
		this.add(panel10); 
		this.add(panel11); 
		this.add(panel12); 
		this.add(panel13); 
		this.add(panel14); 
		this.add(panel15); 
		this.add(panel16); 
		this.add(panel17); 
		this.add(panel18); 
		this.add(panel19); 
		this.add(panel20); 
		this.add(panel21); 
		this.add(panel22); 
		this.add(panel23); 
		this.add(panel24); 
		this.add(panel30); 
		this.add(panel31); 
		this.add(panel32); 
		this.add(panel33); 
		this.add(panel34); 


		btn_jugar.setBounds(285, 890, 130, 30);
		btn_jugar.setBackground(Color.cyan);

		btn_inst.setBounds(1535, 890, 130, 30);
		//btn_inst.setIcon(new ImageIcon (getClass() .getResource("/recursos/boton (1).jpeg") ) );
		btn_inst.setBackground(Color.cyan);

		btn_menu.setBounds(1535, 890, 130, 30);
		btn_menu.setBackground(Color.cyan);

		tirarDado.setBounds(800, 850, 400, 60); 
		tirarDado.setBackground(Color.CYAN);


		btn_error.setBounds(720, 300, 400, 60); 
		btn_error.setBackground(Color.WHITE);
		//-------------------------------------------------------------
		// botones historia 1
		btn_historia1.setBounds(550, 340, 907, 90);
		btn_historia1.setBackground(new Color(55, 126, 182));

		btn_historia2.setBounds(550, 460, 907, 90);
		btn_historia2.setBackground(new Color(55, 126, 182));

		btn_historia3.setBounds(550, 580, 907, 90);
		btn_historia3.setBackground(new Color(55, 126, 182));

		btn_historia4.setBounds(550, 700, 907, 90);
		btn_historia4.setBackground(new Color(55, 126, 182));

		// botones historia 2
		btn_historia1_2.setBounds(550, 340, 907, 90);
		btn_historia1_2.setBackground(new Color(55, 126, 182));

		btn_historia2_2.setBounds(550, 460, 907, 90);
		btn_historia2_2.setBackground(new Color(55, 126, 182));

		btn_historia3_2.setBounds(550, 580, 907, 90);
		btn_historia3_2.setBackground(new Color(55, 126, 182));

		btn_historia4_2.setBounds(550, 700, 907, 90);
		btn_historia4_2.setBackground(new Color(55, 126, 182));

		// botones historia 3
		btn_historia1_3.setBounds(550, 340, 907, 90);
		btn_historia1_3.setBackground(new Color(55, 126, 182));

		btn_historia2_3.setBounds(550, 460, 907, 90);
		btn_historia2_3.setBackground(new Color(55, 126, 182));

		btn_historia3_3.setBounds(550, 580, 907, 90);
		btn_historia3_3.setBackground(new Color(55, 126, 182));

		btn_historia4_3.setBounds(550, 700, 907, 90);
		btn_historia4_3.setBackground(new Color(55, 126, 182));	

		// botones historia 4
		btn_historia1_4.setBounds(550, 340, 907, 90);
		btn_historia1_4.setBackground(new Color(55, 126, 182));

		btn_historia2_4.setBounds(550, 460, 907, 90);
		btn_historia2_4.setBackground(new Color(55, 126, 182));

		btn_historia3_4.setBounds(550, 580, 907, 90);
		btn_historia3_4.setBackground(new Color(55, 126, 182));

		btn_historia4_4.setBounds(550, 700, 907, 90);
		btn_historia4_4.setBackground(new Color(55, 126, 182));

		// botones historia 5
		btn_historia1_5.setBounds(550, 340, 907, 90);
		btn_historia1_5.setBackground(new Color(55, 126, 182));

		btn_historia2_5.setBounds(550, 460, 907, 90);
		btn_historia2_5.setBackground(new Color(55, 126, 182));

		btn_historia3_5.setBounds(550, 580, 907, 90);
		btn_historia3_5.setBackground(new Color(55, 126, 182));

		btn_historia4_5.setBounds(550, 700, 907, 90);
		btn_historia4_5.setBackground(new Color(55, 126, 182));

		// botones deporte 1
		btn_deporte1.setBounds(550, 340, 907, 90);
		btn_deporte1.setBackground(new Color(194, 229, 46));

		btn_deporte2.setBounds(550, 460, 907, 90);
		btn_deporte2.setBackground(new Color(194, 229, 46));

		btn_deporte3.setBounds(550, 580, 907, 90);
		btn_deporte3.setBackground(new Color(194, 229, 46));

		btn_deporte4.setBounds(550, 700, 907, 90);
		btn_deporte4.setBackground(new Color(194, 229, 46));

		// botones deporte 2
		btn_deporte1_2.setBounds(550, 340, 907, 90);
		btn_deporte1_2.setBackground(new Color(194, 229, 46));

		btn_deporte2_2.setBounds(550, 460, 907, 90);
		btn_deporte2_2.setBackground(new Color(194, 229, 46));

		btn_deporte3_2.setBounds(550, 580, 907, 90);
		btn_deporte3_2.setBackground(new Color(194, 229, 46));

		btn_deporte4_2.setBounds(550, 700, 907, 90);
		btn_deporte4_2.setBackground(new Color(194, 229, 46));

		// botones deporte 3
		btn_deporte1_3.setBounds(550, 340, 907, 90);
		btn_deporte1_3.setBackground(new Color(194, 229, 46));

		btn_deporte2_3.setBounds(550, 460, 907, 90);
		btn_deporte2_3.setBackground(new Color(194, 229, 46));

		btn_deporte3_3.setBounds(550, 580, 907, 90);
		btn_deporte3_3.setBackground(new Color(194, 229, 46));

		btn_deporte4_3.setBounds(550, 700, 907, 90);
		btn_deporte4_3.setBackground(new Color(194, 229, 46));

		// botones deporte 4
		btn_deporte1_4.setBounds(550, 340, 907, 90);
		btn_deporte1_4.setBackground(new Color(194, 229, 46));

		btn_deporte2_4.setBounds(550, 460, 907, 90);
		btn_deporte2_4.setBackground(new Color(194, 229, 46));

		btn_deporte3_4.setBounds(550, 580, 907, 90);
		btn_deporte3_4.setBackground(new Color(194, 229, 46));

		btn_deporte4_4.setBounds(550, 700, 907, 90);
		btn_deporte4_4.setBackground(new Color(194, 229, 46));

		// botones deporte 5
		btn_deporte1_5.setBounds(550, 340, 907, 90);
		btn_deporte1_5.setBackground(new Color(194, 229, 46));

		btn_deporte2_5.setBounds(550, 460, 907, 90);
		btn_deporte2_5.setBackground(new Color(194, 229, 46));

		btn_deporte3_5.setBounds(550, 580, 907, 90);
		btn_deporte3_5.setBackground(new Color(194, 229, 46));

		btn_deporte4_5.setBounds(550, 700, 907, 90);
		btn_deporte4_5.setBackground(new Color(194, 229, 46));

		// botones formula1 1
		btn_f1.setBounds(550, 340, 907, 90);
		btn_f1.setBackground(new Color(231, 76, 60));

		btn_f2.setBounds(550, 460, 907, 90);
		btn_f2.setBackground(new Color(231, 76, 60));

		btn_f3.setBounds(550, 580, 907, 90);
		btn_f3.setBackground(new Color(231, 76, 60));

		btn_f4.setBounds(550, 700, 907, 90);
		btn_f4.setBackground(new Color(231, 76, 60));

		// botones formula1 2
		btn_f1_2.setBounds(550, 340, 907, 90);
		btn_f1_2.setBackground(new Color(231, 76, 60));

		btn_f2_2.setBounds(550, 460, 907, 90);
		btn_f2_2.setBackground(new Color(231, 76, 60));

		btn_f3_2.setBounds(550, 580, 907, 90);
		btn_f3_2.setBackground(new Color(231, 76, 60));

		btn_f4_2.setBounds(550, 700, 907, 90);
		btn_f4_2.setBackground(new Color(231, 76, 60));

		// botones formula1 3
		btn_f1_3.setBounds(550, 340, 907, 90);
		btn_f1_3.setBackground(new Color(231, 76, 60));

		btn_f2_3.setBounds(550, 460, 907, 90);
		btn_f2_3.setBackground(new Color(231, 76, 60));

		btn_f3_3.setBounds(550, 580, 907, 90);
		btn_f3_3.setBackground(new Color(231, 76, 60));

		btn_f4_3.setBounds(550, 700, 907, 90);
		btn_f4_3.setBackground(new Color(231, 76, 60));

		// botones formula1 4
		btn_f1_4.setBounds(550, 340, 907, 90);
		btn_f1_4.setBackground(new Color(231, 76, 60));

		btn_f2_4.setBounds(550, 460, 907, 90);
		btn_f2_4.setBackground(new Color(231, 76, 60));

		btn_f3_4.setBounds(550, 580, 907, 90);
		btn_f3_4.setBackground(new Color(231, 76, 60));

		btn_f4_4.setBounds(550, 700, 907, 90);
		btn_f4_4.setBackground(new Color(231, 76, 60));

		// botones formula1 5
		btn_f1_5.setBounds(550, 340, 907, 90);
		btn_f1_5.setBackground(new Color(231, 76, 60));

		btn_f2_5.setBounds(550, 460, 907, 90);
		btn_f2_5.setBackground(new Color(231, 76, 60));

		btn_f3_5.setBounds(550, 580, 907, 90);
		btn_f3_5.setBackground(new Color(231, 76, 60));

		btn_f4_5.setBounds(550, 700, 907, 90);
		btn_f4_5.setBackground(new Color(231, 76, 60));

		// botones arte 1
		btnarte1.setBounds(550, 340, 907, 90);
		btnarte1.setBackground(new Color(242, 135, 232));

		btnarte2.setBounds(550, 460, 907, 90);
		btnarte2.setBackground(new Color(242, 135, 232));

		btnarte3.setBounds(550, 580, 907, 90);
		btnarte3.setBackground(new Color(242, 135, 232));

		btnarte4.setBounds(550, 700, 907, 90);
		btnarte4.setBackground(new Color(242, 135, 232));

		// botones arte 2
		btnarte1_2.setBounds(550, 340, 907, 90);
		btnarte1_2.setBackground(new Color(242, 135, 232));

		btnarte2_2.setBounds(550, 460, 907, 90);
		btnarte2_2.setBackground(new Color(242, 135, 232));

		btnarte3_2.setBounds(550, 580, 907, 90);
		btnarte3_2.setBackground(new Color(242, 135, 232));

		btnarte4_2.setBounds(550, 700, 907, 90);
		btnarte4_2.setBackground(new Color(242, 135, 232));

		// botones arte 3
		btnarte1_3.setBounds(550, 340, 907, 90);
		btnarte1_3.setBackground(new Color(242, 135, 232));

		btnarte2_3.setBounds(550, 460, 907, 90);
		btnarte2_3.setBackground(new Color(242, 135, 232));

		btnarte3_3.setBounds(550, 580, 907, 90);
		btnarte3_3.setBackground(new Color(242, 135, 232));

		btnarte4_3.setBounds(550, 700, 907, 90);
		btnarte4_3.setBackground(new Color(242, 135, 232));

		// botones arte 4
		btnarte1_4.setBounds(550, 340, 907, 90);
		btnarte1_4.setBackground(new Color(242, 135, 232));

		btnarte2_4.setBounds(550, 460, 907, 90);
		btnarte2_4.setBackground(new Color(242, 135, 232));

		btnarte3_4.setBounds(550, 580, 907, 90);
		btnarte3_4.setBackground(new Color(242, 135, 232));

		btnarte4_4.setBounds(550, 700, 907, 90);
		btnarte4_4.setBackground(new Color(242, 135, 232));

		// botones arte 5
		btnarte1_5.setBounds(550, 340, 907, 90);
		btnarte1_5.setBackground(new Color(242, 135, 232));

		btnarte2_5.setBounds(550, 460, 907, 90);
		btnarte2_5.setBackground(new Color(242, 135, 232));

		btnarte3_5.setBounds(550, 580, 907, 90);
		btnarte3_5.setBackground(new Color(242, 135, 232));

		btnarte4_5.setBounds(550, 700, 907, 90);
		btnarte4_5.setBackground(new Color(242, 135, 232));

		// botones Ilerna 1
		btnilerna1.setBounds(550, 340, 907, 90);
		btnilerna1.setBackground(new Color(22, 160, 133));

		btnilerna2.setBounds(550, 460, 907, 90);
		btnilerna2.setBackground(new Color(22, 160, 133));

		btnilerna3.setBounds(550, 580, 907, 90);
		btnilerna3.setBackground(new Color(22, 160, 133));

		btnilerna4.setBounds(550, 700, 907, 90);
		btnilerna4.setBackground(new Color(22, 160, 133));

		// botones Ilerna 2
		btnilerna1_2.setBounds(550, 340, 907, 90);
		btnilerna1_2.setBackground(new Color(22, 160, 133));

		btnilerna2_2.setBounds(550, 460, 907, 90);
		btnilerna2_2.setBackground(new Color(22, 160, 133));

		btnilerna3_2.setBounds(550, 580, 907, 90);
		btnilerna3_2.setBackground(new Color(22, 160, 133));

		btnilerna4_2.setBounds(550, 700, 907, 90);
		btnilerna4_2.setBackground(new Color(22, 160, 133));

		// botones Ilerna 3
		btnilerna1_3.setBounds(550, 340, 907, 90);
		btnilerna1_3.setBackground(new Color(22, 160, 133));

		btnilerna2_3.setBounds(550, 460, 907, 90);
		btnilerna2_3.setBackground(new Color(22, 160, 133));

		btnilerna3_3.setBounds(550, 580, 907, 90);
		btnilerna3_3.setBackground(new Color(22, 160, 133));

		btnilerna4_3.setBounds(550, 700, 907, 90);
		btnilerna4_3.setBackground(new Color(22, 160, 133));

		// botones Ilerna 4
		btnilerna1_4.setBounds(550, 340, 907, 90);
		btnilerna1_4.setBackground(new Color(22, 160, 133));

		btnilerna2_4.setBounds(550, 460, 907, 90);
		btnilerna2_4.setBackground(new Color(22, 160, 133));

		btnilerna3_4.setBounds(550, 580, 907, 90);
		btnilerna3_4.setBackground(new Color(22, 160, 133));

		btnilerna4_4.setBounds(550, 700, 907, 90);
		btnilerna4_4.setBackground(new Color(22, 160, 133));

		// botones Ilerna 5
		btnilerna1_5.setBounds(550, 340, 907, 90);
		btnilerna1_5.setBackground(new Color(22, 160, 133));

		btnilerna2_5.setBounds(550, 460, 907, 90);
		btnilerna2_5.setBackground(new Color(22, 160, 133));

		btnilerna3_5.setBounds(550, 580, 907, 90);
		btnilerna3_5.setBackground(new Color(22, 160, 133));

		btnilerna4_5.setBounds(550, 700, 907, 90);
		btnilerna4_5.setBackground(new Color(22, 160, 133));



		panel1.add(btn_jugar);
		panel1.add(btn_inst);
		panel2.add(btn_menu);
		panel3.add(tirarDado);

		// botones panel historia
		panel2.add(btn_menu);


		// botones panel de historia 1
		panel4.add(btn_historia1);
		panel4.add(btn_historia2);
		panel4.add(btn_historia3);
		panel4.add(btn_historia4);

		//Botonespanel historia 2
		panel12.add(btn_historia1_2);
		panel12.add(btn_historia2_2);
		panel12.add(btn_historia3_2);
		panel12.add(btn_historia4_2);

		//Botonespanel historia 3
		panel16.add(btn_historia1_3);
		panel16.add(btn_historia2_3);
		panel16.add(btn_historia3_3);
		panel16.add(btn_historia4_3);

		//Botonespanel historia 4
		panel17.add(btn_historia1_4);
		panel17.add(btn_historia2_4);
		panel17.add(btn_historia3_4);
		panel17.add(btn_historia4_4);

		//Botonespanel historia 5
		panel18.add(btn_historia1_5);
		panel18.add(btn_historia2_5);
		panel18.add(btn_historia3_5);
		panel18.add(btn_historia4_5);

		//Botones deporte 1
		panel8.add(btn_deporte1);
		panel8.add(btn_deporte2);
		panel8.add(btn_deporte3);
		panel8.add(btn_deporte4);

		//Botones deporte 2
		panel10.add(btn_deporte1_2);
		panel10.add(btn_deporte2_2);
		panel10.add(btn_deporte3_2);
		panel10.add(btn_deporte4_2);

		//Botones deporte 3
		panel19.add(btn_deporte1_3);
		panel19.add(btn_deporte2_3);
		panel19.add(btn_deporte3_3);
		panel19.add(btn_deporte4_3);

		//Botones deporte 4
		panel22.add(btn_deporte1_4);
		panel22.add(btn_deporte2_4);
		panel22.add(btn_deporte3_4);
		panel22.add(btn_deporte4_4);

		//Botones deporte 5
		panel23.add(btn_deporte1_5);
		panel23.add(btn_deporte2_5);
		panel23.add(btn_deporte3_5);
		panel23.add(btn_deporte4_5);

		// botones panel formula 1_1
		panel5.add(btn_f1);
		panel5.add(btn_f2);
		panel5.add(btn_f3);
		panel5.add(btn_f4);

		// F1_2
		panel9.add(btn_f1_2);
		panel9.add(btn_f2_2);
		panel9.add(btn_f3_2);
		panel9.add(btn_f4_2);

		// F1_3
		panel20.add(btn_f1_3);
		panel20.add(btn_f2_3);
		panel20.add(btn_f3_3);
		panel20.add(btn_f4_3);

		// F1_4
		panel21.add(btn_f1_4);
		panel21.add(btn_f2_4);
		panel21.add(btn_f3_4);
		panel21.add(btn_f4_4);

		// F1_5
		panel24.add(btn_f1_5);
		panel24.add(btn_f2_5);
		panel24.add(btn_f3_5);
		panel24.add(btn_f4_5);

		//Botones panel Arte
		panel6.add(btnarte1);
		panel6.add(btnarte2);
		panel6.add(btnarte3);
		panel6.add(btnarte4);

		//Botones panel Arte 2
		panel11.add(btnarte1_2);
		panel11.add(btnarte2_2);
		panel11.add(btnarte3_2);
		panel11.add(btnarte4_2);

		//Botones panel Arte 3
		panel13.add(btnarte1_3);
		panel13.add(btnarte2_3);
		panel13.add(btnarte3_3);
		panel13.add(btnarte4_3);

		//Botones panel Arte 4
		panel14.add(btnarte1_4);
		panel14.add(btnarte2_4);
		panel14.add(btnarte3_4);
		panel14.add(btnarte4_4);

		//Botones panel Arte 5
		panel15.add(btnarte1_5);
		panel15.add(btnarte2_5);
		panel15.add(btnarte3_5);
		panel15.add(btnarte4_5);


		//Botones ilerna 1
		panel7.add(btnilerna1);
		panel7.add(btnilerna2);
		panel7.add(btnilerna3);
		panel7.add(btnilerna4);

		//Botones ilerna 2
		panel30.add(btnilerna1_2);
		panel30.add(btnilerna2_2);
		panel30.add(btnilerna3_2);
		panel30.add(btnilerna4_2);


		//Botones ilerna 3
		panel31.add(btnilerna1_3);
		panel31.add(btnilerna2_3);
		panel31.add(btnilerna3_3);
		panel31.add(btnilerna4_3);	

		//Botones ilerna 4
		panel32.add(btnilerna1_4);
		panel32.add(btnilerna2_4);
		panel32.add(btnilerna3_4);
		panel32.add(btnilerna4_4);	

		//Botones ilerna 4
		panel33.add(btnilerna1_5);
		panel33.add(btnilerna2_5);
		panel33.add(btnilerna3_5);
		panel33.add(btnilerna4_5);	

		//Boton erroneo
		panel34.add(btn_error);


		panel1.setVisible(true);
		panel2.setVisible(false);
		panel3.setVisible(false); 
		panel4.setVisible(false);  
		panel5.setVisible(false);  
		panel6.setVisible(false);
		panel7.setVisible(false);
		panel8.setVisible(false);  
		panel9.setVisible(false);
		panel10.setVisible(false);  
		panel11.setVisible(false);  
		panel12.setVisible(false);  
		panel13.setVisible(false);  
		panel14.setVisible(false);  
		panel15.setVisible(false);  
		panel16.setVisible(false);  
		panel17.setVisible(false);  
		panel18.setVisible(false);  
		panel19.setVisible(false);  
		panel20.setVisible(false);  
		panel21.setVisible(false);  
		panel22.setVisible(false);  
		panel23.setVisible(false);  
		panel24.setVisible(false);  

		panel30.setVisible(false);  
		panel31.setVisible(false);  
		panel32.setVisible(false);  
		panel33.setVisible(false);  
		panel34.setVisible(false);  

		//---------------------------------------------------------------------
		/**
		 * Escuchador para el botón de instrucciones.
		 * @param Click para el botón de instrucciones
		 * @return Entrar en el panel 2 (Instrucciones)
		 */
		btn_inst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para reproducir el sonido
				playBackgroundSound2();
				if(panel1.isVisible()){
					panel1.setVisible(false);
					panel2.setVisible(true);

					validate();
				}
			}
		});
		/**
		 * Escuchador para el botón de jugar.
		 * @param Click para el botón de jugar
		 * @return Entrar en el panel 3 (Jugar)
		 * */
		btn_jugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel1.isVisible()){
					panel3.setVisible(true);
					panel2.setVisible(false);
					panel1.setVisible(false);
					validate();
				}
			}
		});          
		//-----------------------------------------------------------------------
		/**
		 * Escuchador para el botón de menú.
		 * @param Click para el botón de menú
		 * @return Entrar en el panel 1 (Menú)
		 * */
		btn_menu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel2.isVisible()){
					panel2.setVisible(false);
					panel3.setVisible(false);
					panel1.setVisible(true);
					validate();
				}
			}
		});

		//------------------------------------------------------------------------
		// Define los ArrayList y Random como variables de clase si es necesario
		ArrayList<Integer> numerosGenerados = new ArrayList<>();
		Random random = new Random();

		int cantidadNumeros = 25;


		/**
		 * Escuchador para el botón de Tirar Dado.
		 * @param Click para el botón de Tirar Dado
		 * @return Entrar en un panel random (Tirar Dado)
		 * */
		// ActionListener para el botón tirarDado
		tirarDado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para reproducir el sonido
				playBackgroundSound1();

				// Generar un número aleatorio que no se repita
				int numeroAleatorio;
				do {
					numeroAleatorio = random.nextInt(cantidadNumeros) + 1;
				} while (numerosGenerados.contains(numeroAleatorio));

				// Agregar el número generado a la lista
				numerosGenerados.add(numeroAleatorio);

				// Lógica para mostrar el panel correspondiente según el número aleatorio generado
				switch (numeroAleatorio) {

				case 1:
					// pregutna historia 1
					panel4.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;

				case 2:
					// pregutna historia 2
					panel12.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 3:
					// pregutna historia 3
					panel16.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 4:
					// pregutna historia 4
					panel17.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 5:
					// pregutna historia 5
					panel18.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;

				case 6:
					// pregutna formula 1
					panel5.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;

				case 7:
					// pregutna formula 2
					panel9.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible

					break;
				case 8:
					// pregutna formula 3
					panel20.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 9:
					// pregutna formula 4
					panel21.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 10:
					// pregutna formula 5
					panel24.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 11:
					// pregutna arte 1
					panel6.setVisible(true); 
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 12:
					// pregutna arte 2
					panel11.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 13:
					// pregutna arte 3
					panel13.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 14:
					// pregutna arte 4
					panel14.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 15:
					// pregutna arte 5
					panel15.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 16:
					// pregutna Ilerna 1
					panel7.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 17:
					// pregutna Ilerna 2
					panel30.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 18:
					// pregutna Ilerna 3
					panel31.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 19:
					// pregutna Ilerna 4
					panel32.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 20:
					// pregutna Ilerna 5
					panel33.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 21:
					// pregutna Deporte 1
					panel8.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 22:
					// pregutna Deporte 2
					panel10.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 23:
					// pregutna Deporte 3
					panel9.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 24:
					// pregutna Deporte 4
					panel22.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;
				case 25:
					// pregutna Deporte 5
					panel23.setVisible(true);
					if(panel3.isVisible()) // Verificar si panel3 está visible
						panel3.setVisible(false); // Ocultar panel actual solo si está visible
					break;

				default:
					// En caso de que haya un valor inesperado en el switch
					System.out.println("Número Aleatorio no válido");
					break;
				}
			}
		});

		//---------------------------------------------------------------
		/**
		 * Escuchador para el botón de error, y se vuelve a empezar el juego.
		 * @param Click para el botón de Error
		 * @return Entrar en un panel 3 (Error)
		 * */

		btn_error.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel34.isVisible()) {
					panel3.setVisible(true);
					btn_error.setVisible(false);
					panel34.setVisible(false);
					btn_error.setVisible(true); // Mostrar el botón solo cuando panel34 está visible
					validate();
				}
			}
		});


		// ---------------------------------------------------------------------------------------------------------
		/**
		 * Escuchador para los botones de la respuesta.
		 * @param Click para el botón de respuesta
		 * @return Entrar en un panel si es correcta (Panel 3) o entrar en otro si es incorrecta (Panel 34).
		 * */
		btn_historia1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel4.isVisible()){

					playBackgroundSound3();

					btn_historia4.setVisible(false);
					btn_historia2.setVisible(false);
					btn_historia3.setVisible(false);
					btn_historia1.setVisible(false);
					panel3.setVisible(false);
					panel4.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_historia2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel4.isVisible()){
					playBackgroundSound4();
					btn_historia1.setVisible(false);
					btn_historia4.setVisible(false);
					btn_historia3.setVisible(false);
					btn_historia2.setVisible(false);
					panel4.setVisible(false);
					panel3.setVisible(true);
					panel34.setVisible(false);

					validate();
				} 
			}
		});
		btn_historia3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel4.isVisible()){
					playBackgroundSound3();

					btn_historia1.setVisible(false);
					btn_historia2.setVisible(false);
					btn_historia3.setVisible(false);
					btn_historia4.setVisible(false);
					panel3.setVisible(false);
					panel4.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel4.isVisible()){
					playBackgroundSound3();

					btn_historia1.setVisible(false);
					btn_historia2.setVisible(false);
					btn_historia3.setVisible(false);
					btn_historia4.setVisible(false);
					panel4.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		// -----
		btn_historia1_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panel12.isVisible()) {
					playBackgroundSound3();

					btn_historia4_2.setVisible(false);
					btn_historia2_2.setVisible(false);
					btn_historia3_2.setVisible(false);
					btn_historia1_2.setVisible(false);
					panel3.setVisible(false);
					panel12.setVisible(false);
					panel34.setVisible(true);
					validate();

				}
			}
		});

		btn_historia2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel12.isVisible()){
					playBackgroundSound3();

					btn_historia1_2.setVisible(false);
					btn_historia4_2.setVisible(false);
					btn_historia3_2.setVisible(false);
					btn_historia2_2.setVisible(false);
					panel12.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia3_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel12.isVisible()){
					playBackgroundSound3();

					btn_historia1_2.setVisible(false);
					btn_historia2_2.setVisible(false);
					btn_historia3_2.setVisible(false);
					btn_historia4_2.setVisible(false);
					panel3.setVisible(false);
					panel12.setVisible(false);

					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia4_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel12.isVisible()){

					playBackgroundSound3();

					btn_historia1_2.setVisible(false);
					btn_historia2_2.setVisible(false);
					btn_historia3_2.setVisible(false);
					btn_historia4_2.setVisible(false);
					panel12.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_historia1_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel16.isVisible()){
					playBackgroundSound3();
					btn_historia4_3.setVisible(false);
					btn_historia2_3.setVisible(false);
					btn_historia3_3.setVisible(false);
					btn_historia1_3.setVisible(false);
					panel3.setVisible(false);
					panel16.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_historia2_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel16.isVisible()){
					playBackgroundSound3();

					btn_historia1_3.setVisible(false);
					btn_historia4_3.setVisible(false);
					btn_historia3_3.setVisible(false);
					btn_historia2_3.setVisible(false);
					panel16.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia3_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel16.isVisible()){
					playBackgroundSound3();

					btn_historia1_3.setVisible(false);
					btn_historia2_3.setVisible(false);
					btn_historia3_3.setVisible(false);
					btn_historia4_3.setVisible(false);
					panel3.setVisible(false);
					panel16.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia4_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel16.isVisible()){
					playBackgroundSound3();

					btn_historia1_3.setVisible(false);
					btn_historia2_3.setVisible(false);
					btn_historia3_3.setVisible(false);
					btn_historia4_3.setVisible(false);
					panel16.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_historia1_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel17.isVisible()){
					playBackgroundSound3();

					btn_historia4_4.setVisible(false);
					btn_historia2_4.setVisible(false);
					btn_historia3_4.setVisible(false);
					btn_historia1_4.setVisible(false);
					panel3.setVisible(false);
					panel17.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_historia2_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel17.isVisible()){
					playBackgroundSound3();

					btn_historia1_4.setVisible(false);
					btn_historia4_4.setVisible(false);
					btn_historia3_4.setVisible(false);
					btn_historia2_4.setVisible(false);
					panel17.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia3_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel17.isVisible()){
					playBackgroundSound3();

					btn_historia1_4.setVisible(false);
					btn_historia2_4.setVisible(false);
					btn_historia3_4.setVisible(false);
					btn_historia4_4.setVisible(false);
					panel3.setVisible(false);
					panel17.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia4_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel17.isVisible()){

					playBackgroundSound4();

					btn_historia1_4.setVisible(false);
					btn_historia2_4.setVisible(false);
					btn_historia3_4.setVisible(false);
					btn_historia4_4.setVisible(false);
					panel17.setVisible(false);
					panel3.setVisible(true);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_historia1_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel18.isVisible()){

					playBackgroundSound3();

					btn_historia4_5.setVisible(false);
					btn_historia2_5.setVisible(false);
					btn_historia3_5.setVisible(false);
					btn_historia1_5.setVisible(false);
					panel3.setVisible(false);
					panel18.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_historia2_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel18.isVisible()){
					playBackgroundSound4();

					btn_historia1_5.setVisible(false);
					btn_historia4_5.setVisible(false);
					btn_historia3_5.setVisible(false);
					btn_historia2_5.setVisible(false);
					panel18.setVisible(false);
					panel3.setVisible(true);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		btn_historia3_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel18.isVisible()){
					playBackgroundSound3();

					btn_historia1_5.setVisible(false);
					btn_historia2_5.setVisible(false);
					btn_historia3_5.setVisible(false);
					btn_historia4_5.setVisible(false);
					panel3.setVisible(false);
					panel18.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_historia4_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel18.isVisible()){
					playBackgroundSound3();

					btn_historia1_5.setVisible(false);
					btn_historia2_5.setVisible(false);
					btn_historia3_5.setVisible(false);
					btn_historia4_5.setVisible(false);
					panel18.setVisible(false);
					panel3.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//-----

		btn_deporte1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel8.isVisible()){
					playBackgroundSound3();

					btn_deporte1.setVisible(false);
					btn_deporte2.setVisible(false);
					btn_deporte3.setVisible(false);
					btn_deporte4.setVisible(false);
					panel3.setVisible(false);
					panel8.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel8.isVisible()){
					playBackgroundSound3();

					btn_deporte1.setVisible(false);
					btn_deporte2.setVisible(false);
					btn_deporte3.setVisible(false);
					btn_deporte4.setVisible(false);
					panel3.setVisible(false);
					panel8.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_deporte3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel8.isVisible()){
					playBackgroundSound4();

					btn_deporte1.setVisible(false);
					btn_deporte2.setVisible(false);
					btn_deporte3.setVisible(false);
					btn_deporte4.setVisible(false);
					panel3.setVisible(true);
					panel8.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_deporte4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel8.isVisible()){
					playBackgroundSound3();

					btn_deporte1.setVisible(false);
					btn_deporte2.setVisible(false);
					btn_deporte3.setVisible(false);
					btn_deporte4.setVisible(false);
					panel3.setVisible(false);
					panel8.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//-----
		btn_deporte1_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel10.isVisible()){
					playBackgroundSound3();

					btn_deporte1_2.setVisible(false);
					btn_deporte2_2.setVisible(false);
					btn_deporte3_2.setVisible(false);
					btn_deporte4_2.setVisible(false);
					panel3.setVisible(false);
					panel10.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel10.isVisible()){
					playBackgroundSound3();

					btn_deporte1_2.setVisible(false);
					btn_deporte2_2.setVisible(false);
					btn_deporte3_2.setVisible(false);
					btn_deporte4_2.setVisible(false);
					panel3.setVisible(false);
					panel10.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_deporte3_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel10.isVisible()){
					playBackgroundSound4();

					btn_deporte1_2.setVisible(false);
					btn_deporte2_2.setVisible(false);
					btn_deporte3_2.setVisible(false);
					btn_deporte4_2.setVisible(false);
					panel3.setVisible(true);
					panel10.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_deporte4_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel10.isVisible()){
					playBackgroundSound3();

					btn_deporte1_2.setVisible(false);
					btn_deporte2_2.setVisible(false);
					btn_deporte3_2.setVisible(false);
					btn_deporte4_2.setVisible(false);
					panel3.setVisible(false);
					panel10.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//--------
		btn_deporte1_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel19.isVisible()){
					playBackgroundSound3();

					btn_deporte1_3.setVisible(false);
					btn_deporte2_3.setVisible(false);
					btn_deporte3_3.setVisible(false);
					btn_deporte4_3.setVisible(false);
					panel3.setVisible(false);
					panel19.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte2_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel19.isVisible()){
					playBackgroundSound4();

					btn_deporte1_3.setVisible(false);
					btn_deporte2_3.setVisible(false);
					btn_deporte3_3.setVisible(false);
					btn_deporte4_3.setVisible(false);
					panel3.setVisible(true);
					panel19.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		btn_deporte3_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel19.isVisible()){
					playBackgroundSound3();

					btn_deporte1_3.setVisible(false);
					btn_deporte2_3.setVisible(false);
					btn_deporte3_3.setVisible(false);
					btn_deporte4_3.setVisible(false);
					panel3.setVisible(false);
					panel19.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte4_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel19.isVisible()){
					playBackgroundSound3();

					btn_deporte1_3.setVisible(false);
					btn_deporte2_3.setVisible(false);
					btn_deporte3_3.setVisible(false);
					btn_deporte4_3.setVisible(false);
					panel3.setVisible(false);
					panel19.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte1_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel22.isVisible()){
					playBackgroundSound3();

					btn_deporte1_4.setVisible(false);
					btn_deporte2_4.setVisible(false);
					btn_deporte3_4.setVisible(false);
					btn_deporte4_4.setVisible(false);
					panel3.setVisible(false);
					panel22.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte2_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel22.isVisible()){
					playBackgroundSound3();

					btn_deporte1_4.setVisible(false);
					btn_deporte2_4.setVisible(false);
					btn_deporte3_4.setVisible(false);
					btn_deporte4_4.setVisible(false);
					panel3.setVisible(false);
					panel22.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_deporte3_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel22.isVisible()){
					playBackgroundSound4();

					btn_deporte1_4.setVisible(false);
					btn_deporte2_4.setVisible(false);
					btn_deporte3_4.setVisible(false);
					btn_deporte4_4.setVisible(false);
					panel3.setVisible(true);
					panel22.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_deporte4_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel22.isVisible()){
					playBackgroundSound3();

					btn_deporte1_4.setVisible(false);
					btn_deporte2_4.setVisible(false);
					btn_deporte3_4.setVisible(false);
					btn_deporte4_4.setVisible(false);
					panel3.setVisible(false);
					panel22.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//-----

		btn_deporte1_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel23.isVisible()){
					playBackgroundSound4();

					btn_deporte1_5.setVisible(false);
					btn_deporte2_5.setVisible(false);
					btn_deporte3_5.setVisible(false);
					btn_deporte4_5.setVisible(false);
					panel3.setVisible(true);
					panel23.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_deporte2_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel23.isVisible()){
					playBackgroundSound3();

					btn_deporte1_5.setVisible(false);
					btn_deporte2_5.setVisible(false);
					btn_deporte3_5.setVisible(false);
					btn_deporte4_5.setVisible(false);
					panel3.setVisible(false);
					panel23.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_deporte3_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel23.isVisible()){
					playBackgroundSound3();

					btn_deporte1_5.setVisible(false);
					btn_deporte2_5.setVisible(false);
					btn_deporte3_5.setVisible(false);
					btn_deporte4_5.setVisible(false);
					panel3.setVisible(false);
					panel23.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_deporte4_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel23.isVisible()){
					playBackgroundSound3();

					btn_deporte1_5.setVisible(false);
					btn_deporte2_5.setVisible(false);
					btn_deporte3_5.setVisible(false);
					btn_deporte4_5.setVisible(false);
					panel3.setVisible(false);
					panel23.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//-----
		btn_f1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel5.isVisible()){
					playBackgroundSound3();

					btn_f1.setVisible(false);
					btn_f2.setVisible(false);
					btn_f3.setVisible(false);
					btn_f4.setVisible(false);
					panel3.setVisible(false);
					panel5.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel5.isVisible()){
					playBackgroundSound4();

					btn_f1.setVisible(false);
					btn_f2.setVisible(false);
					btn_f3.setVisible(false);
					btn_f4.setVisible(false);
					panel3.setVisible(true);
					panel5.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		btn_f3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel5.isVisible()){
					playBackgroundSound3();

					btn_f1.setVisible(false);
					btn_f2.setVisible(false);
					btn_f3.setVisible(false);
					btn_f4.setVisible(false);
					panel3.setVisible(false);
					panel5.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel5.isVisible()){
					playBackgroundSound3();

					btn_f1.setVisible(false);
					btn_f2.setVisible(false);
					btn_f3.setVisible(false);
					btn_f4.setVisible(false);
					panel3.setVisible(false);
					panel5.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//-----
		btn_f1_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel9.isVisible()){
					playBackgroundSound3();

					btn_f1_2.setVisible(false);
					btn_f2_2.setVisible(false);
					btn_f3_2.setVisible(false);
					btn_f4_2.setVisible(false);
					panel3.setVisible(false);
					panel9.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel9.isVisible()){
					playBackgroundSound3();

					btn_f1_2.setVisible(false);
					btn_f2_2.setVisible(false);
					btn_f3_2.setVisible(false);
					btn_f4_2.setVisible(false);
					panel3.setVisible(false);
					panel9.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_f3_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel9.isVisible()){
					playBackgroundSound3();

					btn_f1_2.setVisible(false);
					btn_f2_2.setVisible(false);
					btn_f3_2.setVisible(false);
					btn_f4_2.setVisible(false);
					panel3.setVisible(false);
					panel9.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f4_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel9.isVisible()){
					playBackgroundSound4();

					btn_f1_2.setVisible(false);
					btn_f2_2.setVisible(false);
					btn_f3_2.setVisible(false);
					btn_f4_2.setVisible(false);
					panel3.setVisible(true);
					panel9.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		//----
		btn_f1_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel20.isVisible()){
					playBackgroundSound4();

					btn_f1_3.setVisible(false);
					btn_f2_3.setVisible(false);
					btn_f3_3.setVisible(false);
					btn_f4_3.setVisible(false);
					panel3.setVisible(true);
					panel20.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_f2_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel20.isVisible()){
					playBackgroundSound3();

					btn_f1_3.setVisible(false);
					btn_f2_3.setVisible(false);
					btn_f3_3.setVisible(false);
					btn_f4_3.setVisible(false);
					panel3.setVisible(false);
					panel20.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_f3_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel20.isVisible()){
					playBackgroundSound3();

					btn_f1_3.setVisible(false);
					btn_f2_3.setVisible(false);
					btn_f3_3.setVisible(false);
					btn_f4_3.setVisible(false);
					panel3.setVisible(false);
					panel20.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f4_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel20.isVisible()){
					playBackgroundSound3();

					btn_f1_3.setVisible(false);
					btn_f2_3.setVisible(false);
					btn_f3_3.setVisible(false);
					btn_f4_3.setVisible(false);
					panel3.setVisible(false);
					panel20.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f1_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel21.isVisible()){
					playBackgroundSound3();

					btn_f1_4.setVisible(false);
					btn_f2_4.setVisible(false);
					btn_f3_4.setVisible(false);
					btn_f4_4.setVisible(false);
					panel3.setVisible(false);
					panel21.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f2_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel21.isVisible()){
					playBackgroundSound4();

					btn_f1_4.setVisible(false);
					btn_f2_4.setVisible(false);
					btn_f3_4.setVisible(false);
					btn_f4_4.setVisible(false);
					panel3.setVisible(true);
					panel21.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		btn_f3_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel21.isVisible()){
					playBackgroundSound3();

					btn_f1_4.setVisible(false);
					btn_f2_4.setVisible(false);
					btn_f3_4.setVisible(false);
					btn_f4_4.setVisible(false);
					panel3.setVisible(false);
					panel21.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f4_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel21.isVisible()){
					playBackgroundSound3();

					btn_f1_4.setVisible(false);
					btn_f2_4.setVisible(false);
					btn_f3_4.setVisible(false);
					btn_f4_4.setVisible(false);
					panel3.setVisible(false);
					panel21.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f1_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel24.isVisible()){
					playBackgroundSound3();

					btn_f1_5.setVisible(false);
					btn_f2_5.setVisible(false);
					btn_f3_5.setVisible(false);
					btn_f4_5.setVisible(false);
					panel3.setVisible(false);
					panel24.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btn_f2_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel24.isVisible()){
					playBackgroundSound3();

					btn_f1_5.setVisible(false);
					btn_f2_5.setVisible(false);
					btn_f3_5.setVisible(false);
					btn_f4_5.setVisible(false);
					panel3.setVisible(false);
					panel24.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btn_f3_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel24.isVisible()){
					playBackgroundSound4();

					btn_f1_5.setVisible(false);
					btn_f2_5.setVisible(false);
					btn_f3_5.setVisible(false);
					btn_f4_5.setVisible(false);
					panel3.setVisible(true);
					panel24.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btn_f4_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel24.isVisible()){
					playBackgroundSound3();

					btn_f1_5.setVisible(false);
					btn_f2_5.setVisible(false);
					btn_f3_5.setVisible(false);
					btn_f4_5.setVisible(false);
					panel3.setVisible(false);
					panel24.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		//-------
		btnarte1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel6.isVisible()){
					playBackgroundSound3();

					btnarte1.setVisible(false);
					btnarte2.setVisible(false);
					btnarte3.setVisible(false);
					btnarte4.setVisible(false);
					panel3.setVisible(false);
					panel6.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnarte2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel6.isVisible()){
					playBackgroundSound3();

					btnarte1.setVisible(false);
					btnarte2.setVisible(false);
					btnarte3.setVisible(false);
					btnarte4.setVisible(false);
					panel3.setVisible(false);
					panel6.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnarte3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel6.isVisible()){
					playBackgroundSound3();

					btnarte1.setVisible(false);
					btnarte2.setVisible(false);
					btnarte3.setVisible(false);
					btnarte4.setVisible(false);
					panel3.setVisible(false);
					panel6.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnarte4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel6.isVisible()){
					playBackgroundSound4();

					btnarte1.setVisible(false);
					btnarte2.setVisible(false);
					btnarte3.setVisible(false);
					btnarte4.setVisible(false);
					panel3.setVisible(true);
					panel6.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		//----------
		btnarte1_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel11.isVisible()){
					playBackgroundSound4();

					btnarte1_2.setVisible(false);
					btnarte2_2.setVisible(false);
					btnarte3_2.setVisible(false);
					btnarte4_2.setVisible(false);
					panel3.setVisible(true);
					panel11.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btnarte2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel11.isVisible()){
					playBackgroundSound3();

					btnarte1_2.setVisible(false);
					btnarte2_2.setVisible(false);
					btnarte3_2.setVisible(false);
					btnarte4_2.setVisible(false);
					panel3.setVisible(false);
					panel11.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnarte3_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel11.isVisible()){
					playBackgroundSound3();

					btnarte1_2.setVisible(false);
					btnarte2_2.setVisible(false);
					btnarte3_2.setVisible(false);
					btnarte4_2.setVisible(false);
					panel3.setVisible(false);
					panel11.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnarte4_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel11.isVisible()){
					playBackgroundSound3();

					btnarte1_2.setVisible(false);
					btnarte2_2.setVisible(false);
					btnarte3_2.setVisible(false);
					btnarte4_2.setVisible(false);
					panel3.setVisible(false);
					panel11.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		//----
		btnarte1_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel13.isVisible()){
					playBackgroundSound4();

					btnarte1_3.setVisible(false);
					btnarte2_3.setVisible(false);
					btnarte3_3.setVisible(false);
					btnarte4_3.setVisible(false);
					panel3.setVisible(true);
					panel13.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btnarte2_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel13.isVisible()){
					playBackgroundSound3();

					btnarte1_3.setVisible(false);
					btnarte2_3.setVisible(false);
					btnarte3_3.setVisible(false);
					btnarte4_3.setVisible(false);
					panel3.setVisible(false);
					panel13.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnarte3_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel13.isVisible()){
					playBackgroundSound3();

					btnarte1_3.setVisible(false);
					btnarte2_3.setVisible(false);
					btnarte3_3.setVisible(false);
					btnarte4_3.setVisible(false);
					panel3.setVisible(false);
					panel13.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnarte4_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel13.isVisible()){
					playBackgroundSound3();

					btnarte1_3.setVisible(false);
					btnarte2_3.setVisible(false);
					btnarte3_3.setVisible(false);
					btnarte4_3.setVisible(false);
					panel3.setVisible(false);
					panel13.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		btnarte1_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel14.isVisible()){
					playBackgroundSound3();

					btnarte1_4.setVisible(false);
					btnarte2_4.setVisible(false);
					btnarte3_4.setVisible(false);
					btnarte4_4.setVisible(false);
					panel3.setVisible(false);
					panel14.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnarte2_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel14.isVisible()){
					playBackgroundSound3();

					btnarte1_4.setVisible(false);
					btnarte2_4.setVisible(false);
					btnarte3_4.setVisible(false);
					btnarte4_4.setVisible(false);
					panel3.setVisible(false);
					panel14.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnarte3_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel14.isVisible()){
					playBackgroundSound4();

					btnarte1_4.setVisible(false);
					btnarte2_4.setVisible(false);
					btnarte3_4.setVisible(false);
					btnarte4_4.setVisible(false);
					panel3.setVisible(true);
					panel14.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btnarte4_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel14.isVisible()){
					playBackgroundSound3();

					btnarte1_4.setVisible(false);
					btnarte2_4.setVisible(false);
					btnarte3_4.setVisible(false);
					btnarte4_4.setVisible(false);
					panel3.setVisible(false);
					panel14.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		btnarte1_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel15.isVisible()){
					playBackgroundSound4();

					btnarte1_5.setVisible(false);
					btnarte2_5.setVisible(false);
					btnarte3_5.setVisible(false);
					btnarte4_5.setVisible(false);
					panel3.setVisible(true);
					panel15.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});

		btnarte2_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel15.isVisible()){
					playBackgroundSound3();

					btnarte1_5.setVisible(false);
					btnarte2_5.setVisible(false);
					btnarte3_5.setVisible(false);
					btnarte4_5.setVisible(false);
					panel3.setVisible(false);
					panel15.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnarte3_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel15.isVisible()){
					playBackgroundSound3();

					btnarte1_5.setVisible(false);
					btnarte2_5.setVisible(false);
					btnarte3_5.setVisible(false);
					btnarte4_5.setVisible(false);
					panel3.setVisible(false);
					panel15.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});

		btnarte4_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel15.isVisible()){
					playBackgroundSound3();

					btnarte1_5.setVisible(false);
					btnarte2_5.setVisible(false);
					btnarte3_5.setVisible(false);
					btnarte4_5.setVisible(false);
					panel3.setVisible(false);
					panel15.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		//---
		btnilerna1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel7.isVisible()){
					playBackgroundSound3();

					btnilerna1.setVisible(false);
					btnilerna2.setVisible(false);
					btnilerna3.setVisible(false);
					btnilerna4.setVisible(false);
					panel3.setVisible(false);
					panel7.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnilerna2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel7.isVisible()){
					playBackgroundSound4();

					btnilerna1.setVisible(false);
					btnilerna2.setVisible(false);
					btnilerna3.setVisible(false);
					btnilerna4.setVisible(false);
					panel3.setVisible(true);
					panel7.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		btnilerna3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel7.isVisible()){
					playBackgroundSound3();

					btnilerna1.setVisible(false);
					btnilerna2.setVisible(false);
					btnilerna3.setVisible(false);
					btnilerna4.setVisible(false);
					panel3.setVisible(false);
					panel7.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});

		btnilerna4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel7.isVisible()){
					playBackgroundSound3();

					btnilerna1.setVisible(false);
					btnilerna2.setVisible(false);
					btnilerna3.setVisible(false);
					btnilerna4.setVisible(false);
					panel3.setVisible(false);
					panel7.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		//--------------
		btnilerna1_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel30.isVisible()){
					playBackgroundSound3();

					btnilerna1_2.setVisible(false);
					btnilerna2_2.setVisible(false);
					btnilerna3_2.setVisible(false);
					btnilerna4_2.setVisible(false);
					panel3.setVisible(false);
					panel30.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnilerna2_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel30.isVisible()){
					playBackgroundSound3();

					btnilerna1_2.setVisible(false);
					btnilerna2_2.setVisible(false);
					btnilerna3_2.setVisible(false);
					btnilerna4_2.setVisible(false);
					panel3.setVisible(false);
					panel30.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnilerna3_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel30.isVisible()){
					playBackgroundSound4();

					btnilerna1_2.setVisible(false);
					btnilerna2_2.setVisible(false);
					btnilerna3_2.setVisible(false);
					btnilerna4_2.setVisible(false);
					panel3.setVisible(true);
					panel30.setVisible(false);
					panel34.setVisible(false);
					validate();
				}
			}
		});

		btnilerna4_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel30.isVisible()){
					playBackgroundSound3();

					btnilerna1_2.setVisible(false);
					btnilerna2_2.setVisible(false);
					btnilerna3_2.setVisible(false);
					btnilerna4_2.setVisible(false);
					panel3.setVisible(false);
					panel30.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		btnilerna1_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel31.isVisible()){
					playBackgroundSound3();

					btnilerna1_3.setVisible(false);
					btnilerna2_3.setVisible(false);
					btnilerna3_3.setVisible(false);
					btnilerna4_3.setVisible(false);
					panel3.setVisible(false);
					panel31.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnilerna2_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel31.isVisible()){
					playBackgroundSound4();

					btnilerna1_3.setVisible(false);
					btnilerna2_3.setVisible(false);
					btnilerna3_3.setVisible(false);
					btnilerna4_3.setVisible(false);
					panel3.setVisible(true);
					panel31.setVisible(false);
					panel34.setVisible(false);
					validate();
				} 
			}
		});
		btnilerna3_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel31.isVisible()){
					playBackgroundSound3();

					btnilerna1_3.setVisible(false);
					btnilerna2_3.setVisible(false);
					btnilerna3_3.setVisible(false);
					btnilerna4_3.setVisible(false);
					panel3.setVisible(false);
					panel31.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});

		btnilerna4_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel31.isVisible()){
					playBackgroundSound3();

					btnilerna1_3.setVisible(false);
					btnilerna2_3.setVisible(false);
					btnilerna3_3.setVisible(false);
					btnilerna4_3.setVisible(false);
					panel3.setVisible(false);
					panel31.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		btnilerna1_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel32.isVisible()){
					playBackgroundSound3();

					btnilerna1_4.setVisible(false);
					btnilerna2_4.setVisible(false);
					btnilerna3_4.setVisible(false);
					btnilerna4_4.setVisible(false);
					panel3.setVisible(false);
					panel32.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});

		btnilerna2_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel32.isVisible()){
					playBackgroundSound3();

					btnilerna1_4.setVisible(false);
					btnilerna2_4.setVisible(false);
					btnilerna3_4.setVisible(false);
					btnilerna4_4.setVisible(false);
					panel3.setVisible(false);
					panel32.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnilerna3_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel32.isVisible()){
					playBackgroundSound4();

					btnilerna1_4.setVisible(false);
					btnilerna2_4.setVisible(false);
					btnilerna3_4.setVisible(false);
					btnilerna4_4.setVisible(false);
					panel3.setVisible(true);
					panel32.setVisible(false);
					panel34.setVisible(false);
					validate();
				}
			}
		});

		btnilerna4_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel32.isVisible()){
					playBackgroundSound3();

					btnilerna1_4.setVisible(false);
					btnilerna2_4.setVisible(false);
					btnilerna3_4.setVisible(false);
					btnilerna4_4.setVisible(false);
					panel3.setVisible(false);
					panel32.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});
		btnilerna1_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel33.isVisible()){
					playBackgroundSound3();
					panel34.setVisible(true);
					panel3.setVisible(false);

					btnilerna1_5.setVisible(false);
					btnilerna2_5.setVisible(false);
					btnilerna3_5.setVisible(false);
					btnilerna4_5.setVisible(false);
					panel33.setVisible(false);
					validate();
				} 
			}
		});

		btnilerna2_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel33.isVisible()){
					playBackgroundSound3();

					btnilerna1_5.setVisible(false);
					btnilerna2_5.setVisible(false);
					btnilerna3_5.setVisible(false);
					btnilerna4_5.setVisible(false);
					panel3.setVisible(false);
					panel33.setVisible(false);
					panel34.setVisible(true);
					validate();
				} 
			}
		});
		btnilerna3_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel33.isVisible()){
					playBackgroundSound4();

					btnilerna1_5.setVisible(false);
					btnilerna2_5.setVisible(false);
					btnilerna3_5.setVisible(false);
					btnilerna4_5.setVisible(false);
					panel3.setVisible(true);
					panel33.setVisible(false);
					panel34.setVisible(false);
					validate();
				}
			}
		});

		btnilerna4_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel33.isVisible()){
					playBackgroundSound3();

					btnilerna1_5.setVisible(false);
					btnilerna2_5.setVisible(false);
					btnilerna3_5.setVisible(false);
					btnilerna4_5.setVisible(false);
					panel3.setVisible(false);
					panel33.setVisible(false);
					panel34.setVisible(true);
					validate();
				}
			}
		});

		// Inicia la reproducción del sonido de fondo
		playBackgroundSound();
	}

	/**
	 * Método para reproducir música automáticamente.
	 * @return Sonido.
	 * */
	// Método para reproducir el sonido de fondo
	public void playBackgroundSound() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/recursos/good-vibes.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Método para reproducir música cuando se pulse un botón.
	 * @param Pulsar Tirar Dado
	 * @return Sonido Tirar Dado.
	 * */
	public void playBackgroundSound1() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/recursos/dados.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start(); // Iniciar reproducción
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para reproducir música cuando se pulse un botón.
	 * @param Pulsar Instrucciones
	 * @return Sonido Instrucciones.
	 * */
	public void playBackgroundSound2() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/recursos/nextlevel.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start(); // Iniciar reproducción
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para reproducir música cuando la pregunta sea incorrecta.
	 * @param Pulsar respuesta incorrecta.
	 * @return Sonido respuesta incorrecta.
	 * */
	public void playBackgroundSound3() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/recursos/error.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start(); // Iniciar reproducción
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para reproducir música cuando la pregunta sea correcta.
	 * @param Pulsar respuesta correcta.
	 * @return Sonido respuesta correcta.
	 * */
	public void playBackgroundSound4() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/recursos/acierto.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start(); // Iniciar reproducción
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	// Método para sumar un punto al puntaje y actualizar el JLabel con Graphics2D
	private void sumarPunto(Graphics2D g2d) {
	    puntos++; // Incrementar el puntaje en 1
	    // Actualizar el texto del JLabel con el nuevo puntaje
	    String textoPuntos = "Puntos: " + puntos;
	    // Borrar el área del JLabel antes de dibujar el nuevo texto
	    g2d.clearRect(0, 0, 291, 90);
	    // Dibujar el nuevo texto con el puntaje actualizado
	    g2d.setColor(new Color(255, 0, 128));
	    g2d.setFont(new Font("Palatino Linotype", Font.PLAIN, 50));
	    g2d.drawString(textoPuntos, 0, 50);
	    // Repintar el JLabel para reflejar los cambios
	    repaint();
	}
	 */

	/**
	 * Método principal que inicia la aplicación del juego.
	 * Hace visible el Frame
	 * Además, configura un ActionListener para el botón "TIRAR EL DADO", que genera un número aleatorio
	 * cada vez que se presiona el botón.
	 */


	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setVisible(true);
		JButton tirarDado = new JButton("TIRAR EL DADO"); 

		tirarDado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int numeroAleatorio = (int) (Math.random() * 5) + 1;
				System.out.println("Número Aleatorio: " + numeroAleatorio);

			}
		});

	}
}
