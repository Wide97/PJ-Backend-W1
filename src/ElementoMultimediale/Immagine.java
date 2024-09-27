package ElementoMultimediale;

public class Immagine extends ElementoMultimediale{
    private int luminosita;


    public Immagine(String titolo, int luminosita) {
        super(titolo);
        setLuminosita(luminosita);
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

    public void show() {
        System.out.println(getTitolo() + "*" + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}
