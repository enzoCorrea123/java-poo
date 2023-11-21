package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JLabel lblData;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblTelefone;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblRua;
	private JTextField txtRua;
	private JLabel lblBairro;
	private JTextField txtBairro;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JLabel lblUf;
	private JLabel lblCep;
	private JLabel lblNumero;
	private JTextField txtNumero;
	private JLabel lblComplemento;
	private JTextField txtComplemento;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private JFormattedTextField formatedCep;
	private JFormattedTextField formatedTelefone;
	private JPasswordField txtSenha;

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaCadastro() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastro.setBounds(189, 11, 68, 14);
		contentPane.add(lblCadastro);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 40, 46, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(66, 37, 100, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 65, 46, 14);
		contentPane.add(lblCpf);

		lblData = new JLabel("Data de nascimento:");
		lblData.setBounds(10, 193, 125, 14);
		contentPane.add(lblData);

		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 90, 46, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(66, 87, 100, 20);
		contentPane.add(txtEmail);

		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 168, 62, 14);
		contentPane.add(lblTelefone);

		lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(10, 115, 46, 14);
		contentPane.add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(66, 112, 86, 20);
		contentPane.add(txtUsuario);

		lblRua = new JLabel("Rua:");
		lblRua.setBounds(221, 65, 46, 14);
		contentPane.add(lblRua);

		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(277, 62, 133, 20);
		contentPane.add(txtRua);

		lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(221, 90, 46, 14);
		contentPane.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(277, 87, 86, 20);
		contentPane.add(txtBairro);

		lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(221, 115, 46, 14);
		contentPane.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(277, 112, 86, 20);
		contentPane.add(txtCidade);

		lblUf = new JLabel("UF:");
		lblUf.setBounds(221, 140, 26, 14);
		contentPane.add(lblUf);

		lblCep = new JLabel("CEP:");
		lblCep.setBounds(221, 40, 46, 14);
		contentPane.add(lblCep);

		lblNumero = new JLabel("Número:");
		lblNumero.setBounds(219, 165, 62, 14);
		contentPane.add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(277, 162, 46, 20);
		contentPane.add(txtNumero);

		lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(221, 193, 86, 14);
		contentPane.add(lblComplemento);

		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(312, 190, 112, 20);
		contentPane.add(txtComplemento);
		
		JComboBox cbUf = new JComboBox();
		cbUf.setModel(new DefaultComboBoxModel(
				new String[] { "", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL",
						"SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));
		cbUf.setBounds(277, 136, 46, 22);
		contentPane.add(cbUf);
		
		MaskFormatter maskDataNascimento = new MaskFormatter("##/##/####");
		maskDataNascimento.setPlaceholderCharacter('_');
		
		JFormattedTextField formatedData = new JFormattedTextField(maskDataNascimento);
		formatedData.setBounds(10, 218, 84, 20);
		contentPane.add(formatedData);
		
		MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
		maskCpf.setPlaceholderCharacter('_');
		
		JFormattedTextField formatedCpf = new JFormattedTextField(maskCpf);
		formatedCpf.setBounds(66, 62, 100, 20);
		contentPane.add(formatedCpf);
		
		MaskFormatter maskCep = new MaskFormatter("##-###-###");
		maskCep.setPlaceholderCharacter('_');
		
		formatedCep = new JFormattedTextField(maskCep);
		formatedCep.setBounds(277, 37, 82, 20);
		contentPane.add(formatedCep);
		
		MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");
		maskTelefone.setPlaceholderCharacter('_');
		
		JFormattedTextField formatedTelefone = new JFormattedTextField(maskTelefone);
		formatedTelefone.setBounds(66, 166, 100, 19);
		contentPane.add(formatedTelefone);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRua.setText("");
				txtBairro.setText("");
				txtCidade.setText("");
				txtComplemento.setText("");
				txtNumero.setText("");
				formatedCep.setText("");
				txtNome.setText("");
				formatedCpf.setText("");
				formatedData.setText("");
				txtEmail.setText("");
				txtUsuario.setText("");
				txtSenha.setText("");
				formatedTelefone.setText("");
				
			}
		});
		btnCancelar.setBounds(10, 249, 89, 23);
		contentPane.add(btnCancelar);
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtBairro.getText().equals("") || txtCidade.getText().equals("") ||txtComplemento.getText().equals("") || txtEmail.getText().equals("") || txtNome.getText().equals("") || txtNumero.getText().equals("") || txtRua.getText().equals("") || txtSenha.getText().equals("") || txtUsuario.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha corretamente os campos!", "Erro",
							JOptionPane.ERROR_MESSAGE);
				}else {
					Date dataNascimentoFormatada = null;
	
					try {
						dataNascimentoFormatada = formato.parse(formatedData.getText());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//colocar cep no objeto endereço
					
					Endereco endereco = new Endereco(txtRua.getText(), txtBairro.getText(), txtCidade.getText(), cbUf.getSelectedItem().toString(), txtComplemento.getText(), Integer.parseInt(txtNumero.getText()), formatedCep.getText());
					Carrinho carrinho = new Carrinho();
					Cliente cliente = new Cliente(txtNome.getText(), formatedCpf.getText(), dataNascimentoFormatada, endereco, txtEmail.getText(), txtUsuario.getText(), txtSenha.getText(), formatedTelefone.getText(),carrinho);
					TelaLogin login = new TelaLogin(cliente);
					login.setVisible(true);
					setVisible(false);
				}
				
			}
			
		});
		
		btnConfirmar.setBounds(324, 249, 100, 23);
		contentPane.add(btnConfirmar);

		JList list = new JList();
		list.setBounds(389, 146, 1, 1);
		contentPane.add(list);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 143, 46, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(66, 142, 100, 19);
		contentPane.add(txtSenha);
		
		
		
		
	}
}
