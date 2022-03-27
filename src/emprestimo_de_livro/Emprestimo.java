package emprestimo_de_livro;


import java.util.Scanner;

public class Emprestimo {

    private Pessoa pessoa = new Pessoa();
    private  Livro[]  livros = new Livro[10];

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }




    public void listarLivros (){
        for(int j = 0; j <  livros.length; j++) {
            System.out.println("Nome do livro " + livros[j].getNome());
            System.out.println("autor do  livro " + livros[j].getAutor());
            System.out.println("quantidade do livro " + livros[j].getQuantidade());
        }
        System.out.println("nao Temos Livro para Emprestimo");
    }


    public void  escolheLivro(String livro ){
        for(int j = 0; j <  livros.length; j++) {
            if((livros[j] != null) && (livros[j].getQuantidade() > 0 ) && (livros[j].getNome().equals(livro) )){
                livros[j].setQuantidade(-1);
                System.out.println("voce podera ficar com esse livro  durante uma semana \n caso nao entregue em uma seman  tera que pagar uma taxa por dia que 2.50 por dia de atraso ");

            }if(livros[j].getQuantidade() <= 0){
                System.out.println("Nao  temos esse livro para emprestimo");

            }
        }
    }


    public void criarlivroParaEmprestimo(Livro livr){
        livros[livros.length - 1 ] = livr;
        Livro[] newLivros = new Livro[livros.length + 1 ];
        for (int j = 1; j< livros.length;){

        }

    }



}





