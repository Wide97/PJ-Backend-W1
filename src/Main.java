import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.RegistrazioneAudio;
import ElementoMultimediale.Video;
import ElementoMultimediale.Immagine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Crea un nuovo elemento multimediale (1 = Audio, 2 = Video, 3 = Immagine): ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (scelta) {
                case 1: // Registrazione audio
                    System.out.println("Inserisci la durata (in secondi): ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 2: // Video
                    System.out.println("Inserisci la durata (in secondi): ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminosita);
                    break;
                case 3: // Immagine
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaImmagine = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    i--;
                    break;
            }
        }


        int scelta;
        do {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire un elemento, oppure 0 per terminare: ");
            scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);

        System.out.println("Programma terminato.");
    }
}
