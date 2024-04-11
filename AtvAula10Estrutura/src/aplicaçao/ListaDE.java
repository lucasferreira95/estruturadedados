package aplica�ao;

public class ListaDE {
	private No primeiro;
    private No ultimo;
    private int tamanho;

    public ListaDE() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // M�todo para inserir dado no in�cio da lista
    
    public void inserirInicio(int dado) {
        No novoNo = new No(dado);
        if (listaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.prox = primeiro;
            primeiro.ant = novoNo;
            primeiro = novoNo;
        }
        tamanho++;
    }

    // M�todo para inserir dado no fim da lista
    
    public void inserirFim(int dado) {
        No novoNo = new No(dado);
        if (listaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.ant = ultimo;
            ultimo.prox = novoNo;
            ultimo = novoNo;
        }
        tamanho++;
    }

    // M�todo para inserir dado no meio da lista (em ordem crescente)
    
    public void inserirOrdenado(int dado) {
        No novoNo = new No(dado);
        if (listaVazia() || primeiro.dado >= dado) {
            inserirInicio(dado);
        } else if (ultimo.dado <= dado) {
            inserirFim(dado);
        } else {
            No atual = primeiro;
            while (atual != null && atual.dado < dado) {
                atual = atual.prox;
            }
            novoNo.prox = atual;
            novoNo.ant = atual.ant;
            atual.ant.prox = novoNo;
            atual.ant = novoNo;
            tamanho++;
        }
    }

    // M�todo para remover dado no in�cio da lista
    
    public void removerPrimeiro() {
        if (!listaVazia()) {
            primeiro = primeiro.prox;
            if (primeiro == null) {
                ultimo = null;
            } else {
                primeiro.ant = null;
            }
            tamanho--;
        }
    }

    // M�todo para remover dado no fim da lista
    
    public void removerUltimo() {
        if (!listaVazia()) {
            ultimo = ultimo.ant;
            if (ultimo == null) {
                primeiro = null;
            } else {
                ultimo.prox = null;
            }
            tamanho--;
        }
    }

    // M�todo para remover dado no meio da lista
    
    public void remover(int dado) {
        No atual = primeiro;
        while (atual != null && atual.dado != dado) {
            atual = atual.prox;
        }
        if (atual != null) {
            if (atual == primeiro) {
                removerPrimeiro();
            } else if (atual == ultimo) {
                removerUltimo();
            } else {
                atual.ant.prox = atual.prox;
                atual.prox.ant = atual.ant;
                tamanho--;
            }
        }
    }

    // M�todo para retornar o tamanho da lista
    
    public int tamanho() {
        return tamanho;
    }

    // M�todo para verificar se a lista est� vazia
    
    public boolean listaVazia() {
        return tamanho == 0;
    }

    // M�todo para imprimir os dados da lista
    
    public void imprimeLista() {
        No atual = primeiro;
        System.out.print("Lista (tamanho " + tamanho + "): ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

}
