/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package som;

import java.io.File;

/**
 *
 * @author flavio-silva
 */
public class Som {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File musica = new File("cartoon001.wav");//pode ser wav ou mp3
        System.out.println("Reproduzindo: " + musica.getAbsolutePath());
        Music track = new Music(musica);
        Play play = new Play(track);
        Thread newThrd = new Thread(play);
        newThrd.start();

    }

}
