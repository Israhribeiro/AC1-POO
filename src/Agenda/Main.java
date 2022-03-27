package Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        intro(agenda);
    }

    public static void intro(Agenda agenda){
        System.out.println("Bem vindo à Agenda Digital, escolha uma das opções para continuar");
        System.out.println("(1) Adicionar contato");
        System.out.println("(2) Remover contato");
        System.out.println("(3) Consultar contato");
        System.out.println("(4) Sair");
        Scanner sc = new Scanner(System.in);

        int op = sc.nextInt();

        selecionarOpcoes(op,agenda);
    }

    public static void selecionarOpcoes(int op,Agenda agenda){
        Scanner sc = new Scanner(System.in);
        String nome;
        switch (op){
            case 1:
                System.out.println("Digite o nome do contato: ");
                nome = sc.nextLine();
                System.out.println("Digite o telefone do contato: ");
                String telefone = sc.nextLine();
                agenda.addContato(new Contato(nome,telefone));
                intro(agenda);
                break;
            case 2:
                System.out.println("Digite o nome do contato que quer remover: ");
                nome = sc.nextLine();
                agenda.removeContato(nome);
                intro(agenda);
                break;
            case 3:
                System.out.println("Digite o nome do contato que quer consultar: ");
                nome = sc.nextLine();
                agenda.consultarContato(nome);
                intro(agenda);
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                intro(agenda);
        }
    }
}
