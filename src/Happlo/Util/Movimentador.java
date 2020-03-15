package Happlo.Util;

import java.util.ArrayList;

import Happlo.HapploDocumento;
import Happlo.HapploViewer;
import Zeta.Cronometro;

public class Movimentador {

	private HapploViewer HapploViewerC;
	private HapploDocumento HapploDocumentoC;
	
	private int MaxPonteiro;
	
	public Movimentador(HapploViewer eHapploViewer) {
		
		HapploViewerC=eHapploViewer;
		HapploDocumentoC = eHapploViewer.getHapploDocumento();
		
		MaxPonteiro=HapploViewerC.getCapacidade() - 1;
		
	}
	
	public void EmpurraParaFrente() {
		
		HapploViewerC.LimparSelecao();

		
		
		int Ponteiro = HapploViewerC.getPonteiro();
		
		
		
		int gPonteiro = Ponteiro;

		ArrayList<String> Temp = new ArrayList<String>();

		while (gPonteiro < MaxPonteiro-1) {

			String eValor = HapploDocumentoC.get(gPonteiro);
			Temp.add(eValor);
			HapploDocumentoC.set(gPonteiro, "---");
			gPonteiro += 1;
		}
		
	
		int ini =Ponteiro + 1;
			
		int o = Temp.size();
		int i =0;
		
		while (ini < MaxPonteiro) {
			
			if (i<o) {
				HapploDocumentoC.set(ini,Temp.get(i));
			}
			i+=1;
			ini+=1;
		}
		
		
		
	
		HapploViewerC.MostrePonteiro();
		
	}
	
	public void PuxarDeTras() {
		
		HapploViewerC.LimparSelecao();

		
		
		int Ponteiro = HapploViewerC.getPonteiro();
		if (Ponteiro<1) {
			return ;
		}
		MaxPonteiro = HapploViewerC.getMaxPonteiro()+1;
		
	
		
		int gPonteiro = Ponteiro;

		ArrayList<String> Temp = new ArrayList<String>();

		while (gPonteiro < MaxPonteiro) {

			String eValor = HapploDocumentoC.get(gPonteiro);
			Temp.add(eValor);
			HapploDocumentoC.set(gPonteiro, "---");
			gPonteiro += 1;
		}
		
	
		int ini =Ponteiro - 1;
			
		int o = Temp.size();
		int i =0;
		
		while (ini < MaxPonteiro) {
			
			if (i<o) {
				HapploDocumentoC.set(ini,Temp.get(i));
			}
			i+=1;
			ini+=1;
		}
		
		
		
		HapploViewerC.setPonteiro(Ponteiro - 1);
		HapploViewerC.MostrePonteiro();
		
	}

	public void QuebrarLinha() {

		HapploViewerC.LimparSelecao();

		int Ponteiro = HapploViewerC.getPonteiro();

		int gPonteiro = Ponteiro;

		ArrayList<String> Temp = new ArrayList<String>();

		while (gPonteiro < MaxPonteiro-1) {

			String eValor = HapploDocumentoC.get(gPonteiro);
			Temp.add(eValor);
			HapploDocumentoC.set(gPonteiro, "---");
			gPonteiro += 1;
		}
		
		
		int linha = 0;
		int mPonteiro = Ponteiro;
		while (mPonteiro >= HapploViewerC.getColunas()) {
			mPonteiro -= HapploViewerC.getColunas();
			linha += 1;
		}
		
		int ini =(linha+1)*HapploViewerC.getColunas();
		int fim = ini ;
		
		gPonteiro = Ponteiro;
		
		int o = Temp.size();
		int i =0;
		
		while (ini < MaxPonteiro) {
			
			if (i<o) {
				HapploDocumentoC.set(ini,Temp.get(i));
			}
			i+=1;
			ini+=1;
		}
		
		
		
		HapploViewerC.setPonteiro(fim);
		HapploViewerC.MostrePonteiro();


	}


	public void Voltar() {

		int Ponteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

		if (Ponteiro > 0) {
			Ponteiro -= 1;
		}

		
		HapploViewerC.setPonteiro(Ponteiro);
		HapploViewerC.MostrePonteiro();


	}

	public void Avancar() {

		int Ponteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

		if (Ponteiro < MaxPonteiro) {
			Ponteiro += 1;
		}

	
		
		HapploViewerC.setPonteiro(Ponteiro);
		HapploViewerC.MostrePonteiro();

	}
	
