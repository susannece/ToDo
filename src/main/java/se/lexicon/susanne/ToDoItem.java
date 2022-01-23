package se.lexicon.susanne;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ToDoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public ToDoItem() {
    }

    public ToDoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if(title == null) throw new RuntimeException("title is null");
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public boolean isOverDue(ToDoItem task){
        LocalDate dateToDay = LocalDate.now();
        int result = deadLine.compareTo(dateToDay);
        return result < 0;
    }

    public String getSummary(ToDoItem task){
        return "Id:" + getId() + " Title:" + getTitle() + " Task:" + getTaskDescription() + " Deadline:" + getDeadLine() + " Done:" + isDone() +" "+ creator.getSummary(creator);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null) throw new IllegalArgumentException("Parameter: title is null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if(deadLine == null) throw new IllegalArgumentException("Parameter: deadLine is null");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return id == toDoItem.id && done == toDoItem.done && title.equals(toDoItem.title) && Objects.equals(taskDescription, toDoItem.taskDescription) && deadLine.equals(toDoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done);
    }

}
