package Zeta;

import java.awt.image.BufferedImage;

public class Image {

    private String mNome;
    private BufferedImage mImagem;

    public Image(String eNome,BufferedImage eImagem){

        this.mNome=eNome;
        this.mImagem=eImagem;

    }


    public String getNome(){return mNome;}
    public BufferedImage getImagem(){return mImagem;}

}
