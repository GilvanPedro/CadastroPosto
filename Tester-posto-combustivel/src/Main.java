import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios(); // Instância da classe Funcionarios
        Estoque estoque = new Estoque();              // Instância da classe Estoque
        Scanner sc = new Scanner(System.in);

        int opc;

        // Loop principal do programa
        while (true) {
            System.out.println("====== Menu de Navegação ======");
            System.out.println("1 - Cadastrar Frentista");
            System.out.println("2 - Gerenciar Estoque");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();

            if (opc == 1) {
                funcionario.Coisas();   // Chama o menu de funcionários
            } else if (opc == 2) {
                estoque.gerenciarProduto(); // Chama o menu do estoque
            } else if (opc == 3) {
                System.out.println("Encerrando...");
                break;  // Sai do programa
            } else {
                System.out.println("\nOpção inválida, tente novamente!\n");
            }
        }
    }
}
