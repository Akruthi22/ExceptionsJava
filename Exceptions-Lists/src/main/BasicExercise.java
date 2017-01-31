package main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Spojrz na klase {@code SuperGreeter}. Twoim zadaniem jest napisac testy
 * sprawdzajace dzialanie tej klasy. Testy te powinny sprawdzac nastepujace
 * przypadki:
 *  * Test(a moze testy?) sprawdzajace czy faktycznie metoda wita osobe
 *    przekazana jako argument.
 *  * Test sprawdzajacy jako zachowuje sie metoda po przekazaniu wartosci null
 *  * Test sprawdzajacy jak zachowuje sie metoda po przekazaniu pustego Stringa.
 *  * Test sprawdzajacy jak zachowuje sie metoda po przekazaniu arugmentu "World".
 */
public class BasicExercise {

    @Test
    public void shouldGreet() {
        String greeting = SuperGreeter.superGreet("Ewelina");
        assertEquals("Hello, Ewelina! You definetly look great today!", greeting);
    }

    @Test
    public void shouldGreetSomebodyElse() {
        String greeting = SuperGreeter.superGreet("Mateusz");
        assertEquals("Hello, Mateusz! You definetly look great today!", greeting);
    }

    @Test
    public void shouldGreetWorld() {
        String greeting = SuperGreeter.superGreet("World");
        assertEquals("Hello, World! You definetly look great today!", greeting);
    }

    @Test
    public void shouldGreetWorldOnNull() {
        shouldGreetDefaultValue(null);
    }

    @Test
    public void shouldGreetWorldOnEmptyString() {
        shouldGreetDefaultValue("");
    }

    private void shouldGreetDefaultValue(String name) {
        String greeting = SuperGreeter.superGreet(name);
        String defaultValue = "Hello, Universe! You definetly look great today!";
        assertEquals(defaultValue, greeting);
    }
}
