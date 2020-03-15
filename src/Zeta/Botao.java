package Zeta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Happlo.Happlo;

public class Botao {

	private String mNome;
	private int mX;
	private int mY;
	private int mLargura;
	private int mAltura;
	private BufferedImage mImg;
	private boolean mComImagem;
	private boolean mClicado;

	private boolean mGradear;
	private Color mCor;
	
	
	public Botao(String eNome, int eX, int eY, int eLargura, int eAltura) {

		mNome = eNome;
		mX = eX;
		mY = eY;
		mLargura = eLargura;
		mAltura = eAltura;
		mClicado = false;
		mComImagem = false;
		mGradear=true;
		mCor = Color.red;
	}

	public Botao(String eNome, int eX, int eY, int eLargura, int eAltura, BufferedImage eImg) {

		mNome = eNome;
		mX = eX;
		mY = eY;
		mLargura = eLargura;
		mAltura = eAltura;
		mClicado = false;
		mComImagem = true;
		mImg = eImg;
		mGradear=false;

	}

	public void setImg(BufferedImage eImg) {
		mComImagem = true;
		mImg = eImg;
	}

	public void draw(Graphics canvas) {

		canvas.setColor(Color.WHITE);

		if (mComImagem) {
			canvas.drawImage(mImg, mX, mY, mLargura, mAltura, null);
		} else {
		}
		
		if (mGradear==true) {
			canvas.setColor(mCor);
			canvas.fillRect(mX, mY, mLargura, mAltura);
			canvas.setColor(Color.WHITE);
			canvas.drawRect(mX-1, mY-1, mLargura+1, mAltura+1);
		}


	}

	public void Gradear() {
		mGradear=true;
	}
	
	public boolean getCiclado() {
		return mClicado;
	}

	public void Desclicar() {
		mClicado = false;
	}

	public boolean getClicadoELimpa() {
		boolean ret = mClicado;
		mClicado = false;

		return ret;
	}

	
	public void setCor(Color eCor) {
		mCor=eCor;
	}

	public Color getCor() {return mCor;}
	
	public int getX() {return mX;}
	public int getY() {return mY;}

	public void setGradear(boolean eGradear) { mGradear = eGradear;}
	public boolean getGradear() {return mGradear;}

	
	public void coordenada(long x, long y) {

		if (x >= mX && x <= (mX + mLargura)) {
			if (y >= mY && y <= (mY + mAltura)) {

				// System.out.println("Botao " + mNome +" Clicado");
				mClicado = true;

			}
		}

	}
}
