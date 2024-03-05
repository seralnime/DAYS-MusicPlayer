package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayer av = new AdvancedAudioPlayer();
        AdaptadorDeAudio AdaptadorDeAudio = new AdaptadorDeAudio(av);
        AdaptadorDeAudio.play("MP4","video.mp4");
        AdaptadorDeAudio.play("VLC","video.vlc");
        AdaptadorDeAudio.play("MP2","live.mp2");
        AdaptadorDeAudio.stop();
    }
}