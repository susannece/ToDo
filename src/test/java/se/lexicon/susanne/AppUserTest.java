package se.lexicon.susanne;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static se.lexicon.susanne.AppRole.*;

public class AppUserTest {

    AppUser testUser1 = new AppUser("stina", "asdf", ROLE_APP_USER);
    AppUser testUser2 = new AppUser();

    @Test
    public void testGetters(){
        assertEquals("stina", testUser1.getUsername());
        assertEquals("asdf", testUser1.getPassword());
        assertEquals(ROLE_APP_USER, testUser1.getRole());
    }

    @Test
    public void testSetters(){
        testUser2.setUsername("Sanna");
        testUser2.setPassword("rtyu");
        testUser2.setRole(ROLE_APP_ADMIN);
        System.out.println(testUser2.toString());
    }
    @Test
    public void testNullExeption(){
        assertThrows(IllegalArgumentException.class, ()-> testUser2.setUsername(null));
        assertThrows(IllegalArgumentException.class, ()-> testUser2.setPassword(null));
        assertThrows(IllegalArgumentException.class, ()-> testUser2.setRole(null));
    }

    @Test
    public void testEmptyStringExeption(){
        assertThrows(IllegalArgumentException.class, ()-> testUser2.setUsername(""));
        assertThrows(IllegalArgumentException.class, ()-> testUser2.setPassword(""));
    }

}
