package emprestimo_de_livro;


import java.util.ArrayList;

public class Emprestimo {

    private Pessoa pessoa = new Pessoa();
    private ArrayList<Livro> livros =  new ArrayList<Livro>();


    public Emprestimo() {
        this.livros.add(new Livro("teste","teste", 1)) ;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public void addLivrosparaEmprestimos(Livro livro){
        this.livros.add( livro);
        System.out.println("livro adicionado com sucesso" );

    }



    public void escolherLivroParaEmprestimo(String nome){
        for (int j = 0; j < this.livros.size(); j++){
            if((livros.get(j) != null)  && (livros.get(j).getQuantidade() > 0 ) && ( livros.get(j).getNome().equals(nome))){
                livros.get(j).setQuantidade(livros.get(j).getQuantidade() - 1);
                System.out.println( "Nome do livro" + livros.get(j).getNome());
                return;
            }
        }
        System.out.println("livro Nao existe em nosso  acervo");
    }



    public void listLivros(){
        if(this.livros.size() <  1){
            System.out.println("Nao tem livros");

        }

        for(int j = 0; j < this.livros.size(); j++){
            System.out.println("livro " + this.livros.get(j).getNome());
            System.out.println("nome do  autor do livro " + this.livros.get(j).getAutor());
            System.out.println("quantidade de livros  disponiveios para emprestimos"+ this.livros.get(j).getQuantidade());

        }
        System.out.println("nao tem livros  para emprestimos "+ livros.size());

    }


    public void excluirLivroDoAcervo(String nome){
        if(this.livros == null ){
            System.out.println("Nao tem livros");
        }
        for (int j = 0; j <this.livros.size(); j++){
            if((this.livros.get(j) != null)  && ( this.livros.get(j).getNome().equals(nome))){
                System.out.println("Livro  excluido com sucesso");
                return;
            }

        }

        System.out.println("Livro nao existe em  acervo");
        }

    }









