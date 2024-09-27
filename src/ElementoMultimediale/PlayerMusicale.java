package ElementoMultimediale;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class PlayerMusicale {

    private List<ElementoMultimediale> playlist;

    public PlayerMusicale () {
        playlist = new ArrayList<>();
    }

    public void aggiungiElemento (ElementoMultimediale elemento) {
        playlist.add(elemento);

    }

    public void riproduciPlaylist () {
        for (ElementoMultimediale elemento : playlist) {
            elemento.esegui();
        }
    }
}
