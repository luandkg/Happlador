package Zeta;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements Runnable {

	private boolean mExecutando;


	Framerater FPS = new Framerater();
	private Painel mTela;

	public Window(String eTitulo, BufferedImage icone,int eLargura, int eAltura,Painel PainelC) {

		this.setSize(eLargura, eAltura + 30);
		this.setLocationRelativeTo(null);
		this.setTitle(eTitulo);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mTela = PainelC;
		
		this.add(mTela);

		if (icone !=null) {
			this.setIconImage(icone);
		}

		mExecutando = true;

		

	}

	@Override
	public void run() {

		while (mExecutando) {

			FPS.setInicio(System.currentTimeMillis());

			mTela.update(FPS.getDelta());

			mTela.repaint();

			FPS.setFim(System.currentTimeMillis());

			try {
				Thread.sleep(FPS.Dormir());
			} catch (Exception e) {

			}

			if (mTela.getFechado()) {
				Fechar();
			}
			
		}

	}

	public void Fechar() {
		mExecutando = false;
		this.setVisible(false); 
		this.dispose();
		System.exit(0);
	}

}
