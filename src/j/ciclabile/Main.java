package j.ciclabile;

public class Main {
	public static void main(String[] args) {
		int[] elementi = {364, 25, 462, 58, 940};
		ElencoInteri elencoInteri = new ElencoInteri(elementi); 
		
		while (elencoInteri.hasAncoraElementi()) {
			System.out.println("Elemento successivo: " + elencoInteri.getElementoSuccessivo());
		}
	}
}
