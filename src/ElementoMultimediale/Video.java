package ElementoMultimediale;

public class Video extends ElementoMultimediale{
    private int volume;
    private int luminosita;


    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        setVolume(volume);
        setLuminosita(luminosita);

    }

    public int getVolume () {
        return volume;
    }

    public void setVolume (int volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Il volume deve essere un valore positivo");
        }
        this.volume = volume;
    }

    public int getLuminosita () {
        return luminosita;
    }

    public void setLuminosita (int luminosita) {
        if (luminosita <= 0) {
            throw new IllegalArgumentException("La luminosità deve essere un valore positivo");
        }
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita () {
        luminosita ++;
    }

    @Override
    public void play () {
        for (int i=0; i<getDurata(); i++) {
            System.out.println(getTitolo() + "!" + "!".repeat(volume) + "*".repeat(luminosita));
            long endTime = System.currentTimeMillis() + 1000;
            while (System.currentTimeMillis() < endTime){

            }
        }
    }

}

