package es.studium.Practica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;
import java.awt.TextField;

public class VistaAltaArticulos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAltaArticulos frame = new VistaAltaArticulos();
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
	public VistaAltaArticulos() {
		setTitle("Crear Articulos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 68, 90, 68, 0, 0};
		gbl_contentPane.rowHeights = new int[]{25, 25, 25, 25, 25, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblCrearArticulo = new JLabel("Crear Articulo");
		GridBagConstraints gbc_lblCrearArticulo = new GridBagConstraints();
		gbc_lblCrearArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearArticulo.gridx = 2;
		gbc_lblCrearArticulo.gridy = 0;
		contentPane.add(lblCrearArticulo, gbc_lblCrearArticulo);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 1;
		contentPane.add(lblDescripcion, gbc_lblDescripcion);
		
		TextField textField_1_1 = new TextField();
		textField_1_1.setColumns(10);
		GridBagConstraints gbc_textField_1_1 = new GridBagConstraints();
		gbc_textField_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1_1.gridx = 2;
		gbc_textField_1_1.gridy = 1;
		contentPane.add(textField_1_1, gbc_textField_1_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 2;
		contentPane.add(lblPrecio, gbc_lblPrecio);
		
		TextField textField_1 = new TextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.anchor = GridBagConstraints.WEST;
		gbc_lblCantidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidad.gridx = 1;
		gbc_lblCantidad.gridy = 3;
		contentPane.add(lblCantidad, gbc_lblCantidad);
		
		TextField textField_1_2 = new TextField();
		textField_1_2.setColumns(10);
		GridBagConstraints gbc_textField_1_2 = new GridBagConstraints();
		gbc_textField_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1_2.gridx = 2;
		gbc_textField_1_2.gridy = 3;
		contentPane.add(textField_1_2, gbc_textField_1_2);
		
		Button bttnCancelarAltaArticulos = new Button("Cancelar");
		GridBagConstraints gbc_bttnCancelarAltaArticulos = new GridBagConstraints();
		gbc_bttnCancelarAltaArticulos.fill = GridBagConstraints.BOTH;
		gbc_bttnCancelarAltaArticulos.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCancelarAltaArticulos.gridx = 1;
		gbc_bttnCancelarAltaArticulos.gridy = 5;
		contentPane.add(bttnCancelarAltaArticulos, gbc_bttnCancelarAltaArticulos);
		
		Button CrearAltaArticulos = new Button("Crear");
		GridBagConstraints gbc_CrearAltaArticulos = new GridBagConstraints();
		gbc_CrearAltaArticulos.insets = new Insets(0, 0, 0, 5);
		gbc_CrearAltaArticulos.fill = GridBagConstraints.BOTH;
		gbc_CrearAltaArticulos.gridx = 3;
		gbc_CrearAltaArticulos.gridy = 5;
		contentPane.add(CrearAltaArticulos, gbc_CrearAltaArticulos);
	}

}
