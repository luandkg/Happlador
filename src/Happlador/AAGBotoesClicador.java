package Happlador;

import java.io.IOException;
import java.util.ArrayList;

import Happlo.Util.Alinhamento;
import Zeta.Local;

public class AAGBotoesClicador {

	private HappladorTela mAAG;

	public AAGBotoesClicador(HappladorTela eAAG) {
		mAAG = eAAG;

	}

	public void Clique() {

		Movimento();

		Consoantes();

		Vogais();

		Numeros();

		Especiais();

	}

	public void Movimento() {

		if (mAAG.BTN_SALVAR.getClicadoELimpa()) {

			try {
				mAAG.HapploDocumentoC.Salvar(Local.LocalAtual() + "Documento.happlo");
			} catch (IOException e) {

			}

		}

		if (mAAG.BTN_COPIAR.getClicadoELimpa()) {

			mAAG.HapploViewerC.getTransferidor().Copiar();

		}

		if (mAAG.BTN_CORTAR.getClicadoELimpa()) {

			mAAG.HapploViewerC.getTransferidor().Cortar();

		}

		if (mAAG.BTN_COLAR.getClicadoELimpa()) {

			mAAG.HapploViewerC.getTransferidor().Colar();

		}

		if (mAAG.BTN_AVANCAR.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().Avancar();

		}

		if (mAAG.BTN_VOLTAR.getClicadoELimpa()) {

			mAAG.HapploViewerC.getMovimentador().Voltar();

		}

		if (mAAG.BTN_REMOVER.getClicadoELimpa()) {

			mAAG.HapploViewerC.getMovimentador().Remover();

		}

		if (mAAG.BTN_QUEBRARLINHA.getClicadoELimpa()) {

			mAAG.HapploViewerC.LimparSelecao();

			mAAG.HapploViewerC.getMovimentador().DescerLinha();

		}

		if (mAAG.BTN_SUBIRLINHA.getClicadoELimpa()) {

			mAAG.HapploViewerC.LimparSelecao();

			mAAG.HapploViewerC.getMovimentador().SubirLinha();

		}

		if (mAAG.BTN_ALINHAR_ESQUERDA.getClicadoELimpa()) {

			mAAG.HapploViewerC.getAlinhamento().Esquerda();

		}

		if (mAAG.BTN_ALINHAR_DIREITA.getClicadoELimpa()) {

			mAAG.HapploViewerC.getAlinhamento().Direita();

		}

		if (mAAG.BTN_ALINHAR_CENTRO.getClicadoELimpa()) {

			mAAG.HapploViewerC.getAlinhamento().Centro();

		}

		if (mAAG.BTN_ESPACO.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.getMovimentador().Espaco();
		}

	}

	public void Consoantes() {
		if (mAAG.BTN_M01.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C01");

		}

		if (mAAG.BTN_M02.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C02");

		}

		if (mAAG.BTN_M03.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C03");

		}

		if (mAAG.BTN_M04.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C04");

		}

		if (mAAG.BTN_M05.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C05");

		}

		if (mAAG.BTN_M06.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C06");

		}

		if (mAAG.BTN_M07.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C07");

		}

		if (mAAG.BTN_M08.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C08");

		}

		if (mAAG.BTN_M09.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C09");

		}

		if (mAAG.BTN_M10.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C10");

		}

		if (mAAG.BTN_M11.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C11");

		}

		if (mAAG.BTN_M12.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C12");

		}

		if (mAAG.BTN_M13.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C13");

		}

		if (mAAG.BTN_M14.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C14");

		}

		if (mAAG.BTN_M15.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("C15");

		}

		if (mAAG.BTN_M16.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("M16");
		}
	}

	public void Vogais() {

		if (mAAG.BTN_V01.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V01");
		}

		if (mAAG.BTN_V02.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V02");
		}
		if (mAAG.BTN_V03.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V03");
		}
		if (mAAG.BTN_V04.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V04");
		}
		if (mAAG.BTN_V05.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V05");
		}
		if (mAAG.BTN_V06.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V06");
		}
		if (mAAG.BTN_V07.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V07");
		}
		if (mAAG.BTN_V08.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V08");
		}
		if (mAAG.BTN_V09.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V09");
		}
		if (mAAG.BTN_V10.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V10");
		}
		if (mAAG.BTN_V11.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("V11");
		}

	}

	public void Numeros() {

		if (mAAG.BTN_N00.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N00");
		}
		if (mAAG.BTN_N01.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N01");
		}
		if (mAAG.BTN_N02.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N02");
		}
		if (mAAG.BTN_N03.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N03");
		}
		if (mAAG.BTN_N04.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N04");
		}
		if (mAAG.BTN_N05.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N05");
		}
		if (mAAG.BTN_N06.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N06");
		}
		if (mAAG.BTN_N07.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N07");
		}
		if (mAAG.BTN_N08.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N08");
		}
		if (mAAG.BTN_N09.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N09");
		}

	}

	public void Especiais() {

		if (mAAG.BTN_E01.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E01");
		}
		if (mAAG.BTN_E02.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E02");
		}
		if (mAAG.BTN_E03.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E03");
		}
		if (mAAG.BTN_E04.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("N04");
		}
		if (mAAG.BTN_E05.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E05");
		}
		if (mAAG.BTN_E06.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E06");
		}
		if (mAAG.BTN_E07.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E07");
		}
		if (mAAG.BTN_E08.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E08");
		}
		if (mAAG.BTN_E09.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E09");
		}

		if (mAAG.BTN_E10.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E10");
		}

		if (mAAG.BTN_E11.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E11");
		}

		if (mAAG.BTN_E12.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E12");
		}

		if (mAAG.BTN_E13.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E13");
		}

		if (mAAG.BTN_E14.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E14");
		}

		if (mAAG.BTN_E15.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E15");
		}

		if (mAAG.BTN_E16.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E16");
		}

		if (mAAG.BTN_E17.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E17");
		}

		if (mAAG.BTN_E18.getClicadoELimpa()) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();

			mAAG.HapploViewerC.Escreva("E18");
		}
	}
}
