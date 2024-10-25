package es.studium.Practica2;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaModificacionArticulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaModificacionArticulo frame = new VistaModificacionArticulo();
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
	public VistaModificacionArticulo() {
		setTitle("Modificar Articulos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 68, 68, 90, 68, 68, 0 };
		gbl_contentPane.rowHeights = new int[] { 25, 0, 0, 25, 25, 25, 25, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		Button bttnCancelarCrearTicket = new Button("Cancelar");
		bttnCancelarCrearTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
				
				JLabel lblModificarArticulo = new JLabel("Modificar Articulo");
				GridBagConstraints gbc_lblModificarArticulo = new GridBagConstraints();
				gbc_lblModificarArticulo.insets = new Insets(0, 0, 5, 5);
				gbc_lblModificarArticulo.gridx = 2;
				gbc_lblModificarArticulo.gridy = 1;
				contentPane.add(lblModificarArticulo, gbc_lblModificarArticulo);
		
				JLabel lblSeleccionarArticulos = new JLabel("Descripcion");
				GridBagConstraints gbc_lblSeleccionarArticulos = new GridBagConstraints();
				gbc_lblSeleccionarArticulos.insets = new Insets(0, 0, 5, 5);
				gbc_lblSeleccionarArticulos.gridx = 1;
				gbc_lblSeleccionarArticulos.gridy = 2;
				contentPane.add(lblSeleccionarArticulos, gbc_lblSeleccionarArticulos);
		
		TextField txtfFecha_1_1 = new TextField();
		GridBagConstraints gbc_txtfFecha_1_1 = new GridBagConstraints();
		gbc_txtfFecha_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfFecha_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtfFecha_1_1.gridx = 2;
		gbc_txtfFecha_1_1.gridy = 2;
		contentPane.add(txtfFecha_1_1, gbc_txtfFecha_1_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		contentPane.add(lblPrecio, gbc_lblPrecio);
		
		TextField txtfFecha_1 = new TextField();
		GridBagConstraints gbc_txtfFecha_1 = new GridBagConstraints();
		gbc_txtfFecha_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfFecha_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtfFecha_1.gridx = 2;
		gbc_txtfFecha_1.gridy = 3;
		contentPane.add(txtfFecha_1, gbc_txtfFecha_1);

		JLabel lblFechaTicket = new JLabel("Cantidad");
		GridBagConstraints gbc_lblFechaTicket = new GridBagConstraints();
		gbc_lblFechaTicket.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaTicket.gridx = 1;
		gbc_lblFechaTicket.gridy = 4;
		contentPane.add(lblFechaTicket, gbc_lblFechaTicket);

		TextField txtfFecha = new TextField();
		GridBagConstraints gbc_txtfFecha = new GridBagConstraints();
		gbc_txtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtfFecha.gridx = 2;
		gbc_txtfFecha.gridy = 4;
		contentPane.add(txtfFecha, gbc_txtfFecha);
		GridBagConstraints gbc_bttnCancelarCrearTicket = new GridBagConstraints();
		gbc_bttnCancelarCrearTicket.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnCancelarCrearTicket.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCancelarCrearTicket.gridx = 1;
		gbc_bttnCancelarCrearTicket.gridy = 6;
		contentPane.add(bttnCancelarCrearTicket, gbc_bttnCancelarCrearTicket);

		Button bttnCrearTicket = new Button("Crear");
		bttnCrearTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_bttnCrearTicket = new GridBagConstraints();
		gbc_bttnCrearTicket.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnCrearTicket.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCrearTicket.gridx = 3;
		gbc_bttnCrearTicket.gridy = 6;
		contentPane.add(bttnCrearTicket, gbc_bttnCrearTicket);
	}
}
