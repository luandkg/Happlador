package Happlo;

import java.awt.Color;


import Happlo.Quottes.HapploConsoante;
import Happlo.Quottes.HapploEspecial;
import Happlo.Quottes.HapploNumero;
import Happlo.Quottes.HapploVogal;

public class Happlo {


	private int mTamanho;
	private Color mCor;

	private int mQuadranteX;
	private int mQuadranteY;

	private HapploConsoante mHapploConsoante;
	private HapploVogal mHapploVogal;
	private HapploNumero mHapploNumero;
	private HapploEspecial mHapploEspecial;

	public Happlo(int eTamanho, Color eCor) {

		setTamanho(eTamanho);
		setCor(eCor);


		mHapploConsoante = new HapploConsoante(mTamanho,mCor);
		mHapploVogal = new HapploVogal(mTamanho,mCor);
		mHapploNumero = new HapploNumero(mTamanho,mCor);
		mHapploEspecial = new HapploEspecial(mTamanho,mCor);

	}

	public void setTamanho(int eTamanho) {
		mTamanho = eTamanho;
		mQuadranteX = eTamanho * 10;
		mQuadranteY = eTamanho * 10;
		

		mHapploConsoante = new HapploConsoante(mTamanho,mCor);
		mHapploVogal = new HapploVogal(mTamanho,mCor);
		mHapploNumero = new HapploNumero(mTamanho,mCor);
		mHapploEspecial = new HapploEspecial(mTamanho,mCor);

	}

	public void setCor(Color eCor) {
		mCor = eCor;
		

		mHapploConsoante = new HapploConsoante(mTamanho,mCor);
		mHapploVogal = new HapploVogal(mTamanho,mCor);
		mHapploNumero = new HapploNumero(mTamanho,mCor);
		mHapploEspecial = new HapploEspecial(mTamanho,mCor);

	}

	public int getEspacador() {

		int ret = 20;

		if (mTamanho > 5) {
			ret = 40;
		}

		return ret;

	}

	public int getTamanho() {
		return mTamanho;
	}

	public int getQuadrante() {
		return mTamanho * 10;
	}

	public Color getCor() {
		return mCor;
	}

	
	public HapploConsoante HapploConsoante() {
		return mHapploConsoante;
	}
	
	public HapploVogal HapploVogal() {
		return mHapploVogal;
	}

	public HapploNumero HapploNumero() {
		return mHapploNumero;
	}
	
	public HapploEspecial HapploEspecial() {
		return mHapploEspecial;
	}
}
