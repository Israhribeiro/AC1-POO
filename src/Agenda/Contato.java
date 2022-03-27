package Agenda;

public class Contato {
    private String telefone;
    private String nome;

    public Contato(String nome,String telefone) {
        setNome(nome);
        setTelefone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
