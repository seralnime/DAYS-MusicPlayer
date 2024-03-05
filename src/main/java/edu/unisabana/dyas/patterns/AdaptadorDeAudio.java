package edu.unisabana.dyas.patterns;


import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class AdaptadorDeAudio implements AudioPlayer{
    AdvancedAudioPlayer av;
    public AdaptadorDeAudio(AdvancedAudioPlayer av){
        this.av = av;
    }
    public void play(String formato, String Nombre){
        switch(formato){
            case "MP4":
                this.av.playMp4(Nombre);
                break;
            case "VLC":
                this.av.playVlc(Nombre);
                break;
            default:
                System.out.println("Formato inválido");;
                break;
        }

    }
    public void stop(){
        this.av.stop();
    }
}
