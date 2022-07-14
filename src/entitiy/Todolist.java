package entitiy;

public class Todolist {

    private String todo;

    // constructor todo tanpa parameter
    public Todolist() {

    }

    // constructor todo dengan parameter
    public Todolist(String todo) {
        this.todo = todo;
    }


    // getter todo
    public String getTodo() {
        return todo;
    }

    // setter todo
    public void setTodo(String todo) {
        this.todo = todo;
    }
}
