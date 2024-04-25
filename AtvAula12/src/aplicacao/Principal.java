package aplicacao;

public class Principal {
	
	public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        // Inserção de elementos na árvore
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        // Travessias na árvore
        System.out.println("Em Ordem:");
        arvore.inorderTr();

        System.out.println("Pre-Ordem:");
        arvore.preorderTr();

        System.out.println("Pos-Ordem:");
        arvore.postorderTr();
    }

}
