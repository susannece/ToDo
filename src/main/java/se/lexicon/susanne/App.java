package se.lexicon.susanne;
import java.time.LocalDate;

public class App 
{
    public static void main( String[] args )
    {
        Person per1 = new Person(1,"Dan", "Persson", "dan@abc.se");
        Person per2 = new Person(2,"Stina", "Karlsson", "stina@abc.se");
        String str1 = per1.getSummary(per1);
        System.out.println( str1 );

        ToDoItem item1 = new ToDoItem(10, "Clean maschine", "Change filter", LocalDate.parse("2020-11-15"), false, per1);
        ToDoItem item2 = new ToDoItem(11, "Change tires", "To winter tires", LocalDate.parse("2021-12-31"), false, per2);
        String str2 = item1.getSummary(item1);
        System.out.println( str2 );

        boolean overDue = item1.isOverDue(item1);
        System.out.println(item1.getTitle() + " " + overDue);

        overDue = item2.isOverDue(item2);
        System.out.println(item2.getTitle() + " " + overDue);

        ToDoItemTask task1 = new ToDoItemTask(20, true, item1, per1);
        ToDoItemTask task2 = new ToDoItemTask(20, true, item2, per2);
        System.out.println(task1.getSummary(task1));
        System.out.println(task2.getSummary(task2));
    }
}
