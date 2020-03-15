package Zeta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import TXLDKG.IN7;
import TXLDKG.MZ4;
import TXLDKG.TXLDKG;

public class Tabuleiro {


    public int Matriz[][];

    private int mLargura;
    private int mAltura;

    public int getLargura() {
        return mLargura;
    }

    public int getAltura() {
        return mAltura;
    }

    public Tabuleiro(int LARGURA, int ALTURA) {

        mLargura = LARGURA;
        mAltura = ALTURA;


        Matriz = new int[LARGURA][ALTURA];

        for (int x = 0; x < LARGURA; x++) {
            for (int y = 0; y < ALTURA; y++) {
                Matriz[x][y] = 0;
            }
        }


       Matriz[0][ALTURA-1] = 2;


    }

    public void Atribuir(int x, int y, int valor) {
        Matriz[x][y] = valor;

    }

    public void AtribuirSePossivel(int x, int y, int valor) {

        if (x>=0 && x<getLargura()){
            if (y>=0 && y<getAltura()){
                Matriz[x][y] = valor;

            }
        }

    }

    public int Obter(int x, int y) {
        return Matriz[x][y];

    }

    public int ObterSePossivel(int x, int y) {

        int ret = -1;

        if (x>=0 && x<getLargura()){
            if (y>=0 && y<getAltura()){
              ret=  Matriz[x][y] ;

            }
        }

        return ret;
    }
    
    public void Limpar() {
    	

        for (int x = 0; x < getLargura(); x++) {
            for (int y = 0; y < getAltura(); y++) {
                Matriz[x][y] = 0;
            }
        }
        
    }
    
    
    public void Salvar(String elocalTexto,String eLocalIn7) {
    	
    	FileWriter arq;
		try {
			arq = new FileWriter(elocalTexto);
			 PrintWriter gravarArq = new PrintWriter(arq);
		     
			 String Documento = "";
			 

		            for (int y = 0; y < getAltura(); y++) {
		            	 for (int x = 0; x < getLargura(); x++) {
		            	String valor = String.valueOf( Matriz[x][y] );
		            	
		            	if (valor.length()==0) { valor = "0000";}
		            	if (valor.length()==1) { valor = "000" + valor;}
		            	if (valor.length()==2) { valor = "00" + valor;}
		            	if (valor.length()==3) { valor = "0" + valor;}

		            	Documento+=valor + " ";

		                
		            }

		            Documento+="\n";
		            
		        }
			 
		        gravarArq.print(Documento);

				IN7 MapeadorIN7 = new IN7();
				
				MapeadorIN7.imaginar(Documento,eLocalIn7 );

				
				
		       
		        arq.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    	
    }
    
    
    public void Ler(String eConteudo) {
    	
    	
    	int i =0;
    	int o=eConteudo.length();
    	
    	String Valor = "";
    	
    	int x = 0;
    	int y=0;
    	
    	while(i<o) {
    		char l = eConteudo.charAt(i);
    		
    		if (l==' ') {
    			int valori = Integer.parseInt(Valor);
    			
    	    	//System.out.print(Valor + ".");

    		//	Matriz[x][y] = valori;
    			
    		this.AtribuirSePossivel(x, y, valori);
    	    //	System.out.print(y);

    			x+=1;
    			Valor="";
    		}else if(l=='\n') {
    				y+=1;
    				x=0;
        	    	//System.out.print("\n");

    		} else {
    			Valor +=String.valueOf(l);

    		}
    		
    		i+=1;
    	}
    	
    	
    }

}
