package main;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTest {

    private static MapContainer container;

    @BeforeClass
    public static void setUp() {
        container = new MapContainer();
    }

//    @After
//    public void after() {
//         container.clear();
//    }

    
    @Before
    public void before() {
        container.addToMap(0, "Nauczyciel");
    }

    @Test
    public void performFirstTest() {
        assertTrue(container.size() == 1);
        container.addToMap(1, "Piotr");
        container.addToMap(2, "Pawel");
        container.addToMap(3, "Lukasz");
        assertTrue(container.size() == 4);
    }

    @Test
    public void performSecondTest() {
        System.out.println("Before test 2: " + container);
        assertTrue(container.size() == 1);
        container.addToMap(1, "Piotr");
        container.addToMap(2, "Pawel");
        container.addToMap(3, "Lukasz");
        assertTrue(container.size() == 4);
    }

    @AfterClass
    public static void tearDown() {
        // niszczymy polaczenie do tajnej bazy danych 
        container.destroy();
    }

}
