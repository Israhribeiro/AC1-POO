package Arvore_Genealogica;

public class ArvoreGenealogica {
    public static void main(String[] args) {
        Pessoa avo = new Pessoa("Albertinho",180);
        Pessoa avoFemea = new Pessoa("Hermenezes",68);
        avo.setConjuge(avoFemea);
        avoFemea.setConjuge(avo);

        Pessoa pai = new Pessoa("Klebinho",37,avoFemea,avo);
        Pessoa mae = new Pessoa("Naiara",35);

        Pessoa mae2 = new Pessoa("Mariazinha",47,avoFemea,avo);
        Pessoa pai2 = new Pessoa("CleberClaudioAlbertoDaSilvaPeixotoArmateiaJuniorNeto",37);

        avo.adicionarFilho(pai);
        avoFemea.adicionarFilho(pai);

        avo.adicionarFilho(mae2);
        avoFemea.adicionarFilho(mae2);

        mae.setConjuge(pai);
        pai.setConjuge(mae);

        mae2.setConjuge(pai2);
        pai2.setConjuge(mae2);

        Pessoa filho1 = new Pessoa("Joao1",19,mae,pai);
        Pessoa filho2 = new Pessoa("Joao2",16,mae,pai);

        Pessoa filho11 = new Pessoa("CleberClaudioAlbertoDaSilvaPeixotoArmateiaJuniorNetoDoFilho",23,mae2,pai2);
        Pessoa filho12 = new Pessoa("CleberClaudioAlbertoDaSilvaPeixotoArmateiaJuniorFilhoDoNeto",1,mae2,pai2);

        mae2.adicionarFilho(filho11);
        mae2.adicionarFilho(filho12);
        pai2.adicionarFilho(filho11);
        pai2.adicionarFilho(filho12);

        mae.adicionarFilho(filho1);
        mae.adicionarFilho(filho2);
        pai.adicionarFilho(filho1);
        pai.adicionarFilho(filho2);

        ImprimirFamilia(avo);
    }

    public static void ImprimirFamilia(Pessoa pessoa){
        System.out.println(pessoa.getNome());
        if(pessoa.getConjuge() != null){
            System.out.println(pessoa.getConjuge().getNome());
        }
        if(pessoa.getFilhos().length > 0){
            Pessoa[] filhos = pessoa.getFilhos();
            for (int i = 0; i < filhos.length - 1; i++) {
                ImprimirFamilia(filhos[i]);
            }
        }
    }
}
