package Happlador;

import java.awt.event.KeyEvent;

import Zeta.Teclado;

public class AAGTeclador {

	private HappladorTela mAAG;
	private Teclado TecladoC;

	public AAGTeclador(HappladorTela eAAG) {

		mAAG = eAAG;
		TecladoC = mAAG.TecladoC;

	}

	public void Tecle() {
		
		Teclado_Movimento();
		
		
		Teclado_Consoantes();
		Teclado_Vogais();
		Teclado_Numeros();
		Teclado_Especial();

	}
	
	
	public void Teclado_Movimento() {
		
		if (TecladoC.isKeyPressed(KeyEvent.VK_LEFT)) {
			TecladoC.Liberar(KeyEvent.VK_LEFT);

			mAAG.HapploViewerC.getMovimentador().Voltar();
			mAAG.HapploViewerC.MostrePonteiro();
		}

		if (TecladoC.isKeyPressed(KeyEvent.VK_RIGHT)) {
			TecladoC.Liberar(KeyEvent.VK_RIGHT);

			mAAG.HapploViewerC.getMovimentador().Avancar();

		}
		
		if (TecladoC.isKeyPressed(KeyEvent.VK_UP)) {
			TecladoC.Liberar(KeyEvent.VK_UP);
			mAAG.HapploViewerC.getMovimentador().SubirLinha();
		}

		if (TecladoC.isKeyPressed(KeyEvent.VK_DOWN)) {
			TecladoC.Liberar(KeyEvent.VK_DOWN);
			mAAG.HapploViewerC.getMovimentador().DescerLinha();

		}
		

		if (TecladoC.isKeyPressed(KeyEvent.VK_SPACE)) {
			TecladoC.Liberar(KeyEvent.VK_SPACE);
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.getMovimentador().Espaco();
		}

		if (TecladoC.isKeyPressed(KeyEvent.VK_ENTER)) {
			TecladoC.Liberar(KeyEvent.VK_ENTER);
			mAAG.HapploViewerC.getMovimentador().QuebrarLinha();
		}

		if (TecladoC.isKeyPressed(KeyEvent.VK_BACK_SPACE)) {
			TecladoC.Liberar(KeyEvent.VK_BACK_SPACE);
			mAAG.HapploViewerC.getMovimentador().PuxarDeTras();
		}

		
	}

	public void Teclado_Numeros() {

		if (TecladoC.isCharPressedELibere("0")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N00");

		}

		if (TecladoC.isCharPressedELibere("1")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N01");
		}

		if (TecladoC.isCharPressedELibere("2")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N02");
		}

		if (TecladoC.isCharPressedELibere("3")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N03");
		}

		if (TecladoC.isCharPressedELibere("4")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N04");
		}

		if (TecladoC.isCharPressedELibere("5")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N05");
		}

		if (TecladoC.isCharPressedELibere("6")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N06");
		}

		if (TecladoC.isCharPressedELibere("7")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N07");
		}

		if (TecladoC.isCharPressedELibere("8")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N08");
		}

		if (TecladoC.isCharPressedELibere("9")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("N09");
		}

	}

	public void Teclado_Vogais() {

		if (TecladoC.isCharPressedELibere("a")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V01");
		}

		if (TecladoC.isCharPressedELibere("e")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V02");
		}

		if (TecladoC.isCharPressedELibere("i")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V03");
		}

		if (TecladoC.isCharPressedELibere("o")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V04");
		}

		if (TecladoC.isCharPressedELibere("u")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V05");
		}

		if (TecladoC.isCharPressedELibere("&")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V02");
		}

	}

	public void Teclado_Consoantes() {

		if (TecladoC.isCharPressedELibere("b")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C01");
		}

		if (TecladoC.isCharPressedELibere("c")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C02");
		}

		if (TecladoC.isCharPressedELibere("d")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C03");
		}

		if (TecladoC.isCharPressedELibere("t")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C03");
		}

		if (TecladoC.isCharPressedELibere("f")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C04");
		}

		if (TecladoC.isCharPressedELibere("g")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C05");
		}

		if (TecladoC.isCharPressedELibere("h")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C06");
		}

		if (TecladoC.isCharPressedELibere("j")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C07");
		}

		if (TecladoC.isCharPressedELibere("k")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C02");
		}

		if (TecladoC.isCharPressedELibere("l")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C09");
		}

		if (TecladoC.isCharPressedELibere("m")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C10");
		}

		if (TecladoC.isCharPressedELibere("n")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C11");
		}

		if (TecladoC.isCharPressedELibere("p")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C12");
		}

		if (TecladoC.isCharPressedELibere("q")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C13");
		}

		if (TecladoC.isCharPressedELibere("r")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C14");
		}

		if (TecladoC.isCharPressedELibere("s")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C15");
		}

		if (TecladoC.isCharPressedELibere("ç")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C15");
		}

		if (TecladoC.isCharPressedELibere("v")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C16");
		}

		if (TecladoC.isCharPressedELibere("w")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V05");
		}

		if (TecladoC.isCharPressedELibere("x")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C08");
		}

		if (TecladoC.isCharPressedELibere("y")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("V03");
		}

		if (TecladoC.isCharPressedELibere("z")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("C15");
		}

	}

	public void Teclado_Especial() {

		if (TecladoC.isCharPressedELibere("-")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E01");
		}

		if (TecladoC.isCharPressedELibere("+")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E02");
		}

		if (TecladoC.isCharPressedELibere("*")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E03");
		}

		if (TecladoC.isCharPressedELibere("/")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E04");
		}

		if (TecladoC.isCharPressedELibere("\\")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E04");
		}

		if (TecladoC.isCharPressedELibere(">")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E05");
		}

		if (TecladoC.isCharPressedELibere("<")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E06");
		}

		if (TecladoC.isCharPressedELibere("=")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E09");
		}

		if (TecladoC.isCharPressedELibere("(")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E07");
		}

		if (TecladoC.isCharPressedELibere("[")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E07");
		}

		if (TecladoC.isCharPressedELibere("{")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E07");
		}

		if (TecladoC.isCharPressedELibere(")")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E08");
		}

		if (TecladoC.isCharPressedELibere("]")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E08");
		}

		if (TecladoC.isCharPressedELibere("}")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E08");
		}

		if (TecladoC.isCharPressedELibere("#")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E12");
		}

		if (TecladoC.isCharPressedELibere(",")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E16");
		}

		if (TecladoC.isCharPressedELibere(".")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E16");
		}

		if (TecladoC.isCharPressedELibere("?")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E17");
		}

		if (TecladoC.isCharPressedELibere("!")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E18");
		}

		if (TecladoC.isCharPressedELibere("@")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E15");
		}

		if (TecladoC.isCharPressedELibere("'")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E10");
		}

		if (TecladoC.isCharPressedELibere("\"")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E11");
		}

		if (TecladoC.isCharPressedELibere("$")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E13");
		}

		if (TecladoC.isCharPressedELibere("%")) {
			mAAG.HapploViewerC.getMovimentador().EmpurraParaFrente();
			mAAG.HapploViewerC.Escreva("E14");
		}

	}

}
