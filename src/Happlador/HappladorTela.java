package Happlador;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Happlo.Happlo;
import Happlo.HapploDocumento;
import Happlo.HapploViewer;
import Happlo.HapploViewerLinha;
import Happlo.Util.Alinhamento;
import Happlo.Util.Exportador;
import Happlo.Util.Movimentador;
import Happlo.Util.Transferidor;
import Util.Texto;
import Zeta.Botao;
import Zeta.Ciclador;
import Zeta.Cronometro;
import Zeta.Escritor;
import Zeta.PacoteDeImagem;
import Zeta.Imaginador;
import Zeta.InBoxer;
import Zeta.Local;
import Zeta.Mouse;
import Zeta.Painel;
import Zeta.RealizadorDeClique;
import Zeta.Tabuleiro;
import Zeta.Teclado;
import Zeta.Time;

public class HappladorTela extends Painel {

	private Mouse MouseC;
	public Teclado TecladoC;

	public RealizadorDeClique mRealizadorDeCLique;

	private boolean fechado;

	public Botao BTN_AVANCAR;
	public Botao BTN_VOLTAR;

	public Botao BTN_ESPACO;
	public Botao BTN_REMOVER;

	public Botao BTN_QUEBRARLINHA;
	public Botao BTN_SUBIRLINHA;

	public Botao BTN_ALINHAR_DIREITA;
	public Botao BTN_ALINHAR_CENTRO;
	public Botao BTN_ALINHAR_ESQUERDA;

	public Botao BTN_COPIAR;
	public Botao BTN_CORTAR;
	public Botao BTN_COLAR;

	public Botao BTN_SALVAR;

	public Botao BTN_M01;
	public Botao BTN_M02;
	public Botao BTN_M03;
	public Botao BTN_M04;
	public Botao BTN_M05;
	public Botao BTN_M06;
	public Botao BTN_M07;
	public Botao BTN_M08;
	public Botao BTN_M09;
	public Botao BTN_M10;
	public Botao BTN_M11;
	public Botao BTN_M12;
	public Botao BTN_M13;
	public Botao BTN_M14;
	public Botao BTN_M15;
	public Botao BTN_M16;

	public Botao BTN_V01;
	public Botao BTN_V02;
	public Botao BTN_V03;
	public Botao BTN_V04;
	public Botao BTN_V05;
	public Botao BTN_V06;
	public Botao BTN_V07;
	public Botao BTN_V08;
	public Botao BTN_V09;
	public Botao BTN_V10;
	public Botao BTN_V11;

	public Botao BTN_N00;
	public Botao BTN_N01;
	public Botao BTN_N02;
	public Botao BTN_N03;
	public Botao BTN_N04;
	public Botao BTN_N05;
	public Botao BTN_N06;
	public Botao BTN_N07;
	public Botao BTN_N08;
	public Botao BTN_N09;

	public Botao BTN_E01;
	public Botao BTN_E02;
	public Botao BTN_E03;
	public Botao BTN_E04;
	public Botao BTN_E05;
	public Botao BTN_E06;
	public Botao BTN_E07;
	public Botao BTN_E08;
	public Botao BTN_E09;
	public Botao BTN_E10;
	public Botao BTN_E11;
	public Botao BTN_E12;
	public Botao BTN_E13;
	public Botao BTN_E14;
	public Botao BTN_E15;
	public Botao BTN_E16;
	public Botao BTN_E17;
	public Botao BTN_E18;

	public Happlo HapploBotoes;
	public HapploViewer HapploViewerC;

	public HapploViewerLinha HapploViewerStatus;

	public HapploDocumento HapploDocumentoC;
	public HapploDocumento HapploDocumentoStatus;

	private Asset AssetC;

	private AAGBotoesDraw mAAGBotoesDraw;
	private AAGBotoesInicializador mAAGBotoesInicializador;
	private AAGTeclador mAAGTeclador;
	private AAGBotoesClicador mAAGBotoesClicador;

	private int mLargura;
	private int mAltura;
	
	public HappladorTela(int eLargura, int eAltura) {

		this.setSize(eLargura, eAltura);
		mAltura=eAltura;
		mLargura=eLargura;
		
		MouseC = new Mouse();
		TecladoC = new Teclado();

		AssetC = new Asset();

		this.addMouseListener(MouseC);
		this.addMouseMotionListener(MouseC);
		this.addKeyListener(TecladoC);

		fechado = false;

		mAAGBotoesDraw = new AAGBotoesDraw(this);
		mAAGBotoesInicializador = new AAGBotoesInicializador(this);
		mAAGTeclador = new AAGTeclador(this);
		mAAGBotoesClicador = new AAGBotoesClicador(this);

		mRealizadorDeCLique = new RealizadorDeClique(MouseC);

		HapploBotoes = new Happlo(5, Color.WHITE);

		BTN_AVANCAR = mRealizadorDeCLique
				.add(new Botao("Avancar", 860, 100, 50, 50, AssetC.getRecursos().obter("direita")));

		BTN_VOLTAR = mRealizadorDeCLique
				.add(new Botao("Voltar", 800, 100, 50, 50, AssetC.getRecursos().obter("esquerda")));

		BTN_REMOVER = mRealizadorDeCLique
				.add(new Botao("Voltar", 920, 100, 50, 50, AssetC.getRecursos().obter("remover")));

		BTN_ESPACO = mRealizadorDeCLique.add(new Botao("ESPACO", 800, 300, 50, 50));
		BTN_ESPACO.setCor(Color.BLACK);
		BTN_ESPACO.setGradear(true);

		BTN_QUEBRARLINHA = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 980, 100, 50, 50,
				AssetC.getRecursos().obter("quebrarlinha"));

