package emprestimo_de_livro;

import java.util.Scanner;

public class Pessoa {
    private  String nome;
    private int idade;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public  void criarCadastro  (){

        Scanner sc = new Scanner(System.in);
        System.out.println("qual seu nome ?");
        String n = sc.nextLine();
        setNome(n);
        System.out.println("qual sua idade");
        int i = sc.nextInt();
        setIdade(i);

        System.out.println("qual sua matricula");
        int matri = sc.nextInt();
        setMatricula(matri);


        System.out.println("seu  Dados " +getNome() +getIdade() +getMatricula());
    }


}
