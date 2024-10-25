package es.studium.Practica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JLabel;

public class VistaAltaTickets extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAltaTickets frame = new VistaAltaTickets();
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
	public VistaAltaTickets() {
		setTitle("Crear Tickets");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 68, 90, 68, 0, 0};
		gbl_contentPane.rowHeights = new int[]{25, 0, 25, 25, 25, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Button bttnCancelarCrearTicket = new Button("Cancelar");
		bttnCancelarCrearTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		

		
		JLabel lblSeleccionarArticulos = new JLabel("Elegir Articulos");
		GridBagConstraints gbc_lblSeleccionarArticulos = new GridBagConstraints();
		gbc_lblSeleccionarArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionarArticulos.gridx = 1;
		gbc_lblSeleccionarArticulos.gridy = 1;
		contentPane.add(lblSeleccionarArticulos, gbc_lblSeleccionarArticulos);
		
		java.awt.List list = new java.awt.List();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.HORIZONTAL;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.gridx = 2;
		gbc_list.gridy = 1;
		contentPane.add(list, gbc_list);
		
		JLabel lblFechaTicket = new JLabel("Fecha");
		GridBagConstraints gbc_lblFechaTicket = new GridBagConstraints();
		gbc_lblFechaTicket.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaTicket.gridx = 1;
		gbc_lblFechaTicket.gridy = 2;
		contentPane.add(lblFechaTicket, gbc_lblFechaTicket);
		
		TextField txtfFecha = new TextField();
		GridBagConstraints gbc_txtfFecha = new GridBagConstraints();
		gbc_txtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtfFecha.gridx = 2;
		gbc_txtfFecha.gridy = 2;
		contentPane.add(txtfFecha, gbc_txtfFecha);
		GridBagConstraints gbc_bttnCancelarCrearTicket = new GridBagConstraints();
		gbc_bttnCancelarCrearTicket.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnCancelarCrearTicket.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCancelarCrearTicket.gridx = 1;
		gbc_bttnCancelarCrearTicket.gridy = 4;
		contentPane.add(bttnCancelarCrearTicket, gbc_bttnCancelarCrearTicket);
		
		Button bttnCrearTicket = new Button("Crear");
		bttnCrearTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_bttnCrearTicket = new GridBagConstraints();
		gbc_bttnCrearTicket.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCrearTicket.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnCrearTicket.gridx = 3;
		gbc_bttnCrearTicket.gridy = 4;
		contentPane.add(bttnCrearTicket, gbc_bttnCrearTicket);
	}

}
