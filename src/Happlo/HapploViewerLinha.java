package Happlo;

import java.awt.Color;
import java.awt.Graphics;

import Happlador.HappladorTela;
import Zeta.Cronometro;
import Zeta.Mouse;

public class HapploViewerLinha {

	private int IX;
	private int IY;

	private int FX;
	private int FY;

	private boolean mSelecionado;

	private boolean mCiclado = false;
	private int SelecaoX;
	private int SelecaoY;

	private int mColunas;
	private int mLinhas;
	private Happlo HapploC;
	private HapploDocumento HapploDocumentoC;

	private boolean mostrar;
	private boolean mGradear;
	private Cronometro C1;

	private int Ponteiro;

	private int INICIO_Y ;
	private int INICIO_X ;
	
	public HapploViewerLinha(int eX,int eY, HapploDocumento eHapploDocumento) {
		mSelecionado = false;
		
		HapploDocumentoC = eHapploDocumento;

		mColunas = 0;
		mLinhas = 1;

		mostrar = false;
		C1 = new Cronometro(1000);

		INICIO_X=eX;
		INICIO_Y=eY;
		HapploC = new Happlo(1, Color.white);

	}
	
	public void setQuantidade(int eQuantidade) {
		mColunas = eQuantidade;
	}
	
	public void setFonte(int eTamanho,Color eCor) {
		HapploC = new Happlo(eTamanho, eCor);
	}
	
	public void MudarTamanho(int eTamanho) {
		HapploC = new Happlo(eTamanho, HapploC.getCor());
	}
	
	public void MudarCor(Color eCor) {
		HapploC = new Happlo(HapploC.getTamanho(), eCor);
	}
	
	public HapploDocumento getHapploDocumento() {
		return HapploDocumentoC;
	}

	public int getPonteiro() {
		return Ponteiro;
	}

	public void setPonteiro(int ePonteiro) {
		Ponteiro = ePonteiro;
	}

	public int getMaxPonteiro() {
		return (getLinhas() * getColunas()) - 1;
	}

	public void MostrePonteiro() {
		C1 = new Cronometro(1000);
		mostrar = true;
	}

	public void CiclarPonteiro() {

		if (C1.Esperado()) {
			mostrar = !mostrar;
		}
	}

	public void setGrade(boolean eGrade) {
		mGradear = eGrade;
	}

	public int getColunas() {
		return mColunas;
	}

	public int getLinhas() {
		return mLinhas;
	}

	public int IniciadoX() {
		return SelecaoX;
	}

	public int IniciadoY() {
		return SelecaoY;
	}

	public boolean EstaIniciado() {
		return mCiclado;
	}

	public void IniciarSelecao(int eX, int eY) {

		SelecaoX = eX;
		SelecaoY = eY;
		mCiclado = true;

	}

	public void Selecionar(int eIX, int eIY, int eFX, int eFY) {
		IX = eIX;
		IY = eIY;
		FX = eFX;
		FY = eFY;
		mSelecionado = true;

		mCiclado = false;

		if (IY > FX) {

			int GI = IX;
			int GY = IY;

			IX = FX;
			IY = FY;

			FX = GI;
			FY = GY;

		}

		if (IY == FY) {

			if (IX > FX) {

				int GX = IX;

				IX = FX;
				FX = GX;

			}

		}

	}

	public void LimparSelecao() {
		mSelecionado = false;
	}

	public int getIX() {
		return IX;
	}

	public int getIY() {
		return IY;
	}

	public int getFX() {
		return FX;
	}

	public int getFY() {
		return FY;
	}

	public boolean estaSelecionado() {

		if (IX == FX && IY == FY) {
			mSelecionado = false;
		}

		return mSelecionado;
	}

	public void RemoverSelecao() {
		mSelecionado = false;
		mCiclado = false;
		IX = 0;
		IY = 0;
		IX = FX;
		IY = FY;
	}

	public int CalcularLinhas(int eTam, Happlo HapploC) {

		int mLinhas = eTam / (HapploC.getQuadrante());

		int si = (mLinhas * 20) / (HapploC.getQuadrante());

		mLinhas = (eTam - si) / (HapploC.getQuadrante());

		if (HapploC.getTamanho() < 5) {
			mLinhas -= (mLinhas / (HapploC.getTamanho() + 1));

		}

		return mLinhas;
	}