	public  void Remover() {
		
		int Ponteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

		if (Ponteiro == 0) {
			return ;
		}

		if (Ponteiro > 0) {
			Ponteiro -= 1;
		}

		if (Ponteiro > 0) {
			HapploDocumentoC.set(Ponteiro, "000");
		}

		
		
		int linha = 0;
		int mPonteiro = Ponteiro;
		while (mPonteiro >= HapploViewerC.getColunas()) {
			mPonteiro -= HapploViewerC.getColunas();
			linha += 1;
		}

		
		
		
		
		int mLinhaPonteiroInicio = linha * HapploViewerC.getColunas();
		int mLinhaPonteiroFim = (mLinhaPonteiroInicio + HapploViewerC.getColunas()) - 1;

		int ePonteiro = Ponteiro + 1;
		ArrayList<String> Temp = new ArrayList<String>();

		while (ePonteiro <= mLinhaPonteiroFim) {

			Temp.add(HapploDocumentoC.get(ePonteiro));

			ePonteiro += 1;
		}

		int i = 0;
		ePonteiro = Ponteiro;
		while (ePonteiro <= mLinhaPonteiroFim) {

			HapploDocumentoC.set(ePonteiro, "000");

			ePonteiro += 1;
			i += 1;
		}

		i = 0;
		ePonteiro = Ponteiro;
		while (ePonteiro <= mLinhaPonteiroFim) {

			if (i < Temp.size()) {
				HapploDocumentoC.set(ePonteiro, Temp.get(i));
			} else {
				HapploDocumentoC.set(ePonteiro, "000");
			}

			ePonteiro += 1;
			i += 1;
		}

		HapploViewerC.setPonteiro(Ponteiro);
		HapploViewerC.MostrePonteiro();

	}
	
	
	public void DescerLinha() {
		
		int Ponteiro = HapploViewerC.getPonteiro();

HapploViewerC.LimparSelecao();

		

		int gPonteiro = Ponteiro;

		int mAjustando = Ponteiro;
		int mLinhaCorrente = 0;
		while (mAjustando >= HapploViewerC.getColunas()) {
			mAjustando -= HapploViewerC.getColunas();
			mLinhaCorrente += 1;
		}
		Ponteiro = (mLinhaCorrente + 1) * HapploViewerC.getColunas();

		if (Ponteiro >= MaxPonteiro) {
			Ponteiro = gPonteiro;
		}

		
		HapploViewerC.setPonteiro(Ponteiro);
		HapploViewerC.MostrePonteiro();
		
	}
	
	
	
	public void Espaco() {
		int Ponteiro = HapploViewerC.getPonteiro();

		
		HapploViewerC.LimparSelecao();

		HapploDocumentoC.set(Ponteiro, "000");
		if (Ponteiro >= 0) {
			Ponteiro += 1;
		}
		
	HapploViewerC.setPonteiro(Ponteiro);
	HapploViewerC.MostrePonteiro();

		
	}
	
	public void SubirLinha() {
		
		int Ponteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

	
		int gPonteiro = Ponteiro;

		int mAjustando = Ponteiro;
		int mLinhaCorrente = 0;
		while (mAjustando >= HapploViewerC.getColunas()) {
			mAjustando -= HapploViewerC.getColunas();
			mLinhaCorrente += 1;
		}
		Ponteiro = (mLinhaCorrente - 1) * HapploViewerC.getColunas();

		Ponteiro += (HapploViewerC.getColunas() - 1);

		if (Ponteiro >= MaxPonteiro) {
			Ponteiro = gPonteiro;
		}
		if (Ponteiro < 0) {
			Ponteiro = 0;
		}
		
		HapploViewerC.setPonteiro(Ponteiro);
		HapploViewerC.MostrePonteiro();

	}
	
	public int ObterLinha(int Ponteiro) {

		int linha = 0;
		int mPonteiro = Ponteiro;
		while (mPonteiro >= HapploViewerC.getColunas()) {
			mPonteiro -= HapploViewerC.getColunas();
			linha += 1;
		}

		return linha;
	}
	
	public int ObterPonteiroInicioLinha(int Ponteiro) {

		int ret = ObterLinha(Ponteiro)*HapploViewerC.getColunas();
		
		return ret;
	}
	
}
