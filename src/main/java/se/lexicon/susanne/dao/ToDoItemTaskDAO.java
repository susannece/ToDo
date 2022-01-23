package se.lexicon.susanne.dao;

import se.lexicon.susanne.ToDoItemTask;

import java.util.Collection;

public interface ToDoItemTaskDAO {

    ToDoItemTask persist(ToDoItemTask task);
    ToDoItemTask findById(int id);
    Collection<ToDoItemTask> findByAssignedStatus(boolean status);
    Collection<ToDoItemTask> findByPersonId(int id);
    void remove(int id);

}
