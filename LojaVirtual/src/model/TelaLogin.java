package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Create the frame.
	 */
	public TelaLogin(Cliente cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTitulo = new JLabel("LOGIN");
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setBounds(189, 11, 46, 14);
		contentPane.add(lbTitulo);

		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setBounds(118, 75, 46, 14);
		contentPane.add(lbUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(166, 75, 144, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setBounds(118, 131, 46, 14);
		contentPane.add(lbSenha);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = txtUsuario.getText();
				String senha = txtSenha.getText();
				if (usuario.equals("") || senha.equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!", "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (cliente.login(usuario, senha)) {
						TelaProduto tela = new TelaProduto(cliente);
						tela.setVisible(true);
						setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Erro",
								JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		btnConfirmar.setBounds(118, 177, 93, 23);
		contentPane.add(btnConfirmar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsuario.setText("");
				txtSenha.setText("");
			}
		});
		btnCancelar.setBounds(221, 177, 89, 23);
		contentPane.add(btnCancelar);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(166, 129, 144, 19);
		contentPane.add(txtSenha);
	}
}
