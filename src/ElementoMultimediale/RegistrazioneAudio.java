package ElementoMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale{
    private int volume;

    public RegistrazioneAudio (String titolo, int durata, int volume) {
        super(titolo, durata);
        setVolume(volume);

    }

    public int getVolume (){
        return volume;
    }

    public void setVolume (int volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Il volume deve essere un valore positivo ");
        }

        this.volume = volume;

    }

    public void  alzaVolume () {
        volume++;
    }

    public void abbassaVolume () {
        if (volume > 1) {
            volume--;
        }
    }

    @Override
    public void play() {
        for (int i =0 ; i < getDurata(); i ++) {
            System.out.println(getTitolo() + "!" + "!".repeat(volume));
            long endTime = System.currentTimeMillis() + 1000;
            while (System.currentTimeMillis()< endTime) {

            }
        }
    }

}
