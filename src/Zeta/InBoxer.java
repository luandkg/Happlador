package Zeta;

import java.awt.Color;
import java.awt.Graphics;

import Oppo.Corpo;

public class InBoxer {

	private int mX;
	private int mY;

	private int mLargura;
	private int mAltura;

	private int mPecaLargura;
	private int mPecaAltura;

	private Camera mCamera;
	private Tabuleiro mTabuleiro;
	private PacoteDeImagem mSprites;
	private Escritor Texto_Pequeno;

	private boolean mLegenda;
	
	public InBoxer(int eX, int eY, int eLargura, int eAltura, int ePecaLargura, int ePecaAltura, int eCameraX,
			int eCameraY, Tabuleiro eTabuleiro, PacoteDeImagem eSprites) {

		this.mX = eX;
		this.mY = eY;
		this.mLargura = eLargura;
		this.mAltura = eAltura;
		this.mTabuleiro = eTabuleiro;
		this.mSprites = eSprites;
		this.mPecaLargura = ePecaLargura;
		this.mPecaAltura = ePecaAltura;

		mCamera = new Camera(eCameraX, eCameraY, PecasX(), PecasY());

		this.Texto_Pequeno = new Escritor(20, Color.WHITE);
		
		mLegenda  = true;
		

	}

	public int getX() {
		return mX;
	}

	public int getY() {
		return mY;
	}

	public int getLargura() {
		return mLargura;
	}

	public int getAltura() {
		return mAltura;
	}

	public int getMaxX() {
		return mTabuleiro.getLargura() - 1;
	}

	public int PecasX() {
		return mLargura / mPecaLargura;
	}

	public int PecasY() {
		return mAltura / mPecaAltura;
	}

	public int getMaxY() {
		return mTabuleiro.getAltura() - 1;
	}

	public int getMinMovX() {
		return PecasX() / 2;
	}

	public int getMinMovY() {
		return PecasY() / 2;
	}

	public int getMaxMovX() {
		return mTabuleiro.getLargura() - PecasX();
	}

	public int getMaxMovY() {
		return mTabuleiro.getAltura() - PecasY();
	}

	public Camera getCamera() {
		return mCamera;
	}
	
	public int getTabuleiroLargura() {
		return mTabuleiro.getLargura();
	}

	public int getTabuleiroAltura() {
		return mTabuleiro.getAltura();
	}
	
	public int getPecaLargura() {
		return mPecaLargura;
	}

	public int getPecaAltura() {
		return mPecaAltura;
	}


	
	

	public String obterNome(int valor) {

		String ns = String.valueOf(valor);
		if (ns.length() == 1) {
			ns = "000" + ns;
		}
		if (ns.length() == 2) {
			ns = "00" + ns;
		}
		if (ns.length() == 3) {
			ns = "0" + ns;
		}

		return ns;

	}

	public void draw(Graphics grafico) {

		grafico.setColor(Color.BLACK);
		grafico.fillRect(mX, mY, mLargura, mAltura);

		for (int x = 0; x < PecasX(); x++) {
			for (int y = 0; y < PecasY(); y++) {
				if (x >= 0 && y >= 0 && x < mTabuleiro.getLargura() && y < mTabuleiro.getAltura()) {

					int valor = mTabuleiro.ObterSePossivel(x + mCamera.getX(), y + mCamera.getY());
					grafico.setColor(Color.BLACK);

					grafico.fillRect(((x * mPecaLargura)) + mX, ((y * mPecaAltura)) + mY, mPecaLargura, mPecaAltura);

					String ns = obterNome(valor);

					int DX = ((x * mPecaLargura) + 1) + mX;
					int DY = ((y * mPecaAltura) + 1) + mY;

					if (mSprites.existe(ns)) {

						grafico.drawImage(mSprites.obter(ns), DX, DY, mPecaLargura - 1, mPecaAltura - 1, null);

					}
					if (mLegenda) {
						Texto_Pequeno.Escreve(grafico, " " + valor, DX + (mPecaLargura / 2), DY + (mPecaAltura / 2));
					}


				}

			}

		}

	}

	
	
