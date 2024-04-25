package aplicacao;

public class ArvoreBinariaBusca {
	
	private Arvore root;

    public ArvoreBinariaBusca() {
        this.root = null;
    }

    // Método para inserir um valor na árvore
    public void inserir(int val) {
        this.root = inserirNo(this.root, val);
    }

    private Arvore inserirNo(Arvore root, int val) {
        if (root == null) {
            return new Arvore(val);
        }

        if (val < root.val) {
            root.esquerda = inserirNo(root.esquerda, val);
        } else if (val > root.val) {
            root.direita = inserirNo(root.direita, val);
        }

        return root;
    }

    // Método para realizar a travessia in-order (esquerda, raiz, direita)
    public void inorderTr() {
        inorder(this.root);
        System.out.println();
    }

    private void inorder(Arvore root) {
        if (root != null) {
            inorder(root.esquerda);
            System.out.print(root.val + " ");
            inorder(root.direita);
        }
    }

    // Método para realizar a travessia pré-ordem (raiz, esquerda, direita)
    public void preorderTr() {
        preorder(this.root);
        System.out.println();
    }

    private void preorder(Arvore root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.esquerda);
            preorder(root.direita);
        }
    }

    // Método para realizar a travessia pós-ordem (esquerda, direita, raiz)
    public void postorderTr() {
        postorder(this.root);
        System.out.println();
    }

    private void postorder(Arvore root) {
        if (root != null) {
            postorder(root.esquerda);
            postorder(root.direita);
            System.out.print(root.val + " ");
        }
    }

}
