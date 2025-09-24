import java.util.Scanner;

public class Funcionarios {
    String nome;                 // Nome do funcionário
    long cpf;                    // CPF do funcionário
    double salarioBase;          // Salário base do funcionário
    int vendasRealizadas;        // Quantidade de vendas realizadas
    int horasTrabalhadas;        // Horas trabalhadas (não está sendo usado no código)
    double comissao;             // Comissão por venda
    double salario;              // Salário variável baseado em vendas

    private Funcionarios[] listaFuncionarios = new Funcionarios[100]; // Lista de até 100 funcionários
    private int quantidadeFuncionarios = 0;                           // Controle do número de funcionários cadastrados

    // Calcula o rendimento do funcionário com base nas vendas
    double rendimento(double vendasTotais) {
        vendasRealizadas++;
        salario = comissao * vendasTotais;
        return salario;
    }

    // Retorna o salário final (fixo + variável)
    double salarioCompleto() {
        return salarioBase + salario;
    }

    // Método para cadastrar um funcionário usando Scanner
    public void cadastrarFuncionario(Scanner sc) {
        System.out.print("Digite o nome do Funcionário: ");
        this.nome = sc.nextLine();

        System.out.print("CPF do Funcionário: ");
        this.cpf = sc.nextLong();

        System.out.print("Salário Base: ");
        this.salarioBase = sc.nextDouble();

        System.out.print("Comissão por Vendas: ");
        this.comissao = sc.nextDouble();
        sc.nextLine(); // limpar buffer do teclado
    }

    // Exibe as informações do funcionário
    public void mostrarInfo() {
        System.out.println("\n--- Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Comissão por Vendas: " + comissao);
    }

    // Menu para cadastrar e listar funcionários
    public void Coisas() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Listar funcionários");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            System.out.println();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (quantidadeFuncionarios < listaFuncionarios.length) {
                        Funcionarios novoFuncionario = new Funcionarios();
                        novoFuncionario.cadastrarFuncionario(sc);
                        listaFuncionarios[quantidadeFuncionarios] = novoFuncionario;
                        quantidadeFuncionarios++;
                    } else {
                        System.out.println("Limite de funcionários atingido!");
                    }
                    break;

                case 2:
                    if (quantidadeFuncionarios == 0) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (int i = 0; i < quantidadeFuncionarios; i++) {
                            listaFuncionarios[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}
