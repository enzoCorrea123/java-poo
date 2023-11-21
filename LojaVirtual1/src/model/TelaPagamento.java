package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaPagamento(Cliente cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Confirmar Pedido");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(211, 11, 166, 14);
		contentPane.add(lblTitulo);

		JLabel lblProdutos = new JLabel("Produtos:");
		lblProdutos.setBounds(10, 125, 83, 14);
		contentPane.add(lblProdutos);
		
		String[] colunas = { "Nome", "Categoria", "Avaliação", "Modelo", "Marca", "Preço: ", "Quantidade", "Valor total" };
		DefaultTableModel carrinhoCompras = new DefaultTableModel(colunas, 0);
		for (int i = 0; i < cliente.getCarrinhoCliente().getListaDeProdutos().size(); i++) {
			
			Object[] linhas = { cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getNome(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getCategoria(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getAvaliacao(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getModelo(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getMarca(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getPreco(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).getQuantidadeProduto(),
					cliente.getCarrinhoCliente().getListaDeProdutos().get(i).calculaTotal()};
			carrinhoCompras.addRow(linhas);
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 152, 554, 140);
		contentPane.add(scrollPane);

		JTable table = new JTable(carrinhoCompras);
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		
		JLabel lblEndereco = new JLabel("Endereço de entrega:");
		lblEndereco.setBounds(10, 53, 128, 14);
		contentPane.add(lblEndereco);

		JLabel lblEnderecoCompra = new JLabel(
				cliente.getNome() + " " + cliente.getTelefone() + " " + cliente.getEndereco());
		lblEnderecoCompra.setBounds(10, 78, 554, 24);
		contentPane.add(lblEnderecoCompra);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cliente.getSaldo() < cliente.getCarrinhoCliente().getValorTotal()) {
					JOptionPane.showMessageDialog(null,"Saldo Insuficiente, vá em perfil para colocar mais saldo","Alert",JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"Compra efetuada com sucesso!"); 
					double saldo = cliente.getSaldo() - cliente.getCarrinhoCliente().getValorTotal();
					cliente.setNovoSaldo(saldo);
					cliente.carrinhoCliente.getListaDeProdutos().clear();
					TelaProduto tela = new TelaProduto(cliente);
					tela.setVisible(true);
					dispose();
				}
			}
		});
		btnComprar.setBounds(458, 343, 89, 23);
		contentPane.add(btnComprar);
		
		JLabel lblValorTotal = new JLabel("ValorTotal: " + cliente.carrinhoCliente.getValorTotal());
		lblValorTotal.setBounds(239, 303, 166, 14);
		contentPane.add(lblValorTotal);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaProduto tela = new TelaProduto(cliente);
				tela.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(10, 343, 89, 23);
		contentPane.add(btnCancelar);
	}
}
