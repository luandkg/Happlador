package Oppo;

import java.awt.Graphics;
import java.util.ArrayList;

public class Entidade {

	private ArrayList<Componente> componentes;

	public Entidade() {
		componentes = new ArrayList<Componente>();
	}


	public void adicionarComponente(Componente c) {
		componentes.add(c);
	}
	
	public Componente obterComponente(String eNome) {
		for (Componente IC : componentes) {
			if (IC.getNome().equals(eNome)) {
				return IC;
			}
		}
		
		if (eNome.equals(Posicao.ID)) {
			Corpo CorpoC = (Corpo) this.obterComponente(Corpo.ID);
			return CorpoC.getPosicao();
		}
		
		if (eNome.equals(Tamanho.ID)) {
			Corpo CorpoC = (Corpo) this.obterComponente(Corpo.ID);
			return CorpoC.getTamanho();
		}
		
		if (eNome.equals(Movimento.ID)) {
			Corpo CorpoC = (Corpo) this.obterComponente(Corpo.ID);
			return CorpoC.getMovimento();
		}
		
		return null;
	}
	
	public Componente adicionarEObterComponente(Componente c) {
		componentes.add(c);
		for (Componente IC : componentes) {
			if (IC.getNome().equals(c.getNome())) {
				return IC;
			}
		}
		return null;
	}
	
	

	public boolean existeComponente(String eNome) {
		for (Componente IC : componentes) {
			if (IC.getNome().equals(eNome)) {
				return true;
			}
		}
		return false;
	}

	
	public String toString() {
		String ret = "";
		
		for (Componente IC : componentes) {
				ret += IC.toString() + "\n";
		}
		return ret;
	}
	
	public void draw(Graphics grafico) {
		
	}
	
}
