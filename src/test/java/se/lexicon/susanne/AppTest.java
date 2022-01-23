package se.lexicon.susanne;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public ToDoItem item;
    public Person person;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
        System.out.println("Answer False");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("Answer True");
    }
}
