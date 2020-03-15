package Zeta;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

public class PacoteDeImagem {

    private ArrayList<Image> ls_sprites;

    public PacoteDeImagem() {

        ls_sprites = new ArrayList<Image>();

    }

    public boolean existe(String eNome) {
        boolean ret = false;

        for (Image SpriteC : ls_sprites) {

            if (SpriteC.getNome().equals(eNome)) {
                ret = true;
                break;
            }

        }

        return ret;
    }

    public void incluir(String eNome, BufferedImage eImagem) {


        if (existe(eNome) == false) {
            ls_sprites.add(new Image(eNome, eImagem));
        }

    }

    public ArrayList<String> obterNomes(){
    	
    	ArrayList<String> ret = new ArrayList<String>();
    	
    	for (Image SpriteC : ls_sprites) {

    		ret.add(SpriteC.getNome());

        }
    	
    	Collections.sort(ret);
    	
    	return ret;
    }

    public BufferedImage obter(String eNome) {
    	BufferedImage ret = null;

        for (Image SpriteC : ls_sprites) {

            if (SpriteC.getNome().equals(eNome)) {
                ret = SpriteC.getImagem();
                break;
            }

        }

        return ret;
    }


}
