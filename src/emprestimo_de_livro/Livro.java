package emprestimo_de_livro;

import java.util.Scanner;

public class Livro {

    private  String nome;
    private  String autor;
    private int quantidade;


    public Livro(String nome, String autor, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
