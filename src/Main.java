import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.PlayerMusicale;
import ElementoMultimediale.RegistrazioneAudio;
import ElementoMultimediale.Video;
import ElementoMultimediale.Immagine;

public class Main {
    public static void main(String[] args) {
        PlayerMusicale player = new PlayerMusicale();

        ElementoMultimediale canzone1 = new RegistrazioneAudio("Canzone 1", 5, 5);
        RegistrazioneAudio audio1 = new RegistrazioneAudio("Audio 1", 3, 5);
        Video video1 = new Video("video1", 4,5, 3);
        Immagine immagine1 = new Immagine("immagine1 ", 5);


        player.aggiungiElemento(canzone1);
        player.aggiungiElemento(audio1);
        player.aggiungiElemento(video1);
        player.aggiungiElemento(immagine1);

        System.out.println("Inizio riproduzione della playlist...");
        player.riproduciPlaylist();
        System.out.println("Riproduzione completata.");
    }
}