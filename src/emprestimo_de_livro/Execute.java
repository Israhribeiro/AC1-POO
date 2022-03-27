package emprestimo_de_livro;

import java.util.Scanner;

public class Execute {

    public static void main(String[] args) {

        Emprestimo emprestimo = new Emprestimo();
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        boolean decisao = true;

        while (decisao) {
            System.out.println("Seja  vendo no  gerenciador  de  emprestimos de livros!! \n pPara Pode utilizar  realize o cadatros");
            pessoa.criarCadastro();

            System.out.println("O que deseja  realizar \n (1) Para  Cadastrar livros \n (2) listrar Livros \n (3)  deletar livros para emprestimo \n 4 para sair ");
            int  n = sc.nextInt();

            if(n == 1){
                String nome = sc.next();
                String autor  = sc.next();
                int quabnt = sc.nextInt();
                livro.setNome(nome);
                livro.setAutor(autor);
                livro.setQuantidade(quabnt);
                emprestimo.addListrosparaEmprestimos(livro);
            }
            if(n == 2 ){
                emprestimo.listLivros();
            }
            if(n == 3 ){
                String nome = sc.next();
                emprestimo.excluirLivroDoAcervo(nome);
            }

            if(n == 4 ){
                decisao = false;
                break;
            }



        }

    }
}
