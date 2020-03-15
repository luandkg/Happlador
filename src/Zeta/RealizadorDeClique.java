package Zeta;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class RealizadorDeClique {

	private boolean clicou = false;
	private Cronometro CronBotoes;
	private ArrayList<Botao> ls_botao;
	private Mouse mMouse;
	private boolean mCliqueContinuo;
	private int mTempo;

	public RealizadorDeClique(Mouse eMouse) {

		ls_botao = new ArrayList<Botao>();
		mMouse = eMouse;
		mCliqueContinuo = true;

		mTempo = 400;
		CronBotoes = new Cronometro(mTempo);

	}

	public Botao add(Botao BotaoC) {
		ls_botao.add(BotaoC);
		return BotaoC;
	}

	public Botao NovoBotao(String eNome, int eX, int eY, int eLargura, int eAltura) {
		Botao BotaoC = new Botao(eNome,eX,eY,eLargura,eAltura);
		ls_botao.add(BotaoC);
		return BotaoC;
	}
	
	public Botao NovoBotaoImagem(String eNome, int eX, int eY, int eLargura, int eAltura, BufferedImage eImg) {
		Botao BotaoC = new Botao(eNome,eX,eY,eLargura,eAltura,eImg);
		ls_botao.add(BotaoC);
		return BotaoC;
	}
	
	
	
	
	public void setCliqueContinuo(boolean eCliqueContinuo) {
		mCliqueContinuo = eCliqueContinuo;
	}

	public void update(long dt) {

		CronBotoes.Esperar();

		if (mMouse.Pressed() == false) {
			clicou = false;
		}

		if (mCliqueContinuo == false) {
			clicou = false;
		}

		if (mMouse.Pressed() == true && clicou == false) {

			for (Botao BotaoC : ls_botao) {
				BotaoC.coordenada(mMouse.x, mMouse.y);
			}

			clicou = true;
			CronBotoes = new Cronometro(mTempo);

		} else if (CronBotoes.Esperado() && mCliqueContinuo == true) {
			if (clicou == true) {
				for (Botao BotaoC : ls_botao) {
					BotaoC.coordenada(mMouse.x, mMouse.y);
				}
				//System.out.println("Clique Continuo ...");
			}

		}
		if (mCliqueContinuo == false) {
			mMouse.DesPressionar();
		}

	}

}
