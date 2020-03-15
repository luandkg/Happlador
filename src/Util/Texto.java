package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Texto {

	public static String Ler(String eArquivo) {

		String ret = "";

		try {
			FileReader arq = new FileReader(eArquivo);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();

			ret += linha;

			while (linha != null) {

				linha = lerArq.readLine();
				if (linha != null) {
					ret += "\n" + linha;
				}

			}

			arq.close();
		} catch (IOException e) {

		}

		return ret;
	}
	
	
}
