import java.util.PriorityQueue;

public class ToDoList {

    private PriorityQueue<TodoItem> queue;

    public ToDoList(){
        queue = new PriorityQueue<>();
    }

    public void add(Importance importance, int priority, String string) {
        TodoItem todoItem = new TodoItem(importance, priority, string);
        queue.add(todoItem);
    }

    public TodoItem remove(){
       return queue.remove();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
