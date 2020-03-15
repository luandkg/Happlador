package Zeta;

public class Camera {

	private int mX;
	private int mY;
	
	private int mMaxX;
	private int mMaxY;
	
	public Camera(int eX,int eY,int eMaxX,int eMaxY) {
		this.mX=eX;
		this.mY=eY;
		
		this.mMaxX=eMaxX;
		this.mMaxY=eMaxY;
		
	}
	
	
	public int getX() {return mX;}
	public int getY() {return mY;}

	public int getMaxY() {return mMaxY;}
	public int getMaxX() {return mMaxX;}

	
	public void Subir() {
		mY-=1;
		if (mY<0) { mY=0;}
	}
	
	public void Descer() {
		mY+=1;
		if (mY>=mMaxY) { mY=mMaxY;}

		
	}
	
	public void Esquerda() {
		mX-=1;
		if (mX<0) { mX=0;}

	}
	
	public void Direita() {
		mX+=1;
		if (mX>=mMaxX) { mX=mMaxX;}

	}
	
	public void MoverPara(int eX,int eY) {
		mX=eX;
		mY=eY;
	}
	
}
