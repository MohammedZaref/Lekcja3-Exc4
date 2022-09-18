package Future.Collars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecondsToMinutesTest {
    @Test
    void shouldConvertSecondsToMinutes() {
        var secondsToMinutes = new SecondsToMinutes();
        Assertions.assertEquals(5, SecondsToMinutes.secondsToMinutesConverter(240));

    }


}
