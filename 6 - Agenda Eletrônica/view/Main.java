package view;

import controller.AgendaController;
import model.Contato;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaController controller = new AgendaController();
        boolean rodando = true;

        while (rodando) {
            System.out.println("1. Adicionar contato: ");
            System.out.println("2. Remover contato: ");
            System.out.println("3. Buscar contato por nome: ");
            System.out.println("4. Buscar contato por email: ");
            System.out.println("5. Buscar contato por telefone: ");
            System.out.println("6. Consultar tamanho da Agenda: ");
            System.out.println("7. Finalizar o Programa.");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Telefone: ");
                    long telefone = scanner.nextLong();
                    controller.adicionarContato(nome, email, telefone);
                    break;
                case 2:
                    System.out.println("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (controller.removerContato(nomeRemover)) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Nome do contato a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoNome = controller.buscarContatoPorNome(nomeBuscar);
                    if (contatoNome != null) {
                        System.out.println("Contato encontrado: " + contatoNome.getNome() + ", "
                                + contatoNome.getEmail() + ", " + contatoNome.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Email do contato a buscar: ");
                    String emailBuscar = scanner.nextLine();
                    Contato contatoEmail = controller.buscarContatoPorEmail(emailBuscar);
                    if (contatoEmail != null) {
                        System.out.println("Contato encontrado: " + contatoEmail.getNome() + ", "
                                + contatoEmail.getEmail() + ", " + contatoEmail.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Telefone do contato a buscar: ");
                    long telefoneBuscar = scanner.nextLong();
                    Contato contatoTelefone = controller.buscarContatoPorTelefone(telefoneBuscar);
                    if (contatoTelefone != null) {
                        System.out.println("Contato encontrado: " + contatoTelefone.getNome() + ", "
                                + contatoTelefone.getEmail() + ", " + contatoTelefone.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Tamanho da agenda: " + controller.getTamanho());
                    break;
                case 7:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
