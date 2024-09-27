import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.PlayerMusicale;
import ElementoMultimediale.RegistrazioneAudio;
import ElementoMultimediale.Video;

public class Main {
    public static void main(String[] args) {
        PlayerMusicale player = new PlayerMusicale();

        ElementoMultimediale canzone1 = new ElementoMultimediale("Canzone 1", 5);
        RegistrazioneAudio audio1 = new RegistrazioneAudio("Audio 1", 3, 5);
        Video video1 = new Video("video1", 4,5, 3);

        player.aggiungiElemento(canzone1);
        player.aggiungiElemento(audio1);
        player.aggiungiElemento(video1);

        System.out.println("Inizio riproduzione della playlist...");
        player.riproduciPlaylist();
        System.out.println("Riproduzione completata.");
    }
}