	public int CalcularColunas(int eTam, Happlo HapploC) {

		int mColunas = eTam / (HapploC.getQuadrante());

		// System.out.println("Quadrante : " + HapploC.getQuadrante());

		// System.out.println("Colunas : " + mColunas);

		int sc = (mColunas * 20) / (HapploC.getQuadrante());

		// System.out.println("Co - Colunas : " + sc);

		mColunas = (eTam - sc) / (HapploC.getQuadrante());

		if (HapploC.getTamanho() < 5) {
			mColunas -= (mColunas / (HapploC.getTamanho() + 1));

		}

		// System.out.println("Colunas : " + mColunas);

		return mColunas;
	}

	public int CalcularCapacidade(int eTam, Happlo HapploC) {
		return CalcularLinhas(eTam, HapploC) * CalcularColunas(eTam, HapploC);
	}

	public int getCapacidade() {
		return getLinhas() * getColunas();
	}

	public void Visualizar(Graphics grafico, Happlo HapploC, HapploDocumento HapploDocumentoC, int mPonteiro, int SX,
			int SY) {

		
		if (mPonteiro<HapploDocumentoC.getCapacidade()) {
			
		} else {
			return ;
		}
		
		
		if ((HapploDocumentoC.get(mPonteiro).equals("C01"))) {

			HapploC.HapploConsoante().C01_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C02"))) {

			HapploC.HapploConsoante().C02_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C03"))) {

			HapploC.HapploConsoante().C03_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C04"))) {

			HapploC.HapploConsoante().C04_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C05"))) {

			HapploC.HapploConsoante().C05_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C06"))) {

			HapploC.HapploConsoante().C06_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C07"))) {

			HapploC.HapploConsoante().C07_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C08"))) {

			HapploC.HapploConsoante().C08_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C09"))) {

			HapploC.HapploConsoante().C09_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C10"))) {

			HapploC.HapploConsoante().C10_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C11"))) {

			HapploC.HapploConsoante().C11_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C12"))) {

			HapploC.HapploConsoante().C12_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C13"))) {

			HapploC.HapploConsoante().C13_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C14"))) {

			HapploC.HapploConsoante().C14_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C15"))) {

			HapploC.HapploConsoante().C15_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("C16"))) {

			HapploC.HapploConsoante().C16_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("V01"))) {
			HapploC.HapploVogal().V01_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V02"))) {
			HapploC.HapploVogal().V02_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V03"))) {
			HapploC.HapploVogal().V03_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V04"))) {
			HapploC.HapploVogal().V04_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V05"))) {
			HapploC.HapploVogal().V05_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V06"))) {
			HapploC.HapploVogal().V06_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V07"))) {
			HapploC.HapploVogal().V07_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V08"))) {
			HapploC.HapploVogal().V08_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V09"))) {
			HapploC.HapploVogal().V09_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V10"))) {
			HapploC.HapploVogal().V10_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("V11"))) {
			HapploC.HapploVogal().V11_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("N00"))) {
			HapploC.HapploNumero().N00_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N01"))) {
			HapploC.HapploNumero().N01_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N02"))) {
			HapploC.HapploNumero().N02_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N03"))) {
			HapploC.HapploNumero().N03_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N04"))) {
			HapploC.HapploNumero().N04_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N05"))) {
			HapploC.HapploNumero().N05_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N06"))) {
			HapploC.HapploNumero().N06_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N07"))) {
			HapploC.HapploNumero().N07_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N08"))) {
			HapploC.HapploNumero().N08_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}
		if ((HapploDocumentoC.get(mPonteiro).equals("N09"))) {
			HapploC.HapploNumero().N09_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E01"))) {
			HapploC.HapploEspecial().E01_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E02"))) {
			HapploC.HapploEspecial().E02_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E03"))) {
			HapploC.HapploEspecial().E03_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E04"))) {
			HapploC.HapploEspecial().E04_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E05"))) {
			HapploC.HapploEspecial().E05_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E06"))) {
			HapploC.HapploEspecial().E06_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E07"))) {
			HapploC.HapploEspecial().E07_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E08"))) {
			HapploC.HapploEspecial().E08_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E09"))) {
			HapploC.HapploEspecial().E09_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E10"))) {
			HapploC.HapploEspecial().E10_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E11"))) {
			HapploC.HapploEspecial().E11_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E12"))) {
			HapploC.HapploEspecial().E12_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E13"))) {
			HapploC.HapploEspecial().E13_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E14"))) {
			HapploC.HapploEspecial().E14_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E15"))) {
			HapploC.HapploEspecial().E15_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E16"))) {
			HapploC.HapploEspecial().E16_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E17"))) {
			HapploC.HapploEspecial().E17_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

		if ((HapploDocumentoC.get(mPonteiro).equals("E18"))) {
			HapploC.HapploEspecial().E18_Draw(grafico, SX + 20, SY + HapploC.getQuadrante() - 10);
		}

	}

	public int SelecaoInicioIndex() {

		return (getIY() * mColunas) + getIX();

	}

	public int SelecaoFimIndex() {

		return (getFY() * mColunas) + getFX();

	}

	public int SelecaoTamanho() {
		return (SelecaoFimIndex() - SelecaoInicioIndex()) + 1;

	}

	private int mPonteiroSelecaoInicio;

	public int PonteiroSelecaoInicio() {
		return mPonteiroSelecaoInicio;
	}

	public boolean Clique(Mouse MouseC) {

		boolean clicado = false;

		if (MouseC.Pressed()) {
			int mX = 50;
			int mY = 50;

			long x = MouseC.x;
			long y = MouseC.y;

			int mLargura = 500;
			int mAltura = 500;

			if (x >= mX && x <= (mX + mLargura)) {
				if (y >= mY && y <= (mY + mAltura)) {

					if (EstaIniciado() == false) {
						IniciarSelecao((int) (x - mX), (int) (y - mY));
					} else {
						RemoverSelecao();
					}

				}
			}

		} else {

			if (EstaIniciado() == true) {

				long SelecaoFimX = MouseC.dx - 50;
				long SelecaoFimY = MouseC.dy - 50;

				if (SelecaoFimX > 600) {
					SelecaoFimX = 600;
				}

				if (SelecaoFimY > 600) {
					SelecaoFimY = 600;
				}

				int Q = HapploC.getQuadrante() + HapploC.getEspacador();

				int IX = (int) IniciadoX() / Q;
				int IY = (int) IniciadoY() / Q;

				int FX = (int) SelecaoFimX / Q;
				int FY = (int) SelecaoFimY / Q;

				Selecionar(IX, IY, FX, FY);

				long mIndex = (IY * getColunas()) + IX;
				long mOndex = (FY * getColunas()) + FX;
				long Tamanho = (mOndex - mIndex) + 1;

				mPonteiroSelecaoInicio = (int) mIndex;
				clicado = true;
			}

		}

		return clicado;
	}

	public void Draw(Graphics grafico) {

		C1.Esperar();

		int SY = INICIO_Y;
		int SX = INICIO_X;

		int eColunas = getColunas();

		if (eColunas==0) {
			eColunas = HapploDocumentoC.getCapacidade();
		}
		
		
		int mPonteiro = 0;

		SY = INICIO_Y;
		
			SX = INICIO_X;
			for (int x = 0; x < eColunas; x++) {

				if (mGradear) {

					grafico.setColor(Color.WHITE);

				//	grafico.drawRect(SX, SY, 20, 50);

				}

				if (mPonteiro == Ponteiro && mostrar == true && estaSelecionado() == false) {
					grafico.setColor(Color.RED);

					grafico.fillRect(SX + 10, SY + (HapploC.getQuadrante() / 5), (HapploC.getQuadrante() / 5),
							HapploC.getQuadrante() / 2);

				}

				if (mGradear) {
					grafico.setColor(Color.WHITE);
					grafico.drawRect(SX + 20, SY, HapploC.getQuadrante(), HapploC.getQuadrante());

				}

				long mIndex = SelecaoInicioIndex();
				long mOndex = SelecaoFimIndex();

				if (estaSelecionado()) {

					if (mPonteiro >= mIndex && mPonteiro <= mOndex) {
						grafico.setColor(Color.WHITE);
						grafico.fillRect(SX + 20, SY , HapploC.getQuadrante(), HapploC.getQuadrante());

					}

				}

				Visualizar(grafico, HapploC, HapploDocumentoC, mPonteiro, SX, SY+5);

				SX += HapploC.getQuadrante() + HapploC.getEspacador();

				if (estaSelecionado()) {

					if (mPonteiro >= mIndex && mPonteiro < mOndex) {
						grafico.setColor(Color.WHITE);
						grafico.fillRect(SX, SY , HapploC.getEspacador(), HapploC.getQuadrante());

					}

				}

				mPonteiro += 1;
			}
		
	}

	public void Escreva(String eValor) {

		int MaxPonteiro = getMaxPonteiro();

		if (Ponteiro < MaxPonteiro) {
			HapploDocumentoC.set(Ponteiro, eValor);
		}

		if (Ponteiro < MaxPonteiro) {
			Ponteiro += 1;
		}

	}

}
