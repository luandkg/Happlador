package Happlo.Quottes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class HapploEspecial {

	private int mTamanho;
	private Color mCor;

	private int mQuadranteX;
	private int mQuadranteY;

	private HapploBasico mHapploBasico;

	public HapploEspecial(int eTamanho, Color eCor) {
		mTamanho = eTamanho;
		mCor = eCor;

		mQuadranteX = eTamanho * 10;
		mQuadranteY = eTamanho * 10;

		mHapploBasico = new HapploBasico(mTamanho, mCor);

	}


	public ArrayList<String> Todas(){
		ArrayList<String> ret = new ArrayList<String>();
		
		for(int i=1;i<=9;i++) {
			ret.add("E0" + i);
		}
		for(int i=10;i<=18;i++) {
			ret.add("E" + i);
		}
		
		return ret;
	}
	public void Generico_Draw(Graphics grafico,String letra, int PX, int PY) {
		
		switch (letra) {
		case "E01":
			E01_Draw(grafico,PX,PY);
			break;
		case "E02":
			E02_Draw(grafico,PX,PY);
			break;
		case "E03":
			E03_Draw(grafico,PX,PY);
			break;
		case "E04":
			E04_Draw(grafico,PX,PY);
			break;
		case "E05":
			E05_Draw(grafico,PX,PY);
			break;
		case "E06":
			E06_Draw(grafico,PX,PY);
			break;
		case "E07":
			E07_Draw(grafico,PX,PY);
			break;
		case "E08":
			E08_Draw(grafico,PX,PY);
			break;
		case "E09":
			E09_Draw(grafico,PX,PY);
			break;
		case "E10":
			E10_Draw(grafico,PX,PY);
			break;
		case "E11":
			E11_Draw(grafico,PX,PY);
			break;
		case "E12":
			E12_Draw(grafico,PX,PY);
			break;
		case "E13":
			E13_Draw(grafico,PX,PY);
			break;
		case "E14":
			E14_Draw(grafico,PX,PY);
			break;
		case "E15":
			E15_Draw(grafico,PX,PY);
			break;
		case "E16":
			E16_Draw(grafico,PX,PY);
			break;
		case "E17":
			E17_Draw(grafico,PX,PY);
			break;
		case "E18":
			E18_Draw(grafico,PX,PY);
			break;
		
		}
		
	}

	
	public void BASE_ESPECIAL(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX, PY, mQuadranteX, mTamanho);

	}

	public void E01_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_CENTRO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void E02_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_CENTRO(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_BARRA(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E03_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_CENTRAL_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E04_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_CENTRO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.TER_CENTRO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E05_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_ESQUERDA_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

		
	}
	
	public void E06_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_DIREITA_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

		
	}
	
	
	public void E07_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_ESQUERDA_DUPLO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

		
	}
	
	
	public void E08_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_DIREITA_DUPLO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

		
	}
	
	public void E09_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);
		
		
	}
	
	public void E10_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_ESQUERDA_SUPER_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

		
	}
	
	public void E11_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

	
		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_DIREITA_SUPER_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E12_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_ESQUERDA_SUPER_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_DIREITA_SUPER_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E13_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_ESQUERDA_SUPER_DUPLO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E14_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_DIREITA_SUPER_DUPLO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	
	public void E15_Draw(Graphics grafico, int PX, int PY) {

		BASE_ESPECIAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_BARRA_DUPLA(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_ESQUERDA_SUPER_DUPLO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.SEG_DIREITA_SUPER_DUPLO_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E16_Draw(Graphics grafico, int PX, int PY) {

		
		mHapploBasico.SEG_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);

		

	}
	
	public void E17_Draw(Graphics grafico, int PX, int PY) {


		mHapploBasico.TER_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
		
		mHapploBasico.SEG_CENTRAL_PONTO(grafico, PX, PY, mQuadranteX, mQuadranteY);

		
		mHapploBasico.BASE_UNICA(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
	
	public void E18_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.SEG_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.TER_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.BASE_UNICA(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

}
