package Zeta;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter {

	private boolean mMousePressed = false;
	public boolean mouseDragged = false;
	
	public int mouseButton = -1;
	
	public long x=(long) -1f;
	public long y=(long) -1f;
	
	public long dx=(long) -1f;
	public long dy=(long) -1f;

	
	public boolean Pressed() {
		return mMousePressed;
	}
	
	public void DesPressionar() {
		mMousePressed=false;
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		this.mMousePressed=true;
		this.mouseButton=e.getButton();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		this.mMousePressed=false;
		this.mouseDragged=false;
	//	this.dx=0;
	//	this.dy=0;
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		this.x=e.getX();
		this.y=e.getY();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		this.mouseDragged=true;
		this.dx=e.getX() ; //- this.dx;
		this.dy=e.getY() ;//- this.dy;
		
	}
	
	
	
	
}
