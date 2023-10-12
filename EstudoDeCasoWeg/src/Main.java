import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int codigoProduto = 0;
	static int codigoServico = 0;
	static String tipo;
	static double potencia;
	static double tensao;
	static int capacidade;
	static double preco;

	public static void main(String[] args) {
//		ProdutoWeg produto1 = new Gerador(1, "G aircraft", 180.0, 208.0, 100, 3000, "energia solar", 12.0);
//		ProdutoWeg produto2 = new MotorEletrico(1, "W22", 208, 380, 200, 5000, "bobinado", 75);
//		ProdutoWeg produto3 = new InversorFrequencia(3, "CFW501", 208, 220, 10, 7000, 300, "Trifasico");
//
//		ServicoDeManutencao servico1 = new ServicoDeManutencao("Consertar partida do motor", 550);
//		ServicoDeManutencao servico2 = new ServicoDeManutencao("Consertar tensão de saída variável", 550);
//		ServicoDeManutencao servico3 = new ServicoDeManutencao("Consertar regulador de tensão", 550);
//		ServicoDeManutencao servico4 = new ServicoDeManutencao("Consertar alternador", 550);
//
//		Weg weg = new Weg();
//
//		weg.adicionarProduto(produto1);
//		weg.adicionarProduto(produto2);
//		weg.adicionarProduto(produto3);
//
//		weg.adicionarServico(servico1);
//		weg.adicionarServico(servico2);
//		weg.adicionarServico(servico3);
//		weg.adicionarServico(servico4);
//		System.out.println("Lista de produtos:\n");
//		System.out.println(weg.listarProduto());
//		System.out.println("\nLista de Serviços\n");
//		System.out.println(weg.listarServico());
//		System.out.println("\nProduto 1:\n");
//		System.out.println(weg.listarProduto(0));
//		System.out.println("\nProduto 2:\n");
//		System.out.println(weg.listarProduto(1));
//		System.out.println("\nProduto 3:\n");
//		System.out.println(weg.listarProduto(2));
//		
//		System.out.println("\nManutenções\n");
//		produto1.realizarManutencao(weg.listarServico(3));
//		produto2.realizarManutencao(weg.listarServico(1));
//		produto3.realizarManutencao(weg.listarServico(2));
		Weg weg = new Weg();
		ProdutoWeg produto;
		ServicoDeManutencao servico = null;
		while (true) {
			System.out.println("Bem vindo ao sistema da weg! Aqui está o menu:");
			System.out.println(
					"1 - Adicionar produto\n2 - Adicionar serviço\n3 - Listar produto\n4 - Listar serviço\n5 - Excluir produto\n6 - Excluir serviço\n7 - Sair");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Qual produto você quer adicionar?\n1 - Gerador\n2 - Motor\n3 - Inversor");
				int op2 = sc.nextInt();

				switch (op2) {
				case 1:
					atributosProduto();
					codigoProduto++;
					System.out.println("Digite o tipo do combustível:");
					String tipoCombustivel = sc.next();
					System.out.println("Digite a autonomia:");
					double autonomia = sc.nextDouble();

					produto = new Gerador(codigoProduto--, tipo, potencia, tensao, capacidade, preco, tipoCombustivel,
							autonomia);
					adicionarNaLista(produto, weg);
					System.out.println("Ientificador do produto: " + codigoProduto);
					break;

				case 2:
					atributosProduto();
					codigoProduto++;
					System.out.println("Digite o tipo do enrolamento:");
					String tipoEnrolamento = sc.next();
					System.out.println("Digite a eficiência:");
					double eficiencia = sc.nextDouble();

					produto = new MotorEletrico(codigoProduto--, tipo, potencia, tensao, capacidade, preco,
							tipoEnrolamento, eficiencia);
					adicionarNaLista(produto, weg);
					System.out.println("Identificador do produto: " + codigoProduto);
					break;

				case 3:
					atributosProduto();
					codigoProduto++;
					System.out.println("Digite a capacidade:");
					double capacidadeFrequencia = sc.nextDouble();
					System.out.println("Digite o número de fases:");
					String fases = sc.next();

					produto = new InversorFrequencia(codigoProduto--, tipo, potencia, tensao, capacidade, preco,
							capacidadeFrequencia, fases);
					adicionarNaLista(produto, weg);
					System.out.println("Ientificador do produto: " + codigoProduto);
					break;
				}
				break;
			case 2:
				adicionarServico(servico, weg);
				System.out.println("Identificador do serviço: " + codigoServico);
				codigoServico++;
				break;
			case 3:
				System.out.println("1 - Listar todos os produtos\n2 - Listar um produto");
				int op4 = sc.nextInt();

				if (op4 == 1) {
					System.out.println(weg.listarProduto());
				} else if (op4 == 2) {
					System.out.println("Digite o código do produto:");
					int cod = sc.nextInt();

					try {
						System.out.println(weg.listarProduto(cod));
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Erro: O código informado não está associado a nenhum produto.");
					}
				}
				break;
			case 4:
				System.out.println("1 - Listar todos os serviços\n2 - Listar um serviço");
				int op5 = sc.nextInt();

				if (op5 == 1) {
					System.out.println(weg.listarServico());
				} else if (op5 == 2) {
					System.out.println("Digite o código do serviço:");
					int cod = sc.nextInt();

					try {
						System.out.println(weg.listarServico(cod));
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Erro: O código informado não está associado a nenhum serviço.");
					}
				}
				break;
			case 5:
				System.out.println("1 - remover todos os produtos\n2 - remover um produto");
				int op6 = sc.nextInt();

				if (op6 == 1) {
					weg.removerTodosProdutos();
					System.out.println("Todos os produtos foram removidos!");
				} else if (op6 == 2) {
					System.out.println("Digite o código do produto:");
					int cod = sc.nextInt();

					try {
						weg.removerProduto(cod);
						System.out.println("Produto removido");
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Erro: O código informado não está associado a nenhum produto.");
					}
				}
				break;
				
			case 6:
				System.out.println("1 - remover todos os serviços\n2 - remover um serviço");
				int op7 = sc.nextInt();

				if (op7 == 1) {
					weg.removerTodosServicos();
					System.out.println("Todos os serviços foram removidos!");
				} else if (op7 == 2) {
					System.out.println("Digite o código do serviço:");
					int cod = sc.nextInt();

					try {
						weg.removerProduto(cod);
						System.out.println("serviço removido");
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Erro: O código informado não está associado a nenhum serviço.");
					}
				}
				break;
			case 7:
				System.exit(0);
			}
		}

	}

	public static void atributosProduto() {
		System.out.println("Digite o tipo:");
		tipo = sc.next();
		System.out.println("Digite a potência:");
		potencia = sc.nextDouble();
		System.out.println("Digite a tensão:");
		tensao = sc.nextDouble();
		System.out.println("Digite a capacidade:");
		capacidade = sc.nextInt();
		System.out.println("Digite o preço:");
		preco = sc.nextDouble();
	}

	public static void adicionarNaLista(ProdutoWeg produto, Weg weg) {
		weg.adicionarProduto(produto);
		if (produto != null) {
			System.out.println("Produto cadastrado com sucesso!");
		} else {
			System.out.println("Erro: Produto não cadastrado");
		}
	}

	public static void adicionarServico(ServicoDeManutencao servico, Weg weg) {
		System.out.println("Digite a descrição do serviço:");
		String descricao = sc.next();
		System.out.println("Digite o custo do serviço:");
		double custo = sc.nextDouble();

		servico = new ServicoDeManutencao(descricao, custo);

		weg.adicionarServico(servico);
		if (servico != null) {
			System.out.println("serviço cadastrado com sucesso!");
		} else {
			System.out.println("serviço: Produto não cadastrado");
		}
	}
}
