package es.studium.Practica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VistaMenuprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaMenuprincipal frame = new VistaMenuprincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaMenuprincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(true);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Articulos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAltaArticulos = new JMenuItem("Alta");
		mnNewMenu.add(mntmAltaArticulos);
		
		JMenuItem mntmBajaArticulos = new JMenuItem("Baja");
		mnNewMenu.add(mntmBajaArticulos);
		
		JMenuItem mntmListadoArticulos = new JMenuItem("Listado");
		mnNewMenu.add(mntmListadoArticulos);
		
		JMenuItem mntmModificarArticulos = new JMenuItem("Modificar");
		mnNewMenu.add(mntmModificarArticulos);
		
		JMenu mnNewMenu_1 = new JMenu("Tickets");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAltaTickets = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmAltaTickets);
		
		JMenuItem mntmListadoTickets = new JMenuItem("Listado");
		mnNewMenu_1.add(mntmListadoTickets);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
}
