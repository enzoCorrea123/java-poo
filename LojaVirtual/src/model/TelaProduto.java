package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaProduto extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaProduto(Cliente cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProdutos.setBounds(167, 0, 90, 25);
		contentPane.add(lblProdutos);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 24, 434, 237);
		contentPane.add(tabbedPane);

		JPanel tenis = new JPanel();
		tabbedPane.addTab("Tênis", null, tenis, null);
		tenis.setLayout(null);

		JButton btnProduto1 = new JButton("Chuteira");
		btnProduto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto chuteira = new Produto("Chuteira", 250.0, "tenis", "5", "esporte", "nike", "laranja", 100,
						"Chuteira que o neymar usou quando jogava no Santos, recomendo", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(chuteira, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnProduto1.setBounds(80, 11, 258, 32);
		tenis.add(btnProduto1);

		JButton btnTenis2 = new JButton("Nike Pegasus");
		btnTenis2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto pegasus = new Produto("Pegasus", 350.0, "tenis", "4.5", "esportivo", "nike", "vermelho", 100,
						"Pisante para sair e pegar as novinha, funciona mesmo se duvidar compra e testa", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(pegasus, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnTenis2.setBounds(80, 91, 258, 32);
		tenis.add(btnTenis2);

		JButton btnTenis3 = new JButton("All star");
		btnTenis3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto allStar = new Produto("All star", 250.0, "tenis", "5", "moda", "converse", "preto", 100,
						"All star para usar em qualquer ocasião, top de linha", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(allStar, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnTenis3.setBounds(80, 166, 258, 32);
		tenis.add(btnTenis3);

		JLabel label = new JLabel("New label");
		label.setBounds(94, 21, 45, 13);
		tenis.add(label);

		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(94, 21, 45, 13);
		tenis.add(label_1);

		JPanel sapato = new JPanel();
		tabbedPane.addTab("Sapato", null, sapato, null);
		sapato.setLayout(null);

		JButton btnSapato1 = new JButton("Sapato oxford");
		btnSapato1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto oxford = new Produto("Oxford", 300.0, "sapato", "5", "social", "Dakota", "preto", 100,
						"Sapato confortável para eventos chiques", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(oxford, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnSapato1.setBounds(81, 11, 258, 32);
		sapato.add(btnSapato1);

		JButton btnSapato2 = new JButton("Sapato derby");
		btnSapato2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto derby = new Produto("Derby", 400.0, "sapato", "5", "social", "Beira Rio", "marrom", 100,
						"Sapato bom para ir na igreja", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(derby, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnSapato2.setBounds(81, 88, 258, 32);
		sapato.add(btnSapato2);

		JButton btnSapato3 = new JButton("Sapato loafer");
		btnSapato3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto loafer = new Produto("Loafer", 450.0, "sapato", "5", "social", "Melissa", "marrom", 100,
						"Sapato top muito bonito", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(loafer, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnSapato3.setBounds(81, 166, 258, 32);
		sapato.add(btnSapato3);

		JPanel chinelo = new JPanel();
		tabbedPane.addTab("Chinelo", null, chinelo, null);
		chinelo.setLayout(null);

		JButton btnChinelo1 = new JButton("Chinelo nuvem");
		btnChinelo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto nuvem = new Produto("Chinelo Nuvem", 120.0, "chinelo", "4.5", "caseiro", "havaianas", "azul",
						100, "Chinelo de rico muito chique pra ficar em casa", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(nuvem, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnChinelo1.setBounds(81, 11, 258, 32);
		chinelo.add(btnChinelo1);

		JButton btnChinelo2 = new JButton("Chinelo slim");
		btnChinelo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto slim = new Produto("Chinelo slim", 30.0, "chinelo", "5", "caseiro", "havainas", "amarelo", 100,
						"chinelo simples pra usar em qualquer lugar", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(slim, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnChinelo2.setBounds(81, 89, 258, 32);
		chinelo.add(btnChinelo2);

		JButton btnChinelo3 = new JButton("sandália");
		btnChinelo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto sandalia = new Produto("Sandalia", 150.0, "chinelo", "5", "caseiro", "havainas", "verde", 100,
						"Sandalia cringe pra velho usar", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(sandalia, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnChinelo3.setBounds(81, 166, 258, 32);
		chinelo.add(btnChinelo3);

		JPanel sapatenis = new JPanel();
		tabbedPane.addTab("Sapatenis", null, sapatenis, null);
		sapatenis.setLayout(null);

		JButton btnSapatenis1 = new JButton("Sapatenis casual");
		btnSapatenis1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto sapatenis = new Produto("Sapatenis casual", 279.50, "sapatenis", "5", "social", "democrata",
						"marrom", 100, "sapatenis bonito para ir em eventos sociais", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(sapatenis, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnSapatenis1.setBounds(82, 11, 258, 32);
		sapatenis.add(btnSapatenis1);

		JButton btnSapatenis2 = new JButton("Sapatenis slip on");
		btnSapatenis2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto slipOn = new Produto("Sapatenis slip on", 279.50, "sapatenis", "5", "social", "Puma", "preto",
						100, "sapatenis bom, confortável e bonito", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(slipOn, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnSapatenis2.setBounds(82, 87, 258, 32);
		sapatenis.add(btnSapatenis2);

		JButton btnSapatenis3 = new JButton("Sapatenis couro");
		btnSapatenis3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto couro = new Produto("Sapatenis couro", 279.50, "sapatenis", "5", "social", "reserva go",
						"marrom", 100, "sapatenis top de linha famosos usam", 5);
				TelaMostrarProduto frame = new TelaMostrarProduto(couro, cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnSapatenis3.setBounds(82, 166, 258, 32);
		sapatenis.add(btnSapatenis3);

		JPanel carrinho = new JPanel();
		tabbedPane.addTab("Ver Carrinho", null, carrinho, null);
		carrinho.setLayout(null);

		String[] colunas = { "Produto", "Quantidade", "Vlr. Unitário R$", "Remover" };
		DefaultTableModel carrinhoCompras = new DefaultTableModel(colunas, 0);
		for (int i = 0; i < cliente.getCarrinhoCliente().getListaDeProdutos().size(); i++) {

			Object[] linhas = { cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getNome(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getQuantidadeProduto(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getPreco(), "remover produto" };
			carrinhoCompras.addRow(linhas);
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 429, 171);
		carrinho.add(scrollPane);

		JTable table = new JTable(carrinhoCompras);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		table.setEnabled(false);

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int colunaClicada = table.columnAtPoint(e.getPoint());
				int linhaClicada = table.rowAtPoint(e.getPoint());
				Object linhaNome = table.getValueAt(linhaClicada, 0);
				String nome = linhaNome.toString();

				if (colunaClicada == 3) {
					((DefaultTableModel) table.getModel()).removeRow(linhaClicada);
					cliente.carrinhoCliente.removerProduto(linhaClicada);
				}
//				                 
//				 Object valorNome= table.getValueAt(linhaClicada, 0);
//				 String nome = valorNome.toString();
//				                 
//				 if (colunaClicada == 3) {
//					 clicadas++;
//				    if(clicadas%2 == 0) {
//				       ((DefaultTableModel) table.getModel()).removeRow(linhaClicada);
//				       removerProduto(nome, cliente);
//				    } 
//				 }
			}
		});

		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPagamento tela = new TelaPagamento(cliente);
				tela.setVisible(true);
				dispose();
			}
		});
		btnComprar.setBounds(318, 182, 89, 23);
		carrinho.add(btnComprar);

		JButton btnClear = new JButton("Limpar carrinho");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanho = cliente.carrinhoCliente.getListaDeProdutos().size();
				for (int i = 0; i < tamanho; i++) {
					((DefaultTableModel) table.getModel()).removeRow(0);
				}

				cliente.carrinhoCliente.getListaDeProdutos().clear();
				dispose();
				setVisible(true);
			}
		});
		btnClear.setBounds(10, 183, 128, 21);
		carrinho.add(btnClear);

		JPanel perfil = new JPanel();
		tabbedPane.addTab("Ver Perfil", null, perfil, null);
		perfil.setLayout(null);

		JLabel lblNome = new JLabel(cliente.getNome());
		lblNome.setBounds(23, 129, 93, 14);
		perfil.add(lblNome);

		JLabel lblEmail = new JLabel(cliente.getEmail());
		lblEmail.setBounds(168, 114, 251, 14);
		perfil.add(lblEmail);

		JLabel lblCpf = new JLabel(cliente.getCpf());
		lblCpf.setBounds(168, 28, 93, 14);
		perfil.add(lblCpf);

		JLabel lblTelefone = new JLabel(cliente.getTelefone());
		lblTelefone.setBounds(168, 64, 93, 14);
		perfil.add(lblTelefone);

		JLabel lblSaldo = new JLabel("Saldo: " + cliente.getSaldo());
		lblSaldo.setBounds(306, 28, 113, 14);
		perfil.add(lblSaldo);

		JButton btnSaldo = new JButton("Adicionar Saldo");
		btnSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCarteira carteira = new TelaCarteira(cliente);
				carteira.setVisible(true);
				dispose();

			}
		});
		btnSaldo.setBounds(272, 72, 147, 23);
		perfil.add(btnSaldo);

		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon("C:\\Users\\Aluno\\Documents\\GitHub\\poo\\LojaVirtual\\assets\\user-removebg-preview.png"));
		
		lblFoto.setBounds(10, 10, 136, 109);
		perfil.add(lblFoto);
	}
}
