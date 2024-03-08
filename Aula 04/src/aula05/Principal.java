package aula05;

public class Principal {
	
	public static void main(String[] args) {
		
		PilhaDinamica pilha = new PilhaDinamica();
		pilha.push(80);
		pilha.push(90);
		pilha.push(100);
		
		pilha.imprimir();
	}

}
