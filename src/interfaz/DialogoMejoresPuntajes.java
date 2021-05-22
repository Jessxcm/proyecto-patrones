package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import mundo.AgreggateIterator;
import mundo.IAggregate;
import mundo.Iterator;

public class DialogoMejoresPuntajes extends JDialog implements ActionListener {

	// -----------------------------------------------------------------
	// ---------------------------Constantes----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	public final static String ACEPTAR = "Aceptar";

	// -----------------------------------------------------------------
	// --------------------------Asociaciones---------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	InterfazSpaceInvaders interfaz;

	/**
	 * 
	 */
	JPanel auxiliar;

	// -----------------------------------------------------------------
	// ----------------------------Atributos----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	JButton butBotonAceptar;

	// -----------------------------------------------------------------
	// ---------------------------Constructor---------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 * @param interfaz
	 */
	public DialogoMejoresPuntajes(InterfazSpaceInvaders interfaz, ArrayList<String> puntajes) {

		super(interfaz, false);

		this.interfaz = interfaz;
		setLayout(null);

		auxiliar = new JPanel();
		auxiliar.setLayout(null);
		auxiliar.setBackground(Color.BLACK);
		
		/*jtable*/
		String titulos[] = { "POSICION", "PUNTAJE", "NICKNAME", "PARTIDA" };

		String datos[][] = new String[puntajes.size()][4];
		if(puntajes != null){
			
			IAggregate aggregate = new AgreggateIterator();
			Iterator iterator = aggregate.createIterator(puntajes);
			
			
			//AggregateIterator aggregate = new AggregateIterator();
	        //Iterator iterator = aggregate.createIterator(puntajes);
	        while (iterator.hasNext()){
	        	int posicion = iterator.posicion();
	        	String[] informacion = puntajes.get(posicion).split(" "); 
		        datos[posicion][0] = informacion[0];
				datos[posicion][1] = informacion[1];
				datos[posicion][2] = informacion[2];
				datos[posicion][3] = informacion[3];
	            String Linea = (String) iterator.next();
	            System.out.println(Linea);
			}
		}
				
		JTable TablaPuntajes = new JTable(datos,titulos);
		TablaPuntajes.setEnabled(false);
		TablaPuntajes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TablaPuntajes.setBackground(Color.BLACK);
		TablaPuntajes.setForeground(Color.WHITE);
		TablaPuntajes.setBorder(null);
		TablaPuntajes.setFont(new Font("ArcadeClassic", Font.PLAIN, 13));
		TablaPuntajes.setDefaultRenderer(Object.class, new MiRender());
		
		JScrollPane mibarra1 = new JScrollPane(TablaPuntajes);
		mibarra1.setBounds(140, 30, 300, 310);
		mibarra1.setViewportView(TablaPuntajes);
		mibarra1.getViewport().setBackground(Color.BLACK);
		mibarra1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		auxiliar.add(mibarra1);
		
		butBotonAceptar = new JButton(ACEPTAR);
		butBotonAceptar.setActionCommand(ACEPTAR);
		butBotonAceptar.addActionListener(this);
		butBotonAceptar.setBounds(235, 360, 130, 25);
		butBotonAceptar.setBackground(Color.BLACK);
		butBotonAceptar.setFont(new Font("ArcadeClassic", Font.PLAIN, 20));
		butBotonAceptar.setForeground(Color.YELLOW);
		
		auxiliar.setSize(600,400);
		auxiliar.add(butBotonAceptar);

		auxiliar.setBackground(Color.BLACK);
		System.out.println(puntajes);
		setFont(new Font("ArcadeClassic", Font.PLAIN, 20));
		setForeground(Color.RED);
		
		add(auxiliar);
				
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));
	}

	// -----------------------------------------------------------------
	// ----------------------Manejador de eventos-----------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals(ACEPTAR)) {
			this.dispose();
		}
	}
	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	public void mostrar() {
		setSize(600, 400);
		setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
