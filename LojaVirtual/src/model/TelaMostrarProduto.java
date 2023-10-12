package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMostrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade;

	/**
	 * Create the frame.
	 */
	public TelaMostrarProduto(Produto produto, Cliente cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel(produto.getNome());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(153, 11, 164, 22);
		contentPane.add(lblNewLabel);

		JLabel lblpreco = new JLabel("Preço");
		lblpreco.setBounds(20, 43, 46, 14);
		contentPane.add(lblpreco);

		JLabel lblValor = new JLabel(String.valueOf(produto.getPreco()));
		lblValor.setBounds(82, 43, 46, 14);
		contentPane.add(lblValor);

		JLabel lblAvaliacao = new JLabel("Avaliação");
		lblAvaliacao.setBounds(271, 43, 66, 14);
		contentPane.add(lblAvaliacao);

		JLabel lblValor_1 = new JLabel(produto.getAvaliacao());
		lblValor_1.setBounds(347, 43, 63, 14);
		contentPane.add(lblValor_1);

		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(20, 83, 46, 14);
		contentPane.add(lblModelo);

		JLabel lblValor_2 = new JLabel(produto.getModelo());
		lblValor_2.setBounds(82, 83, 89, 14);
		contentPane.add(lblValor_2);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(271, 83, 46, 14);
		contentPane.add(lblMarca);

		JLabel lblValor_3 = new JLabel(produto.getMarca());
		lblValor_3.setBounds(333, 83, 77, 14);
		contentPane.add(lblValor_3);

		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(20, 122, 46, 14);
		contentPane.add(lblCor);

		JLabel lblValor_4 = new JLabel(produto.getCor());
		lblValor_4.setBounds(82, 122, 89, 14);
		contentPane.add(lblValor_4);

		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setBounds(271, 122, 46, 14);
		contentPane.add(lblEstoque);

		JLabel lblValor_5 = new JLabel(String.valueOf(produto.getEstoque()));
		lblValor_5.setBounds(333, 122, 46, 14);
		contentPane.add(lblValor_5);

		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(20, 166, 63, 14);
		contentPane.add(lblDescrio);

		JLabel lblValor_6 = new JLabel(produto.getDescricao());
		lblValor_6.setBounds(92, 146, 169, 55);
		contentPane.add(lblValor_6);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(271, 163, 78, 14);
		contentPane.add(lblQuantidade);

		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(347, 160, 46, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaProduto tela = new TelaProduto(cliente);
				tela.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setBounds(20, 211, 89, 23);
		contentPane.add(btnVoltar);

		JButton btnNewButton = new JButton("Adicionar ao carrinho");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanho = cliente.carrinhoCliente.getListaDeProdutos().size();
				boolean existe = false;
				for (int i = 0; i < tamanho; i++) {
					if (produto.getNome().equals(cliente.carrinhoCliente.getListaDeProdutos().get(i).getNome())) {
						existe = true;
						JOptionPane.showMessageDialog(null, "Produto já adicionado no carrinho!", "Erro",
								JOptionPane.ERROR_MESSAGE);
					}
				}
				if (!existe) {
					produto.setQuantidadeProduto(Integer.parseInt(txtQuantidade.getText()));
					cliente.getCarrinhoCliente().setListaDeProdutos(produto);
					produto.setEstoque(produto.getEstoque() - Integer.parseInt(txtQuantidade.getText()));
					JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho");
					TelaProduto tela = new TelaProduto(cliente);
					tela.setVisible(true);
					dispose();
				}

			}
		});
		btnNewButton.setBounds(236, 211, 188, 23);
		contentPane.add(btnNewButton);
	}
}
