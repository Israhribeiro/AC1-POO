package Agenda;

public class Agenda {
    private Contato[] contatos = new Contato[1];
    
    public void addContato(Contato contato){
        contatos[contatos.length - 1] = contato;
        Contato[] newContatos = new Contato[contatos.length + 1];
        for (int i = 0; i < contatos.length; i++) {
            newContatos[i] = contatos[i];
        }
    }

    public void removeContato(String nome){
        if(contatos.length == 0){
            System.out.println("Lista de contatos vazia...");
            return;
        }
        Contato[] newContatos = new Contato[contatos.length - 1];
        int j = 0;
        Boolean temContato = false;
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i].getNome() != nome){
                newContatos[j] = contatos[i];
                j++;
            }
            if(contatos[i].getNome() == nome) temContato = true;
        }
        if(!temContato) System.out.println("O contato não existe na lista");
        else System.out.println("Contato removido com sucesso");
    }

    public void consultarContato(String nome){
        if(contatos.length == 0){
            System.out.println("Lista de contatos vazia...");
            return;
        }
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i].getNome().contains(nome)){
                System.out.println("Nome: " + contatos[i].getNome());
                System.out.println("Telefone: " + contatos[i].getTelefone());
                return;
            }
        }
        System.out.println("Contato não cadastrado");
    }

}
