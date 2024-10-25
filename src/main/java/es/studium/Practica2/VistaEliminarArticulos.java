package es.studium.Practica2;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaEliminarArticulos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaEliminarArticulos frame = new VistaEliminarArticulos();
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
	public VistaEliminarArticulos() {
		setTitle("Eliminar Articulos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 68, 90, 68, 0, 0};
		gbl_contentPane.rowHeights = new int[]{25, 25, 0, 0, 25, 25, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		

		
		JLabel lblSeleccionarArticulos = new JLabel("Seleccioanr Articulos");
		GridBagConstraints gbc_lblSeleccionarArticulos = new GridBagConstraints();
		gbc_lblSeleccionarArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionarArticulos.gridx = 2;
		gbc_lblSeleccionarArticulos.gridy = 0;
		contentPane.add(lblSeleccionarArticulos, gbc_lblSeleccionarArticulos);
		
		java.awt.List listArticulos = new java.awt.List();
		GridBagConstraints gbc_listArticulos = new GridBagConstraints();
		gbc_listArticulos.fill = GridBagConstraints.BOTH;
		gbc_listArticulos.gridheight = 3;
		gbc_listArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_listArticulos.gridx = 2;
		gbc_listArticulos.gridy = 1;
		contentPane.add(listArticulos, gbc_listArticulos);
		
		Button bttnCancelarEliminarArticulo = new Button("Cancelar");
		bttnCancelarEliminarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_bttnCancelarEliminarArticulo = new GridBagConstraints();
		gbc_bttnCancelarEliminarArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnCancelarEliminarArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCancelarEliminarArticulo.gridx = 1;
		gbc_bttnCancelarEliminarArticulo.gridy = 5;
		contentPane.add(bttnCancelarEliminarArticulo, gbc_bttnCancelarEliminarArticulo);
		
		Button bttnEliminarArticulo = new Button("Eliminar");
		bttnEliminarArticulo.setActionCommand("Eliminar");
		bttnEliminarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_bttnEliminarArticulo = new GridBagConstraints();
		gbc_bttnEliminarArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_bttnEliminarArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnEliminarArticulo.gridx = 3;
		gbc_bttnEliminarArticulo.gridy = 5;
		contentPane.add(bttnEliminarArticulo, gbc_bttnEliminarArticulo);
	}

}
