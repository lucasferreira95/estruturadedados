package aplica�ao;

public class Principal {
	public static void main(String[] args) {
        ListaDE list = new ListaDE();

        // Inser��o de dados na lista em ordem crescente
        list.inserirOrdenado(5);
        list.inserirOrdenado(3);
        list.inserirOrdenado(7);
        list.inserirOrdenado(1);

        // Imprimir os dados da lista
        list.imprimeLista(); // Sa�da: Lista (tamanho 4): 1 3 5 7

        // Remo��o de dados da lista
        list.remover(3);

        // Imprimir os dados da lista ap�s a remo��o
        list.imprimeLista(); // Sa�da: Lista (tamanho 3): 1 5 7
    }

}
