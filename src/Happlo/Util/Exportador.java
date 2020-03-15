package Happlo.Util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Happlo.Happlo;
import Zeta.Local;

public class Exportador {

	public static void Exportar(String eLocalInicio) {

		Happlo HapploLaranja = new Happlo(20, Color.orange);
		Happlo HapploVerde = new Happlo(20, Color.green);
		Happlo HapploAzul = new Happlo(20, Color.blue);
		Happlo HapploVermelho = new Happlo(20, Color.red);

		for (String letra : HapploVerde.HapploConsoante().Todas()) {

			BufferedImage bImg = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
			Graphics2D grafico = bImg.createGraphics();
			grafico.setColor(Color.BLACK);
			grafico.fillRect(0, 0, 500, 500);

			HapploVerde.HapploConsoante().Generico_Draw(grafico, letra, 30, 200);

			String eLocal = eLocalInicio + letra + ".png";

			try {
				if (ImageIO.write(bImg, "png", new File(eLocal))) {

					// System.out.println(" -- Letra : " + eLocal);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		for (String letra : HapploLaranja.HapploVogal().Todas()) {

			BufferedImage bImg = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
			Graphics2D grafico = bImg.createGraphics();
			grafico.setColor(Color.BLACK);
			grafico.fillRect(0, 0, 500, 500);

			HapploLaranja.HapploVogal().Generico_Draw(grafico, letra, 30, 200);

			String eLocal = eLocalInicio + letra + ".png";

			try {
				if (ImageIO.write(bImg, "png", new File(eLocal))) {

					// System.out.println(" -- Letra : " + eLocal);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		for (String letra : HapploAzul.HapploNumero().Todas()) {

			BufferedImage bImg = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
			Graphics2D grafico = bImg.createGraphics();
			grafico.setColor(Color.BLACK);
			grafico.fillRect(0, 0, 500, 500);

			HapploAzul.HapploNumero().Generico_Draw(grafico, letra, 30, 200);

			String eLocal = eLocalInicio + letra + ".png";

			try {
				if (ImageIO.write(bImg, "png", new File(eLocal))) {

					// System.out.println(" -- Letra : " + eLocal);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		for (String letra : HapploVermelho.HapploEspecial().Todas()) {

			BufferedImage bImg = new BufferedImage(250, 250, BufferedImage.TYPE_INT_RGB);
			Graphics2D grafico = bImg.createGraphics();
			grafico.setColor(Color.BLACK);
			grafico.fillRect(0, 0, 500, 500);

			HapploVermelho.HapploEspecial().Generico_Draw(grafico, letra, 30, 200);

			String eLocal = eLocalInicio + letra + ".png";

			try {
				if (ImageIO.write(bImg, "png", new File(eLocal))) {

					// System.out.println(" -- Letra : " + eLocal);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
