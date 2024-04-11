package aplicaçao;

public class Principal {
	public static void main(String[] args) {
        ListaDE list = new ListaDE();

        // Inserção de dados na lista em ordem crescente
        list.inserirOrdenado(5);
        list.inserirOrdenado(3);
        list.inserirOrdenado(7);
        list.inserirOrdenado(1);

        // Imprimir os dados da lista
        list.imprimeLista(); // Saída: Lista (tamanho 4): 1 3 5 7

        // Remoção de dados da lista
        list.remover(3);

        // Imprimir os dados da lista após a remoção
        list.imprimeLista(); // Saída: Lista (tamanho 3): 1 5 7
    }

}
