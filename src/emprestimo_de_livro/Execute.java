package emprestimo_de_livro;

import java.util.Scanner;

public class Execute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emprestimo emprestimo = new Emprestimo();
        Pessoa pessoa = new Pessoa();

        boolean decisao = true;

        while (decisao) {
            System.out.println("Seja  vendo no  gerenciador  de  emprestimos de livros!! \n Ja tem cadastro? \n(1) sim e (2) nao");
            int cadastro = sc.nextInt();

            if(cadastro == 2){
                pessoa.criarCadastro();
            }
            System.out.println("O que deseja  realizar \n (1) Para  Cadastrar livros \n (2) listrar Livros \n (3)  deletar livros para emprestimo \n (4) para sair ");
            int  n = sc.nextInt();

            if(n == 1){
                System.out.println("---------------------------------------------------------------------------------------------------------\n");

                System.out.println("Nome do  livro  q deseja cadastrar");

                String nom = sc.nextLine();

                String nome = sc.nextLine();
                System.out.println("Autor do livro  ");

                String autor = sc.nextLine();


                System.out.println("Quantidade  de livros disponiveis para emprestimos ");
                int quabnt = sc.nextInt();

                emprestimo.addLisvrosparaEmprestimos(new Livro(nome, autor, quabnt));
            }
            if(n == 2 ){
                emprestimo.listLivros();
            }
            if(n == 3 ){
                System.out.println("Qual livro que deseja apagar");
                String nome = sc.nextLine();
                emprestimo.excluirLivroDoAcervo(nome);
            }

            if(n == 4 ){
                System.out.println("fechando ...");
                decisao = false;
                break;
            }



        }

    }
}
