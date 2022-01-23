package se.lexicon.susanne.dao;

import se.lexicon.susanne.ToDoItemTask;

import java.util.ArrayList;
import java.util.Collection;

public class ToDoItemTaskDAOCollection implements ToDoItemTaskDAO {

    Collection<ToDoItemTask> tasks;
    ToDoItemTask task = new ToDoItemTask();

    @Override
    public ToDoItemTask persist(ToDoItemTask task) {
        tasks.add(task);
        return task;
    }

    @Override
    public ToDoItemTask findById(int id) {
        for (ToDoItemTask temp : tasks ) {
            if(temp.getId() == id)
                task=temp;
        }
        return task;
    }

    @Override
    public Collection<ToDoItemTask> findByAssignedStatus(boolean status) {
        Collection<ToDoItemTask> it = new ArrayList<>();
        for (ToDoItemTask temp : tasks ) {
            if(temp.isAssigned() == status)
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<ToDoItemTask> findByPersonId(int id) {
        Collection<ToDoItemTask> it = new ArrayList<>();
        for (ToDoItemTask temp : tasks ) {
            if(temp.getPerson().getId() == id)
                it.add(temp);
        }
        return it;
    }

    @Override
    public void remove(int id) {
        tasks.removeIf(temp -> temp.getId() == id);
    }

}
