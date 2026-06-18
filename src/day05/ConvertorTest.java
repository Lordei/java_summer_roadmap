package day05;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @org.junit.jupiter.api.Test
     void celsiusToFahrenheit() {
        assertEquals(212.0, Convertor.celsiusToFahrenheit(100), 0.01);
    }

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(100.0, Convertor.fahrenheitToCelsius(212), 0.01);
    }

    @org.junit.jupiter.api.Test
    void kgToPounds() {
        assertEquals(22.046, Convertor.kgToPounds(10), 0.01);
    }

    @org.junit.jupiter.api.Test
    void poundsToKg() {
        assertEquals(10.0, Convertor.poundsToKg(22.046), 0.01);
    }

    @org.junit.jupiter.api.Test
    void cmToInches() {
        assertEquals(10.0, Convertor.cmToInches(25.4), 0.01);
    }

    @org.junit.jupiter.api.Test
    void inchesToCm() {
        assertEquals(25.4, Convertor.inchesToCm(10), 0.01);
    }
}