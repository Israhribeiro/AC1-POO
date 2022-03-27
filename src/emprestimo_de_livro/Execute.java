package emprestimo_de_livro;

import java.util.Scanner;

public class Execute {

    public static void main(String[] args) {

        Emprestimo emprestimo = new Emprestimo();
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        boolean decisao = true;

        while (decisao) {
            System.out.println("Seja  vendo no  gerenciador  de  emprestimos de livros!! \n pPara Pode utilizar  realize o cadatros");
            pessoa.criarCadastro();

            System.out.println("O que deseja  realizar \n (1) Para  Cadastrar livros \n (2) listrar Livros \n (3)  deletar para emprestimo");
            int  n = sc.nextInt();

            if(n == 1){
                emprestimo.
            }
            if(n == 2 ){
                emprestimo.listarLivros();
            }
            if(n == 3 ){

            }
            if(n == 4 ){

            }
            if(n == 5 ){
                decisao = false;
                break;
            }



        }

    }
}
