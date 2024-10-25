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

public class VistaModificarArticulos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaModificarArticulos frame = new VistaModificarArticulos();
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
	public VistaModificarArticulos() {
		setTitle("Modificar Articulos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 68, 90, 68, 0, 0};
		gbl_contentPane.rowHeights = new int[]{25, 0, 0, 0, 25, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		

		
		JLabel lblSeleccionarArticulos = new JLabel("Seleccionar Articulos");
		GridBagConstraints gbc_lblSeleccionarArticulos = new GridBagConstraints();
		gbc_lblSeleccionarArticulos.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionarArticulos.gridx = 2;
		gbc_lblSeleccionarArticulos.gridy = 0;
		contentPane.add(lblSeleccionarArticulos, gbc_lblSeleccionarArticulos);
		
		java.awt.List list = new java.awt.List();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 3;
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridwidth = 3;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		contentPane.add(list, gbc_list);
		
		Button bttnCancelarModificarArticulo = new Button("Cancelar");
		bttnCancelarModificarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_bttnCancelarModificarArticulo = new GridBagConstraints();
		gbc_bttnCancelarModificarArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnCancelarModificarArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_bttnCancelarModificarArticulo.gridx = 1;
		gbc_bttnCancelarModificarArticulo.gridy = 4;
		contentPane.add(bttnCancelarModificarArticulo, gbc_bttnCancelarModificarArticulo);
		
		Button bttnModificarArticulo = new Button("Modificar");
		bttnModificarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_bttnModificarArticulo = new GridBagConstraints();
		gbc_bttnModificarArticulo.insets = new Insets(0, 0, 0, 5);
		gbc_bttnModificarArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_bttnModificarArticulo.gridx = 3;
		gbc_bttnModificarArticulo.gridy = 4;
		contentPane.add(bttnModificarArticulo, gbc_bttnModificarArticulo);
	}

}
