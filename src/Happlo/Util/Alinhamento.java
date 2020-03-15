package Happlo.Util;

import java.util.ArrayList;

import Happlo.HapploDocumento;
import Happlo.HapploViewer;

public class Alinhamento {

	HapploViewer HapploViewerC;
	HapploDocumento HapploDocumentoC;
	
	public Alinhamento(HapploViewer eHapploViewer) {
		HapploViewerC=eHapploViewer;
		HapploDocumentoC = eHapploViewer.getHapploDocumento();
	}
	
	public  void Direita( ) {

		int retPonteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

		int linha = 0;
		int mPonteiro = retPonteiro;
		while (mPonteiro >= HapploViewerC.getColunas()) {
			mPonteiro -= HapploViewerC.getColunas();
			linha += 1;
		}

		int mLinhaPonteiroInicio = linha * HapploViewerC.getColunas();
		int mLinhaPonteiroFim = (mLinhaPonteiroInicio + HapploViewerC.getColunas()) - 1;

		int ePonteiro = mLinhaPonteiroInicio;
		int ePonteiroComConteudo = ePonteiro;

		while (ePonteiro <= mLinhaPonteiroFim) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			if (eValor.equals("---")) {

			} else if (eValor.equals("000")) {

			} else {
				ePonteiroComConteudo = ePonteiro;
				break;
			}

			ePonteiro += 1;
		}

		ePonteiro = mLinhaPonteiroFim;

		int ePonteiroComConteudoFim = ePonteiro;

		while (ePonteiro >= mLinhaPonteiroInicio) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			if (eValor.equals("---")) {

			} else if (eValor.equals("000")) {

			} else {
				ePonteiroComConteudoFim = ePonteiro;
				break;
			}

			ePonteiro -= 1;
		}

		ePonteiro = ePonteiroComConteudo;
		ArrayList<String> Temp = new ArrayList<String>();

		while (ePonteiro <= ePonteiroComConteudoFim) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			Temp.add(eValor);

			ePonteiro += 1;
		}

		ePonteiro = mLinhaPonteiroInicio;

		while (ePonteiro <= mLinhaPonteiroFim) {
			HapploDocumentoC.set(ePonteiro, "000");
			ePonteiro += 1;
		}
		int i = 0;
		int o = Temp.size();

		if (o > 0) {

			while (i < o) {

				HapploDocumentoC.set(mLinhaPonteiroFim, Temp.get(o - i - 1));

				i += 1;
				mLinhaPonteiroFim -= 1;
			}

		}

		retPonteiro = (mLinhaPonteiroInicio + HapploViewerC.getColunas()) - 1;

		HapploViewerC.setPonteiro(retPonteiro);
	}

	public  void Esquerda() {

		int retPonteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

		int linha = 0;
		int mPonteiro = retPonteiro;
		while (mPonteiro >= HapploViewerC.getColunas()) {
			mPonteiro -= HapploViewerC.getColunas();
			linha += 1;
		}

		int mLinhaPonteiroInicio = linha * HapploViewerC.getColunas();
		int mLinhaPonteiroFim = (mLinhaPonteiroInicio + HapploViewerC.getColunas()) - 1;

		int ePonteiro = mLinhaPonteiroInicio;
		int ePonteiroComConteudo = ePonteiro;

		while (ePonteiro <= mLinhaPonteiroFim) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			if (eValor.equals("---")) {

			} else if (eValor.equals("000")) {

			} else {
				ePonteiroComConteudo = ePonteiro;
				break;
			}

			ePonteiro += 1;
		}

		ePonteiro = mLinhaPonteiroInicio;
		int i = 0;

		while (ePonteiro <= mLinhaPonteiroFim) {

			String eValor = "000";
			if (ePonteiroComConteudo + i <= mLinhaPonteiroFim) {
				eValor = HapploDocumentoC.get(ePonteiroComConteudo + i);
			}

			HapploDocumentoC.set(ePonteiro, eValor);

			ePonteiro += 1;
			i += 1;
		}

		retPonteiro = mLinhaPonteiroInicio;

		HapploViewerC.setPonteiro(retPonteiro);
	}

	public  void Centro( ){

		int retPonteiro = HapploViewerC.getPonteiro();

		HapploViewerC.LimparSelecao();

		int linha = 0;
		int mPonteiro = retPonteiro;
		while (mPonteiro >= HapploViewerC.getColunas()) {
			mPonteiro -= HapploViewerC.getColunas();
			linha += 1;
		}

		int mLinhaPonteiroInicio = linha * HapploViewerC.getColunas();
		int mLinhaPonteiroFim = (mLinhaPonteiroInicio + HapploViewerC.getColunas()) - 1;

		int metade = (mLinhaPonteiroFim - mLinhaPonteiroInicio) / 2;
		int metadeInicio = mLinhaPonteiroInicio + metade;

		int ePonteiro = mLinhaPonteiroInicio;
		int ePonteiroComConteudo = ePonteiro;

		while (ePonteiro <= mLinhaPonteiroFim) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			if (eValor.equals("---")) {

			} else if (eValor.equals("000")) {

			} else {
				ePonteiroComConteudo = ePonteiro;
				break;
			}

			ePonteiro += 1;
		}

		ePonteiro = mLinhaPonteiroFim;

		int ePonteiroComConteudoFim = ePonteiro;

		while (ePonteiro >= mLinhaPonteiroInicio) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			if (eValor.equals("---")) {

			} else if (eValor.equals("000")) {

			} else {
				ePonteiroComConteudoFim = ePonteiro;
				break;
			}

			ePonteiro -= 1;
		}

		ePonteiro = ePonteiroComConteudo;
		ArrayList<String> Temp = new ArrayList<String>();

		while (ePonteiro <= ePonteiroComConteudoFim) {

			String eValor = HapploDocumentoC.get(ePonteiro);
			Temp.add(eValor);

			ePonteiro += 1;
		}

		ePonteiro = mLinhaPonteiroInicio;

		while (ePonteiro <= mLinhaPonteiroFim) {
			HapploDocumentoC.set(ePonteiro, "000");
			ePonteiro += 1;
		}
		int i = 0;
		int o = Temp.size();

		int comecar = metadeInicio - (Temp.size() / 2);

		while (i < o) {

			HapploDocumentoC.set(comecar, Temp.get(i));

			comecar += 1;
			i += 1;
		}

		retPonteiro = (mLinhaPonteiroInicio + HapploViewerC.getColunas()) - 1;

		HapploViewerC.setPonteiro(retPonteiro);
	}
}
