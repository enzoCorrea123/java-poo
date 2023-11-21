package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaCarteira extends JFrame {

	private JPanel contentPane;
	private JTextField txtSaldo;

	/**
	 * Create the frame.
	 */
	public TelaCarteira(Cliente cliente
			) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarteira = new JLabel("Carteira");
		lblCarteira.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCarteira.setBounds(181, 11, 81, 25);
		contentPane.add(lblCarteira);
		
		JLabel lblNovoSaldo = new JLabel("adicionar saldo:");
		lblNovoSaldo.setBounds(127, 72, 108, 14);
		contentPane.add(lblNovoSaldo);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(230, 69, 86, 20);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(10, 145, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.setSaldo(Double.parseDouble(txtSaldo.getText()));
				TelaProduto tela = new TelaProduto(cliente);
				tela.setVisible(true);
				dispose();
				
			}
		});
		btnConfirmar.setBounds(323, 145, 101, 23);
		contentPane.add(btnConfirmar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "pix", "cartão de crédito", "cartão de débito"}));
		comboBox.setBounds(230, 101, 86, 21);
		contentPane.add(comboBox);
		
		JLabel lblForma = new JLabel("Forma de pagamento:");
		lblForma.setBounds(104, 104, 131, 14);
		contentPane.add(lblForma);
	}
}
