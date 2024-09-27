package ElementoMultimediale;

public class ElementoMultimediale {
    private String titolo;
    private int durata;

    public ElementoMultimediale (String titolo, int durata) {
        this.titolo = titolo;
        setDurata(durata);
    }

    public String getTitolo () {
        return titolo;
    }

    public int getDurata () {
        return durata;
    }

    public void setDurata (int durata) {
        if (durata <= 0) {
            throw new IllegalArgumentException("La durata deve avere valore positivo");
        }
        this.durata = durata;
    }

    public void play() {
        System.out.println("Riproducendo" + titolo + " per " + durata + " secondi.");
        for (int i=0; i<durata; i++) {
            long endTime = System.currentTimeMillis()+ 1000;
            while (System.currentTimeMillis() < endTime);
        }
    }
}
