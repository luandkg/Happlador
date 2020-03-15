package Happlo.Quottes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class HapploVogal {

	private int mTamanho;
	private Color mCor;

	private int mQuadranteX;
	private int mQuadranteY;
	
	private HapploBasico mHapploBasico;

	public HapploVogal(int eTamanho, Color eCor) {
		mTamanho=eTamanho;
		mCor=eCor;
		
		mQuadranteX = eTamanho * 10;
		mQuadranteY = eTamanho * 10;
		
		mHapploBasico = new HapploBasico(mTamanho,mCor);

	}


	public ArrayList<String> Todas(){
		ArrayList<String> ret = new ArrayList<String>();
		
		for(int i=1;i<=9;i++) {
			ret.add("V0" + i);
		}
		for(int i=10;i<=11;i++) {
			ret.add("V" + i);
		}
		
		return ret;
	}
	public void Generico_Draw(Graphics grafico,String letra, int PX, int PY) {
		
		switch (letra) {
		case "V01":
			V01_Draw(grafico,PX,PY);
			break;
		case "V02":
			V02_Draw(grafico,PX,PY);
			break;
		case "V03":
			V03_Draw(grafico,PX,PY);
			break;
		case "V04":
			V04_Draw(grafico,PX,PY);
			break;
		case "V05":
			V05_Draw(grafico,PX,PY);
			break;
		case "V06":
			V06_Draw(grafico,PX,PY);
			break;
		case "V07":
			V07_Draw(grafico,PX,PY);
			break;
		case "V08":
			V08_Draw(grafico,PX,PY);
			break;
		case "V09":
			V09_Draw(grafico,PX,PY);
			break;
		case "V10":
			V10_Draw(grafico,PX,PY);
			break;
		case "V11":
			V11_Draw(grafico,PX,PY);
			break;
		
		}
		
	}

	public void BASE_VOGAL(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		// grafico.fillRect(PX, PY-mQuadranteY+mTamanho, mQuadranteX, mTamanho);

		grafico.fillRect(PX, PY, mQuadranteX, mTamanho);

		grafico.fillRect(PX, PY - mQuadranteY + mTamanho, mTamanho, mQuadranteY);

		grafico.fillRect(PX + (emQuadranteX / 2), PY - mQuadranteY + mTamanho, mTamanho, mQuadranteY);

		grafico.fillRect(PX + (mQuadranteX), PY - mQuadranteY + mTamanho, mTamanho, mQuadranteY);

	}

	public void V01_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.PONT_SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V02_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V03_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	PONT_SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V04_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V05_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V06_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
	}

	public void V07_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V08_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
	}

	public void V09_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.PONT_SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
	}

	public void V10_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

	public void V11_Draw(Graphics grafico, int PX, int PY) {

		BASE_VOGAL(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_SEG_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	PONT_SEG_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

		mHapploBasico.	PONT_TER_DIR(grafico, PX, PY, mQuadranteX, mQuadranteY);
		mHapploBasico.	PONT_TER_ESQ(grafico, PX, PY, mQuadranteX, mQuadranteY);

	}

}
