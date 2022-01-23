package se.lexicon.susanne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoItemTest {

    private ToDoItem testItem;
    private ToDoItem testItem2;
    private ToDoItem testItem3 = new ToDoItem();
    private Person person = new Person(123, "Kalle", "Larsson", "kalle@abc.se");


    @Before
    public void beforeTest() {
        testItem = new ToDoItem(123,"write nice code","Java", LocalDate.parse("2022-01-30"),false, person);
        testItem2 = new ToDoItem(125,"write  code","Java2", LocalDate.parse("2022-01-15"),true, person);
    }

    @Test
    public void testGetters(){
        assertEquals(123, testItem.getId());
        assertEquals("write nice code", testItem.getTitle());
        assertEquals("Java", testItem.getTaskDescription());
        assertEquals(LocalDate.parse("2022-01-30"), testItem.getDeadLine());
        Assert.assertFalse(testItem.isDone());
        Assert.assertTrue(testItem2.isDone());
    }

    @Test
    public void testSetters(){
        testItem3.setId(13);
        testItem3.setTitle("Writing");
        testItem3.setTaskDescription("JAVA");
        testItem3.setDeadLine(LocalDate.parse("2022-01-30"));
        testItem3.setDone(false);
        testItem3.setCreator(person);
        System.out.println(testItem3.toString());
    }

    @Test
    public void testNullExeptions(){
        assertThrows(IllegalArgumentException.class, ()-> testItem3.setTitle(null));
        assertThrows(IllegalArgumentException.class, ()-> testItem3.setDeadLine(null));
    }

    @Test
    public void isOverDue_should_return_false() {
        Assert.assertFalse(testItem.isOverDue(testItem));
    }

    @Test
    public void isOverDue_should_return_true() {
        Assert.assertTrue(testItem2.isOverDue(testItem2));
    }

}
