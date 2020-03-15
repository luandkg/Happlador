package Happlo.Util;

import java.util.ArrayList;

import Happlo.HapploDocumento;
import Happlo.HapploViewer;

public class Transferidor {

	private HapploViewer HapploViewerC;
	private HapploDocumento HapploDocumentoC;
	private ArrayList<String> Transferencia;

	public Transferidor(HapploViewer eHapploViewer) {

		HapploViewerC = eHapploViewer;
		HapploDocumentoC = eHapploViewer.getHapploDocumento();

		Transferencia = new ArrayList<String>();

	}

	public void Copiar() {

		if (HapploViewerC.estaSelecionado()) {

			int mIndex = HapploViewerC.SelecaoInicioIndex();
			int mOndex = HapploViewerC.SelecaoFimIndex();
			Transferencia.clear();
			int ePonteiro = mIndex;

			while (ePonteiro <= mOndex) {
				String eValor = HapploDocumentoC.get(ePonteiro);
				Transferencia.add(eValor);
				ePonteiro += 1;
			}

			System.out.println("Copiados : " + Transferencia.size());

			HapploViewerC.RemoverSelecao();

		} else {
			System.out.println("Precisa selecionar uma região !");
			Transferencia.clear();
		}

	}

	public void Cortar() {
		if (HapploViewerC.estaSelecionado()) {

			int mIndex = HapploViewerC.SelecaoInicioIndex();
			int mOndex = HapploViewerC.SelecaoFimIndex();
			Transferencia.clear();
			int ePonteiro = mIndex;

			while (ePonteiro <= mOndex) {
				String eValor = HapploDocumentoC.get(ePonteiro);
				Transferencia.add(eValor);

				HapploDocumentoC.set(ePonteiro, "000");

				ePonteiro += 1;
			}

			System.out.println("Recortados : " + Transferencia.size());

			HapploViewerC.RemoverSelecao();

		} else {
			System.out.println("Precisa selecionar uma região !");
			Transferencia.clear();

		}
	}

	public void Colar() {

		int Ponteiro = HapploViewerC.getPonteiro();

		if (Transferencia.size() > 0) {

			int tam = Transferencia.size();
			int i = 0;
			while (i < tam) {
				HapploDocumentoC.set(Ponteiro, Transferencia.get(i));
				Ponteiro += 1;
				i += 1;
			}

		}
		HapploViewerC.setPonteiro(Ponteiro);

	}

	public boolean PossuiTransferencia() {
		return Transferencia.size() > 0;
	}

	public void Limpar() {

		Transferencia.clear();

	}
}
