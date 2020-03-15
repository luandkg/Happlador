package TXLDKG;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

public class IN7 {

	public int quadrante(int X, int Y) {

		int ret = 0;

		int ondex = 0;
		boolean onc = false;

		int index = 0;
		boolean inc = false;

		while (onc == false) {

			int OInicio = (ondex * 10) + ondex;
			int OFim = ((ondex + 1) * 10) + ondex;

			if (Y >= OInicio && Y < OFim) {

				// System.out.println("ENC O : " + ondex + " em : " +OInicio + " ate " + OFim);

				onc = true;
				break;
			}

			if (ondex >= 500) {
				onc = true;
			}
			ondex += 1;

		}

		if (Y >= 0 && Y < 11) {
			ondex = 1;
		}

		if (Y >= 11 && Y < 22) {
			ondex = 2;
		}

		while (inc == false) {

			int IInicio = (index * 10) + index;
			int IFim = ((index + 1) * 10) + index;

			if (X >= IInicio && X < IFim) {

				// System.out.println("ENC I : " + index + " em : " + IInicio + " ate " + IFim);

				inc = true;
				break;
			}

			if (index >= 500) {
				inc = true;
			}
			index += 1;

		}

		if (X >= 0 && X < 11) {
			index = 3;
		}

		if (X >= 11 && X < 22) {
			index = 4;
			// System.out.println("Segunda Matriz");
		}

		if (index == 0) {
			index = 1;
		}
		if (ondex == 0) {
			ondex = 1;
		}

		ret = (index * ondex);

		
		while (ret >= 100) {
			ret -= 100;
		}

		return ret;
	}

	public class PrefixoCor {

		public int R = 0;
		public int G = 0;

		public PrefixoCor(int eR, int eG) {
			R = eR;
			G = eG;
		}

	}

	public String desimaginar(String e3) throws IOException {

		BufferedImage imagem = ImageIO.read(new File(e3));

		Raster raster;
		raster = imagem.getRaster();
		int altura = imagem.getHeight();
		int largura = imagem.getWidth();
		int pixels[] = new int[altura * largura];
		int bandaInt;
		String banda[] = new String[imagem.getRaster().getNumBands()];
		String bandaBinaria;
		int k = 0;

		ArrayList<Integer> valores = new ArrayList<Integer>();

		for (int z = 0; z < altura; z++) {
			for (int l = 0; l < largura; l++) {
				raster.getPixel(l, z, pixels);

				Color rgb = new Color(imagem.getRGB(l, z));

				if (rgb.getBlue() > 0) {

					if (rgb.getBlue() < 99) {
						valores.add(rgb.getBlue() / 3);

					} else {
						valores.add(rgb.getBlue());
					}

					// System.out.print(" " + (rgb.getBlue()/2));
				}

				k++;
			}
		}

		TXLDKG l = new TXLDKG();

		// System.out.println("Largura : " + largura);
		// System.out.println("Altura : " + altura);
		// System.out.println("Pixels : " + pixels.length);
		// System.out.println("Codigos : " + valores.size());

		return l.desconverterLista(valores);
	}

	public void imaginar(String e3, String arquivoSaida) {

		TXLDKG C = new TXLDKG();
		MZ4 mapeador = new MZ4();

		ArrayList<Integer> valores = mapeador.mapearConjuntoMatriz(C.converterListaInteiro(e3));

		int raiz = mapeador.getRaiz(C.converterListaInteiro(e3));

		//System.out.println("");
		//System.out.println(" - Codigos : " + String.valueOf(e3.length()));
		//System.out.println(" - Raiz : " + String.valueOf(raiz));
		//System.out.println(" - Matrizes : " + String.valueOf(raiz * raiz));

		int tamanho = (raiz * 10) + ((raiz - 1));

		BufferedImage img = new BufferedImage(tamanho, tamanho, BufferedImage.TYPE_INT_RGB);
		Graphics g = img.createGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, tamanho, tamanho);

		Random rand = new Random();

		

		ArrayList<PrefixoCor> Cores = new ArrayList<PrefixoCor>();

		for (int t = 0; t < 100; t++) {
			Cores.add(new PrefixoCor(rand.nextInt(255), rand.nextInt(255)));
		}


		WritableRaster raster = img.getRaster();

		int X = 0;
		int Y = 0;

		for (int i = 0; i < (valores.size()); i++) {

			int valor = valores.get(i);

			int pixels[] = new int[4];
			pixels[0] = 0;
			pixels[1] = 255;
			pixels[2] = valor;

			if (valor < 99) {
				pixels[2] = 3 * valor;
			}

			int IndexadorCor = quadrante(X, Y);
			if (IndexadorCor < 100) {
				pixels[0] = Cores.get(IndexadorCor).R;
				pixels[1] = Cores.get(IndexadorCor).G;
			}

			if (valor == 200) {
				pixels[0] = 255;
				pixels[1] = 255;
				pixels[2] = 255;

				if (X < tamanho) {
					raster.setPixel(X, Y, pixels);
				}
				X += 1;
			} else if (valor == 201) {
				pixels[0] = 0;
				pixels[1] = 0;
				pixels[2] = 0;

				if (X < tamanho) {
					raster.setPixel(X, Y, pixels);
				}
				X += 1;
			} else if (valor == 202) {
				pixels[0] = 255;
				pixels[1] = 255;
				pixels[2] = 255;

				X = 0;
				Y += 1;

				for (int l = 0; l < tamanho; l++) {
					if (l < tamanho) {
						raster.setPixel(l, Y, pixels);
					}
				}
			} else {

				if (X < tamanho) {
					raster.setPixel(X, Y, pixels);
				}
				X += 1;
			}

			if (valor == 200) {
				int xa = X;
				Y += 1;
				X = 0;
				// System.out.print("\n");

			} else if (valor == 201) {
				// System.out.print(" ");
			} else if (valor == 202) {
				// System.out.print("\n");
			} else {

				String SValor = String.valueOf(valor);
				if (SValor.length() == 1) {
					SValor = "00" + SValor;
				}
				if (SValor.length() == 2) {
					SValor = "0" + SValor;
				}
				// System.out.print(" " + SValor );

			}

		}

		// Limpando Coluna
		// System.out.print("\n\n");
		for (int r = 1; r < raiz; r++) {
			int coluna = ((r * 10) + r) - 1;

			for (int l = 0; l < tamanho; l++) {
				int pixels[] = new int[4];
				pixels[0] = 0;
				pixels[1] = 0;
				pixels[2] = 0;
			}
			// System.out.println(" - Limpando Coluna : " + coluna);

		}

		img.setData(raster);

		try {
			ImageIO.write(img, "png", new File(arquivoSaida));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
