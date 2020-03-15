package Zeta;

public class Framerater {


	double fps = 60;
	
	 double periodo ;

	 long ti = 0;
	long to = 0;
		
	public Framerater() {
		ti=0;
		to=0;
		periodo = ((double)1.0 / (double)fps)*1000;  
	}
	
	
	public void setInicio(long eInicio) {
		ti=eInicio;
	}
	
	public void setFim(long eFim) {
		to=eFim;
	}
	
	public long getDelta() {
		return to-ti;
	}
	
	
	public int Dormir() {
		
		int ret = (int)((int)periodo - (to - ti));
		if(ret < 0) { ret = 0; }

		return  ret;
	}
	
}
