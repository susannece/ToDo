package se.lexicon.susanne;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person testPerson;
    private Person testPerson2 = new Person();
    private Person testPerson4 = new Person();

    @Before
    public void beforeTest() {
        testPerson = new Person(456, "Lisa", "Andersson", "lisa@abc.se");
        System.out.println(("Before test in PersonTest."));
    }

    @Test
    public void testGetters(){
        assertEquals(456, testPerson.getId());
        assertEquals("Lisa", testPerson.getFirstName());
        assertEquals("Andersson", testPerson.getLastName());
        assertEquals("lisa@abc.se", testPerson.getEmail());
    }

    @Test
    public void testSetters(){
        testPerson2.setFirstName("Sanna");
        testPerson2.setLastName("Björk");
        testPerson2.setEmail("sanna@abc.se");
        System.out.println(testPerson2.toString());
    }

    @Test
    public void testNullExeptions(){
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setLastName(null));
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setEmail(null));
    }

    @Test
    public void getSummaryTest(){
        assertEquals("ID:456 Name:Lisa Andersson", testPerson.getSummary(testPerson));
    }
}
