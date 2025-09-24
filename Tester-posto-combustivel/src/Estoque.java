import java.util.Scanner;

public class Estoque {
    String marcaProduto;            // Marca do produto (não utilizado no código)
    String localProduto;            // Local do produto (não utilizado no código)
    double quantidadeProduto;       // Quantidade do produto (não utilizado diretamente)
    double precoProduto;            // Preço do produto (não utilizado diretamente)
    static int vendas;              // Contador de vendas (não está sendo usado ainda)
    int produtoCadastrado = 0;      // Número de produtos cadastrados

    private String[] produtosCombustivel = new String[100]; // Lista de produtos
    private double[] combustivelValor = new double[100];    // Preços dos produtos
    private double[] quantidade = new double[100];          // Quantidade disponível

    Scanner sc = new Scanner(System.in);

    // Lista os produtos cadastrados com preço e quantidade
    public void Produto() {
        if(produtoCadastrado > 0){
            System.out.println("======= Produtos e Preços =======");
            for (int i = 0; i < produtoCadastrado; i++) {
                System.out.println("Produto: " + produtosCombustivel[i] +
                        " | Preço: R$ " + combustivelValor[i] +
                        " | Quantidade Restante: " + quantidade[i] + " litros");
            }
            System.out.println();
        }else{
            System.out.println("Nenhum produto Cadastrado!!");
        }
    }

    // Menu para cadastrar e listar produtos
    void gerenciarProduto() {
        int opc;

        while (true) {
            System.out.println("====== MENU ======");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Listar Produtos Combustivel");
            System.out.println("3- Sair");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Digite o nome do Produto: ");
                    String nomeProduto = sc.next();

                    boolean existe = false;
                    for (int i = 0; i < produtoCadastrado; i++) {
                        if (produtosCombustivel[i].equalsIgnoreCase(nomeProduto)) {
                            // Caso o produto já exista, atualiza valores
                            System.out.println("Produto já existe! Atualizando valores...");
                            System.out.print("Novo Preço: ");
                            combustivelValor[i] = sc.nextDouble();
                            System.out.print("Nova Quantidade: ");
                            quantidade[i] = sc.nextDouble();
                            existe = true;
                            break;
                        }
                    }

                    if (!existe) {
                        // Cadastro de novo produto
                        produtosCombustivel[produtoCadastrado] = nomeProduto;
                        System.out.print("O Preço: ");
                        combustivelValor[produtoCadastrado] = sc.nextDouble();
                        System.out.print("Quantidade Disponível: ");
                        quantidade[produtoCadastrado] = sc.nextDouble();
                        produtoCadastrado++;
                    }
                    break;

                case 2:
                    Produto(); // Mostra lista de produtos
                    break;

                case 3:
                    System.out.println("Saindo...");
                    return; // Sai do método, voltando para o menu principal

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
