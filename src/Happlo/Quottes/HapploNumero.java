package Happlo.Quottes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class HapploNumero {

	private int mTamanho;
	private Color mCor;

	private int mQuadranteX;
	private int mQuadranteY;
	
	private HapploBasico mHapploBasico;

	public HapploNumero(int eTamanho, Color eCor) {
		mTamanho=eTamanho;
		mCor=eCor;
		
		mQuadranteX = eTamanho * 10;
		mQuadranteY = eTamanho * 10;
		
		mHapploBasico = new HapploBasico(mTamanho,mCor);

	}


	public ArrayList<String> Todas(){
		ArrayList<String> ret = new ArrayList<String>();
		
		for(int i=0;i<=9;i++) {
			ret.add("N0" + i);
		}
		
		
		return ret;
	}
	public void Generico_Draw(Graphics grafico,String letra, int PX, int PY) {
		
		switch (letra) {
		case "N01":
			N01_Draw(grafico,PX,PY);
			break;
		case "N02":
			N02_Draw(grafico,PX,PY);
			break;
		case "N03":
			N03_Draw(grafico,PX,PY);
			break;
		case "N04":
			N04_Draw(grafico,PX,PY);
			break;
		case "N05":
			N05_Draw(grafico,PX,PY);
			break;
		case "N06":
			N06_Draw(grafico,PX,PY);
			break;
		case "N07":
			N07_Draw(grafico,PX,PY);
			break;
		case "N08":
			N08_Draw(grafico,PX,PY);
			break;
		case "N09":
			N09_Draw(grafico,PX,PY);
			break;
		case "N00":
			N00_Draw(grafico,PX,PY);
			break;
		}
		
	}

	public void BASE_NUMERICA(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		Graphics2D g2 = (Graphics2D) grafico;

		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		g2.drawLine(PX, PY, (PX + mQuadranteX), PY - mQuadranteY+mTamanho);
		g2.drawLine(PX + mQuadranteX, PY, PX, PY - mQuadranteY+mTamanho);

		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

	}

	public void N00_Draw(Graphics grafico, int PX, int PY) {

		BASE_NUMERICA(grafico, PX, PY);

	}

	public void N01_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		BASE_NUMERICA(grafico, PX, PY);
		Graphics2D g2 = (Graphics2D) grafico;

		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

	//	grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - (mQuadranteY / 2) + (mQuadranteY / 3), mTamanho,
		//		mTamanho);
		
		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY, mTamanho, mTamanho);

		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

	}

	public void N02_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		BASE_NUMERICA(grafico, PX, PY);

		Graphics2D g2 = (Graphics2D) grafico;

		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - (mQuadranteY)+mTamanho , mTamanho,mTamanho);

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY-mTamanho, mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

	}

	public void N03_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		BASE_NUMERICA(grafico, PX, PY);
		Graphics2D g2 = (Graphics2D) grafico;

		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY, mTamanho, mTamanho);


		grafico.drawOval(PX, PY - (mQuadranteY / 2) - (mTamanho / 2), mTamanho, mTamanho);

		grafico.drawOval(PX + (mQuadranteX) - (mTamanho), PY - (mQuadranteY / 2) - (mTamanho / 2), mTamanho, mTamanho);
		
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

	}

	public void N04_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		BASE_NUMERICA(grafico, PX, PY);
		Graphics2D g2 = (Graphics2D) grafico;

		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		

		grafico.drawOval(PX, PY - (mQuadranteY / 2) - (mTamanho / 2), mTamanho, mTamanho);

		grafico.drawOval(PX + (mQuadranteX) - (mTamanho), PY - (mQuadranteY / 2) - (mTamanho / 2), mTamanho, mTamanho);

		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY, mTamanho, mTamanho);
		
		
		grafico.drawOval(PX + (mQuadranteX / 2) - (mTamanho / 2), PY - (mQuadranteY)+mTamanho , mTamanho,mTamanho);

		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		
		
	}

	public void N05_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		BASE_NUMERICA(grafico, PX, PY);
		Graphics2D g2 = (Graphics2D) grafico;

		g2.setStroke(new BasicStroke((float) mTamanho, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.drawOval(PX, PY - (mQuadranteY / 2) - (mTamanho / 2), mTamanho, mTamanho);

		grafico.drawOval(PX + (mQuadranteX) - (mTamanho), PY - (mQuadranteY / 2) - (mTamanho / 2), mTamanho, mTamanho);
		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

	}

	public void N06_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		Graphics2D g2 = (Graphics2D) grafico;

		BASE_NUMERICA(grafico, PX, PY);

		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.fillRect(PX + (mQuadranteX / 2) - (3 * mTamanho / 2), PY - mQuadranteY - mTamanho, 3 * mTamanho,
				mTamanho);

	}

	public void N07_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		Graphics2D g2 = (Graphics2D) grafico;

		BASE_NUMERICA(grafico, PX, PY);

		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.fillRect(PX + (mQuadranteX / 2) - (3 * mTamanho / 2), PY, 3 * mTamanho, mTamanho);

		grafico.fillRect(PX + (mQuadranteX / 2) - (3 * mTamanho / 2), PY - mQuadranteY - mTamanho, 3 * mTamanho,
				mTamanho);

	}

	public void N08_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		Graphics2D g2 = (Graphics2D) grafico;

		BASE_NUMERICA(grafico, PX, PY);

		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.fillRect(PX + (mQuadranteX / 2) - (3 * mTamanho / 2), PY - mQuadranteY - mTamanho, 3 * mTamanho,
				mTamanho);

		grafico.fillRect(PX, PY - (mQuadranteY / 2) - (mTamanho / 2), 2 * mTamanho, mTamanho);

		grafico.fillRect(PX + (mQuadranteX) - 2 * mTamanho, PY - (mQuadranteY / 2) - (mTamanho / 2), 2 * mTamanho,
				mTamanho);

	}

	public void N09_Draw(Graphics grafico, int PX, int PY) {
		grafico.setColor(mCor);

		Graphics2D g2 = (Graphics2D) grafico;

		BASE_NUMERICA(grafico, PX, PY);

		g2.setStroke(new BasicStroke((float) 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

		grafico.fillRect(PX + (mQuadranteX / 2) - (3 * mTamanho / 2), PY - mQuadranteY - mTamanho, 3 * mTamanho,
				mTamanho);

		grafico.fillRect(PX, PY - (mQuadranteY / 2) - (mTamanho / 2), 2 * mTamanho, mTamanho);

		grafico.fillRect(PX + (mQuadranteX) - 2 * mTamanho, PY - (mQuadranteY / 2) - (mTamanho / 2), 2 * mTamanho,
				mTamanho);
		grafico.fillRect(PX + (mQuadranteX / 2) - (3 * mTamanho / 2), PY, 3 * mTamanho, mTamanho);

	}

	
}
