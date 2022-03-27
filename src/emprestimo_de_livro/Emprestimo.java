package emprestimo_de_livro;


import java.util.Scanner;

public class Emprestimo {

    private Pessoa pessoa = new Pessoa();
    private Livro livro = new Livro();
    private  Livro  livros[];

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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





}