	public int getIlusionX(int eX) {

		return (this.getX() +((eX*mPecaLargura)- (mCamera.getX() * mPecaLargura)));

	}

	public int getIlusionY(int eY) {

		return (this.getY() +((eY*mPecaAltura)- (mCamera.getY() * mPecaAltura)));

	}
	
	public float getEscalaLargura(int eX) {
		return (float)this.getPecaLargura()/(float)eX;
	}
	
	public float getEscalaAltura(int eX) {
		return (float)this.getPecaAltura()/(float)eX;
	}
	
	public boolean EstaVisivel(int DX, int DY) {

		int XFim = (PecasX()*mPecaLargura) + this.getX();
		int YFim = (PecasY()*mPecaAltura) + this.getY();

		boolean ret = false;

		if (DX >= this.getX() && DX < XFim) {

			if (DY >= this.getY() && DY < YFim) {
				ret = true;
			}
		}

		return ret;

	}
	
	public int PropLargura(int DX,int tam) {

		int ret = 0;

		
		if (DX >= this.getX() && DX < this.getX() + this.getLargura()) {	
			ret =(this.getX() + this.getLargura())-(DX);
			
			if (ret>=tam) {
				ret=tam;
			}
			
		}
		
		if (DX<this.getX()) {
			ret = tam;
		}

		return ret;

	}
	
	public int PropAltura(int DY,int tam) {

		int ret = 0;

		
		if (DY >= this.getY() && DY < this.getY() + this.getAltura()) {	
			ret =(this.getY() + this.getAltura())-(DY);
			
			if (ret>=tam) {
				ret=tam;
			}
			
		}
		
		if (DY<this.getY()) {
			ret = tam;
		}

		if (ret<this.getY() + this.getAltura()) {}
		
		
		
		
		return ret;

	}
	
	
	public int PropLarguraInicio(int DX,int tam) {

		int ret = 0;
		
		if (DX >= this.getX() && DX < this.getX() + this.getLargura()) {				
				ret = DX;		
		}
		
		if (DX<this.getX()) {
			ret = this.getX();
		}

		return ret;

	}
	
	public int PropAlturaInicio(int DY,int tam) {

		int ret = 0;
		
		if (DY >= this.getY() && DY < this.getY() + this.getAltura()) {				
				ret = DY;		
		}
		
		if (DY<this.getY()) {
			ret = this.getY();
		}

		
		return ret;

	}
	
	
	public int PropY(int DY,int tam) {

		int ret = 0;

		
		if (DY >= this.getY() && DY < this.getY() + this.getAltura()) {	
			
			ret =(this.getY() + this.getAltura())-(DY);
			
			if (ret>=tam) {
				ret=tam;
			}
			
			

		}

	
		
		return ret;

	}
	
	
	
	

	public int EnquadraX(int PX) {

		if (PX < 0) {
			PX = 0;
		}

		if (PX >= getMaxX()) {
			PX = getMaxX();
		}

		return PX;
	}

	public int EnquadraY(int PY) {

		if (PY < 0) {
			PY = 0;
		}

		if (PY >= getMaxY()) {
			PY = getMaxY();
		}

		return PY;
	}

	public void Posiciona(int PX, int PY) {

		if (PX <= getMinMovX()) {

			mCamera.MoverPara(0, mCamera.getY());

		} else if (PX > getMinMovX() && PX <= getMaxX() - getMinMovX()) {

			mCamera.MoverPara(PX - getMinMovX(), mCamera.getY());

		} else if (PX > getMaxX() - getMinMovX()) {

			mCamera.MoverPara(getMaxMovX(), mCamera.getY());

		}

		if (PY <= getMinMovY()) {

			mCamera.MoverPara(mCamera.getX(), 0);

		} else if (PY > getMinMovY() && PY <= getMaxY() - getMinMovY()) {

			mCamera.MoverPara(mCamera.getX(), PY - getMinMovY());

		} else if (PY > getMaxY() - getMinMovY()) {

			mCamera.MoverPara(mCamera.getX(), getMaxMovY());

		}

	}

	public void setLegendador(boolean eLegenda) {
		mLegenda = eLegenda;
	}
}
