import org.testng.annotations.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.testng.AssertJUnit.assertEquals;

public class MainTest {

    @Test
    public void testGetParse() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.getParse(dateString);
        OffsetDateTime expectedDate = OffsetDateTime.parse(dateString);

        assertEquals(expectedDate, dateTime);
    }

    @Test
    public void testCustomFormattedDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedData = Main.customFormattedDate(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));

        assertEquals(expectedFormattedDate, formattedData);
    }

}