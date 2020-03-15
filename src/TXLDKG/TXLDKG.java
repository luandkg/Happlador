package TXLDKG;

import java.util.ArrayList;

public class TXLDKG {

	// private String ALFABETO = "
	// abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ\n0123456789.,:\"{}()<>[]\\/-+*=?!@#$%?'";

	private String CANAL_10 = "ABCÇDEFGHIJKLMNOPQRSTUVWXYZ";
	private String CANAL_11 = "abcçdefghijklmnopqrstuvwxyz";
	private String CANAL_12 = "0123456789+-*=/\\<>()[]{}";
	private String CANAL_13 = "\n\t ,.;:?!@#$%_§ªº`'\"";

	private String CANAL_14 = "áéíóúàèìòùâêîôûãẽĩõũäëïöü";
	private String CANAL_15 = "ÁÉÍÓÚÀÈÌÒÙÂÊîÔÛÃẼĨÕŨÄËÏÖÜ";

	public int MAX() {
		return CANAL_10.length() + CANAL_11.length() + CANAL_12.length() + CANAL_13.length();
	}

	public String converter(String entrada) {
		String saida = "";

		int i = 0;
		int o = entrada.length();

		while (i < o) {
			char l = entrada.charAt(i);

			saida += String.valueOf(obterPrefixo(l) + " ");
			saida += String.valueOf(obterValor(l) + " ");

			i += 1;
		}

		saida += String.valueOf("99 ");
		saida += String.valueOf("99 ");

		return saida;
	}

	public ArrayList<Integer> converterListaInteiro(String entrada) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		int i = 0;
		int o = entrada.length();

		while (i < o) {
			char l = entrada.charAt(i);

			ret.add(Integer.parseInt(obterPrefixo(l)));
			ret.add(Integer.parseInt(obterValor(l)));

			i += 1;
		}

		ret.add(99);
		ret.add(99);

		return ret;
	}

	public String desconverterLista(ArrayList<Integer> entrada) {
		String saida = "";

		int i = 0;
		int o = entrada.size();

		while (i < o) {

			int valor = entrada.get(i);
			int valor2 = entrada.get(i + 1);
			if (valor == 99) {
				break;
			} else {
				saida += retornar(valor, valor2);
			}

			i += 2;
		}

		return saida;
	}

	public String desconverter(String entrada) {
		String saida = "";

		entrada = entrada.replace("  ", " ");
		entrada = entrada.replace("\n", "");

		while (entrada.contains("  ")) {
			entrada = entrada.replace("  ", " ");
		}

		int i = 0;
		int o = entrada.length();
		while (i < o) {

			char l1 = entrada.charAt(i);
			char l2 = entrada.charAt(i + 1);

			char l3 = entrada.charAt(i + 2);

			char l4 = entrada.charAt(i + 3);
			char l5 = entrada.charAt(i + 4);

			char l6 = entrada.charAt(i + 5);

			String prefixo = String.valueOf(l1) + String.valueOf(l2);
			String valor = String.valueOf(l4) + String.valueOf(l5);

			System.out.println("C : " + prefixo + ":" + valor);

			if (prefixo.equals("99")) {
				break;
			} else {
				saida += retornar(Integer.parseInt(prefixo), Integer.parseInt(valor));
			}

			i += 6;
		}

		return saida;
	}

	public String obterPrefixo(char c) {

		c = String.valueOf(c).charAt(0);

		String ret = "";

		if (CANAL_10.contains(String.valueOf(c))) {
			ret = String.valueOf(10);
		}

		if (CANAL_11.contains(String.valueOf(c))) {
			ret = String.valueOf(11);
		}

		if (CANAL_12.contains(String.valueOf(c))) {
			ret = String.valueOf(12);
		}

		if (CANAL_13.contains(String.valueOf(c))) {
			ret = String.valueOf(13);
		}

		if (CANAL_14.contains(String.valueOf(c))) {
			ret = String.valueOf(14);
		}

		if (CANAL_15.contains(String.valueOf(c))) {
			ret = String.valueOf(15);
		}

		String ri = ret;

		if (ri.length() == 0) {
			ri = "00";
		}

		if (ri.length() == 1) {
			ri = "0" + ri;
		}

		return ri;
	}

	public String obterValor(char c) {

		c = String.valueOf(c).charAt(0);

		String Conteudo = "";

		if (CANAL_10.contains(String.valueOf(c))) {
			Conteudo = CANAL_10;
		}

		if (CANAL_11.contains(String.valueOf(c))) {
			Conteudo = CANAL_11;
		}

		if (CANAL_12.contains(String.valueOf(c))) {
			Conteudo = CANAL_12;
		}

		if (CANAL_13.contains(String.valueOf(c))) {
			Conteudo = CANAL_13;
		}

		if (CANAL_14.contains(String.valueOf(c))) {
			Conteudo = CANAL_14;
		}

		if (CANAL_15.contains(String.valueOf(c))) {
			Conteudo = CANAL_15;
		}

		int i = 0;
		int o = Conteudo.length();

		boolean enc = false;

		while (i < o) {
			char l = Conteudo.charAt(i);

			if (l == c) {
				break;
			}

			i += 1;
		}

		i += 1;

		String ri = String.valueOf(i);

		if (ri.length() == 0) {
			ri = "00";
		}

		if (ri.length() == 1) {
			ri = "0" + ri;
		}

		return ri;
	}

	public String retornar(int prefixo, int dupla) {

		String conteudo = "";

		if (prefixo == 10) {
			conteudo = CANAL_10;
		}

		if (prefixo == 11) {
			conteudo = CANAL_11;
		}

		if (prefixo == 12) {
			conteudo = CANAL_12;
		}

		if (prefixo == 13) {
			conteudo = CANAL_13;
		}

		if (prefixo == 14) {
			conteudo = CANAL_14;
		}

		if (prefixo == 15) {
			conteudo = CANAL_15;
		}

		String ret = "";

		int i = 0;
		int o = conteudo.length();
		dupla = dupla - 1;

		while (i < o) {
			char l = conteudo.charAt(i);

			if (i == dupla) {
				ret = String.valueOf(l);
				break;
			}

			i += 1;
		}

		return ret;
	}

}
