package gabriel.crud;

import gabriel.crud.model.Aluno;
import gabriel.crud.service.AlunoService;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static AlunoService service = new AlunoService();

    public static void main(String[] args) {
        int opcao = -1;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Buscar aluno por nome");
            System.out.println("0 - Sair");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Digite um número!");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> service.listar();
                case 3 -> atualizar();
                case 4 -> remover();
                case 5 -> buscar();
            }
        } while (opcao != 0);
    }

    static void cadastrar() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        service.cadastrar(nome, email);
        System.out.println("Aluno cadastrado!");
    }

    static void atualizar() {
        System.out.print("ID: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ID precisa ser um número!");
            scanner.nextLine();
            return;
        }
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Novo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Novo email: ");
        String email = scanner.nextLine();
        service.atualizar(id, nome, email);
        System.out.println("Aluno atualizado!");
    }

    static void remover() {
        System.out.print("ID do aluno para remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (!service.existeAluno(id)) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Tem certeza que deseja remover? (s/n): ");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("s")) {
            if (service.remover(id)) {
                System.out.println("Aluno removido com sucesso!");
            } else {
                System.out.println("Erro ao remover aluno.");
            }
        } else {
            System.out.println("Remoção cancelada.");
        }
    }

    static void buscar() {
        System.out.print("Digite o nome para buscar: ");
        String termo = scanner.nextLine();

        Aluno aluno = service.buscarPorNome(termo);
        if (aluno != null) {
            System.out.println("Aluno encontrado: " + aluno);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}

