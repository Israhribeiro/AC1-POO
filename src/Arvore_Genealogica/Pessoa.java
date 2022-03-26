package Arvore_Genealogica;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa conjuge;
    private Pessoa[] filhos = new Pessoa[1];

    public Pessoa(String nome,int idade){
        setNome(nome);
        setIdade(idade);
    }

    public Pessoa(String nome,int idade,Pessoa mae, Pessoa pai){
        setNome(nome);
        setIdade(idade);
        setMae(mae);
        setPai(pai);
    }

    public void adicionarFilho(Pessoa filho){
        Pessoa[] newFilhos = new Pessoa[filhos.length + 1];
        for(int i = 0; i < filhos.length; i++)
        {
            newFilhos[i] = filhos[i];
        }
        newFilhos[filhos.length - 1] = filho;
        filhos = newFilhos;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public Pessoa[] getFilhos(){
        return filhos;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
}
