import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.PlayerMusicale;

public class Main {
    public static void main(String[] args) {
        PlayerMusicale player = new PlayerMusicale();

        ElementoMultimediale canzone1 =  new ElementoMultimediale("titolo1", 5);
        ElementoMultimediale canzone2 =  new ElementoMultimediale("titolo2", 7);

        player.aggiungiElemento(canzone1);
        player.aggiungiElemento(canzone2);

        System.out.println("Inizio riproduzione playlist...");
        player.riproduciPlaylist();
        System.out.println("riproduzione completata");

    }
}