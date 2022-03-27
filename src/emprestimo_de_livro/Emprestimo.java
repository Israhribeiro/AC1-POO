package emprestimo_de_livro;


import java.util.Scanner;

public class Emprestimo {

    private Pessoa pessoa = new Pessoa();
    private  Emprestimo  emprestimo;
    private Livro livro = new Livro();
    private  Livro  livros[];

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }


    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void  fazerEmprestimo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual seu nome ?");
        String n = sc.nextLine();
        pessoa.setNome(n);
        System.out.println("qual sua idade");
        int i = sc.nextInt();
        pessoa.setIdade(i);

        System.out.println("qual sua matricula");
        int matri = sc.nextInt();
        pessoa.setMatricula(matri);


        System.out.println("seu  Dados " + pessoa.getNome() +pessoa.getIdade() + pessoa.getMatricula());




        System.out.println("qual o nome do livro que  deseja  fazer emprestimo  ?");


        String aut = sc.nextLine();

        livro.setNome("romeu e julieta");
        livro.getAutor();


    }


    public void addListrosparaEmprestimos( Livro livro){



    }



    public void escooherLivroParaEmprestimo(String nome){
        for (int j = 0; j < livros.length; j++){
            if((livros[j] != null)  && (livros[j].getQuantidade() > 0 ) && ( livros[j].getNome().equals(nome))){
                livros[j].setQuantidade(livros[j].getQuantidade() - 1);
                System.out.println( "Nome do livro" + livros[j].getNome());
                return;
            }
        }
        System.out.println("livro Nao existe em nosso  acervo");
    }



    public void listLivros(){
        for(int j = 0; j< livros.length; j++){
            System.out.println("livro" + livros[j].getNome());
            System.out.println("nome do  autor do livro " + livros[j].getAutor());
            System.out.println("quantidade de livros  disponiveios para emprestimos"+  livros[j].getQuantidade());
            return ;
        }

        System.out.println("nao tem livros  para emprestimos ");

    }


    public void excluirLivroDoAcervo(String nome){
        Livro[] newLivro = new Livro[livros.length + 1];
        for(int j =0 ; j< livros.length; j++){
            if((livros[j] != null)  && (livros[j].getNome().equals((nome)))) {
                livros[j] = null;
                System.out.println("Livro escluido com suceso");
                return ;
            }
        }
        System.out.println("Livro nao existe em  acervo");
    }





}





