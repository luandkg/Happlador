package Zeta;

public class Ciclador {

	private long ciclos;
	private long max;

	public Ciclador() {
		ciclos=0;
		max=0;
	}
	
	
	public long getCiclos() {
		return ciclos;
	}
	
	public void Tick() {
		ciclos+=1;
	}
	
	public void Zerar() {
		max=ciclos;
		ciclos=0;
	}
	
	public long getMax() {
		return max;
	}
}
