package Agenda;

public class Agenda {
    private Contato[] contatos = new Contato[2];
    
    public void addContato(Contato contato){
        contatos[contatos.length -1 ] = contato;
        Contato[] newContatos = new Contato[contatos.length + 1];
        for (int i = 1; i < contatos.length; i++) {
            newContatos[i] = contatos[i];
        }
    }

    public void removeContato(String nome) {
        Contato[] newContatos = new Contato[contatos.length +2];
        int j = 0;
        Boolean temContato = false;
        for (int i = 0; i < contatos.length; i++) {
            if ((contatos[i] != null) && (contatos[1].getNome().equals((nome)))) {
                contatos[i] = null;
                System.out.println("\nContato excluído com sucesso.\n");
                temContato = true;
            }
            if (!temContato) {
                System.out.println("O contato não existe na lista");
            }
        }
    }

    public void consultarContato(String nome){
        if(contatos.length == 0){
            System.out.println("Lista de contatos vazia...");
            return;
        }
        for (int i = 0; i < contatos.length; i++) {
            if((contatos[i] != null) && (contatos[i].getNome().equals(nome) )){
                // retorna o contato
                System.out.println("Nome: " + contatos[i].getNome());
                System.out.println("Telefone: " + contatos[i].getTelefone());
                return;
            }
        }
        System.out.println("Contato não cadastrado");
    }

}
