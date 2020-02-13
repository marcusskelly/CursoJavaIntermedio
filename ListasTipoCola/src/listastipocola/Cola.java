package listastipocola;

import javax.swing.JOptionPane;

public class Cola {

	private Nodo inicioCola, finalCola;
	String Cola = " ";

	public Cola() {

		inicioCola = null;
		finalCola = null;
	}

	// Metodo para saber si la cola esta vacia
	public boolean ColaVacia() {
		if (inicioCola == null) {
			return true;
		} else {
			return false;
		}
	}

	// Metodo para insertar a la cola
	public void Insertar(int informacion) {
		Nodo nuevo_nodo = new Nodo();
		nuevo_nodo.informacion = informacion;
		nuevo_nodo.siguiente = null;

		if (ColaVacia()) {
			inicioCola = nuevo_nodo;
			finalCola = nuevo_nodo;
		} else {
			finalCola.siguiente = nuevo_nodo;
			finalCola = nuevo_nodo;
		}
	}

	// Metodo para extraer la cola
	public int Extraer() {
		if (!ColaVacia()) {
			int informacion = inicioCola.informacion;

			if (inicioCola == finalCola) {
				inicioCola = null;
				finalCola = null;
			} else {
				inicioCola = inicioCola.siguiente;
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	// Metodo para mostrar cola
	public void MostrarContenido() {

		Nodo recorrido = inicioCola;
		String ColaInvertida = " ";

		while (recorrido != null) {
			Cola += recorrido.informacion;
			recorrido = recorrido.siguiente;
		}

		String cadena[] = Cola.split(" ");// lo que hace split es ordenar los numeros en 10 20 30, en vez de 01 02 03

		for (int i = cadena.length - 1; i >= 0; i--) {
			ColaInvertida += " " + cadena[i];
		}

		JOptionPane.showMessageDialog(null, ColaInvertida);
		Cola = "";
	}
}
