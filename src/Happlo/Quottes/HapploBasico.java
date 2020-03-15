package Happlo.Quottes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class HapploBasico {

	private int mTamanho;
	private Color mCor;

	private int mQuadranteX;
	private int mQuadranteY;
	
	
	public HapploBasico(int eTamanho, Color eCor) {
		mTamanho=eTamanho;
		mCor=eCor;
		
		mQuadranteX = eTamanho * 10;
		mQuadranteY = eTamanho * 10;
		
		
	}
	
	
	public void SEG_COM(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX, PY - (emQuadranteY / 2) + (mTamanho / 2), emQuadranteX, mTamanho); // SEG-COM
	}

	public void TER_COM(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX, PY - emQuadranteY + mTamanho, emQuadranteX, mTamanho); // TER-COM
	}

	public void SEG_ESQ(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX, PY - (emQuadranteY / 2) + (mTamanho / 2), (emQuadranteX / 2), mTamanho); // SEG-ESQ
	}

	public void SEG_DIR(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX + (emQuadranteX / 2), PY - (emQuadranteY / 2) + (mTamanho / 2), (emQuadranteX / 2),
				mTamanho); // SEG-DIR
	}

	
	
	
	public void PONT_SEG_DIR(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.fillRect(PX + (mQuadranteX / 2) + (mQuadranteX / 4), PY - (mQuadranteY / 4), mTamanho, mTamanho);

	}

	public void PONT_SEG_ESQ(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.fillRect(PX + (mQuadranteX / 4), PY - (mQuadranteY / 4), mTamanho, mTamanho);

	}

	public void TER_DIR(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX + (emQuadranteX / 2), PY - emQuadranteY + mTamanho, (emQuadranteX / 2), mTamanho); // TER-DIR
	}

	public void TER_ESQ(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX, PY - emQuadranteY + mTamanho, (emQuadranteX / 2), mTamanho); // TER-DIR
	}

	public void PONT_TER_DIR(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		grafico.fillRect(PX + (mQuadranteX / 2) + (mQuadranteX / 4),
				PY - (emQuadranteY / 2) - (mQuadranteY / 4) + (mTamanho / 2), mTamanho, mTamanho);

	}

	public void PONT_TER_ESQ(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		grafico.fillRect(PX + (mQuadranteX / 4), PY - (emQuadranteY / 2) - (mQuadranteY / 4) + (mTamanho / 2), mTamanho,
				mTamanho);

	}
	
	public void BASE_UNICA(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.fillRect(PX, PY, mQuadranteX, mTamanho);

	}
	
	public void BASE(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX, PY, mQuadranteX, mTamanho);

		grafico.fillRect(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - mQuadranteY + mTamanho, mTamanho,
				mQuadranteY - mTamanho);

	}
	
	public void SEG_CENTRO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.setColor(mCor);

		grafico.fillRect(PX + (emQuadranteX / 4), PY - (emQuadranteY / 2) + (mTamanho / 2), (emQuadranteX / 2),
				mTamanho); 
		
	}

	
	public void SEG_BARRA(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		grafico.fillRect(PX + (emQuadranteX / 2) - (mTamanho/2), PY -mQuadranteY + (mQuadranteY/3) , mTamanho, mQuadranteY/2);

	}
	
	public void SEG_BARRA_DUPLA(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {
		
		
		grafico.fillRect(PX + (emQuadranteX / 2) - (mTamanho), PY -mQuadranteY + (mQuadranteY/3) , mTamanho, mQuadranteY/2);

		grafico.fillRect(PX + (emQuadranteX / 2) + (mTamanho), PY -mQuadranteY + (mQuadranteY/3) , mTamanho, mQuadranteY/2);

	}
	
	
	public void SEG_CENTRO_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - (emQuadranteY/4), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_CENTRAL_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - (emQuadranteY/2), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	
	public void TER_CENTRO_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - (emQuadranteY/2) , mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_ESQUERDA_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 4) - (mTamanho / 2), PY - (emQuadranteY/2), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_DIREITA_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) +(mQuadranteX / 4) - (mTamanho / 2), PY - (emQuadranteY/2), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_ESQUERDA_DUPLO_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 4) - (mTamanho / 2), PY - (emQuadranteY/3), mTamanho, mTamanho);
		
		grafico.drawOval(PX + (mQuadranteX / 4) - (mTamanho / 2), PY - (emQuadranteY) + (emQuadranteY/4), mTamanho, mTamanho);

		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_DIREITA_DUPLO_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) +(mQuadranteX / 4) - (mTamanho / 2), PY - (emQuadranteY/3), mTamanho, mTamanho);
		
		grafico.drawOval(PX + (mQuadranteX / 2) +(mQuadranteX / 4) - (mTamanho / 2), PY - (emQuadranteY) + (emQuadranteY/4), mTamanho, mTamanho);

		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	
	public void SEG_ESQUERDA_SUPER_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 6) - (mTamanho / 2), PY - (emQuadranteY/2), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_DIREITA_SUPER_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) +(mQuadranteX / 4) - (mTamanho / 2)+(mQuadranteX / 6), PY - (emQuadranteY/2), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_ESQUERDA_SUPER_DUPLO_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 6) - (mTamanho / 2), PY - (emQuadranteY/2) - (emQuadranteY/4), mTamanho, mTamanho);
		grafico.drawOval(PX + (mQuadranteX / 6) - (mTamanho / 2), PY - (emQuadranteY/2) + (emQuadranteY/4), mTamanho, mTamanho);


		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
	
	public void SEG_DIREITA_SUPER_DUPLO_PONTO(Graphics grafico, int PX, int PY, int emQuadranteX, int emQuadranteY) {

		Graphics2D g2 = (Graphics2D) grafico;
		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) +(mQuadranteX / 4) - (mTamanho / 2)+(mQuadranteX / 6), PY - (emQuadranteY/2) - (emQuadranteY/4), mTamanho, mTamanho);
		grafico.drawOval(PX + (mQuadranteX / 2) +(mQuadranteX / 4) - (mTamanho / 2)+(mQuadranteX / 6), PY - (emQuadranteY/2) + (emQuadranteY/4), mTamanho, mTamanho);


		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
	}
}
