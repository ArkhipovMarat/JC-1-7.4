import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompare {
    @Test
    void stringCompare () {
        String originalString = "netology.ru";
//        Assertions.assertEquals(originalString, "NeTologY.ru");

        assertThat(originalString, equalToIgnoringCase("NeTologY.ru"));
    }
}
