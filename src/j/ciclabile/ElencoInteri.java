package j.ciclabile;

/*Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di 
ciclarli (dal primo all’ultimo).
Dovrà offrire due metodi :
- int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima 
volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda 
volta il secondo, …)
- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da 
restituire)
La classe deve avere un costruttore che prende come parametro un array di interi 
(che sarà l’elenco che viene gestito internamente)
Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList 
o simili.*/

public class ElencoInteri {
	private int [] elenco;
	private int elemento;

public ElencoInteri(int[] elenco) {
	this.elenco = elenco;
	this.elemento = 0;
	}

public int getElementoSuccessivo() {
    if (hasAncoraElementi()) {
    	return elenco[elemento++];
    } else {
    	System.out.println("Non ci sono altri elementi nell'elenco.");
    	return 0;
    }
}

public boolean hasAncoraElementi() {
    return elemento < elenco.length;
    }
}


