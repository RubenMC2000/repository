import java.util.Comparator;

public class TodoItem implements Comparable<TodoItem> {

    //PROPERTIES
    private Importance importance;
    private int priority;
    private String string;

    //CONSTRUCTOR
    public TodoItem(Importance importance, int priority, String string) {
        this.importance = importance;
        this.priority = priority;
        this.string = string;
    }

    public Importance getImportance() {
        return importance;
    }

    public int getPriority() {
        return priority;
    }

    public String getString() {
        return string;
    }

    @Override
    public int compareTo(TodoItem item) {
        int items;
        items = item.importance.compareTo(this.importance);
        if(items == 0){
            items = this.priority - item.priority;
        }
        return items;
    }



@Override
public String toString(){
    return "TodoItem{" + getImportance() + ", Priority " + getPriority() + ", " + getString() + "}";
}
}