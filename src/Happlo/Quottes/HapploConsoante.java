package Happlo.Quottes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class HapploConsoante {

	private int mTamanho;
	private Color mCor;

	private int mQuadranteX;
	private int mQuadranteY;
	private HapploBasico mHapploBasico;

	
	public HapploConsoante(int eTamanho, Color eCor) {
		mTamanho=eTamanho;
		mCor=eCor;
		
		mQuadranteX = eTamanho * 10;
		mQuadranteY = eTamanho * 10;
		
		mHapploBasico = new HapploBasico(mTamanho,mCor);

		
	}
	
	public ArrayList<String> Todas(){
		ArrayList<String> ret = new ArrayList<String>();
		
		for(int i=1;i<=9;i++) {
			ret.add("C0" + i);
		}
		for(int i=10;i<=16;i++) {
			ret.add("C" + i);
		}
		
		return ret;
	}
	public void Generico_Draw(Graphics grafico,String letra, int PX, int PY) {
		
		switch (letra) {
		case "C01":
			C01_Draw(grafico,PX,PY);
			break;
		case "C02":
			C02_Draw(grafico,PX,PY);
			break;
		case "C03":
			C03_Draw(grafico,PX,PY);
			break;
		case "C04":
			C04_Draw(grafico,PX,PY);
			break;
		case "C05":
			C05_Draw(grafico,PX,PY);
			break;
		case "C06":
			C06_Draw(grafico,PX,PY);
			break;
		case "C07":
			C07_Draw(grafico,PX,PY);
			break;
		case "C08":
			C08_Draw(grafico,PX,PY);
			break;
		case "C09":
			C09_Draw(grafico,PX,PY);
			break;
		case "C10":
			C10_Draw(grafico,PX,PY);
			break;
		case "C11":
			C11_Draw(grafico,PX,PY);
			break;
		case "C12":
			C12_Draw(grafico,PX,PY);
			break;
		case "C13":
			C13_Draw(grafico,PX,PY);
			break;
		case "C14":
			C14_Draw(grafico,PX,PY);
			break;
		case "C15":
			C15_Draw(grafico,PX,PY);
			break;
		case "C16":
			C16_Draw(grafico,PX,PY);
			break;
		}
		
	}

	public void C01_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);


	}

	public void C02_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C03_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C04_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C05_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C06_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C07_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C08_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C09_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C10_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C11_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C12_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
	}

	public void C13_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
	}

	public void C14_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void C15_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
	}

	public void C16_Draw(Graphics grafico, int PX, int PY) {

		mHapploBasico.	BASE(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_COM(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}
}
