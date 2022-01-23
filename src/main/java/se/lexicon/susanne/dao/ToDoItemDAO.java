package se.lexicon.susanne.dao;

import se.lexicon.susanne.ToDoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemDAO {

    ToDoItem persist(ToDoItem toDoItem);
    ToDoItem findById(int id);
    Collection<ToDoItem> findAll();
    Collection<ToDoItem> findAllByDoneStatus(boolean done);
    Collection<ToDoItem> findByTitleContains(String title);
    Collection<ToDoItem> findByPersonId(int personId);
    Collection<ToDoItem> findByDeadlineBefore(LocalDate date);
    Collection<ToDoItem> findByDeadlineAfter(LocalDate date);
    void remove(int id);

}
