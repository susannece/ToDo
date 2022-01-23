package se.lexicon.susanne;

import java.util.Objects;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person person;

    public ToDoItemTask(int id, boolean assigned, ToDoItem toDoItem, Person person) {
        if(toDoItem == null){ throw new RuntimeException("toDoItem is null");}
        this.id = id;
        this.assigned = assigned;
        this.toDoItem = toDoItem;
        this.person = person;
    }

    public ToDoItemTask() {
    }

    public String getSummary(ToDoItemTask task){
        return "Id:" + id + " Assigned: " + assigned + " " + person.getSummary(person);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public ToDoItem getToDoItem() {
        return toDoItem;
    }

    public void setToDoItem(ToDoItem toDoItem) {
        if(toDoItem == null){ throw new IllegalArgumentException("Parameter ToDoItem toDoItem  is null"); }
        this.toDoItem = toDoItem;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "ToDoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", toDoItem=" + toDoItem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItemTask that = (ToDoItemTask) o;
        return id == that.id && assigned == that.assigned && toDoItem.equals(that.toDoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, toDoItem);
    }
}
