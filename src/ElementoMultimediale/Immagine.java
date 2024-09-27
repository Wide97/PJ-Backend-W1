package ElementoMultimediale;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 1) {
            luminosita--;
        }
    }

    public void show() {
        System.out.println(getTitolo() + "*" + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}


