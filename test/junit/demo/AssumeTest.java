package junit.demo;

import org.junit.jupiter.api.*;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import static  org.junit.jupiter.api.Assumptions.*;

public class AssumeTest {

    @Test
    void testAssumeTrue() {
        boolean b = 'A' == 'A';
        assumeTrue(b);
        assertEquals("Hello", "Hello");
    }

    @Test
    @DisplayName("test executes only on Saturday")
    public void testAssumeTrueSaturday() {
        LocalDateTime dt = LocalDateTime.now();
        assumeTrue(dt.getDayOfWeek().getValue() == 6);
        System.out.println("further code will execute only if above assumption holds true");
    }

    @Test
    void testAssumeFalse() {
        boolean b = 'A' != 'A';
        assumeFalse(b);
        assertEquals("Hello", "Hello");
    }

    @Test
    @DisplayName("test executes only on Thursday")
    public void testAssumeTrueThursday() {
        LocalDateTime dt = LocalDateTime.now();
        assumeTrue(dt.getDayOfWeek().getValue() == 4);
        System.out.println("further code will execute only if above assumption holds true");
    }
}
