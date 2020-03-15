package Zeta;

import javax.swing.JPanel;

public abstract class Painel extends JPanel {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4484671194489992873L;
	/**
	 * 
	 */
	
	public abstract boolean getFechado() ;
	public abstract void update(long dt) ;

	
}
