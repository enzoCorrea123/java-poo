package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import javax.swing.JLabel;

public class TelaCarrinho extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarrinho frame = new TelaCarrinho();
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
	public TelaCarrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] colunas = {"Produto", "Quantidade", "Total R$", "Remover"};
		DefaultTableModel carrinhoCompras = new DefaultTableModel(colunas, 0);
		
		for(Produto produto : new Carrinho().getListaDeProdutos()) {
			Object[] linhas = {produto.getNome(), produto.getQuantidadeProduto(), produto.valorQuantidadeTotal(), null};
			carrinhoCompras.addRow(linhas);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 42, 430, 123);
		contentPane.add(scrollPane);
		
		JTable table = new JTable(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Produto", "Quantidade", "Total R$", "Remover"
			}
		));
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		table.setVisible(true);
		
		
	}
}
