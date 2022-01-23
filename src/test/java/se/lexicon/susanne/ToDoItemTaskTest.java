package se.lexicon.susanne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ToDoItemTaskTest {

    Person testPerson = new Person(67, "Stina", "Hall", "lisa@abc.se");
    ToDoItem testItem = new ToDoItem(23, "boka rum", "hotellrum",LocalDate.parse("2022-01-31"), false, testPerson);
    private ToDoItemTask testTask = new ToDoItemTask(345, false, testItem, testPerson);
    private ToDoItemTask testTask2 = new ToDoItemTask(364, true, testItem, testPerson);
    private ToDoItemTask testTask3 = new ToDoItemTask();

    @Before
    public void beforeTest() {
        System.out.println("Before test in ToDoItemTaskTest");
    }

    @Test
    public void testGetters(){
        assertEquals(345, testTask.getId());
        Assert.assertFalse(testTask.isAssigned());
        Assert.assertTrue(testTask2.isAssigned());
    }

    @Test
    public void testSetters(){
        testTask3.setId(89);
        testTask3.setAssigned(true);
        testTask3.setToDoItem(testItem);
        testTask3.setPerson(testPerson);
        System.out.println(testTask3.toString());
    }

    @Test
    public void testNullExeptions(){
        assertThrows(IllegalArgumentException.class, ()-> testTask3.setToDoItem(null));
    }

    @Test
    public void getSummaryTest(){
        assertEquals("Id:345 Assigned: false Id:67 Name:Stina Hall", testTask.getSummary(testTask));
    }
}
