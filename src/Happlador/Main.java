package Happlador;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Zeta.Imaginador;
import Zeta.Local;
import Zeta.Window;

public class Main {

	public static void main(String[] args) {


	     BufferedImage icone = Imaginador.CarregarStream(Local.ObterRecurso("editor.png"));

	 
		HappladorTela mTela = new HappladorTela(1650, 900);

		Window w = new Window("Happlador - Luan Freitas", icone, mTela.getLargura(), mTela.getAltura(), mTela);

		w.addKeyListener(mTela.TecladoC);
		
		Thread WindowsThread = new Thread(w);
		WindowsThread.start();

	}

}
