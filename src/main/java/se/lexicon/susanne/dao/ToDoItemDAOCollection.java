package se.lexicon.susanne.dao;

import se.lexicon.susanne.ToDoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class ToDoItemDAOCollection implements ToDoItemDAO{

    private Collection<ToDoItem> items;
    ToDoItem item = new ToDoItem();

    @Override
    public ToDoItem persist(ToDoItem toDoItem) {
        items.add(toDoItem);
        return toDoItem;
    }

    @Override
    public ToDoItem findById(int id) {
        for (ToDoItem temp : items ) {
            if (temp.getId()==id)
                item=temp;
        }
        return item;
    }

    @Override
    public Collection<ToDoItem> findAll() {
        return items;
    }

    @Override
    public Collection<ToDoItem> findAllByDoneStatus(boolean done) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem temp : items ) {
            if(temp.isDone() == done)
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByTitleContains(String title) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem temp : items ) {
            if (temp.getTitle().contains(title.toLowerCase()))
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByPersonId(int personId) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem temp : items ) {
            if(temp.getCreator().getId() == personId)
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByDeadlineBefore(LocalDate date) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem temp : items ) {
            if(temp.getDeadLine().compareTo(date) < 0)
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<ToDoItem> findByDeadlineAfter(LocalDate date) {
        Collection<ToDoItem> it = new ArrayList<>();
        for (ToDoItem temp : items ) {
            if(temp.getDeadLine().compareTo(date) > 0)
                it.add(temp);
        }
        return it;
    }

    @Override
    public void remove(int id) {
        items.removeIf(temp -> temp.getId() == id);
    }
}
