package aplicacao;

public class Arvore {
    int val;
    Arvore esquerda;
    Arvore direita;

    public Arvore(int val) {
        this.val = val;
        this.esquerda = null;
        this.direita = null;
    }

}
