package Agenda;

public class Contato {
    private long telefone;
    private String nome;

    public Contato(String nome,long telefone) {
        setNome(nome);
        setTelefone(telefone);
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
