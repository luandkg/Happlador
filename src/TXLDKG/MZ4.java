package TXLDKG;

import java.util.ArrayList;
import java.util.Random;

public class MZ4 {

	public String mapearConjunto(ArrayList<Integer> conjunto) {

		String ret = "";

		Random r = new Random();

		int numero = conjunto.size();

		int contador = 0;

		int pulador = 0;

		int CPulador = 0;
		int FNumero = 0;

		int Raiz = this.getRaiz(conjunto);

		FNumero = (Raiz * Raiz) * 100;
		CPulador = Raiz * 10;

		int m10 = 0;

		for (int i = 0; i < FNumero; i++) {

			if (contador == CPulador) {
				contador = 0;
				ret += "\n";
				pulador += 1;
				m10 = 0;
			} else {
				if (CPulador >= 20) {

					if (m10 == 10) {
						m10 = 0;
						ret += " ";
					}
				}
			}

			if (pulador == 10) {
				pulador = 0;
				ret += "\n";
			}

			if (i < numero) {
				String db = String.valueOf(conjunto.get(i));
				if (db.length() == 1) {
					db = "0" + db;
				}

				ret += " " + db;
			} else {

				String db = String.valueOf(r.nextInt(80));

				if (db.length() == 1) {
					db = "0" + db;
				}
				ret += " " + db;
			}

			contador += 1;
			m10 += 1;
		}

		return ret;

	}

	public ArrayList<Integer> mapearConjuntoMatriz(ArrayList<Integer> conjunto) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		Random r = new Random();

		int numero = conjunto.size();

		int contador = 0;

		int pulador = 0;

		int CPulador = 0;
		int FNumero = 0;

		int Raiz = this.getRaiz(conjunto);

		FNumero = (Raiz * Raiz) * 100;
		CPulador = Raiz * 10;

		int m10 = 0;

		for (int i = 0; i < FNumero; i++) {

			if (contador == CPulador) {
				contador = 0;
				ret.add(200);
				pulador += 1;
				m10 = 0;
			} else {
				if (CPulador >= 20) {

					if (m10 == 10) {
						m10 = 0;
						ret.add(201);
					}
				}
			}

			if (pulador == 10) {
				pulador = 0;
				ret.add(202);
			}

			if (i < numero) {

				ret.add(conjunto.get(i));

			} else {

				ret.add(r.nextInt(80));
			}

			contador += 1;
			m10 += 1;
		}

		return ret;

	}

	public int getRaiz(ArrayList<Integer> conjunto) {

		int ret = 0;

		int numero = conjunto.size();

		int index = 1;
		boolean conseguiu = false;

		if (conjunto.size() > 100) {

			while (conseguiu == false) {
				int min = (index * index) * 100;
				int max = ((index + 1) * (index + 1)) * 100;

				if (numero >= min && numero < max) {
					ret = index;
					conseguiu = true;
					break;
				}

				index += 1;
			}

		}

		return ret + 1;

	}

	public String mapear(int numero) {

		String ret = "";

		int contador = 0;

		if (numero >= 0 && numero < 100) {

			for (int i = 0; i < 100; i++) {

				if (contador == 10) {
					contador = 0;
					ret += "\n";
				}

				if (i < numero) {
					String db = String.valueOf(numero);
					if (db.length() == 1) {
						db = "0" + db;
					}

					ret += " " + db;
				} else {
					ret += " 00";
				}

				contador += 1;
			}

		}

		return ret;

	}
}
