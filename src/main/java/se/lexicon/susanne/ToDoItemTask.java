package se.lexicon.susanne;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person person;

    public ToDoItemTask(int id, boolean assigned, ToDoItem toDoItem, Person person) {
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
        this.toDoItem = toDoItem;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
