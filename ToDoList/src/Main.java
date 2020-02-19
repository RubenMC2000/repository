public class Main {

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.add(Importance.MEDIUM, 1, "take a nap");
        toDoList.add(Importance.LOW, 1, "master how to sing in the shower");
        toDoList.add(Importance.HIGH, 1, "petting the cat");
        toDoList.add(Importance.LOW, 2, "help the code cadets");
        toDoList.add(Importance.MEDIUM, 2, "buy chocolate donuts");
        toDoList.add(Importance.HIGH, 2, "watch Black Clover last episode");

        toDoList.isEmpty();

        while (!toDoList.isEmpty()) {
            TodoItem todoItem = toDoList.remove();
            System.out.println(todoItem);
        }

    }
}
