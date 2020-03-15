package Happlador;

import java.awt.image.BufferedImage;

import Zeta.PacoteDeImagem;
import Zeta.Imaginador;
import Zeta.Local;

public class Asset {

	private PacoteDeImagem mRecursos;


	public Asset() {
		
		Carregar_Recursos();
		
		
		
	}
	
	
	private void Carregar_Recursos() {
		
		mRecursos = new PacoteDeImagem();


	     BufferedImage setacinza = Imaginador.CarregarStream(Local.ObterRecurso("setacinza.png"));
	     BufferedImage setaverde = Imaginador.CarregarStream(Local.ObterRecurso("setaverde.png"));

	        
	     mRecursos.incluir("setacinza", setacinza);
	     mRecursos.incluir("setaverde", setaverde);

	     mRecursos.incluir("setacinza_NORTE", Imaginador.Girar(setacinza, 270));
	     mRecursos.incluir("setacinza_SUL", Imaginador.Girar(setacinza, 90));
	     mRecursos.incluir("setacinza_LESTE", setacinza);
	     mRecursos.incluir("setacinza_OESTE", Imaginador.Girar(setacinza, 180));

	     mRecursos.incluir("setaverde_NORTE", Imaginador.Girar(setaverde, 270));
	     mRecursos.incluir("setaverde_SUL", Imaginador.Girar(setaverde, 90));
	     mRecursos.incluir("setaverde_LESTE", setaverde);
	     mRecursos.incluir("setaverde_OESTE", Imaginador.Girar(setaverde, 180));
		
	     mRecursos.incluir("ir", Imaginador.CarregarStream(Local.ObterRecurso("Next.png")));
	     mRecursos.incluir("voltar", Imaginador.CarregarStream(Local.ObterRecurso("Previous.png")));
	     mRecursos.incluir("dialogo", Imaginador.CarregarStream(Local.ObterRecurso("dialogo.png")));

	     mRecursos.incluir("salvar", Imaginador.CarregarStream(Local.ObterRecurso("save.png")));
	     
	     mRecursos.incluir("quebrarlinha", Imaginador.CarregarStream(Local.ObterRecurso("quebrarlinha.png")));
	     mRecursos.incluir("subirlinha", Imaginador.CarregarStream(Local.ObterRecurso("subirlinha.png")));

	     mRecursos.incluir("esquerda", Imaginador.CarregarStream(Local.ObterRecurso("esquerda.png")));
	     
	     mRecursos.incluir("direita",Imaginador.Girar( Imaginador.CarregarStream(Local.ObterRecurso("esquerda.png")),180));

	     
	     mRecursos.incluir("remover", Imaginador.CarregarStream(Local.ObterRecurso("remover.png")));

	     mRecursos.incluir("alinharEsquerda", Imaginador.CarregarStream(Local.ObterRecurso("alinharEsquerda.png")));
	     mRecursos.incluir("alinharDireita", Imaginador.CarregarStream(Local.ObterRecurso("alinharDireita.png")));
	     mRecursos.incluir("alinharCentro", Imaginador.CarregarStream(Local.ObterRecurso("alinharCentro.png")));

	     mRecursos.incluir("copiar", Imaginador.CarregarStream(Local.ObterRecurso("copiar.png")));
	     mRecursos.incluir("colar", Imaginador.CarregarStream(Local.ObterRecurso("colar.png")));
	     mRecursos.incluir("cortar", Imaginador.CarregarStream(Local.ObterRecurso("cortar.png")));

	     mRecursos.incluir("descolar", Imaginador.EscalaDeCinza(Imaginador.CarregarStream(Local.ObterRecurso("colar.png"))));
	     mRecursos.incluir("descortar", Imaginador.EscalaDeCinza(Imaginador.CarregarStream(Local.ObterRecurso("cortar.png"))));
	     mRecursos.incluir("descopiar",Imaginador.EscalaDeCinza( Imaginador.CarregarStream(Local.ObterRecurso("copiar.png"))));

	}
	
	
	
	public PacoteDeImagem getRecursos() {
		return mRecursos;
	}
	
	
	
}
