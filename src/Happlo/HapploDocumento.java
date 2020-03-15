package Happlo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HapploDocumento {

	private ArrayList<String> Dados;

	public HapploDocumento() {

		Dados = new ArrayList<String>();

	

	}

	public void setCapacidade(int eTamanho) {

		Dados = new ArrayList<String>();

		for (int i = 0; i < eTamanho; i++) {
			Dados.add("---");
		}

	}
	
	public int getCapacidade() {return Dados.size();}
	
	public String get(int ePonteiro) {
		
		if (ePonteiro<Dados.size()) {
			return Dados.get(ePonteiro);
		} else {
			return "---";
		}
	}

	public void set(int ePonteiro, String eValor) {
		
		if (ePonteiro<Dados.size()) {
			Dados.set(ePonteiro, eValor);
		} 
	}
	public void Escrever( String eValor) {
		
		for(String e : 	eValor.split(" ")) {
			Dados.add(e);
		}
			
		
	}
	
	public void add( String eValor) {
		
		
		Dados.add( eValor);

	}
	
	
	public void Abrir(String eLocalArquivo) {

		Dados.clear();
		
		String documento = "";

		try {
			FileReader arq = new FileReader(eLocalArquivo);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();

			documento += linha;

			while (linha != null) {

				linha = lerArq.readLine();
				if (linha != null) {
					documento +=  linha;
				}

			}

			arq.close();
		} catch (IOException e) {

		}
		
		int i =0;
		int o = documento.length();
		

		int pi = 0;
		
		while(i<o) {
			
			String c1 = String.valueOf(documento.charAt(i));
			String c2 = String.valueOf(documento.charAt(i+1));
			String c3 = String.valueOf(documento.charAt(i+2));

			String Valor = c1 + c2+c3;
			add( Valor);
			pi+=1;
			

			i+=3;
		}
		
		
		
	}

	public String Conteudo() {
		String ret = "";
		int i =0;

		for (String s : Dados) {
			ret +=s;
			i+=1;
			
			if (i>=100) {
				i=0;
				ret +=("\n");
			}
		}
		return ret;
		
	}
	public void Salvar(String eLocalArquivo) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(eLocalArquivo));

		int i =0;
		
		for (String s : Dados) {
			writer.write(s);
			i+=1;
			
			if (i>=100) {
				i=0;
				writer.write("\n");
			}
		}

		writer.close();
	}

}
