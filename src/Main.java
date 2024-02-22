//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Fai attenzione a usare almeno Java 8
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Crea un oggetto OffsetDateTime dalla stringa "2023-03-01T13:00:00Z"
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = getParse(dateString);

        // Formatta la data ottenendo "01 marzo 2023"
        String customFormattedDate = customFormattedDate(dateTime);
        System.out.println("Data formattata: " + customFormattedDate);
    }

    // Funzione per il parsing della stringa in OffsetDateTime
    static OffsetDateTime getParse(String dateString) {
        return OffsetDateTime.parse(dateString);
    }

    // Formatta la data ottenendo "01 marzo 2023"
    static String customFormattedDate(OffsetDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        String formattedDate = dateTime.format(formatter);
        return formattedDate;
    }
}