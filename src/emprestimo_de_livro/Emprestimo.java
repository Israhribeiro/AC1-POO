package emprestimo_de_livro;


import java.util.*;

public class Emprestimo {

    private Pessoa pessoa = new Pessoa();
    
    private ArrayList<Livro> livros =  new ArrayList<Livro>();

    public Emprestimo() {
        this.livros.add(new  Livro ("teste", "teste", 1));
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public void addLisvrosparaEmprestimos(Livro livro){
        livros.add(livro);
        System.out.println("Livro aicionado com suceso" +livros.size());
    }



    public void escooherLivroParaEmprestimo(String nome){
        for (int j = 0; j < livros.size(); j++){
            if((livros.get(j) != null)  && (livros.get(j).getQuantidade() > 0 ) && ( livros.get(j).getNome().equals(nome))){
                livros.get(j).setQuantidade(livros.get(j).getQuantidade() - 1);
                System.out.println( "Nome do livro" + livros.get(j).getNome());
                return;
            }
        }
        System.out.println("livro Nao existe em nosso  acervo");
    }



    public void listLivros(){
        if(livros.size() <  1){
            System.out.println("Nao tem livros");
            return;
        }
        for(int j = 0; j < livros.size(); j++){
            System.out.println("livro" + livros.get(j).getNome());
            System.out.println("nome do  autor do livro " + livros.get(j).getAutor());
            System.out.println("quantidade de livros  disponiveios para emprestimos"+  livros.get(j).getQuantidade());
            return ;
        }
        System.out.println("nao tem livros  para emprestimos "+ livros.size());

    }


    public void excluirLivroDoAcervo(String nome){
        if(livros == null ){
            System.out.println("Nao tem livros");
            return;
        }
        for (int j = 0; j < livros.size(); j++){
            if((livros.get(j) != null)   && ( livros.get(j).getNome().equals(nome))){
                System.out.println("Livro  excluido com sucesso");
            }

        }

        System.out.println("Livro nao existe em  acervo");
        }

    }









