/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.blocks;

import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author danie
 */
public class Resources {
    public static Clip loadResourceSound(String resourceName) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //input stream para o recurso        
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(resourceName);
        //input stream para ler som
        AudioInputStream ain = AudioSystem.getAudioInputStream(in);
        //obter o objeto para tocar o som
        Clip clip = AudioSystem.getClip();
        //ler o som 
        clip.open(ain);
        //retorn o som
        return clip;
    }
}