		BTN_SUBIRLINHA = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 1030, 100, 50, 50,
				AssetC.getRecursos().obter("subirlinha"));

		BTN_ALINHAR_ESQUERDA = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 1090, 100, 50, 50,
				AssetC.getRecursos().obter("alinharEsquerda"));

		BTN_ALINHAR_DIREITA = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 1210, 100, 50, 50,
				AssetC.getRecursos().obter("alinharDireita"));

		BTN_ALINHAR_CENTRO = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 1150, 100, 50, 50,
				AssetC.getRecursos().obter("alinharCentro"));

		BTN_COPIAR = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 800, 200, 50, 50,
				AssetC.getRecursos().obter("copiar"));

		BTN_CORTAR = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 860, 200, 50, 50,
				AssetC.getRecursos().obter("cortar"));

		BTN_COLAR = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 1000, 200, 50, 50,
				AssetC.getRecursos().obter("colar"));

		BTN_SALVAR = mRealizadorDeCLique.NovoBotaoImagem("LINHA", 1550, 100, 50, 50,
				AssetC.getRecursos().obter("salvar"));

		mAAGBotoesInicializador.Botoes_Iniciar();

		mRealizadorDeCLique.setCliqueContinuo(true);


		HapploDocumentoC = new HapploDocumento();
		HapploViewerC = new HapploViewer(50, 50, 500, 500, HapploDocumentoC);
		HapploViewerC.setGrade(false);
		HapploViewerC.setPonteiro(0);
		HapploViewerC.setFonte(3, Color.yellow);
		
		File Arquivo = new File(Local.LocalAtual() + "Documento.happlo");
		if (Arquivo.exists()) {
			HapploDocumentoC.Abrir(Local.LocalAtual() + "Documento.happlo");

		}
		
		
	

		Exportar_Assets();

		HapploDocumentoStatus = new HapploDocumento();

	
		HapploDocumentoStatus.Escrever("V01 C03 C11");
		
		HapploViewerStatus = new HapploViewerLinha(50, 700, HapploDocumentoStatus);
		HapploViewerStatus.MudarCor(Color.YELLOW);
		HapploViewerStatus.MudarTamanho(13);	

	}
	
	
	
	public int getLargura() {return mLargura;}
	public int getAltura() {return mAltura;}

	public void Exportar_Assets() {

		Exportador.Exportar(Local.LocalAtual() + "Assets/");

	}

	public void paintComponent(Graphics grafico) {
		super.paintComponent(grafico);

		// Limpar Tela
		grafico.setColor(Color.BLACK);
		grafico.fillRect(0, 0, getWidth(), getHeight());

		if (HapploViewerC.getTransferidor().PossuiTransferencia()) {
			BTN_COLAR.setImg(AssetC.getRecursos().obter("colar"));
		} else {
			BTN_COLAR.setImg(AssetC.getRecursos().obter("descolar"));
		}

		if (HapploViewerC.estaSelecionado()) {
			BTN_COPIAR.setImg(AssetC.getRecursos().obter("copiar"));
			BTN_CORTAR.setImg(AssetC.getRecursos().obter("cortar"));

		} else {
			BTN_COPIAR.setImg(AssetC.getRecursos().obter("descopiar"));
			BTN_CORTAR.setImg(AssetC.getRecursos().obter("descortar"));

		}

		HapploViewerC.Draw(grafico);
		HapploViewerC.CiclarPonteiro();

		HapploViewerStatus.Draw(grafico);

		BTN_VOLTAR.draw(grafico);

		BTN_AVANCAR.draw(grafico);

		BTN_REMOVER.draw(grafico);

		BTN_ESPACO.draw(grafico);

		BTN_QUEBRARLINHA.draw(grafico);
		BTN_SUBIRLINHA.draw(grafico);

		BTN_ALINHAR_ESQUERDA.draw(grafico);
		BTN_ALINHAR_DIREITA.draw(grafico);
		BTN_ALINHAR_CENTRO.draw(grafico);

		BTN_COPIAR.draw(grafico);
		BTN_CORTAR.draw(grafico);
		BTN_COLAR.draw(grafico);

		BTN_SALVAR.draw(grafico);

		mAAGBotoesDraw.Botoes_Consoante_Draw(grafico);
		mAAGBotoesDraw.Botoes_Vogal_Draw(grafico);
		mAAGBotoesDraw.Botoes_Numero_Draw(grafico);
		mAAGBotoesDraw.Botoes_Especial_Draw(grafico);

	}

	@Override
	public void update(long dt) {

		if (HapploViewerC.Clique(MouseC)) {
			HapploViewerC.setPonteiro(HapploViewerC.PonteiroSelecaoInicio());
		}

		mRealizadorDeCLique.update(dt);

		mAAGBotoesClicador.Clique();

		mAAGTeclador.Tecle();

	}

	@Override
	public boolean getFechado() {
		return fechado;
	}

	public void Fechar() {
		fechado = true;
	}

}
