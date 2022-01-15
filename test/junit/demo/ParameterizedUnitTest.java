package junit.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedUnitTest {
    @ParameterizedTest
    @DisplayName("Test value source1")
    @ValueSource(ints = {2, 4, 8})
    void testNumberShouldBeEven(int num) {
        assertEquals(0, num % 2);
    }

    @ParameterizedTest
    @DisplayName("Test value source2")
    @ValueSource(strings = {"Effective Java", "Code Complete", "Clean Code"})
    void testPrintTitle(String title) {
        System.out.println(title);
    }


    @ParameterizedTest
    @DisplayName("Test csv source")
    @CsvSource({"1,One", "2,Two", "3,Three"})
    void testDataFromCsv(long id, String name) {
        System.out.printf("id: %d, name: %s", id, name);
    }

}
