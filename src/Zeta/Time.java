package Zeta;

public class Time {

	private long mTempo_inicio;

	public Time() {
		mTempo_inicio = System.nanoTime();
	}
	
	public  long getTime() {
		return System.nanoTime()-mTempo_inicio;
	}
	
}
