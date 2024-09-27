package ElementoMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        if (volume > 1) {
            volume--;
        }
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!" + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public void esegui() {
        play();
    }
}



